package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.Rotate */
public final /* synthetic */ class Rotate implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ gzipInputStream MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CaptureMessage MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ Rotate(CaptureMessage captureMessage, String str, gzipInputStream gzipinputstream) {
        this.MediaBrowserCompat$ItemReceiver = captureMessage;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = gzipinputstream;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r9) {
        /*
            r8 = this;
            o.CaptureMessage r0 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = r8.write
            o.gzipInputStream r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.PassportWorkflowActivity$a r9 = (p040o.PassportWorkflowActivity.C6985a) r9
            o.ResponseParser r3 = new o.ResponseParser
            r3.<init>()
            r0.ParcelableVolumeInfo = r3
            r0.MediaDescriptionCompat = r1
            int r3 = r1.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r3 == r7) goto L_0x003b
            r7 = 2670353(0x28bf11, float:3.741962E-39)
            if (r3 == r7) goto L_0x0031
            r7 = 1844922713(0x6df74959, float:9.5664337E27)
            if (r3 != r7) goto L_0x0045
            java.lang.String r3 = "CURRENT"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            r1 = r4
            goto L_0x0046
        L_0x0031:
            java.lang.String r3 = "WORK"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            r1 = r6
            goto L_0x0046
        L_0x003b:
            java.lang.String r3 = "HOME"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            r1 = r5
            goto L_0x0046
        L_0x0045:
            r1 = -1
        L_0x0046:
            if (r1 == 0) goto L_0x0054
            if (r1 == r6) goto L_0x0050
            if (r1 != r4) goto L_0x0057
            r9.MediaBrowserCompat$ItemReceiver()
            goto L_0x0057
        L_0x0050:
            r9.write()
            goto L_0x0057
        L_0x0054:
            r9.read()
        L_0x0057:
            if (r2 == 0) goto L_0x00d2
            r9.MediaBrowserCompat$CustomActionResultReceiver(r2)
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.read
            java.lang.String r3 = "<set-?>"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.write = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaSessionCompat$ResultReceiverWrapper
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaSessionCompat$QueueItem = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.ParcelableVolumeInfo
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.f2778x50fd9e4a = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaMetadataCompat
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaBrowserCompat$MediaItem = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaBrowserCompat$CustomActionResultReceiver = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaBrowserCompat$MediaItem
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.RatingCompat = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaBrowserCompat$SearchResultReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaMetadataCompat = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.write
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.read = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.IconCompatParcelizer
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaBrowserCompat$ItemReceiver = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.MediaDescriptionCompat
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaBrowserCompat$SearchResultReceiver = r1
            o.ResponseParser r9 = r0.ParcelableVolumeInfo
            java.lang.String r1 = r2.RatingCompat
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            r9.MediaSessionCompat$ResultReceiverWrapper = r1
            o.CaptureAnimationsModule r9 = new o.CaptureAnimationsModule
            r9.<init>(r0)
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x00cb
            r5 = r6
        L_0x00cb:
            if (r5 == 0) goto L_0x00d2
            T r0 = r0.RatingCompat
            r9.IconCompatParcelizer(r0)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Rotate.IconCompatParcelizer(java.lang.Object):void");
    }
}
