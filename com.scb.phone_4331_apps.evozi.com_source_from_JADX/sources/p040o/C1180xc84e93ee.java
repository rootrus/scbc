package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p040o.FitWindowsFrameLayout;

/* renamed from: o.FitWindowsLinearLayout$MediaBrowserCompat$CustomActionResultReceiver */
class C1180xc84e93ee extends FitWindowsFrameLayout.read {
    C1180xc84e93ee(FitWindowsFrameLayout.read read, Resources resources) {
        super(read, resources);
    }

    public Drawable newDrawable(Resources resources) {
        return new FitWindowsLinearLayout(this, resources);
    }
}
