package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.setTransitioning */
public final class setTransitioning extends ActionBarContainer implements SubMenu {
    public setTransitioning(Context context, setBaselineAlignedChildIndex setbaselinealignedchildindex) {
        super(context, setbaselinealignedchildindex);
    }

    public final void clearHeader() {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).clearHeader();
    }

    public final MenuItem getItem() {
        return IconCompatParcelizer(((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((setBaselineAlignedChildIndex) this.MediaBrowserCompat$ItemReceiver).setIcon(drawable);
        return this;
    }
}
