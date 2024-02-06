package androidx.appcompat.view.menu;

import android.view.MenuItem;
import p040o.ExpandedMenuView;

class MenuItemWrapperICS$MediaBrowserCompat$CustomActionResultReceiver extends ExpandedMenuView<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
    final /* synthetic */ MenuItemWrapperICS MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuItemWrapperICS$MediaBrowserCompat$CustomActionResultReceiver(MenuItemWrapperICS menuItemWrapperICS, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.MediaBrowserCompat$CustomActionResultReceiver = menuItemWrapperICS;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.MediaBrowserCompat$ItemReceiver).onMenuItemActionExpand(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(menuItem));
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.MediaBrowserCompat$ItemReceiver).onMenuItemActionCollapse(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(menuItem));
    }
}
