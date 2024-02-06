package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.writeSessionEventAppExecution */
public final /* synthetic */ class writeSessionEventAppExecution implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzsi MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ writeSessionEventAppExecution(buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver, zzsi zzsi) {
        this.write = buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzsi;
    }

    public final void IconCompatParcelizer(Object obj) {
        buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver = this.write;
        zzsi zzsi = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckCaptureModule$a$MediaBrowserCompat$ItemReceiver checkCaptureModule$a$MediaBrowserCompat$ItemReceiver = (CheckCaptureModule$a$MediaBrowserCompat$ItemReceiver) obj;
        checkCaptureModule$a$MediaBrowserCompat$ItemReceiver.write(buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        if (zzsi.MediaBrowserCompat$CustomActionResultReceiver != null) {
            checkCaptureModule$a$MediaBrowserCompat$ItemReceiver.read(buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(zzsi.MediaBrowserCompat$CustomActionResultReceiver, buildfeaturessessiondatafrom_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver));
        }
    }
}
