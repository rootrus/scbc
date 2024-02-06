package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBitsPerPixel */
public final class getBitsPerPixel extends getChannels<C1161xfaac52a4> {
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;

    /* renamed from: o.getBitsPerPixel$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1161xfaac52a4> {
        private /* synthetic */ getBitsPerPixel write;

        IconCompatParcelizer(getBitsPerPixel getbitsperpixel) {
            this.write = getbitsperpixel;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C1161xfaac52a4 checkExtractActivity_MembersInjector$MediaBrowserCompat$SearchResultReceiver = (C1161xfaac52a4) obj;
            String str = this.write.write;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentStatus");
            }
            checkExtractActivity_MembersInjector$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getBitsPerPixel(RegularImmutableBiMap regularImmutableBiMap, Multisets.UnmodifiableMultiset unmodifiableMultiset, setMaxGapFrames setmaxgapframes, setRequestedFps setrequestedfps, toLongArray tolongarray) {
        super(regularImmutableBiMap, unmodifiableMultiset, setmaxgapframes, setrequestedfps, tolongarray);
        onGetStartedClick.write((Object) unmodifiableMultiset, "easycashContactInformationDisplayMapper");
        onGetStartedClick.write((Object) setmaxgapframes, "termsAndConditionsCase");
        onGetStartedClick.write((Object) setrequestedfps, "easycashNCBCase");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConsMapper");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) "LOANS", (java.lang.Object) r0) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r3 = this;
            java.lang.String r0 = r3.MediaBrowserCompat$MediaItem
            java.lang.String r1 = "productGroup"
            if (r0 != 0) goto L_0x0009
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            java.lang.String r2 = "CARDS"
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = r3.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x0018
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0018:
            java.lang.String r1 = "LOANS"
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0047
        L_0x0020:
            java.lang.String r0 = r3.MediaDescriptionCompat
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = "flowType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0029:
            java.lang.String r1 = "NON_REFERRAL"
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0047
            o.getBitsPerPixel$IconCompatParcelizer r0 = new o.getBitsPerPixel$IconCompatParcelizer
            r0.<init>(r3)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x0046
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0046:
            return
        L_0x0047:
            super.read()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getBitsPerPixel.read():void");
    }
}
