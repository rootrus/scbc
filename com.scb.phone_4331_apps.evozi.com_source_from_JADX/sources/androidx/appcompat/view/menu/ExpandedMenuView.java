package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p040o.AlertController$RecycleListView;
import p040o.MenuItemImpl;
import p040o.setStackedBackground;
import p040o.setTabContainer;

public final class ExpandedMenuView extends ListView implements MenuItemImpl.write, setTabContainer, AdapterView.OnItemClickListener {
    private static final int[] write = {16842964, 16843049};
    private MenuItemImpl MediaBrowserCompat$ItemReceiver;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, write, i, 0));
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(0)) {
            setBackgroundDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(0));
        }
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(1)) {
            setDivider(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(1));
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
        this.MediaBrowserCompat$ItemReceiver = menuItemImpl;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(menuItemImpl, (setStackedBackground) null, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((MenuItemImpl) getAdapter().getItem(i), (setStackedBackground) null, 0);
    }
}
