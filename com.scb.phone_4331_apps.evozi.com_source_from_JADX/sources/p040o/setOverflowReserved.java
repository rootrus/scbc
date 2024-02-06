package p040o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setOverflowReserved */
public final class setOverflowReserved implements PopupWindow.OnDismissListener {
    public final setSplitBackground IconCompatParcelizer;
    public final MenuItemImpl MediaBrowserCompat$CustomActionResultReceiver;
    private final Context MediaBrowserCompat$ItemReceiver;
    private final View read;
    public IconCompatParcelizer write;

    /* renamed from: o.setOverflowReserved$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        boolean write(MenuItem menuItem);
    }

    public final void onDismiss() {
    }

    public setOverflowReserved(Context context, View view) {
        this(context, view, (byte) 0);
    }

    private setOverflowReserved(Context context, View view, byte b) {
        this(context, view, 0, AlertController$RecycleListView.read.popupMenuStyle);
    }

    private setOverflowReserved(Context context, View view, int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = view;
        MenuItemImpl menuItemImpl = new MenuItemImpl(context);
        this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl;
        menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) new MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
            }

            public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
                if (setOverflowReserved.this.write != null) {
                    return setOverflowReserved.this.write.write(menuItem);
                }
                return false;
            }
        });
        setSplitBackground setsplitbackground = new setSplitBackground(context, this.MediaBrowserCompat$CustomActionResultReceiver, view, false, i2, 0);
        this.IconCompatParcelizer = setsplitbackground;
        setsplitbackground.IconCompatParcelizer = 0;
        this.IconCompatParcelizer.write = this;
    }
}
