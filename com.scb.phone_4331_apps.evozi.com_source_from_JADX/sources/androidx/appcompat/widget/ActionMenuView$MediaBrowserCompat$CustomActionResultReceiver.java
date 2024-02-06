package androidx.appcompat.widget;

import android.view.MenuItem;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;

class ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver implements MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver {
    final /* synthetic */ ActionMenuView read;

    ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver(ActionMenuView actionMenuView) {
        this.read = actionMenuView;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        return this.read.mOnMenuItemClickListener != null && this.read.mOnMenuItemClickListener.onMenuItemClick(menuItem);
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        if (this.read.mMenuBuilderCallback != null) {
            this.read.mMenuBuilderCallback.MediaBrowserCompat$ItemReceiver(menuItemImpl);
        }
    }
}
