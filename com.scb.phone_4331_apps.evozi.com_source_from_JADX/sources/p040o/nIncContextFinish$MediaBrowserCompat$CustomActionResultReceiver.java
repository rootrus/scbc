package p040o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p040o.nIncContextFinish;

/* renamed from: o.nIncContextFinish$MediaBrowserCompat$CustomActionResultReceiver */
public class nIncContextFinish$MediaBrowserCompat$CustomActionResultReceiver extends nIncContextFinish.write {
    private static final RectF IconCompatParcelizer = new RectF();
    private float MediaBrowserCompat$CustomActionResultReceiver;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private float RatingCompat;
    public float read;
    public float write;

    public nIncContextFinish$MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, float f3, float f4) {
        this.MediaMetadataCompat = f;
        this.MediaDescriptionCompat = f2;
        this.RatingCompat = f3;
        this.MediaBrowserCompat$CustomActionResultReceiver = f4;
    }

    public final void write(Matrix matrix, Path path) {
        Matrix matrix2 = this.MediaBrowserCompat$ItemReceiver;
        matrix.invert(matrix2);
        path.transform(matrix2);
        IconCompatParcelizer.set(this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompat$CustomActionResultReceiver);
        path.arcTo(IconCompatParcelizer, this.read, this.write, false);
        path.transform(matrix);
    }
}
