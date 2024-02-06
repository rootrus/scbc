package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.lang.ref.WeakReference;
import p040o.AbsActionBarView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.C1134xe5b94a38;
import p040o.MenuItemImpl;
import p040o.setPopupCallback;
import p040o.setStackedBackground;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;
import p040o.setTabContainer;

protected final class AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver {
    int AlertController$RecycleListView;
    int IconCompatParcelizer;
    View Keep;
    View MediaBrowserCompat$CustomActionResultReceiver;
    Bundle MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    AbsActionBarView MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    Context f2x50fd9e4a;
    boolean MediaDescriptionCompat;
    int MediaMetadataCompat;
    boolean MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    MenuItemImpl MediaSessionCompat$Token;
    boolean ParcelableVolumeInfo = false;
    int PlaybackStateCompat$CustomAction;
    boolean RatingCompat;
    int read;
    int setHasDecor;
    ViewGroup write;

    AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver(int i) {
        this.IconCompatParcelizer = i;
    }

    public final boolean write() {
        if (this.Keep == null) {
            return false;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return true;
        }
        AbsActionBarView absActionBarView = this.MediaBrowserCompat$SearchResultReceiver;
        if (absActionBarView.MediaBrowserCompat$CustomActionResultReceiver == null) {
            absActionBarView.MediaBrowserCompat$CustomActionResultReceiver = new AbsActionBarView.write();
        }
        if (absActionBarView.MediaBrowserCompat$CustomActionResultReceiver.getCount() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void read(Context context) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme newTheme = context.getResources().newTheme();
        newTheme.setTo(context.getTheme());
        newTheme.resolveAttribute(AlertController$RecycleListView.read.actionBarPopupTheme, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        }
        newTheme.resolveAttribute(AlertController$RecycleListView.read.panelMenuListTheme, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        } else {
            newTheme.applyStyle(C1134xe5b94a38.Theme_AppCompat_CompactMenu, true);
        }
        setPopupCallback setpopupcallback = new setPopupCallback(context, 0);
        setpopupcallback.getTheme().setTo(newTheme);
        this.f2x50fd9e4a = setpopupcallback;
        TypedArray obtainStyledAttributes = setpopupcallback.obtainStyledAttributes(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme);
        this.read = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_panelBackground, 0);
        this.setHasDecor = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_android_windowAnimationStyle, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public final void read(MenuItemImpl menuItemImpl) {
        AbsActionBarView absActionBarView;
        MenuItemImpl menuItemImpl2 = this.MediaSessionCompat$Token;
        if (menuItemImpl != menuItemImpl2) {
            if (menuItemImpl2 != null) {
                menuItemImpl2.write((setStackedBackground) this.MediaBrowserCompat$SearchResultReceiver);
            }
            this.MediaSessionCompat$Token = menuItemImpl;
            if (menuItemImpl != null && (absActionBarView = this.MediaBrowserCompat$SearchResultReceiver) != null) {
                Context context = menuItemImpl.write;
                menuItemImpl.f2552x50fd9e4a.add(new WeakReference(absActionBarView));
                absActionBarView.IconCompatParcelizer(context, menuItemImpl);
                menuItemImpl.MediaDescriptionCompat = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final setTabContainer IconCompatParcelizer(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        if (this.MediaSessionCompat$Token == null) {
            return null;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            AbsActionBarView absActionBarView = new AbsActionBarView(this.f2x50fd9e4a, AlertController$RecycleListView.MediaMetadataCompat.abc_list_menu_item_layout);
            this.MediaBrowserCompat$SearchResultReceiver = absActionBarView;
            absActionBarView.write = setstackedbackground_mediabrowsercompat_itemreceiver;
            MenuItemImpl menuItemImpl = this.MediaSessionCompat$Token;
            AbsActionBarView absActionBarView2 = this.MediaBrowserCompat$SearchResultReceiver;
            Context context = menuItemImpl.write;
            menuItemImpl.f2552x50fd9e4a.add(new WeakReference(absActionBarView2));
            absActionBarView2.IconCompatParcelizer(context, menuItemImpl);
            menuItemImpl.MediaDescriptionCompat = true;
        }
        AbsActionBarView absActionBarView3 = this.MediaBrowserCompat$SearchResultReceiver;
        ViewGroup viewGroup = this.write;
        if (absActionBarView3.MediaMetadataCompat == null) {
            absActionBarView3.MediaMetadataCompat = (ExpandedMenuView) absActionBarView3.read.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_expanded_menu_layout, viewGroup, false);
            if (absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver == null) {
                absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver = new AbsActionBarView.write();
            }
            absActionBarView3.MediaMetadataCompat.setAdapter(absActionBarView3.MediaBrowserCompat$CustomActionResultReceiver);
            absActionBarView3.MediaMetadataCompat.setOnItemClickListener(absActionBarView3);
        }
        return absActionBarView3.MediaMetadataCompat;
    }
}
