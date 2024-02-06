package p040o;

/* renamed from: o.setContentView$MediaBrowserCompat$ItemReceiver */
final class setContentView$MediaBrowserCompat$ItemReceiver implements setStackedBackground$MediaBrowserCompat$ItemReceiver {
    final /* synthetic */ setContentView MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;

    setContentView$MediaBrowserCompat$ItemReceiver(setContentView setcontentview) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setcontentview;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == null) {
            return false;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.onMenuOpened(108, menuItemImpl);
        return true;
    }

    public final void read(MenuItemImpl menuItemImpl, boolean z) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver();
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.onPanelClosed(108, menuItemImpl);
            }
            this.MediaBrowserCompat$ItemReceiver = false;
        }
    }
}
