package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import p040o.setTabContainer;

/* renamed from: o.setContentHeight */
public final class setContentHeight extends BaseAdapter {
    private final LayoutInflater IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver = -1;
    private final boolean MediaBrowserCompat$MediaItem;
    public MenuItemImpl read;
    private final int write;

    public final long getItemId(int i) {
        return (long) i;
    }

    public setContentHeight(MenuItemImpl menuItemImpl, LayoutInflater layoutInflater, boolean z, int i) {
        this.MediaBrowserCompat$MediaItem = z;
        this.IconCompatParcelizer = layoutInflater;
        this.read = menuItemImpl;
        this.write = i;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final int getCount() {
        ArrayList<MenuItemImpl> arrayList;
        if (this.MediaBrowserCompat$MediaItem) {
            MenuItemImpl menuItemImpl = this.read;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
            arrayList = menuItemImpl.ParcelableVolumeInfo;
        } else {
            arrayList = this.read.MediaBrowserCompat$ItemReceiver();
        }
        if (this.MediaBrowserCompat$ItemReceiver < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: write */
    public final MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> arrayList;
        if (this.MediaBrowserCompat$MediaItem) {
            MenuItemImpl menuItemImpl = this.read;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
            arrayList = menuItemImpl.ParcelableVolumeInfo;
        } else {
            arrayList = this.read.MediaBrowserCompat$ItemReceiver();
        }
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.IconCompatParcelizer.inflate(this.write, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.read.read() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        setTabContainer.read read2 = (setTabContainer.read) view;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            listMenuItemView.setForceShowIcon(true);
        }
        read2.read(getItem(i));
        return view;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        MenuItemImpl menuItemImpl = this.read.read;
        if (menuItemImpl != null) {
            MenuItemImpl menuItemImpl2 = this.read;
            menuItemImpl2.MediaBrowserCompat$CustomActionResultReceiver();
            ArrayList<MenuItemImpl> arrayList = menuItemImpl2.ParcelableVolumeInfo;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == menuItemImpl) {
                    this.MediaBrowserCompat$ItemReceiver = i;
                    return;
                }
            }
        }
        this.MediaBrowserCompat$ItemReceiver = -1;
    }

    public final void notifyDataSetChanged() {
        MediaBrowserCompat$CustomActionResultReceiver();
        super.notifyDataSetChanged();
    }
}
