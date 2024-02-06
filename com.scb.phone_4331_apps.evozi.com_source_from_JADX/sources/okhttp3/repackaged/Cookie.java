package okhttp3.repackaged;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.http.HttpDate;

public final class Cookie {
    private static final Pattern ahr = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern ahs = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern aht = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern ahu = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
        this.persistent = z4;
    }

    private Cookie(Builder builder) {
        if (builder.name == null) {
            throw new IllegalArgumentException("builder.name == null");
        } else if (builder.value == null) {
            throw new IllegalArgumentException("builder.value == null");
        } else if (builder.domain != null) {
            this.name = builder.name;
            this.value = builder.value;
            this.expiresAt = builder.expiresAt;
            this.domain = builder.domain;
            this.path = builder.path;
            this.secure = builder.secure;
            this.httpOnly = builder.httpOnly;
            this.persistent = builder.persistent;
            this.hostOnly = builder.hostOnly;
        } else {
            throw new IllegalArgumentException("builder.domain == null");
        }
    }

    public final String name() {
        return this.name;
    }

    public final String value() {
        return this.value;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final String domain() {
        return this.domain;
    }

    public final String path() {
        return this.path;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean z;
        if (this.hostOnly) {
            z = httpUrl.host().equals(this.domain);
        } else {
            z = m5821a(httpUrl, this.domain);
        }
        if (!z || !m5824b(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5821a(HttpUrl httpUrl, String str) {
        String host = httpUrl.host();
        if (host.equals(str)) {
            return true;
        }
        if (!host.endsWith(str) || host.charAt((host.length() - str.length()) - 1) != '.' || Util.verifyAsIpAddress(host)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m5824b(HttpUrl httpUrl, String str) {
        String encodedPath = httpUrl.encodedPath();
        if (encodedPath.equals(str)) {
            return true;
        }
        if (!encodedPath.startsWith(str)) {
            return false;
        }
        if (!str.endsWith("/") && encodedPath.charAt(str.length()) != '/') {
            return false;
        }
        return true;
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
        return m5820a(System.currentTimeMillis(), httpUrl, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static okhttp3.repackaged.Cookie m5820a(long r23, okhttp3.repackaged.HttpUrl r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 59
            r3 = 0
            int r4 = okhttp3.repackaged.internal.Util.delimiterOffset((java.lang.String) r0, (int) r3, (int) r1, (char) r2)
            r5 = 61
            int r6 = okhttp3.repackaged.internal.Util.delimiterOffset((java.lang.String) r0, (int) r3, (int) r4, (char) r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = okhttp3.repackaged.internal.Util.trimSubstring(r0, r3, r6)
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0022
            return r7
        L_0x0022:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r10 = okhttp3.repackaged.internal.Util.trimSubstring(r0, r6, r4)
            int r4 = r4 + r8
            r11 = -1
            r13 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r15 = r3
            r16 = r15
            r18 = r16
            r6 = r7
            r17 = r8
            r19 = r11
            r21 = r13
            r8 = r6
        L_0x003d:
            if (r4 >= r1) goto L_0x00ab
            int r7 = okhttp3.repackaged.internal.Util.delimiterOffset((java.lang.String) r0, (int) r4, (int) r1, (char) r2)
            int r2 = okhttp3.repackaged.internal.Util.delimiterOffset((java.lang.String) r0, (int) r4, (int) r7, (char) r5)
            java.lang.String r4 = okhttp3.repackaged.internal.Util.trimSubstring(r0, r4, r2)
            if (r2 >= r7) goto L_0x0054
            int r2 = r2 + 1
            java.lang.String r2 = okhttp3.repackaged.internal.Util.trimSubstring(r0, r2, r7)
            goto L_0x0056
        L_0x0054:
            java.lang.String r2 = ""
        L_0x0056:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0067
            int r4 = r2.length()     // Catch:{ IllegalArgumentException -> 0x00a3 }
            long r21 = m5819a((java.lang.String) r2, (int) r3, (int) r4)     // Catch:{ IllegalArgumentException -> 0x00a3 }
            goto L_0x0073
        L_0x0067:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            long r19 = m5822aR(r2)     // Catch:{  }
        L_0x0073:
            r18 = 1
            goto L_0x00a3
        L_0x0076:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            java.lang.String r8 = m5823aS(r2)     // Catch:{ IllegalArgumentException -> 0x00a3 }
            r17 = r3
            goto L_0x00a3
        L_0x0085:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x008f
            r6 = r2
            goto L_0x00a3
        L_0x008f:
            java.lang.String r2 = "secure"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0099
            r15 = 1
            goto L_0x00a3
        L_0x0099:
            java.lang.String r2 = "httponly"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a3
            r16 = 1
        L_0x00a3:
            int r4 = r7 + 1
            r2 = 59
            r5 = 61
            r7 = 0
            goto L_0x003d
        L_0x00ab:
            r0 = -9223372036854775808
            int r2 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00b2
            goto L_0x00d4
        L_0x00b2:
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00d8
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00c4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00c9
        L_0x00c4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00c9:
            long r0 = r23 + r19
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 < 0) goto L_0x00d6
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r11 = r0
            goto L_0x00da
        L_0x00d6:
            r11 = r13
            goto L_0x00da
        L_0x00d8:
            r11 = r21
        L_0x00da:
            if (r8 != 0) goto L_0x00e4
            java.lang.String r0 = r25.host()
            r13 = r0
            r0 = r25
            goto L_0x00ef
        L_0x00e4:
            r0 = r25
            boolean r1 = m5821a(r0, r8)
            if (r1 != 0) goto L_0x00ee
            r1 = 0
            return r1
        L_0x00ee:
            r13 = r8
        L_0x00ef:
            java.lang.String r1 = "/"
            if (r6 == 0) goto L_0x00fb
            boolean r2 = r6.startsWith(r1)
            if (r2 == 0) goto L_0x00fb
            r14 = r6
            goto L_0x010e
        L_0x00fb:
            java.lang.String r0 = r25.encodedPath()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            if (r2 == 0) goto L_0x010d
            java.lang.String r0 = r0.substring(r3, r2)
            r14 = r0
            goto L_0x010e
        L_0x010d:
            r14 = r1
        L_0x010e:
            okhttp3.repackaged.Cookie r0 = new okhttp3.repackaged.Cookie
            r8 = r0
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.Cookie.m5820a(long, okhttp3.repackaged.HttpUrl, java.lang.String):okhttp3.repackaged.Cookie");
    }

    /* renamed from: a */
    private static long m5819a(String str, int i, int i2) {
        int a = m5818a(str, i, i2, false);
        Matcher matcher = ahu.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m5818a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(ahu).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(aht).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(ahs).matches()) {
                i6 = ahs.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(ahr).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a = m5818a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 <= 0 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: a */
    private static int m5818a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: aR */
    private static long m5822aR(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                return parseLong;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (!str.startsWith("-")) {
                return Long.MAX_VALUE;
            } else {
                return Long.MIN_VALUE;
            }
        }
    }

    /* renamed from: aS */
    private static String m5823aS(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String domainToAscii = Util.domainToAscii(str);
            if (domainToAscii != null) {
                return domainToAscii;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> values = headers.values("Set-Cookie");
        int size = values.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Cookie parse = parse(httpUrl, values.get(i));
            if (parse != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parse);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public static final class Builder {
        String domain;
        long expiresAt = 253402300799999L;
        boolean hostOnly;
        boolean httpOnly;
        String name;
        String path = "/";
        boolean persistent;
        boolean secure;
        String value;

        public final Builder name(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.name = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public final Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.value = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder domain(String str) {
            return m5825d(str, false);
        }

        public final Builder hostOnlyDomain(String str) {
            return m5825d(str, true);
        }

        /* renamed from: d */
        private Builder m5825d(String str, boolean z) {
            if (str != null) {
                String domainToAscii = Util.domainToAscii(str);
                if (domainToAscii != null) {
                    this.domain = domainToAscii;
                    this.hostOnly = z;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected domain: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("domain == null");
        }

        public final Builder path(String str) {
            if (str.startsWith("/")) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Cookie build() {
            return new Cookie(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(HttpDate.format(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.expiresAt == this.expiresAt && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.value.hashCode();
        int hashCode3 = this.domain.hashCode();
        int hashCode4 = this.path.hashCode();
        long j = this.expiresAt;
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.secure ^ true ? 1 : 0)) * 31) + (this.httpOnly ^ true ? 1 : 0)) * 31) + (this.persistent ^ true ? 1 : 0)) * 31) + (this.hostOnly ^ true ? 1 : 0);
    }
}
