package okhttp3;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p040o.GoodToKnowActivity;
import p040o.HmlNationalIdActivity;
import p040o.LifestyleCustomizationActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class Cookie {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */
    public static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */
    public static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */
    public static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public final String name() {
        return this.name;
    }

    public final String value() {
        return this.value;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final String domain() {
        return this.domain;
    }

    public final String path() {
        return this.path;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean z;
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        if (this.hostOnly) {
            z = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) httpUrl.host(), (Object) this.domain);
        } else {
            z = Companion.domainMatch(httpUrl.host(), this.domain);
        }
        if (!z || !Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cookie.name, (Object) this.name) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cookie.value, (Object) this.value) && cookie.expiresAt == this.expiresAt && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cookie.domain, (Object) this.domain) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cookie.path, (Object) this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
        }
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.value.hashCode();
        long j = this.expiresAt;
        int i = (int) (j ^ (j >>> 32));
        int hashCode3 = this.domain.hashCode();
        int hashCode4 = this.path.hashCode();
        int i2 = 1231;
        int i3 = (((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.httpOnly ? 1231 : 1237)) * 31) + (this.persistent ? 1231 : 1237)) * 31;
        if (!this.hostOnly) {
            i2 = 1237;
        }
        return i3 + i2;
    }

    public final String toString() {
        return toString$okhttp(false);
    }

    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m6355deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_value  reason: not valid java name */
    public final String m6359deprecated_value() {
        return this.value;
    }

    /* renamed from: -deprecated_persistent  reason: not valid java name */
    public final boolean m6357deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_expiresAt  reason: not valid java name */
    public final long m6352deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly  reason: not valid java name */
    public final boolean m6353deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_domain  reason: not valid java name */
    public final String m6351deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_path  reason: not valid java name */
    public final String m6356deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_httpOnly  reason: not valid java name */
    public final boolean m6354deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_secure  reason: not valid java name */
    public final boolean m6358deprecated_secure() {
        return this.secure;
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
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
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "toString()");
        return obj;
    }

    public static final class Builder {
        private String domain;
        private long expiresAt = 253402300799999L;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path = "/";
        private boolean persistent;
        private boolean secure;
        private String value;

        public final Builder name(String str) {
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString(), (Object) str)) {
                builder.name = str;
                return builder;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final Builder value(String str) {
            onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString(), (Object) str)) {
                builder.value = str;
                return builder;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        public final Builder expiresAt(long j) {
            Builder builder = this;
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            builder.expiresAt = j;
            builder.persistent = true;
            return builder;
        }

        public final Builder domain(String str) {
            onGetStartedClick.write((Object) str, "domain");
            return domain(str, false);
        }

        public final Builder hostOnlyDomain(String str) {
            onGetStartedClick.write((Object) str, "domain");
            return domain(str, true);
        }

        private final Builder domain(String str, boolean z) {
            Builder builder = this;
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                builder.domain = canonicalHost;
                builder.hostOnly = z;
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected domain: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder path(String str) {
            onGetStartedClick.write((Object) str, "path");
            Builder builder = this;
            if (GoodToKnowActivity.read(str, "/", false)) {
                builder.path = str;
                return builder;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final Builder secure() {
            Builder builder = this;
            builder.secure = true;
            return builder;
        }

        public final Builder httpOnly() {
            Builder builder = this;
            builder.httpOnly = true;
            return builder;
        }

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, (NtbDiscoverFundFilterActivity) null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) str2)) {
                return true;
            }
            onGetStartedClick.write((Object) str, "$this$endsWith");
            onGetStartedClick.write((Object) str2, "suffix");
            if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || Util.canParseAsIpAddress(str)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) encodedPath, (Object) str)) {
                return true;
            }
            if (GoodToKnowActivity.read(encodedPath, str, false)) {
                onGetStartedClick.write((Object) str, "$this$endsWith");
                onGetStartedClick.write((Object) "/", "suffix");
                return str.endsWith("/") || encodedPath.charAt(str.length()) == '/';
            }
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
            onGetStartedClick.write((Object) str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
            if (r0 > 253402300799999L) goto L_0x0115;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0146 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.Cookie parse$okhttp(long r24, okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                r23 = this;
                r6 = r27
                java.lang.String r0 = "url"
                r7 = r26
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
                java.lang.String r0 = "setCookie"
                p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
                r1 = 59
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r27
                int r8 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r0, (char) r1, (int) r2, (int) r3, (int) r4, (java.lang.Object) r5)
                r1 = 61
                r4 = 2
                r3 = r8
                int r0 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r0, (char) r1, (int) r2, (int) r3, (int) r4, (java.lang.Object) r5)
                r1 = 0
                if (r0 != r8) goto L_0x0026
                return r1
            L_0x0026:
                r2 = 0
                r3 = 1
                java.lang.String r10 = okhttp3.internal.Util.trimSubstring$default(r6, r2, r0, r3, r1)
                r4 = r10
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0037
                r4 = r3
                goto L_0x0038
            L_0x0037:
                r4 = r2
            L_0x0038:
                if (r4 != 0) goto L_0x018c
                int r4 = okhttp3.internal.Util.indexOfControlOrNonAscii(r10)
                r5 = -1
                if (r4 != r5) goto L_0x018c
                int r0 = r0 + r3
                java.lang.String r11 = okhttp3.internal.Util.trimSubstring(r6, r0, r8)
                int r0 = okhttp3.internal.Util.indexOfControlOrNonAscii(r11)
                if (r0 == r5) goto L_0x004d
                return r1
            L_0x004d:
                int r8 = r8 + r3
                int r0 = r27.length()
                r4 = -1
                r9 = r1
                r22 = r9
                r16 = r2
                r17 = r16
                r18 = r17
                r19 = r3
                r14 = r4
                r20 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0065:
                if (r8 >= r0) goto L_0x00e1
                r1 = 59
                int r1 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r6, (char) r1, (int) r8, (int) r0)
                r12 = 61
                int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r6, (char) r12, (int) r8, (int) r1)
                java.lang.String r8 = okhttp3.internal.Util.trimSubstring(r6, r8, r12)
                if (r12 >= r1) goto L_0x0080
                int r12 = r12 + 1
                java.lang.String r12 = okhttp3.internal.Util.trimSubstring(r6, r12, r1)
                goto L_0x0082
            L_0x0080:
                java.lang.String r12 = ""
            L_0x0082:
                java.lang.String r13 = "expires"
                boolean r13 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r13, r3)
                if (r13 == 0) goto L_0x0097
                r8 = r23
                okhttp3.Cookie$Companion r8 = (okhttp3.Cookie.Companion) r8     // Catch:{ IllegalArgumentException -> 0x00dd }
                int r13 = r12.length()     // Catch:{ IllegalArgumentException -> 0x00dd }
                long r20 = r8.parseExpires(r12, r2, r13)     // Catch:{ IllegalArgumentException -> 0x00dd }
                goto L_0x00a7
            L_0x0097:
                java.lang.String r13 = "max-age"
                boolean r13 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r13, r3)
                if (r13 == 0) goto L_0x00aa
                r8 = r23
                okhttp3.Cookie$Companion r8 = (okhttp3.Cookie.Companion) r8     // Catch:{  }
                long r14 = r8.parseMaxAge(r12)     // Catch:{  }
            L_0x00a7:
                r18 = r3
                goto L_0x00dd
            L_0x00aa:
                java.lang.String r13 = "domain"
                boolean r13 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r13, r3)
                if (r13 == 0) goto L_0x00bd
                r8 = r23
                okhttp3.Cookie$Companion r8 = (okhttp3.Cookie.Companion) r8     // Catch:{ IllegalArgumentException -> 0x00dd }
                java.lang.String r9 = r8.parseDomain(r12)     // Catch:{ IllegalArgumentException -> 0x00dd }
                r19 = r2
                goto L_0x00dd
            L_0x00bd:
                java.lang.String r13 = "path"
                boolean r13 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r13, r3)
                if (r13 == 0) goto L_0x00c8
                r22 = r12
                goto L_0x00dd
            L_0x00c8:
                java.lang.String r12 = "secure"
                boolean r12 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r12, r3)
                if (r12 == 0) goto L_0x00d3
                r16 = r3
                goto L_0x00dd
            L_0x00d3:
                java.lang.String r12 = "httponly"
                boolean r8 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r12, r3)
                if (r8 == 0) goto L_0x00dd
                r17 = r3
            L_0x00dd:
                int r8 = r1 + 1
                r1 = 0
                goto L_0x0065
            L_0x00e1:
                r0 = -9223372036854775808
                int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r6 != 0) goto L_0x00e8
                goto L_0x010e
            L_0x00e8:
                int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x0117
                r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r0 > 0) goto L_0x00f9
                r0 = 1000(0x3e8, double:4.94E-321)
                long r14 = r14 * r0
                goto L_0x00fe
            L_0x00f9:
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00fe:
                long r0 = r24 + r14
                int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
                if (r4 < 0) goto L_0x0110
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x010e
                goto L_0x0115
            L_0x010e:
                r12 = r0
                goto L_0x0119
            L_0x0110:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0115:
                r12 = r4
                goto L_0x0119
            L_0x0117:
                r12 = r20
            L_0x0119:
                java.lang.String r0 = r26.host()
                if (r9 != 0) goto L_0x0122
                r14 = r0
                r1 = 0
                goto L_0x0130
            L_0x0122:
                r1 = r23
                okhttp3.Cookie$Companion r1 = (okhttp3.Cookie.Companion) r1
                boolean r1 = r1.domainMatch(r0, r9)
                if (r1 != 0) goto L_0x012e
                r1 = 0
                return r1
            L_0x012e:
                r1 = 0
                r14 = r9
            L_0x0130:
                int r0 = r0.length()
                int r4 = r14.length()
                if (r0 == r4) goto L_0x0147
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = r0.get()
                java.lang.String r0 = r0.getEffectiveTldPlusOne(r14)
                if (r0 != 0) goto L_0x0147
                return r1
            L_0x0147:
                java.lang.String r0 = "/"
                r1 = r22
                if (r1 == 0) goto L_0x0155
                boolean r4 = p040o.GoodToKnowActivity.read(r1, r0, r2)
                if (r4 == 0) goto L_0x0155
                r15 = r1
                goto L_0x0183
            L_0x0155:
                java.lang.String r1 = r26.encodedPath()
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r5 = 47
                java.lang.String r6 = "$this$lastIndex"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r6)
                int r6 = r4.length()
                int r6 = r6 - r3
                int r3 = p040o.GoodToKnowActivity.IconCompatParcelizer((java.lang.CharSequence) r4, (char) r5, (int) r6, (boolean) r2)
                if (r3 == 0) goto L_0x0182
                if (r1 == 0) goto L_0x017a
                java.lang.String r0 = r1.substring(r2, r3)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                goto L_0x0182
            L_0x017a:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x0182:
                r15 = r0
            L_0x0183:
                okhttp3.Cookie r0 = new okhttp3.Cookie
                r20 = 0
                r9 = r0
                r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
                return r0
            L_0x018c:
                r0 = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        private final long parseExpires(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            Companion companion = this;
            int dateCharacterOffset = companion.dateCharacterOffset(str2, i, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (dateCharacterOffset < i3) {
                int dateCharacterOffset2 = companion.dateCharacterOffset(str2, dateCharacterOffset + 1, i3, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    i5 = Integer.parseInt(matcher.group(1));
                    i8 = Integer.parseInt(matcher.group(2));
                    i9 = Integer.parseInt(matcher.group(3));
                } else if (i6 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    i6 = Integer.parseInt(matcher.group(1));
                } else if (i7 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group = matcher.group(1);
                    onGetStartedClick.IconCompatParcelizer((Object) group, "matcher.group(1)");
                    Locale locale = Locale.US;
                    onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
                    if (group != null) {
                        String lowerCase = group.toLowerCase(locale);
                        onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = Cookie.MONTH_PATTERN.pattern();
                        onGetStartedClick.IconCompatParcelizer((Object) pattern, "MONTH_PATTERN.pattern()");
                        i7 = GoodToKnowActivity.read((CharSequence) pattern, lowerCase, 0, false) / 4;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
                dateCharacterOffset = companion.dateCharacterOffset(str2, dateCharacterOffset2 + 1, i3, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            }
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (i6 > 0 && 31 >= i6) {
                        if (i5 >= 0 && 23 >= i5) {
                            if (i8 >= 0 && 59 >= i8) {
                                if (i9 >= 0 && 59 >= i9) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    return parseLong;
                }
                return Long.MIN_VALUE;
            } catch (NumberFormatException e) {
                CharSequence charSequence = str;
                LifestyleCustomizationActivity lifestyleCustomizationActivity = new LifestyleCustomizationActivity("-?\\d+");
                onGetStartedClick.write((Object) charSequence, "input");
                if (!lifestyleCustomizationActivity.write.matcher(charSequence).matches()) {
                    throw e;
                } else if (!GoodToKnowActivity.read(str, "-", false)) {
                    return Long.MAX_VALUE;
                } else {
                    return Long.MIN_VALUE;
                }
            }
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
            onGetStartedClick.write((Object) headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            List list = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(parse);
                }
            }
            if (list == null) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<Cookie> unmodifiableList = Collections.unmodifiableList(list);
            onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        private final String parseDomain(String str) {
            boolean z;
            onGetStartedClick.write((Object) str, "$this$endsWith");
            onGetStartedClick.write((Object) ".", "suffix");
            if (!str.endsWith(".")) {
                onGetStartedClick.write((Object) str, "$this$removePrefix");
                onGetStartedClick.write((Object) r0, "prefix");
                CharSequence charSequence = str;
                onGetStartedClick.write((Object) charSequence, "$this$startsWith");
                onGetStartedClick.write((Object) r0, "prefix");
                if (charSequence instanceof String) {
                    z = GoodToKnowActivity.read((String) charSequence, (String) r0, false);
                } else {
                    z = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, r0, 0, r0.length(), false);
                }
                if (z) {
                    str = str.substring(r0.length());
                    onGetStartedClick.IconCompatParcelizer((Object) str, "(this as java.lang.String).substring(startIndex)");
                }
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
