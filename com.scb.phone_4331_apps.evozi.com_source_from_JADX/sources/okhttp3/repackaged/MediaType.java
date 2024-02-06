package okhttp3.repackaged;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {
    private static final String ahU = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final String ahV = "\"([^\"]*)\"";
    private static final Pattern ahW = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern ahX = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String ahY;
    private final String ahZ;
    private final String charset;
    private final String type;

    private MediaType(String str, String str2, String str3, String str4) {
        this.ahY = str;
        this.type = str2;
        this.ahZ = str3;
        this.charset = str4;
    }

    public static MediaType parse(String str) {
        String str2;
        Matcher matcher = ahW.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = ahX.matcher(str);
        String str3 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                if (matcher2.group(2) != null) {
                    str2 = matcher2.group(2);
                } else {
                    str2 = matcher2.group(3);
                }
                if (str3 == null || str2.equalsIgnoreCase(str3)) {
                    str3 = str2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple different charsets: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str3);
    }

    public final String type() {
        return this.type;
    }

    public final String subtype() {
        return this.ahZ;
    }

    public final Charset charset() {
        String str = this.charset;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    public final Charset charset(Charset charset2) {
        String str = this.charset;
        return str != null ? Charset.forName(str) : charset2;
    }

    public final String toString() {
        return this.ahY;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).ahY.equals(this.ahY);
    }

    public final int hashCode() {
        return this.ahY.hashCode();
    }
}
