package com.google.android.gms.internal.firebase_ml;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzfg {
    private static final Pattern zztz = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern zzua = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern zzub;
    private static final Pattern zzuc;
    private String type = "application";
    private String zzud = "octet-stream";
    private final SortedMap<String, String> zzue = new TreeMap();
    private String zzuf;

    public zzfg(String str) {
        Matcher matcher = zzub.matcher(str);
        zzks.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        zzks.checkArgument(zztz.matcher(group).matches(), "Type contains reserved characters");
        this.type = group;
        this.zzuf = null;
        String group2 = matcher.group(2);
        zzks.checkArgument(zztz.matcher(group2).matches(), "Subtype contains reserved characters");
        this.zzud = group2;
        this.zzuf = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = zzuc.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                zza(group4, group5);
            }
        }
    }

    private final zzfg zza(String str, String str2) {
        if (str2 == null) {
            this.zzuf = null;
            this.zzue.remove(str.toLowerCase(Locale.US));
            return this;
        }
        zzks.checkArgument(zzua.matcher(str).matches(), "Name contains reserved characters");
        this.zzuf = null;
        this.zzue.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    static boolean zzaf(String str) {
        return zzua.matcher(str).matches();
    }

    public final String zzew() {
        String str = this.zzuf;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.type);
        sb.append('/');
        sb.append(this.zzud);
        SortedMap<String, String> sortedMap = this.zzue;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append("=");
                if (!zzaf(str2)) {
                    String replace = str2.replace("\\", "\\\\").replace("\"", "\\\"");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 2);
                    sb2.append("\"");
                    sb2.append(replace);
                    sb2.append("\"");
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        String sb3 = sb.toString();
        this.zzuf = sb3;
        return sb3;
    }

    public final String toString() {
        return zzew();
    }

    private final boolean zza(zzfg zzfg) {
        return zzfg != null && this.type.equalsIgnoreCase(zzfg.type) && this.zzud.equalsIgnoreCase(zzfg.zzud);
    }

    public static boolean zzb(String str, String str2) {
        return str2 != null && new zzfg(str).zza(new zzfg(str2));
    }

    public final zzfg zza(Charset charset) {
        zza("charset", charset == null ? null : charset.name());
        return this;
    }

    public final Charset zzey() {
        String str = (String) this.zzue.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    public final int hashCode() {
        return zzew().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfg = (zzfg) obj;
        if (!zza(zzfg) || !this.zzue.equals(zzfg.zzue)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder(37);
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        zzub = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(22 + String.valueOf(sb3).length());
        sb4.append("\\s*;\\s*(");
        sb4.append("[^\\s/=;\"]+");
        sb4.append(")=(");
        sb4.append(sb3);
        sb4.append(")");
        zzuc = Pattern.compile(sb4.toString());
    }
}
