package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import p040o.nAllocationSetSurface;

/* renamed from: o.nElementGetNativeData */
public final class nElementGetNativeData implements setStackedBackground, View.OnClickListener {
    public ColorStateList IconCompatParcelizer;
    private setStackedBackground$MediaBrowserCompat$ItemReceiver Keep;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public LinearLayout MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public LayoutInflater MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f5545x50fd9e4a;
    MenuItemImpl MediaDescriptionCompat;
    public NavigationMenuView MediaMetadataCompat;
    final View.OnClickListener MediaSessionCompat$QueueItem = this;
    boolean MediaSessionCompat$ResultReceiverWrapper;
    int MediaSessionCompat$Token;
    int ParcelableVolumeInfo;
    public int RatingCompat;
    public IconCompatParcelizer read;
    public ColorStateList setHasDecor;
    public Drawable write;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(setCustomView setcustomview) {
        return false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return false;
    }

    public final boolean read() {
        return false;
    }

    public final boolean write(MenuItemImpl menuItemImpl) {
        return false;
    }

    public final void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
        this.MediaBrowserCompat$SearchResultReceiver = LayoutInflater.from(context);
        this.MediaDescriptionCompat = menuItemImpl;
        this.MediaSessionCompat$Token = context.getResources().getDimensionPixelOffset(nAllocationSetSurface.IconCompatParcelizer.design_navigation_separator_vertical_padding);
    }

    public final void write(boolean z) {
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        this.Keep = setstackedbackground_mediabrowsercompat_itemreceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.Keep;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, z);
        }
    }

    /* renamed from: i_ */
    public final int mo795i_() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Parcelable RatingCompat() {
        Bundle bundle = new Bundle();
        if (this.MediaMetadataCompat != null) {
            SparseArray sparseArray = new SparseArray();
            this.MediaMetadataCompat.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            bundle.putBundle("android:menu:adapter", iconCompatParcelizer.read());
        }
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.MediaBrowserCompat$ItemReceiver.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        nIncDeviceCreate nincdevicecreate;
        MenuItemImpl menuItemImpl2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.MediaMetadataCompat.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                IconCompatParcelizer iconCompatParcelizer = this.read;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    iconCompatParcelizer.read = true;
                    int size = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C10066x57ff1d16 nelementgetnativedata_mediabrowsercompat_customactionresultreceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.get(i2);
                        if ((nelementgetnativedata_mediabrowsercompat_customactionresultreceiver instanceof RatingCompat) && (menuItemImpl2 = ((RatingCompat) nelementgetnativedata_mediabrowsercompat_customactionresultreceiver).MediaBrowserCompat$CustomActionResultReceiver) != null && menuItemImpl2.getItemId() == i) {
                            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(menuItemImpl2);
                            break;
                        }
                        i2++;
                    }
                    iconCompatParcelizer.read = false;
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C10066x57ff1d16 nelementgetnativedata_mediabrowsercompat_customactionresultreceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.get(i3);
                        if (!(!(nelementgetnativedata_mediabrowsercompat_customactionresultreceiver2 instanceof RatingCompat) || (menuItemImpl = ((RatingCompat) nelementgetnativedata_mediabrowsercompat_customactionresultreceiver2).MediaBrowserCompat$CustomActionResultReceiver) == null || (actionView = menuItemImpl.getActionView()) == null || (nincdevicecreate = (nIncDeviceCreate) sparseParcelableArray2.get(menuItemImpl.getItemId())) == null)) {
                            actionView.restoreHierarchyState(nincdevicecreate);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.MediaBrowserCompat$ItemReceiver.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void read(int i) {
        this.ParcelableVolumeInfo = i;
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    /* renamed from: o.nElementGetNativeData$MediaDescriptionCompat */
    static class MediaDescriptionCompat extends nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver {
        public MediaDescriptionCompat(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_navigation_item, viewGroup, false));
            this.write.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: o.nElementGetNativeData$MediaMetadataCompat */
    static class MediaMetadataCompat extends nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver {
        public MediaMetadataCompat(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: o.nElementGetNativeData$write */
    static class write extends nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver {
        public write(View view) {
            super(view);
        }
    }

    /* renamed from: o.nElementGetNativeData$IconCompatParcelizer */
    public class IconCompatParcelizer extends RecyclerView.IconCompatParcelizer<nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver> {
        final ArrayList<C10066x57ff1d16> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
        public boolean read;
        private MenuItemImpl write;

        public final long MediaBrowserCompat$ItemReceiver(int i) {
            return (long) i;
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
            nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver nelementgetnativedata_mediabrowsercompat_searchresultreceiver = (nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver) setcontentview;
            int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
            boolean z = true;
            if (MediaBrowserCompat$CustomActionResultReceiver == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) nelementgetnativedata_mediabrowsercompat_searchresultreceiver.write;
                ColorStateList colorStateList = nElementGetNativeData.this.IconCompatParcelizer;
                navigationMenuItemView.IconCompatParcelizer = colorStateList;
                if (colorStateList == null) {
                    z = false;
                }
                navigationMenuItemView.MediaBrowserCompat$ItemReceiver = z;
                MenuItemImpl menuItemImpl = navigationMenuItemView.MediaBrowserCompat$CustomActionResultReceiver;
                if (menuItemImpl != null) {
                    navigationMenuItemView.setIcon(menuItemImpl.getIcon());
                }
                if (nElementGetNativeData.this.MediaSessionCompat$ResultReceiverWrapper) {
                    navigationMenuItemView.setTextAppearance(nElementGetNativeData.this.ParcelableVolumeInfo);
                }
                if (nElementGetNativeData.this.setHasDecor != null) {
                    navigationMenuItemView.setTextColor(nElementGetNativeData.this.setHasDecor);
                }
                SwitchCompat.IconCompatParcelizer((View) navigationMenuItemView, nElementGetNativeData.this.write != null ? nElementGetNativeData.this.write.getConstantState().newDrawable() : null);
                RatingCompat ratingCompat = (RatingCompat) this.MediaBrowserCompat$ItemReceiver.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(ratingCompat.read);
                navigationMenuItemView.setHorizontalPadding(nElementGetNativeData.this.MediaBrowserCompat$MediaItem);
                navigationMenuItemView.setIconPadding(nElementGetNativeData.this.RatingCompat);
                navigationMenuItemView.read(ratingCompat.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
                ((TextView) nelementgetnativedata_mediabrowsercompat_searchresultreceiver.write).setText(((RatingCompat) this.MediaBrowserCompat$ItemReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver.getTitle());
            } else if (MediaBrowserCompat$CustomActionResultReceiver == 2) {
                nElementGetNativeData$MediaBrowserCompat$ItemReceiver nelementgetnativedata_mediabrowsercompat_itemreceiver = (nElementGetNativeData$MediaBrowserCompat$ItemReceiver) this.MediaBrowserCompat$ItemReceiver.get(i);
                nelementgetnativedata_mediabrowsercompat_searchresultreceiver.write.setPadding(0, nelementgetnativedata_mediabrowsercompat_itemreceiver.IconCompatParcelizer, 0, nelementgetnativedata_mediabrowsercompat_itemreceiver.write);
            }
        }

        public final /* synthetic */ void write(RecyclerView.setContentView setcontentview) {
            nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver nelementgetnativedata_mediabrowsercompat_searchresultreceiver = (nElementGetNativeData$MediaBrowserCompat$SearchResultReceiver) setcontentview;
            if (nelementgetnativedata_mediabrowsercompat_searchresultreceiver instanceof MediaDescriptionCompat) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) nelementgetnativedata_mediabrowsercompat_searchresultreceiver.write;
                FrameLayout frameLayout = navigationMenuItemView.read;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.RatingCompat.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public IconCompatParcelizer() {
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompat$ItemReceiver.size();
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
            C10066x57ff1d16 nelementgetnativedata_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (nelementgetnativedata_mediabrowsercompat_customactionresultreceiver instanceof nElementGetNativeData$MediaBrowserCompat$ItemReceiver) {
                return 2;
            }
            if (nelementgetnativedata_mediabrowsercompat_customactionresultreceiver instanceof read) {
                return 3;
            }
            if (nelementgetnativedata_mediabrowsercompat_customactionresultreceiver instanceof RatingCompat) {
                return ((RatingCompat) nelementgetnativedata_mediabrowsercompat_customactionresultreceiver).MediaBrowserCompat$CustomActionResultReceiver.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (!this.read) {
                this.read = true;
                this.MediaBrowserCompat$ItemReceiver.clear();
                this.MediaBrowserCompat$ItemReceiver.add(new read());
                int i = -1;
                int size = nElementGetNativeData.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver().size();
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    MenuItemImpl menuItemImpl = nElementGetNativeData.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver().get(i2);
                    if (menuItemImpl.isChecked()) {
                        MediaBrowserCompat$ItemReceiver(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.MediaBrowserCompat$ItemReceiver = (menuItemImpl.MediaBrowserCompat$ItemReceiver & true) | z ? 1 : 0;
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.MediaBrowserCompat$ItemReceiver.add(new nElementGetNativeData$MediaBrowserCompat$ItemReceiver(nElementGetNativeData.this.MediaSessionCompat$Token, z ? 1 : 0));
                            }
                            this.MediaBrowserCompat$ItemReceiver.add(new RatingCompat(menuItemImpl));
                            int size2 = subMenu.size();
                            int i4 = z;
                            int i5 = i4;
                            while (i4 < size2) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (i5 == 0 && menuItemImpl2.getIcon() != null) {
                                        i5 = 1;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.MediaBrowserCompat$ItemReceiver = (menuItemImpl2.MediaBrowserCompat$ItemReceiver & true) | z ? 1 : 0;
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        MediaBrowserCompat$ItemReceiver(menuItemImpl);
                                    }
                                    this.MediaBrowserCompat$ItemReceiver.add(new RatingCompat(menuItemImpl2));
                                }
                                i4++;
                                z = false;
                            }
                            if (i5 != 0) {
                                int size3 = this.MediaBrowserCompat$ItemReceiver.size();
                                for (int size4 = this.MediaBrowserCompat$ItemReceiver.size(); size4 < size3; size4++) {
                                    ((RatingCompat) this.MediaBrowserCompat$ItemReceiver.get(size4)).read = true;
                                }
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i3 = this.MediaBrowserCompat$ItemReceiver.size();
                            z2 = menuItemImpl.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                this.MediaBrowserCompat$ItemReceiver.add(new nElementGetNativeData$MediaBrowserCompat$ItemReceiver(nElementGetNativeData.this.MediaSessionCompat$Token, nElementGetNativeData.this.MediaSessionCompat$Token));
                            }
                        } else if (!z2 && menuItemImpl.getIcon() != null) {
                            int size5 = this.MediaBrowserCompat$ItemReceiver.size();
                            for (int i6 = i3; i6 < size5; i6++) {
                                ((RatingCompat) this.MediaBrowserCompat$ItemReceiver.get(i6)).read = true;
                            }
                            z2 = true;
                        }
                        RatingCompat ratingCompat = new RatingCompat(menuItemImpl);
                        ratingCompat.read = z2;
                        this.MediaBrowserCompat$ItemReceiver.add(ratingCompat);
                        i = groupId;
                    }
                    i2++;
                    z = false;
                }
                this.read = z;
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
            if (this.write != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.write;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.write = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        public final Bundle read() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.write;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.MediaBrowserCompat$ItemReceiver.size();
            for (int i = 0; i < size; i++) {
                C10066x57ff1d16 nelementgetnativedata_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get(i);
                if (nelementgetnativedata_mediabrowsercompat_customactionresultreceiver instanceof RatingCompat) {
                    MenuItemImpl menuItemImpl2 = ((RatingCompat) nelementgetnativedata_mediabrowsercompat_customactionresultreceiver).MediaBrowserCompat$CustomActionResultReceiver;
                    View actionView = menuItemImpl2 != null ? menuItemImpl2.getActionView() : null;
                    if (actionView != null) {
                        nIncDeviceCreate nincdevicecreate = new nIncDeviceCreate();
                        actionView.saveHierarchyState(nincdevicecreate);
                        sparseArray.put(menuItemImpl2.getItemId(), nincdevicecreate);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new MediaDescriptionCompat(nElementGetNativeData.this.MediaBrowserCompat$SearchResultReceiver, viewGroup, nElementGetNativeData.this.MediaSessionCompat$QueueItem);
            }
            if (i == 1) {
                return new nElementGetNativeData$MediaBrowserCompat$MediaItem(nElementGetNativeData.this.MediaBrowserCompat$SearchResultReceiver, viewGroup);
            }
            if (i == 2) {
                return new MediaMetadataCompat(nElementGetNativeData.this.MediaBrowserCompat$SearchResultReceiver, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new write(nElementGetNativeData.this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.nElementGetNativeData$RatingCompat */
    static class RatingCompat implements C10066x57ff1d16 {
        final MenuItemImpl MediaBrowserCompat$CustomActionResultReceiver;
        boolean read;

        RatingCompat(MenuItemImpl menuItemImpl) {
            this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl;
        }
    }

    /* renamed from: o.nElementGetNativeData$read */
    static class read implements C10066x57ff1d16 {
        read() {
        }
    }

    public final void onClick(View view) {
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read = true;
        }
        MenuItemImpl menuItemImpl = navigationMenuItemView.MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(menuItemImpl, this, 0);
        if (menuItemImpl != null && menuItemImpl.isCheckable() && MediaBrowserCompat$ItemReceiver2) {
            this.read.MediaBrowserCompat$ItemReceiver(menuItemImpl);
        }
        IconCompatParcelizer iconCompatParcelizer2 = this.read;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.read = false;
        }
        IconCompatParcelizer iconCompatParcelizer3 = this.read;
        if (iconCompatParcelizer3 != null) {
            iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer3.IconCompatParcelizer.write();
        }
    }
}
