package p040o;

import android.content.ContentResolver;
import android.media.Image;
import android.net.Uri;

/* renamed from: o.getBackBarcodes */
public interface getBackBarcodes extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
    void IconCompatParcelizer();

    void MediaBrowserCompat$CustomActionResultReceiver(ContentResolver contentResolver, Image image, Uri uri, float f, int i);

    void MediaBrowserCompat$ItemReceiver();

    void read();

    void read(ContentResolver contentResolver, byte[] bArr, Uri uri, float f, int i);
}
