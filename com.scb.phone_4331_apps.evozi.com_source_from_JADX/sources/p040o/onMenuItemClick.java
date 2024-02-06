package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: o.onMenuItemClick */
final class onMenuItemClick extends setOverflowIcon {
    private final WeakReference<Context> write;

    public onMenuItemClick(Context context, Resources resources) {
        super(resources);
        this.write = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.write.get();
        if (!(drawable == null || context == null)) {
            ActionBarOverlayLayout.IconCompatParcelizer();
            ActionBarOverlayLayout.IconCompatParcelizer(context, i, drawable);
        }
        return drawable;
    }
}
