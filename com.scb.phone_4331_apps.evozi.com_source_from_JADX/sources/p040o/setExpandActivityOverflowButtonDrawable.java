package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: o.setExpandActivityOverflowButtonDrawable */
public final class setExpandActivityOverflowButtonDrawable extends Resources {
    private final WeakReference<Context> IconCompatParcelizer;

    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.IconCompatParcelizer.get();
        if (context != null) {
            return ActionBarOverlayLayout.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    public final Drawable MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return super.getDrawable(i);
    }
}
