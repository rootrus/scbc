package p040o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: o.validateRequestPermissionsRequestCode */
public abstract class validateRequestPermissionsRequestCode<T extends Drawable> implements performOptionsMenuClosed<T>, performDestroy {
    public final T IconCompatParcelizer;

    public validateRequestPermissionsRequestCode(T t) {
        if (t != null) {
            this.IconCompatParcelizer = (Drawable) t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void MediaBrowserCompat$ItemReceiver() {
        T t = this.IconCompatParcelizer;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof setUseDefaultMargins) {
            ((setUseDefaultMargins) t).read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.prepareToDraw();
        }
    }

    public final /* synthetic */ Object write() {
        Drawable.ConstantState constantState = this.IconCompatParcelizer.getConstantState();
        if (constantState == null) {
            return this.IconCompatParcelizer;
        }
        return constantState.newDrawable();
    }
}
