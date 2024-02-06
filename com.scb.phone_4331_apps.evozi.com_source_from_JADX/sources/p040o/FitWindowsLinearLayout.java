package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p040o.FitWindowsFrameLayout;

/* renamed from: o.FitWindowsLinearLayout */
class FitWindowsLinearLayout extends FitWindowsFrameLayout {
    private static Method write;

    FitWindowsLinearLayout(Drawable drawable) {
        super(drawable);
        write();
    }

    FitWindowsLinearLayout(FitWindowsFrameLayout.read read, Resources resources) {
        super(read, resources);
        write();
    }

    public void setHotspot(float f, float f2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.MediaBrowserCompat$CustomActionResultReceiver.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (IconCompatParcelizer()) {
            super.setTintList(colorStateList);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (IconCompatParcelizer()) {
            super.setTint(i);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.setTint(i);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (IconCompatParcelizer()) {
            super.setTintMode(mode);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean IconCompatParcelizer() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        if (!(this.MediaBrowserCompat$CustomActionResultReceiver == null || (method = write) == null)) {
            try {
                return ((Boolean) method.invoke(this.MediaBrowserCompat$CustomActionResultReceiver, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public FitWindowsFrameLayout.read MediaBrowserCompat$CustomActionResultReceiver() {
        return new C1180xc84e93ee(this.IconCompatParcelizer, (Resources) null);
    }

    private void write() {
        if (write == null) {
            try {
                write = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
