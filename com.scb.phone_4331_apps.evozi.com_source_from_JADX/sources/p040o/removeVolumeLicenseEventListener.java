package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeVolumeLicenseEventListener */
public final /* synthetic */ class removeVolumeLicenseEventListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ long MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ removeVolumeLicenseEventListener(C10829Sizeof.C37931 r1, boolean z, long j, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.read = z;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.read;
        long j = this.MediaBrowserCompat$ItemReceiver;
        String str = this.IconCompatParcelizer;
        getPayee getpayee = (getPayee) obj;
        if (!z || r0.PlaybackStateCompat$CustomAction.write.setShortcut()) {
            r0.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(r0.PlaybackStateCompat$CustomAction.read(j, false));
            getpayee.read(str);
            return;
        }
        getpayee.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.chubb_setting_alert_message);
    }
}
