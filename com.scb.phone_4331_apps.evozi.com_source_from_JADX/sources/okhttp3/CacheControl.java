package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import p040o.GoodToKnowActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class CacheControl {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
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
        return this.sMaxAgeSeconds;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
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

    public final boolean immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m6345deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m6346deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m6341deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m6349deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m6344deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m6342deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m6343deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m6348deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m6347deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m6340deprecated_immutable() {
        return this.immutable;
    }

    public final String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
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
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
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
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = obj;
        return obj;
    }

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            return j <= 2147483647L ? (int) j : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        public final Builder noCache() {
            Builder builder = this;
            builder.noCache = true;
            return builder;
        }

        public final Builder noStore() {
            Builder builder = this;
            builder.noStore = true;
            return builder;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "timeUnit");
            Builder builder = this;
            if (i >= 0) {
                builder.maxAgeSeconds = builder.clampToInt(timeUnit.toSeconds((long) i));
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxAge < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "timeUnit");
            Builder builder = this;
            if (i >= 0) {
                builder.maxStaleSeconds = builder.clampToInt(timeUnit.toSeconds((long) i));
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "timeUnit");
            Builder builder = this;
            if (i >= 0) {
                builder.minFreshSeconds = builder.clampToInt(timeUnit.toSeconds((long) i));
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("minFresh < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder onlyIfCached() {
            Builder builder = this;
            builder.onlyIfCached = true;
            return builder;
        }

        public final Builder noTransform() {
            Builder builder = this;
            builder.noTransform = true;
            return builder;
        }

        public final Builder immutable() {
            Builder builder = this;
            builder.immutable = true;
            return builder;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (NtbDiscoverFundFilterActivity) null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(okhttp3.Headers r28) {
            /*
                r27 = this;
                r0 = r28
                java.lang.String r1 = "headers"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                int r1 = r28.size()
                r5 = 1
                r7 = r5
                r6 = 0
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
                r21 = 0
            L_0x0021:
                if (r6 >= r1) goto L_0x01b4
                java.lang.String r9 = r0.name(r6)
                java.lang.String r2 = r0.value(r6)
                java.lang.String r3 = "Cache-Control"
                boolean r3 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r9, r3, r5)
                if (r3 == 0) goto L_0x0037
                if (r8 != 0) goto L_0x003f
                r8 = r2
                goto L_0x0040
            L_0x0037:
                java.lang.String r3 = "Pragma"
                boolean r3 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r9, r3, r5)
                if (r3 == 0) goto L_0x01a8
            L_0x003f:
                r7 = 0
            L_0x0040:
                r3 = 0
            L_0x0041:
                int r9 = r2.length()
                if (r3 >= r9) goto L_0x01a1
                r9 = r27
                okhttp3.CacheControl$Companion r9 = (okhttp3.CacheControl.Companion) r9
                java.lang.String r5 = "=,;"
                int r5 = r9.indexOfElement(r2, r5, r3)
                java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
                if (r2 == 0) goto L_0x019b
                java.lang.String r3 = r2.substring(r3, r5)
                java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r0)
                r24 = r1
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x0195
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = p040o.GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(r3)
                java.lang.String r3 = r3.toString()
                r25 = r7
                int r7 = r2.length()
                if (r5 == r7) goto L_0x00e2
                char r7 = r2.charAt(r5)
                r26 = r8
                r8 = 44
                if (r7 == r8) goto L_0x00e4
                char r7 = r2.charAt(r5)
                r8 = 59
                if (r7 == r8) goto L_0x00e4
                int r5 = r5 + 1
                int r5 = okhttp3.internal.Util.indexOfNonWhitespace(r2, r5)
                int r7 = r2.length()
                if (r5 >= r7) goto L_0x00b8
                char r7 = r2.charAt(r5)
                r8 = 34
                if (r7 != r8) goto L_0x00b8
                int r5 = r5 + 1
                r1 = r2
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r7 = 0
                int r1 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r1, (char) r8, (int) r5, (boolean) r7)
                if (r2 == 0) goto L_0x00b2
                java.lang.String r4 = r2.substring(r5, r1)
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r0)
                r0 = 1
                int r1 = r1 + r0
                goto L_0x00e9
            L_0x00b2:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                r0.<init>(r4)
                throw r0
            L_0x00b8:
                r7 = 0
                java.lang.String r8 = ",;"
                int r8 = r9.indexOfElement(r2, r8, r5)
                if (r2 == 0) goto L_0x00dc
                java.lang.String r4 = r2.substring(r5, r8)
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r0)
                if (r4 == 0) goto L_0x00d6
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                java.lang.CharSequence r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(r4)
                java.lang.String r4 = r0.toString()
                r1 = r8
                goto L_0x00e9
            L_0x00d6:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                r0.<init>(r1)
                throw r0
            L_0x00dc:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                r0.<init>(r4)
                throw r0
            L_0x00e2:
                r26 = r8
            L_0x00e4:
                r7 = 0
                int r5 = r5 + 1
                r1 = r5
                r4 = 0
            L_0x00e9:
                java.lang.String r0 = "no-cache"
                r5 = 1
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x00fe
                r0 = r28
                r3 = r1
                r10 = r5
            L_0x00f6:
                r1 = r24
                r7 = r25
                r8 = r26
                goto L_0x0041
            L_0x00fe:
                java.lang.String r0 = "no-store"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x010b
                r0 = r28
                r3 = r1
                r11 = r5
                goto L_0x00f6
            L_0x010b:
                java.lang.String r0 = "max-age"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x011a
                r0 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r4, r0)
                goto L_0x0190
            L_0x011a:
                r0 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r8, r3, r5)
                if (r8 == 0) goto L_0x0129
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r4, r0)
                goto L_0x0190
            L_0x0129:
                java.lang.String r0 = "private"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x0136
                r0 = r28
                r3 = r1
                r14 = r5
                goto L_0x00f6
            L_0x0136:
                java.lang.String r0 = "public"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x0143
                r0 = r28
                r3 = r1
                r15 = r5
                goto L_0x00f6
            L_0x0143:
                java.lang.String r0 = "must-revalidate"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x0151
                r0 = r28
                r3 = r1
                r16 = r5
                goto L_0x00f6
            L_0x0151:
                java.lang.String r0 = "max-stale"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x0161
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r4, r0)
                goto L_0x0190
            L_0x0161:
                java.lang.String r0 = "min-fresh"
                boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r5)
                if (r0 == 0) goto L_0x016f
                r0 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r4, r0)
                goto L_0x0190
            L_0x016f:
                r0 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r4, r3, r5)
                if (r4 == 0) goto L_0x017b
                r19 = r5
                goto L_0x0190
            L_0x017b:
                java.lang.String r4 = "no-transform"
                boolean r4 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r4, r3, r5)
                if (r4 == 0) goto L_0x0186
                r20 = r5
                goto L_0x0190
            L_0x0186:
                java.lang.String r4 = "immutable"
                boolean r3 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r4, r3, r5)
                if (r3 == 0) goto L_0x0190
                r21 = r5
            L_0x0190:
                r0 = r28
                r3 = r1
                goto L_0x00f6
            L_0x0195:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                r0.<init>(r1)
                throw r0
            L_0x019b:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                r0.<init>(r4)
                throw r0
            L_0x01a1:
                r24 = r1
                r25 = r7
                r26 = r8
                goto L_0x01aa
            L_0x01a8:
                r24 = r1
            L_0x01aa:
                r0 = -1
                r1 = 0
                int r6 = r6 + 1
                r0 = r28
                r1 = r24
                goto L_0x0021
            L_0x01b4:
                if (r7 == 0) goto L_0x01b9
                r22 = r8
                goto L_0x01bb
            L_0x01b9:
                r22 = 0
            L_0x01bb:
                okhttp3.CacheControl r0 = new okhttp3.CacheControl
                r23 = 0
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                CharSequence charSequence = str2;
                char charAt = str.charAt(i);
                onGetStartedClick.write((Object) charSequence, "$this$contains");
                boolean z = false;
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, charAt, 0, false) >= 0) {
                    z = true;
                }
                if (z) {
                    return i;
                }
                i++;
            }
            return str.length();
        }
    }
}
