package p040o;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.util.ArrayList;
import p040o.ActionMenuItemView;

/* renamed from: o.setItemInvoker$MediaBrowserCompat$ItemReceiver */
public class setItemInvoker$MediaBrowserCompat$ItemReceiver implements ActionMenuItemView.read {
    final Context IconCompatParcelizer;
    final AppCompatCheckBox<Menu, Menu> MediaBrowserCompat$CustomActionResultReceiver = new AppCompatCheckBox<>();
    final ActionMode.Callback MediaBrowserCompat$ItemReceiver;
    final ArrayList<setItemInvoker> write = new ArrayList<>();

    public setItemInvoker$MediaBrowserCompat$ItemReceiver(Context context, ActionMode.Callback callback) {
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$ItemReceiver = callback;
    }

    public final boolean read(ActionMenuItemView actionMenuItemView, Menu menu) {
        return this.MediaBrowserCompat$ItemReceiver.onCreateActionMode(MediaBrowserCompat$CustomActionResultReceiver(actionMenuItemView), read(menu));
    }

    public final boolean IconCompatParcelizer(ActionMenuItemView actionMenuItemView, Menu menu) {
        return this.MediaBrowserCompat$ItemReceiver.onPrepareActionMode(MediaBrowserCompat$CustomActionResultReceiver(actionMenuItemView), read(menu));
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView actionMenuItemView, MenuItem menuItem) {
        MenuItem menuItem2;
        ActionMode.Callback callback = this.MediaBrowserCompat$ItemReceiver;
        ActionMode MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(actionMenuItemView);
        Context context = this.IconCompatParcelizer;
        setGravity setgravity = (setGravity) menuItem;
        if (Build.VERSION.SDK_INT >= 16) {
            menuItem2 = new MenuItemWrapperICS$CollapsibleActionViewWrapper(context, setgravity);
        } else {
            menuItem2 = new MenuItemWrapperICS(context, setgravity);
        }
        return callback.onActionItemClicked(MediaBrowserCompat$CustomActionResultReceiver2, menuItem2);
    }

    public final void IconCompatParcelizer(ActionMenuItemView actionMenuItemView) {
        this.MediaBrowserCompat$ItemReceiver.onDestroyActionMode(MediaBrowserCompat$CustomActionResultReceiver(actionMenuItemView));
    }

    private Menu read(Menu menu) {
        Menu menu2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ActionBarContainer actionBarContainer = new ActionBarContainer(this.IconCompatParcelizer, (setHorizontalGravity) menu);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(menu, actionBarContainer);
        return actionBarContainer;
    }

    public final ActionMode MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView actionMenuItemView) {
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            setItemInvoker setiteminvoker = this.write.get(i);
            if (setiteminvoker != null && setiteminvoker.write == actionMenuItemView) {
                return setiteminvoker;
            }
        }
        setItemInvoker setiteminvoker2 = new setItemInvoker(this.IconCompatParcelizer, actionMenuItemView);
        this.write.add(setiteminvoker2);
        return setiteminvoker2;
    }
}
