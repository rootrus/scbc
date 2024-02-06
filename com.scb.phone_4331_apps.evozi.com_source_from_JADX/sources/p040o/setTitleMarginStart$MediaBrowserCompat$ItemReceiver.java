package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import p040o.setTabContainer;

/* renamed from: o.setTitleMarginStart$MediaBrowserCompat$ItemReceiver */
public abstract class setTitleMarginStart$MediaBrowserCompat$ItemReceiver implements setStackedBackground {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public MenuItemImpl f2647x50fd9e4a;
    public Context MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public setStackedBackground$MediaBrowserCompat$ItemReceiver MediaSessionCompat$Token;
    public setTabContainer PlaybackStateCompat;
    public Context PlaybackStateCompat$CustomAction;

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return false;
    }

    public abstract void read(MenuItemImpl menuItemImpl, setTabContainer.read read);

    public boolean read() {
        return false;
    }

    public boolean read(MenuItemImpl menuItemImpl) {
        return true;
    }

    public final boolean write(MenuItemImpl menuItemImpl) {
        return false;
    }

    public setTitleMarginStart$MediaBrowserCompat$ItemReceiver() {
    }

    public setTitleMarginStart$MediaBrowserCompat$ItemReceiver(Context context, int i, int i2) {
        this.PlaybackStateCompat$CustomAction = context;
        this.MediaBrowserCompat$ItemReceiver = LayoutInflater.from(context);
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public boolean MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: i_ */
    public final int mo795i_() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public View MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        setTabContainer.read read;
        if (view instanceof setTabContainer.read) {
            read = (setTabContainer.read) view;
        } else {
            read = (setTabContainer.read) this.MediaBrowserCompat$ItemReceiver.inflate(this.MediaBrowserCompat$CustomActionResultReceiver, viewGroup, false);
        }
        read(menuItemImpl, read);
        return (View) read;
    }

    public setTabContainer MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup) {
        if (this.PlaybackStateCompat == null) {
            setTabContainer settabcontainer = (setTabContainer) this.MediaBrowserCompat$ItemReceiver.inflate(this.IconCompatParcelizer, viewGroup, false);
            this.PlaybackStateCompat = settabcontainer;
            settabcontainer.MediaBrowserCompat$CustomActionResultReceiver(this.f2647x50fd9e4a);
            write(true);
        }
        return this.PlaybackStateCompat;
    }

    public void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
        this.MediaSessionCompat$QueueItem = context;
        LayoutInflater.from(context);
        this.f2647x50fd9e4a = menuItemImpl;
    }

    public void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.MediaSessionCompat$Token;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, z);
        }
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(setCustomView setcustomview) {
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.MediaSessionCompat$Token;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            return setstackedbackground_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(setcustomview);
        }
        return false;
    }

    public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        this.MediaSessionCompat$Token = setstackedbackground_mediabrowsercompat_itemreceiver;
    }

    public void write(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.PlaybackStateCompat;
        if (viewGroup != null) {
            MenuItemImpl menuItemImpl = this.f2647x50fd9e4a;
            int i = 0;
            if (menuItemImpl != null) {
                menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
                ArrayList<MenuItemImpl> MediaBrowserCompat$ItemReceiver2 = this.f2647x50fd9e4a.MediaBrowserCompat$ItemReceiver();
                int size = MediaBrowserCompat$ItemReceiver2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl2 = MediaBrowserCompat$ItemReceiver2.get(i3);
                    if (read(menuItemImpl2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        MenuItemImpl IconCompatParcelizer2 = childAt instanceof setTabContainer.read ? ((setTabContainer.read) childAt).IconCompatParcelizer() : null;
                        View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(menuItemImpl2, childAt, viewGroup);
                        if (menuItemImpl2 != IconCompatParcelizer2) {
                            MediaBrowserCompat$ItemReceiver3.setPressed(false);
                            MediaBrowserCompat$ItemReceiver3.jumpDrawablesToCurrentState();
                        }
                        if (MediaBrowserCompat$ItemReceiver3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) MediaBrowserCompat$ItemReceiver3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(MediaBrowserCompat$ItemReceiver3);
                            }
                            ((ViewGroup) this.PlaybackStateCompat).addView(MediaBrowserCompat$ItemReceiver3, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!MediaBrowserCompat$ItemReceiver(viewGroup, i)) {
                    i++;
                }
            }
        }
    }
}
