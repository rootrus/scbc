package p040o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.PlaybackStateCompat;
import p040o.setTabContainer;

/* renamed from: o.AbsActionBarView */
public final class AbsActionBarView implements setStackedBackground, AdapterView.OnItemClickListener {
    MenuItemImpl IconCompatParcelizer;
    public write MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$SearchResultReceiver;
    private Context MediaDescriptionCompat;
    public ExpandedMenuView MediaMetadataCompat;
    public LayoutInflater read;
    public setStackedBackground$MediaBrowserCompat$ItemReceiver write;

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: i_ */
    public final int mo795i_() {
        return 0;
    }

    public final boolean read() {
        return false;
    }

    public final boolean write(MenuItemImpl menuItemImpl) {
        return false;
    }

    public AbsActionBarView(Context context, int i) {
        this(i);
        this.MediaDescriptionCompat = context;
        this.read = LayoutInflater.from(context);
    }

    private AbsActionBarView(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$SearchResultReceiver = 0;
    }

    public final void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
        if (this.MediaDescriptionCompat != null) {
            this.MediaDescriptionCompat = context;
            if (this.read == null) {
                this.read = LayoutInflater.from(context);
            }
        }
        this.IconCompatParcelizer = menuItemImpl;
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.notifyDataSetChanged();
        }
    }

    public final void write(boolean z) {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.notifyDataSetChanged();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        this.write = setstackedbackground_mediabrowsercompat_itemreceiver;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(setCustomView setcustomview) {
        if (!setcustomview.hasVisibleItems()) {
            return false;
        }
        setVisibility setvisibility = new setVisibility(setcustomview);
        MenuItemImpl menuItemImpl = setvisibility.read;
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(menuItemImpl.write);
        AbsActionBarView absActionBarView = new AbsActionBarView(playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer, AlertController$RecycleListView.MediaMetadataCompat.abc_list_menu_item_layout);
        setvisibility.write = absActionBarView;
        absActionBarView.write = setvisibility;
        MenuItemImpl menuItemImpl2 = setvisibility.read;
        AbsActionBarView absActionBarView2 = setvisibility.write;
        Context context = menuItemImpl2.write;
        menuItemImpl2.f2552x50fd9e4a.add(new WeakReference(absActionBarView2));
        absActionBarView2.IconCompatParcelizer(context, menuItemImpl2);
        menuItemImpl2.MediaDescriptionCompat = true;
        AbsActionBarView absActionBarView3 = setvisibility.write;
        if (absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver == null) {
            absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver = new write();
        }
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver = absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver;
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaMetadataCompat = setvisibility;
        View view = menuItemImpl.MediaBrowserCompat$SearchResultReceiver;
        if (view != null) {
            playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.read = view;
        } else {
            playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$SearchResultReceiver = menuItemImpl.MediaBrowserCompat$MediaItem;
            playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.RatingCompat = menuItemImpl.MediaMetadataCompat;
        }
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaDescriptionCompat = setvisibility;
        PlaybackStateCompat.CustomAction write2 = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        setvisibility.IconCompatParcelizer = write2;
        write2.setOnDismissListener(setvisibility);
        WindowManager.LayoutParams attributes = setvisibility.IconCompatParcelizer.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        setvisibility.IconCompatParcelizer.show();
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.write;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            setstackedbackground_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(setcustomview);
        }
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.write;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, z);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getItem(i), this, 0);
    }

    public final Parcelable RatingCompat() {
        if (this.MediaMetadataCompat == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.MediaMetadataCompat;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.MediaMetadataCompat.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: o.AbsActionBarView$write */
    public class write extends BaseAdapter {
        private int write = -1;

        public final long getItemId(int i) {
            return (long) i;
        }

        public write() {
            MediaBrowserCompat$ItemReceiver();
        }

        public final int getCount() {
            MenuItemImpl menuItemImpl = AbsActionBarView.this.IconCompatParcelizer;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
            int size = menuItemImpl.ParcelableVolumeInfo.size();
            return this.write < 0 ? size : size - 1;
        }

        /* renamed from: MediaBrowserCompat$ItemReceiver */
        public final MenuItemImpl getItem(int i) {
            MenuItemImpl menuItemImpl = AbsActionBarView.this.IconCompatParcelizer;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
            ArrayList<MenuItemImpl> arrayList = menuItemImpl.ParcelableVolumeInfo;
            int i2 = this.write;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = AbsActionBarView.this.read.inflate(AbsActionBarView.this.MediaBrowserCompat$ItemReceiver, viewGroup, false);
            }
            ((setTabContainer.read) view).read(getItem(i));
            return view;
        }

        private void MediaBrowserCompat$ItemReceiver() {
            MenuItemImpl menuItemImpl = AbsActionBarView.this.IconCompatParcelizer.read;
            if (menuItemImpl != null) {
                MenuItemImpl menuItemImpl2 = AbsActionBarView.this.IconCompatParcelizer;
                menuItemImpl2.MediaBrowserCompat$CustomActionResultReceiver();
                ArrayList<MenuItemImpl> arrayList = menuItemImpl2.ParcelableVolumeInfo;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == menuItemImpl) {
                        this.write = i;
                        return;
                    }
                }
            }
            this.write = -1;
        }

        public final void notifyDataSetChanged() {
            MediaBrowserCompat$ItemReceiver();
            super.notifyDataSetChanged();
        }
    }
}
