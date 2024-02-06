package p040o;

import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.executeKMSSoapCall$MediaBrowserCompat$SearchResultReceiver */
final class executeKMSSoapCall$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<C6977x9bb0870b> {
    private /* synthetic */ zziu.zzc MediaBrowserCompat$ItemReceiver;

    executeKMSSoapCall$MediaBrowserCompat$SearchResultReceiver(zziu.zzc zzc) {
        this.MediaBrowserCompat$ItemReceiver = zzc;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C6977x9bb0870b passportCaptureModule$b$MediaBrowserCompat$CustomActionResultReceiver = (C6977x9bb0870b) obj;
        String str = this.MediaBrowserCompat$ItemReceiver.read;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            str2 = str3;
        }
        passportCaptureModule$b$MediaBrowserCompat$CustomActionResultReceiver.read(str, str2, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
