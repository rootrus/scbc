package p040o;

import p040o.LogFileManager;
import p040o.StreetViewPanoramaFragment;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getYTextureUniform */
public final /* synthetic */ class getYTextureUniform implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LogFileManager.C35981 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ nativeWriteImageToFileBuffer read;

    public /* synthetic */ getYTextureUniform(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer, LogFileManager.C35981 r2) {
        this.read = nativewriteimagetofilebuffer;
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.read;
        ((newCheckExtractor.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(nativewriteimagetofilebuffer.write, StreetViewPanoramaFragment.zzb.SCAN, nativewriteimagetofilebuffer.MediaMetadataCompat ? "deeplink" : "scan", this.MediaBrowserCompat$ItemReceiver);
    }
}
