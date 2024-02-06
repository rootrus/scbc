package com.airbnb.deeplinkdispatch;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DeepLinkEntry {
    private static final String PARAM = "([a-zA-Z][a-zA-Z0-9_-]*)";
    private static final Pattern PARAM_PATTERN = Pattern.compile(PARAM_REGEX);
    private static final String PARAM_REGEX = "%7B(([a-zA-Z][a-zA-Z0-9_-]*))%7D";
    private static final String PARAM_VALUE = "([a-zA-Z0-9_#'!+%~,\\-\\.\\@\\$\\:]+)";
    private final Class<?> activityClass;
    private final String method;
    private final Set<String> parameters;
    private final Pattern regex;
    private final Type type;
    private final String uriTemplate;

    public enum Type {
        CLASS,
        METHOD
    }

    public DeepLinkEntry(String str, Type type2, Class<?> cls, String str2) {
        DeepLinkUri parse = DeepLinkUri.parse(str);
        String schemeHostAndPath = schemeHostAndPath(parse);
        this.uriTemplate = str;
        this.type = type2;
        this.activityClass = cls;
        this.method = str2;
        this.parameters = parseParameters(parse);
        StringBuilder sb = new StringBuilder();
        sb.append(schemeHostAndPath.replaceAll(PARAM_REGEX, PARAM_VALUE));
        sb.append("$");
        this.regex = Pattern.compile(sb.toString());
    }

    public final Type getType() {
        return this.type;
    }

    public final Class<?> getActivityClass() {
        return this.activityClass;
    }

    public final String getMethod() {
        return this.method;
    }

    private static Set<String> parseParameters(DeepLinkUri deepLinkUri) {
        Pattern pattern = PARAM_PATTERN;
        StringBuilder sb = new StringBuilder();
        sb.append(deepLinkUri.encodedHost());
        sb.append(deepLinkUri.encodedPath());
        Matcher matcher = pattern.matcher(sb.toString());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    public final Map<String, String> getParameters(String str) {
        HashMap hashMap = new HashMap(this.parameters.size());
        Matcher matcher = this.regex.matcher(schemeHostAndPath(DeepLinkUri.parse(str)));
        if (matcher.matches()) {
            int i = 1;
            for (String next : this.parameters) {
                String group = matcher.group(i);
                if (group != null && !"".equals(group.trim())) {
                    hashMap.put(next, group);
                }
                i++;
            }
        }
        return hashMap;
    }

    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    private static String parsePath(DeepLinkUri deepLinkUri) {
        return deepLinkUri.encodedPath();
    }

    public final boolean matches(String str) {
        DeepLinkUri parse = DeepLinkUri.parse(str);
        return parse != null && this.regex.matcher(schemeHostAndPath(parse)).find();
    }

    private String schemeHostAndPath(DeepLinkUri deepLinkUri) {
        StringBuilder sb = new StringBuilder();
        sb.append(deepLinkUri.scheme());
        sb.append("://");
        sb.append(deepLinkUri.encodedHost());
        sb.append(parsePath(deepLinkUri));
        return sb.toString();
    }
}
