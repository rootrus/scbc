package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;

/* renamed from: o.setCustomView */
public class setCustomView extends MenuItemImpl implements SubMenu {
    private MenuItemImpl AlertController$RecycleListView;
    public MenuItemImpl PlaybackStateCompat;

    public setCustomView(Context context, MenuItemImpl menuItemImpl, MenuItemImpl menuItemImpl2) {
        super(context);
        this.PlaybackStateCompat = menuItemImpl;
        this.AlertController$RecycleListView = menuItemImpl2;
    }

    public void setQwertyMode(boolean z) {
        this.PlaybackStateCompat.setQwertyMode(z);
    }

    public final boolean RatingCompat() {
        return this.PlaybackStateCompat.RatingCompat();
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        return this.PlaybackStateCompat.MediaBrowserCompat$MediaItem();
    }

    public MenuItem getItem() {
        return this.AlertController$RecycleListView;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) {
        this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final MenuItemImpl write() {
        return this.PlaybackStateCompat.write();
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        return super.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, menuItem) || this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.AlertController$RecycleListView.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.AlertController$RecycleListView.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.read(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.write(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.write(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.MediaBrowserCompat$ItemReceiver(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.read(view);
    }

    public final boolean read(MenuItemImpl menuItemImpl) {
        return this.PlaybackStateCompat.read(menuItemImpl);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver(menuItemImpl);
    }

    public final String IconCompatParcelizer() {
        MenuItemImpl menuItemImpl = this.AlertController$RecycleListView;
        int itemId = menuItemImpl != null ? menuItemImpl.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.IconCompatParcelizer());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.PlaybackStateCompat.setGroupDividerEnabled(z);
    }

    public final boolean read() {
        return this.PlaybackStateCompat.read();
    }
}
