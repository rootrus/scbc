package androidx.appcompat.view.menu;

import android.view.MenuItem;
import p040o.ExpandedMenuView;

class MenuItemWrapperICS$MediaBrowserCompat$ItemReceiver extends ExpandedMenuView<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ MenuItemWrapperICS MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuItemWrapperICS$MediaBrowserCompat$ItemReceiver(MenuItemWrapperICS menuItemWrapperICS, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.MediaBrowserCompat$CustomActionResultReceiver = menuItemWrapperICS;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.MediaBrowserCompat$ItemReceiver).onMenuItemClick(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(menuItem));
    }
}
