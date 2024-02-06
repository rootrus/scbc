package p040o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.MenuItemImpl;
import p040o.AbsActionBarView;
import p040o.PlaybackStateCompat;

/* renamed from: o.setVisibility */
final class setVisibility implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, setStackedBackground$MediaBrowserCompat$ItemReceiver {
    PlaybackStateCompat.CustomAction IconCompatParcelizer;
    MenuItemImpl read;
    AbsActionBarView write;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
        return false;
    }

    public setVisibility(MenuItemImpl menuItemImpl) {
        this.read = menuItemImpl;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.IconCompatParcelizer.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.IconCompatParcelizer.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.read.read(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.read.performShortcut(i, keyEvent, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.write.MediaBrowserCompat$ItemReceiver(this.read, true);
    }

    public final void read(MenuItemImpl menuItemImpl, boolean z) {
        PlaybackStateCompat.CustomAction customAction;
        if ((z || menuItemImpl == this.read) && (customAction = this.IconCompatParcelizer) != null) {
            customAction.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MenuItemImpl menuItemImpl = this.read;
        AbsActionBarView absActionBarView = this.write;
        if (absActionBarView.MediaBrowserCompat$CustomActionResultReceiver == null) {
            absActionBarView.MediaBrowserCompat$CustomActionResultReceiver = new AbsActionBarView.write();
        }
        menuItemImpl.MediaBrowserCompat$ItemReceiver((MenuItemImpl) absActionBarView.MediaBrowserCompat$CustomActionResultReceiver.getItem(i), (setStackedBackground) null, 0);
    }
}
