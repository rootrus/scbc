package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class InternetDomainName {
    private static final CharMatcher DASH_MATCHER = CharMatcher.anyOf("-_");
    private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".。．｡");
    private static final Joiner DOT_JOINER = Joiner.m81on('.');
    private static final String DOT_REGEX = "\\.";
    private static final Splitter DOT_SPLITTER = Splitter.m3611on('.');
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_PUBLIC_SUFFIX_FOUND = -1;
    private static final CharMatcher PART_CHAR_MATCHER = CharMatcher.JAVA_LETTER_OR_DIGIT.mo51375or(DASH_MATCHER);
    private final String name;
    private final ImmutableList<String> parts;
    private final int publicSuffixIndex;

    private InternetDomainName(String str) {
        String lowerCase = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom((CharSequence) str, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(lowerCase.length() <= MAX_LENGTH, "Domain name too long: '%s':", lowerCase);
        this.name = lowerCase;
        ImmutableList<String> copyOf = ImmutableList.copyOf(DOT_SPLITTER.split(lowerCase));
        this.parts = copyOf;
        Preconditions.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(validateSyntax(this.parts), "Not a valid domain name: '%s'", lowerCase);
        this.publicSuffixIndex = findPublicSuffix();
    }

    private int findPublicSuffix() {
        int size = this.parts.size();
        for (int i = 0; i < size; i++) {
            String join = DOT_JOINER.join((Iterable<?>) this.parts.subList(i, size));
            if (TldPatterns.EXACT.contains(join)) {
                return i;
            }
            if (TldPatterns.EXCLUDED.contains(join)) {
                return i + 1;
            }
            if (matchesWildcardPublicSuffix(join)) {
                return i;
            }
        }
        return -1;
    }

    public static InternetDomainName fromLenient(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    private static boolean validateSyntax(List<String> list) {
        int size = list.size() - 1;
        if (!validatePart(list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart(list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validatePart(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (PART_CHAR_MATCHER.matchesAllOf(CharMatcher.ASCII.retainFrom(str)) && !DASH_MATCHER.matches(str.charAt(0)) && !DASH_MATCHER.matches(str.charAt(str.length() - 1))) {
                if (!z || !CharMatcher.DIGIT.matches(str.charAt(0))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String name() {
        return this.name;
    }

    public ImmutableList<String> parts() {
        return this.parts;
    }

    public boolean isPublicSuffix() {
        return this.publicSuffixIndex == 0;
    }

    public boolean hasPublicSuffix() {
        return this.publicSuffixIndex != -1;
    }

    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return ancestor(this.publicSuffixIndex);
        }
        return null;
    }

    public boolean isUnderPublicSuffix() {
        return this.publicSuffixIndex > 0;
    }

    public boolean isTopPrivateDomain() {
        return this.publicSuffixIndex == 1;
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.name);
        return ancestor(this.publicSuffixIndex - 1);
    }

    public boolean hasParent() {
        return this.parts.size() > 1;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.name);
        return ancestor(1);
    }

    private InternetDomainName ancestor(int i) {
        Joiner joiner = DOT_JOINER;
        ImmutableList<String> immutableList = this.parts;
        return fromInternal(joiner.join((Iterable<?>) immutableList.subList(i, immutableList.size())));
    }

    public InternetDomainName child(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) Preconditions.checkNotNull(str));
        sb.append(".");
        sb.append(this.name);
        return fromInternal(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public InternetDomainName fromInternal(String str) {
        return fromLenient(str);
    }

    public static boolean isValidLenient(String str) {
        try {
            fromLenient(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean matchesWildcardPublicSuffix(String str) {
        String[] split = str.split(DOT_REGEX, 2);
        return split.length == 2 && TldPatterns.UNDER.contains(split[1]);
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("name", this.name).toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.name.equals(((InternetDomainName) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
