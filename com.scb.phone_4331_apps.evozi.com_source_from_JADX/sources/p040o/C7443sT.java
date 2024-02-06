package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sT */
public final /* synthetic */ class C7443sT implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ sE$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ C7443sT(sE$MediaBrowserCompat$ItemReceiver se_mediabrowsercompat_itemreceiver, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = se_mediabrowsercompat_itemreceiver;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        sE$MediaBrowserCompat$ItemReceiver se_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        C5421state unused = se_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.write;
        getIdManager$MediaBrowserCompat$CustomActionResultReceiver getidmanager_mediabrowsercompat_customactionresultreceiver = new getIdManager$MediaBrowserCompat$CustomActionResultReceiver();
        getidmanager_mediabrowsercompat_customactionresultreceiver.read = "EDONATION";
        getidmanager_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = str;
        getidmanager_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = true;
        ((getTopLeftCornerWidth.PlaybackStateCompat) obj).MediaBrowserCompat$ItemReceiver(new getIdManager(getidmanager_mediabrowsercompat_customactionresultreceiver, (byte) 0));
    }
}
