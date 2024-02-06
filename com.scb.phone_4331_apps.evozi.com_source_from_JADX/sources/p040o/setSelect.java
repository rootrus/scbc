package p040o;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;

/* renamed from: o.setSelect */
public final class setSelect {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public setSelect() {
    }

    public static byte[] read(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, setRecipients.MediaMetadataCompat().write, byteArrayOutputStream);
        Log.i("imagesize ImageUtils", String.valueOf((long) byteArrayOutputStream.toByteArray().length));
        return byteArrayOutputStream.toByteArray();
    }

    public setSelect(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.write = str5;
    }
}
