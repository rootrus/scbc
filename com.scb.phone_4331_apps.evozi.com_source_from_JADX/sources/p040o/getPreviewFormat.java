package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getPreviewFormat */
public final /* synthetic */ class getPreviewFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4128bz write;

    public /* synthetic */ getPreviewFormat(C4128bz bzVar, boolean z, String str) {
        this.write = bzVar;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.MediaBrowserCompat$MediaItem == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r6) {
        /*
            r5 = this;
            o.bz r0 = r5.write
            boolean r1 = r5.IconCompatParcelizer
            java.lang.String r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
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
            boolean r0 = r0.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r4
        L_0x001f:
            r6.MediaBrowserCompat$ItemReceiver(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getPreviewFormat.IconCompatParcelizer(java.lang.Object):void");
    }
}
