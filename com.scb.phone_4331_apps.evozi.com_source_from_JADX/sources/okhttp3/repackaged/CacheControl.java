package okhttp3.repackaged;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

public final class CacheControl {
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private final int aha;
    private final boolean ahb;
    private final boolean ahc;
    private final boolean ahd;
    String headerValue;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.aha = i2;
        this.ahb = z3;
        this.ahc = z4;
        this.ahd = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.headerValue = str;
    }

    private CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.aha = -1;
        this.ahb = false;
        this.ahc = false;
        this.ahd = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int sMaxAgeSeconds() {
        return this.aha;
    }

    public final boolean isPrivate() {
        return this.ahb;
    }

    public final boolean isPublic() {
        return this.ahc;
    }

    public final boolean mustRevalidate() {
        return this.ahd;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.repackaged.CacheControl parse(okhttp3.repackaged.Headers r23) {
        /*
            r0 = r23
            int r1 = r23.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
        L_0x0019:
            if (r6 >= r1) goto L_0x0133
            java.lang.String r9 = r0.name(r6)
            java.lang.String r2 = r0.value(r6)
            java.lang.String r4 = "Cache-Control"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x002f
            if (r8 != 0) goto L_0x0037
            r8 = r2
            goto L_0x0038
        L_0x002f:
            java.lang.String r4 = "Pragma"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x012c
        L_0x0037:
            r7 = 0
        L_0x0038:
            r4 = 0
        L_0x0039:
            int r9 = r2.length()
            if (r4 >= r9) goto L_0x012c
            java.lang.String r9 = "=,;"
            int r9 = okhttp3.repackaged.internal.http.HeaderParser.skipUntil(r2, r4, r9)
            java.lang.String r4 = r2.substring(r4, r9)
            java.lang.String r4 = r4.trim()
            int r3 = r2.length()
            if (r9 == r3) goto L_0x0099
            char r3 = r2.charAt(r9)
            r5 = 44
            if (r3 == r5) goto L_0x0099
            char r3 = r2.charAt(r9)
            r5 = 59
            if (r3 == r5) goto L_0x0099
            int r9 = r9 + 1
            int r3 = okhttp3.repackaged.internal.http.HeaderParser.skipWhitespace(r2, r9)
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x0088
            char r5 = r2.charAt(r3)
            r9 = 34
            if (r5 != r9) goto L_0x0088
            int r3 = r3 + 1
            java.lang.String r5 = "\""
            int r5 = okhttp3.repackaged.internal.http.HeaderParser.skipUntil(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            r22 = 1
            int r5 = r5 + 1
            goto L_0x009f
        L_0x0088:
            r22 = 1
            java.lang.String r5 = ",;"
            int r5 = okhttp3.repackaged.internal.http.HeaderParser.skipUntil(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            java.lang.String r3 = r3.trim()
            goto L_0x009f
        L_0x0099:
            r22 = 1
            int r9 = r9 + 1
            r5 = r9
            r3 = 0
        L_0x009f:
            java.lang.String r9 = "no-cache"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00ac
            r10 = r22
        L_0x00a9:
            r9 = -1
            goto L_0x0129
        L_0x00ac:
            java.lang.String r9 = "no-store"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00b7
            r11 = r22
            goto L_0x00a9
        L_0x00b7:
            java.lang.String r9 = "max-age"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00c6
            r9 = -1
            int r12 = okhttp3.repackaged.internal.http.HeaderParser.parseSeconds(r3, r9)
            goto L_0x0129
        L_0x00c6:
            java.lang.String r9 = "s-maxage"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00d4
            r9 = -1
            int r13 = okhttp3.repackaged.internal.http.HeaderParser.parseSeconds(r3, r9)
            goto L_0x0129
        L_0x00d4:
            java.lang.String r9 = "private"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00df
            r14 = r22
            goto L_0x00a9
        L_0x00df:
            java.lang.String r9 = "public"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00ea
            r15 = r22
            goto L_0x00a9
        L_0x00ea:
            java.lang.String r9 = "must-revalidate"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00f5
            r16 = r22
            goto L_0x00a9
        L_0x00f5:
            java.lang.String r9 = "max-stale"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0105
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r17 = okhttp3.repackaged.internal.http.HeaderParser.parseSeconds(r3, r4)
            goto L_0x00a9
        L_0x0105:
            java.lang.String r9 = "min-fresh"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0113
            r9 = -1
            int r18 = okhttp3.repackaged.internal.http.HeaderParser.parseSeconds(r3, r9)
            goto L_0x0129
        L_0x0113:
            r9 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x011f
            r19 = r22
            goto L_0x0129
        L_0x011f:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0129
            r20 = r22
        L_0x0129:
            r4 = r5
            goto L_0x0039
        L_0x012c:
            r9 = -1
            r22 = 1
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0133:
            if (r7 != 0) goto L_0x0138
            r21 = 0
            goto L_0x013a
        L_0x0138:
            r21 = r8
        L_0x013a:
            okhttp3.repackaged.CacheControl r0 = new okhttp3.repackaged.CacheControl
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.CacheControl.parse(okhttp3.repackaged.Headers):okhttp3.repackaged.CacheControl");
    }

    public final String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        String ul = m5796ul();
        this.headerValue = ul;
        return ul;
    }

    /* renamed from: ul */
    private String m5796ul() {
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.aha != -1) {
            sb.append("s-maxage=");
            sb.append(this.aha);
            sb.append(", ");
        }
        if (this.ahb) {
            sb.append("private, ");
        }
        if (this.ahc) {
            sb.append("public, ");
        }
        if (this.ahd) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public static final class Builder {
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.maxAgeSeconds = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxAge < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.maxStaleSeconds = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.minFreshSeconds = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("minFresh < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final CacheControl build() {
            return new CacheControl(this);
        }
    }
}
