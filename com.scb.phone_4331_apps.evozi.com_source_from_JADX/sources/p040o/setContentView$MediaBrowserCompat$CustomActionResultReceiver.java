package p040o;

import android.view.MenuItem;
import android.view.View;

/* renamed from: o.setContentView$MediaBrowserCompat$CustomActionResultReceiver */
final class setContentView$MediaBrowserCompat$CustomActionResultReceiver implements MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver {
    final /* synthetic */ setContentView read;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        return false;
    }

    setContentView$MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview) {
        this.read = setcontentview;
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        if (this.read.IconCompatParcelizer == null) {
            return;
        }
        if (this.read.read.MediaSessionCompat$ResultReceiverWrapper()) {
            this.read.IconCompatParcelizer.onPanelClosed(108, menuItemImpl);
        } else if (this.read.IconCompatParcelizer.onPreparePanel(0, (View) null, menuItemImpl)) {
            this.read.IconCompatParcelizer.onMenuOpened(108, menuItemImpl);
        }
    }
}
