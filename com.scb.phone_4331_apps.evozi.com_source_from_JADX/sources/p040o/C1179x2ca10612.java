package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p040o.FitWindowsFrameLayout;

/* renamed from: o.FitWindowsFrameLayout$MediaBrowserCompat$CustomActionResultReceiver */
class C1179x2ca10612 extends FitWindowsFrameLayout.read {
    C1179x2ca10612(FitWindowsFrameLayout.read read, Resources resources) {
        super(read, resources);
    }

    public Drawable newDrawable(Resources resources) {
        return new FitWindowsFrameLayout(this, resources);
    }
}
