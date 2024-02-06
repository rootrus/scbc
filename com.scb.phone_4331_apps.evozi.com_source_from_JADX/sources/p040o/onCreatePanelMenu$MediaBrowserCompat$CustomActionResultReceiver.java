package p040o;

import p040o.onCreatePanelMenu;

/* renamed from: o.onCreatePanelMenu$MediaBrowserCompat$CustomActionResultReceiver */
class onCreatePanelMenu$MediaBrowserCompat$CustomActionResultReceiver extends onCreatePanelMenu {
    onCreatePanelMenu$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2, i3, i4));
    }

    public final onCreatePanelMenu.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
        if (Math.min(1.0f, IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2, i3, i4)) == 1.0f) {
            return onCreatePanelMenu.IconCompatParcelizer.QUALITY;
        }
        return IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4);
    }
}
