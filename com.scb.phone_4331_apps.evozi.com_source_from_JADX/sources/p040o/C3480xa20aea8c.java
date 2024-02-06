package p040o;

import p040o.ImagePerfectionProfile;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver */
final class C3480xa20aea8c<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
    private /* synthetic */ C3478xeef7f070 MediaBrowserCompat$CustomActionResultReceiver;

    C3480xa20aea8c(C3478xeef7f070 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth.MediaMetadataCompat mediaMetadataCompat = (getTopLeftCornerWidth.MediaMetadataCompat) obj;
        mediaMetadataCompat.IconCompatParcelizer(ImagePerfectionProfile.UseMRZPassportDetection.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
        mediaMetadataCompat.write();
    }
}
