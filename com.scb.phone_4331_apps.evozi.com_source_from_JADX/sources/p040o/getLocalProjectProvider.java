package p040o;

import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.writeUInt64NoTag;

/* renamed from: o.getLocalProjectProvider */
public final /* synthetic */ class getLocalProjectProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4176cd MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getLocalProjectProvider(C4176cd cdVar, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = cdVar;
        this.MediaBrowserCompat$ItemReceiver = builder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r7) {
        /*
            r6 = this;
            o.cd r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.AutoValue_CrashlyticsReport_CustomAttribute$Builder r1 = r6.MediaBrowserCompat$ItemReceiver
            o.KtaJsonCheck$RatingCompat r7 = (p040o.KtaJsonCheck.RatingCompat) r7
            java.lang.String r2 = r1.MediaSessionCompat$Token
            if (r2 == 0) goto L_0x00cc
            java.lang.String r3 = "0"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = "RP_INITIAL"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00cc
            java.util.List<java.lang.String> r2 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r3 = r1.MediaSessionCompat$Token
            boolean r2 = r2.contains(r3)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            java.lang.String r7 = r1.MediaSessionCompat$Token
            o.getPassportParameters r1 = new o.getPassportParameters
            r1.<init>(r0, r7)
            T r7 = r0.RatingCompat
            if (r7 == 0) goto L_0x0032
            r3 = r4
        L_0x0032:
            if (r3 == 0) goto L_0x0039
            T r7 = r0.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x0039:
            return
        L_0x003a:
            java.util.List<java.lang.String> r2 = r0.write
            java.lang.String r5 = r1.MediaSessionCompat$Token
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0058
            java.lang.String r7 = r1.MediaSessionCompat$Token
            o.getVideoPlayerCameraPlayer r1 = new o.getVideoPlayerCameraPlayer
            r1.<init>(r0, r7)
            T r7 = r0.RatingCompat
            if (r7 == 0) goto L_0x0050
            r3 = r4
        L_0x0050:
            if (r3 == 0) goto L_0x0057
            T r7 = r0.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r2 = r1.MediaSessionCompat$Token
            boolean r2 = p040o.C4176cd.IconCompatParcelizer((java.lang.String) r2)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r7 = r1.MediaSessionCompat$Token
            int r1 = r7.hashCode()
            r2 = -527465066(0xffffffffe08f8596, float:-8.27347E19)
            r5 = 2
            if (r1 == r2) goto L_0x008a
            r2 = -221095274(0xfffffffff2d25a96, float:-8.3329746E30)
            if (r1 == r2) goto L_0x0080
            r2 = 867473415(0x33b49807, float:8.409557E-8)
            if (r1 != r2) goto L_0x0094
            java.lang.String r1 = "TOUCHPOINT_COMPLETE"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0094
            r7 = r5
            goto L_0x0095
        L_0x0080:
            java.lang.String r1 = "TOUCHPOINT_INITIAL"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0094
            r7 = r3
            goto L_0x0095
        L_0x008a:
            java.lang.String r1 = "TOUCHPOINT_VERIFIED"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0094
            r7 = r4
            goto L_0x0095
        L_0x0094:
            r7 = -1
        L_0x0095:
            if (r7 == 0) goto L_0x00b9
            if (r7 == r4) goto L_0x00aa
            if (r7 != r5) goto L_0x00c7
            o.bM r7 = p040o.C4073bM.IconCompatParcelizer
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x00a2
            r3 = r4
        L_0x00a2:
            if (r3 == 0) goto L_0x00a9
            T r0 = r0.RatingCompat
            r7.IconCompatParcelizer(r0)
        L_0x00a9:
            return
        L_0x00aa:
            o.getRttiExtractor r7 = p040o.getRttiExtractor.IconCompatParcelizer
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x00b1
            r3 = r4
        L_0x00b1:
            if (r3 == 0) goto L_0x00b8
            T r0 = r0.RatingCompat
            r7.IconCompatParcelizer(r0)
        L_0x00b8:
            return
        L_0x00b9:
            o.bL r7 = p040o.C4072bL.read
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x00c0
            r3 = r4
        L_0x00c0:
            if (r3 == 0) goto L_0x00c7
            T r0 = r0.RatingCompat
            r7.IconCompatParcelizer(r0)
        L_0x00c7:
            return
        L_0x00c8:
            r7.read()
            return
        L_0x00cc:
            r7.MediaBrowserCompat$SearchResultReceiver()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getLocalProjectProvider.IconCompatParcelizer(java.lang.Object):void");
    }
}
