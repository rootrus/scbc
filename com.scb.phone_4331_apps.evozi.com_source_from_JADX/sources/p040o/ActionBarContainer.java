package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: o.ActionBarContainer */
public class ActionBarContainer extends setForceShowIcon<setHorizontalGravity> implements Menu {
    public ActionBarContainer(Context context, setHorizontalGravity sethorizontalgravity) {
        super(context, sethorizontalgravity);
    }

    public MenuItem add(CharSequence charSequence) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).add(charSequence));
    }

    public MenuItem add(int i) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return read(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return read(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return read(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return read(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = IconCompatParcelizer(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        read(i);
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).removeItem(i);
    }

    public void removeGroup(int i) {
        MediaBrowserCompat$CustomActionResultReceiver(i);
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).removeGroup(i);
    }

    public void clear() {
        write();
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).findItem(i));
    }

    public int size() {
        return ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).size();
    }

    public MenuItem getItem(int i) {
        return IconCompatParcelizer(((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).getItem(i));
    }

    public void close() {
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((setHorizontalGravity) this.MediaBrowserCompat$ItemReceiver).setQwertyMode(z);
    }
}
