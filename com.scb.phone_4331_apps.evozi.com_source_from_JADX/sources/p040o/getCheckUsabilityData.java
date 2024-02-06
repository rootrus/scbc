package p040o;

import android.graphics.Bitmap;

/* renamed from: o.getCheckUsabilityData */
public interface getCheckUsabilityData {
    int IconCompatParcelizer(Bitmap bitmap);

    Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config);

    void MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap);

    Bitmap MediaBrowserCompat$ItemReceiver();

    String read(int i, int i2, Bitmap.Config config);

    String write(Bitmap bitmap);
}
