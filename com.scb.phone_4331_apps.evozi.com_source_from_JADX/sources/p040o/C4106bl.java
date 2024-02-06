package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.bl */
public final /* synthetic */ class C4106bl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4128bz IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ C4106bl(C4128bz bzVar, boolean z, String str) {
        this.IconCompatParcelizer = bzVar;
        this.read = z;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.MediaBrowserCompat$SearchResultReceiver == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r6) {
        /*
            r5 = this;
            o.bz r0 = r5.IconCompatParcelizer
            boolean r1 = r5.read
            java.lang.String r2 = r5.MediaBrowserCompat$ItemReceiver
            o.getFrontImage r6 = (p040o.getFrontImage) r6
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x001e
            if (r2 == 0) goto L_0x0016
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0016
            r1 = r4
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 != 0) goto L_0x001e
            boolean r0 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r4
        L_0x001f:
            r6.MediaBrowserCompat$CustomActionResultReceiver((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4106bl.IconCompatParcelizer(java.lang.Object):void");
    }
}
