package p040o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bumptech.glide.Glide;
import com.lyft.android.scissors.CropView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;
import p040o.addCircle;
import p040o.addMarker;
import p040o.infoWindowAnchor;
import p040o.setMaxZoomPreference;

/* renamed from: o.CTRSV */
public final class CTRSV {
    private static boolean IconCompatParcelizer = IconCompatParcelizer("com.nostra13.universalimageloader.core.ImageLoader");
    private static boolean MediaBrowserCompat$ItemReceiver = IconCompatParcelizer("com.bumptech.glide.Glide");
    private static boolean write = IconCompatParcelizer("com.squareup.picasso.Picasso");

    CTRSV() {
    }

    /* renamed from: o.CTRSV$write */
    public static class write {
        public Bitmap.CompressFormat MediaBrowserCompat$CustomActionResultReceiver = Bitmap.CompressFormat.JPEG;
        public final CropView MediaBrowserCompat$ItemReceiver;
        public int write = 100;

        public write(CropView cropView) {
            DGBMV.IconCompatParcelizer(cropView, "cropView == null");
            this.MediaBrowserCompat$ItemReceiver = cropView;
        }
    }

    static IdExtractor_Factory IconCompatParcelizer(CropView cropView) {
        if (write) {
            return new addMarker.read(Picasso.with(cropView.getContext()), new addCircle.IconCompatParcelizer(cropView.read.MediaDescriptionCompat, cropView.read.MediaBrowserCompat$SearchResultReceiver));
        }
        if (MediaBrowserCompat$ItemReceiver) {
            return new zzca$zze$zza$read$MediaBrowserCompat$CustomActionResultReceiver(Glide.MediaBrowserCompat$ItemReceiver(cropView.getContext()), DGEMV.IconCompatParcelizer(Glide.IconCompatParcelizer(cropView.getContext()).MediaBrowserCompat$CustomActionResultReceiver, cropView.read.MediaDescriptionCompat, cropView.read.MediaBrowserCompat$SearchResultReceiver));
        }
        if (IconCompatParcelizer) {
            return new setMaxZoomPreference.read(ImageLoader.getInstance(), new infoWindowAnchor.write((byte) 0));
        }
        throw new IllegalStateException("You must provide a BitmapLoader.");
    }

    private static boolean IconCompatParcelizer(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Rect MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        if (i == i3 && i2 == i4) {
            return new Rect(0, 0, i3, i4);
        }
        if (i * i4 > i3 * i2) {
            f2 = (float) i4;
            f = (float) i2;
        } else {
            f2 = (float) i3;
            f = (float) i;
        }
        float f3 = f2 / f;
        return new Rect(0, 0, (int) ((((float) i) * f3) + 0.5f), (int) ((((float) i2) * f3) + 0.5f));
    }
}
