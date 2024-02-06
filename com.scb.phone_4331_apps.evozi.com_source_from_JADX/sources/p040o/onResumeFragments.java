package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: o.onResumeFragments */
final class onResumeFragments {
    private static final CheckParameters_MembersInjector MediaBrowserCompat$ItemReceiver = new setPaddingRelative() {
        public final void write(Bitmap bitmap) {
        }
    };

    static performOptionsMenuClosed<Bitmap> IconCompatParcelizer(CheckParameters_MembersInjector checkParameters_MembersInjector, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = write(checkParameters_MembersInjector, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            checkParameters_MembersInjector = MediaBrowserCompat$ItemReceiver;
        }
        if (bitmap == null) {
            return null;
        }
        return new getLastCustomNonConfigurationInstance(bitmap, checkParameters_MembersInjector);
    }

    private static Bitmap write(CheckParameters_MembersInjector checkParameters_MembersInjector, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w("DrawableToBitmap", sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock write = requestPermissionsFromFragment.write();
            write.lock();
            Bitmap IconCompatParcelizer = checkParameters_MembersInjector.IconCompatParcelizer(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(IconCompatParcelizer);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return IconCompatParcelizer;
            } finally {
                write.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", sb2.toString());
            }
            return null;
        }
    }
}
