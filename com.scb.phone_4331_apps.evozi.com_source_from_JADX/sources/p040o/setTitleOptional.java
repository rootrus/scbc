package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setTitleOptional */
final class setTitleOptional extends setPrimaryBackground implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int IconCompatParcelizer = AlertController$RecycleListView.MediaMetadataCompat.abc_popup_menu_item_layout;
    private final int AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private boolean AppCompatDialogFragment;
    private final int Keep;
    final MenuPopupWindow MediaBrowserCompat$CustomActionResultReceiver;
    View MediaBrowserCompat$ItemReceiver;
    private final View.OnAttachStateChangeListener MediaBrowserCompat$MediaItem = new View.OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (setTitleOptional.this.write != null) {
                if (!setTitleOptional.this.write.isAlive()) {
                    setTitleOptional.this.write = view.getViewTreeObserver();
                }
                setTitleOptional.this.write.removeGlobalOnLayoutListener(setTitleOptional.this.read);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final setContentHeight MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2648x50fd9e4a;
    private View MediaDescriptionCompat;
    private final Context MediaSessionCompat$QueueItem;
    private final MenuItemImpl MediaSessionCompat$ResultReceiverWrapper;
    private PopupWindow.OnDismissListener MediaSessionCompat$Token;
    private int ParcelableVolumeInfo = 0;
    private final boolean PlaybackStateCompat;
    private setStackedBackground$MediaBrowserCompat$ItemReceiver PlaybackStateCompat$CustomAction;
    private int RatingCompat;
    final ViewTreeObserver.OnGlobalLayoutListener read = new ViewTreeObserver.OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (setTitleOptional.this.MediaBrowserCompat$CustomActionResultReceiver() && !setTitleOptional.this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo()) {
                View view = setTitleOptional.this.MediaBrowserCompat$ItemReceiver;
                if (view == null || !view.isShown()) {
                    setTitleOptional.this.IconCompatParcelizer();
                } else {
                    setTitleOptional.this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
                }
            }
        }
    };
    private final int setHasDecor;
    ViewTreeObserver write;

    public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
    }

    public final Parcelable RatingCompat() {
        return null;
    }

    public final boolean read() {
        return false;
    }

    public setTitleOptional(Context context, MenuItemImpl menuItemImpl, View view, int i, int i2, boolean z) {
        this.MediaSessionCompat$QueueItem = context;
        this.MediaSessionCompat$ResultReceiverWrapper = menuItemImpl;
        this.PlaybackStateCompat = z;
        this.MediaBrowserCompat$SearchResultReceiver = new setContentHeight(menuItemImpl, LayoutInflater.from(context), this.PlaybackStateCompat, IconCompatParcelizer);
        this.setHasDecor = i;
        this.Keep = i2;
        Resources resources = context.getResources();
        this.AlertController$RecycleListView = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_config_prefDialogWidth));
        this.MediaDescriptionCompat = view;
        this.MediaBrowserCompat$CustomActionResultReceiver = new MenuPopupWindow(this.MediaSessionCompat$QueueItem, this.setHasDecor, this.Keep);
        menuItemImpl.f2552x50fd9e4a.add(new WeakReference(this));
        IconCompatParcelizer(context, menuItemImpl);
        menuItemImpl.MediaDescriptionCompat = true;
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.ParcelableVolumeInfo = i;
    }

    public final void IconCompatParcelizer() {
        if (MediaBrowserCompat$CustomActionResultReceiver()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return !this.AppCompatDialogFragment && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onDismiss() {
        this.AppCompatDialogFragment = true;
        this.MediaSessionCompat$ResultReceiverWrapper.close();
        ViewTreeObserver viewTreeObserver = this.write;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.write = this.MediaBrowserCompat$ItemReceiver.getViewTreeObserver();
            }
            this.write.removeGlobalOnLayoutListener(this.read);
            this.write = null;
        }
        this.MediaBrowserCompat$ItemReceiver.removeOnAttachStateChangeListener(this.MediaBrowserCompat$MediaItem);
        PopupWindow.OnDismissListener onDismissListener = this.MediaSessionCompat$Token;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void write(boolean z) {
        this.f2648x50fd9e4a = false;
        setContentHeight setcontentheight = this.MediaBrowserCompat$SearchResultReceiver;
        if (setcontentheight != null) {
            setcontentheight.notifyDataSetChanged();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        this.PlaybackStateCompat$CustomAction = setstackedbackground_mediabrowsercompat_itemreceiver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(p040o.setCustomView r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0086
            o.setSplitBackground r0 = new o.setSplitBackground
            android.content.Context r3 = r9.MediaSessionCompat$QueueItem
            android.view.View r5 = r9.MediaBrowserCompat$ItemReceiver
            boolean r6 = r9.PlaybackStateCompat
            int r7 = r9.setHasDecor
            int r8 = r9.Keep
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.setStackedBackground$MediaBrowserCompat$ItemReceiver r2 = r9.PlaybackStateCompat$CustomAction
            r0.MediaBrowserCompat$MediaItem = r2
            o.setPrimaryBackground r3 = r0.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x0023
            r3.MediaBrowserCompat$ItemReceiver((p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver) r2)
        L_0x0023:
            boolean r2 = p040o.setPrimaryBackground.read((p040o.MenuItemImpl) r10)
            r0.read = r2
            o.setPrimaryBackground r3 = r0.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x0030
            r3.read((boolean) r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.MediaSessionCompat$Token
            r0.write = r2
            r2 = 0
            r9.MediaSessionCompat$Token = r2
            o.MenuItemImpl r2 = r9.MediaSessionCompat$ResultReceiverWrapper
            r2.read((boolean) r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r2.MediaMetadataCompat()
            androidx.appcompat.widget.MenuPopupWindow r3 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaSessionCompat$Token()
            int r4 = r9.ParcelableVolumeInfo
            android.view.View r5 = r9.MediaDescriptionCompat
            int r5 = p040o.SwitchCompat.m3079x50fd9e4a(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0060
            android.view.View r4 = r9.MediaDescriptionCompat
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0060:
            o.setPrimaryBackground r4 = r0.MediaBrowserCompat$ItemReceiver
            r5 = 1
            if (r4 == 0) goto L_0x006d
            boolean r4 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            if (r4 == 0) goto L_0x006d
            r4 = r5
            goto L_0x006e
        L_0x006d:
            r4 = r1
        L_0x006e:
            if (r4 == 0) goto L_0x0072
        L_0x0070:
            r0 = r5
            goto L_0x007c
        L_0x0072:
            android.view.View r4 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 != 0) goto L_0x0078
            r0 = r1
            goto L_0x007c
        L_0x0078:
            r0.write(r2, r3, r5, r5)
            goto L_0x0070
        L_0x007c:
            if (r0 == 0) goto L_0x0086
            o.setStackedBackground$MediaBrowserCompat$ItemReceiver r0 = r9.PlaybackStateCompat$CustomAction
            if (r0 == 0) goto L_0x0085
            r0.MediaBrowserCompat$CustomActionResultReceiver(r10)
        L_0x0085:
            return r5
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTitleOptional.MediaBrowserCompat$CustomActionResultReceiver(o.setCustomView):boolean");
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        if (menuItemImpl == this.MediaSessionCompat$ResultReceiverWrapper) {
            IconCompatParcelizer();
            setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.PlaybackStateCompat$CustomAction;
            if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
                setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, z);
            }
        }
    }

    public final void IconCompatParcelizer(View view) {
        this.MediaDescriptionCompat = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        IconCompatParcelizer();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(PopupWindow.OnDismissListener onDismissListener) {
        this.MediaSessionCompat$Token = onDismissListener;
    }

    public final ListView write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }

    public final void read(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(i);
    }

    public final void write(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.AppCompatActivity = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaDescriptionCompat() {
        /*
            r6 = this;
            boolean r0 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = r2
            goto L_0x00be
        L_0x000b:
            boolean r0 = r6.AppCompatDialogFragment
            if (r0 != 0) goto L_0x00be
            android.view.View r0 = r6.MediaDescriptionCompat
            if (r0 == 0) goto L_0x00be
            r6.MediaBrowserCompat$ItemReceiver = r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.IconCompatParcelizer((android.widget.PopupWindow.OnDismissListener) r6)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.IconCompatParcelizer((android.widget.AdapterView.OnItemClickListener) r6)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.write((boolean) r2)
            android.view.View r0 = r6.MediaBrowserCompat$ItemReceiver
            android.view.ViewTreeObserver r3 = r6.write
            if (r3 != 0) goto L_0x002c
            r3 = r2
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r6.write = r4
            if (r3 == 0) goto L_0x003a
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r6.read
            r4.addOnGlobalLayoutListener(r3)
        L_0x003a:
            android.view.View$OnAttachStateChangeListener r3 = r6.MediaBrowserCompat$MediaItem
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.MenuPopupWindow r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r3.IconCompatParcelizer((android.view.View) r0)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r6.ParcelableVolumeInfo
            r0.write((int) r3)
            boolean r0 = r6.f2648x50fd9e4a
            if (r0 != 0) goto L_0x005d
            o.setContentHeight r0 = r6.MediaBrowserCompat$SearchResultReceiver
            android.content.Context r3 = r6.MediaSessionCompat$QueueItem
            int r4 = r6.AlertController$RecycleListView
            int r0 = MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r4)
            r6.RatingCompat = r0
            r6.f2648x50fd9e4a = r2
        L_0x005d:
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r6.RatingCompat
            r0.IconCompatParcelizer((int) r3)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 2
            r0.MediaBrowserCompat$ItemReceiver(r3)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            android.graphics.Rect r3 = r6.MediaMetadataCompat
            r0.write((android.graphics.Rect) r3)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaDescriptionCompat()
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            android.widget.ListView r0 = r0.write()
            r0.setOnKeyListener(r6)
            boolean r3 = r6.AppCompatActivity
            if (r3 == 0) goto L_0x00b0
            o.MenuItemImpl r3 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.lang.CharSequence r3 = r3.MediaMetadataCompat
            if (r3 == 0) goto L_0x00b0
            android.content.Context r3 = r6.MediaSessionCompat$QueueItem
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r4 = p040o.AlertController$RecycleListView.MediaMetadataCompat.abc_popup_menu_header_item_layout
            android.view.View r3 = r3.inflate(r4, r0, r1)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x00a9
            o.MenuItemImpl r5 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.lang.CharSequence r5 = r5.MediaMetadataCompat
            r4.setText(r5)
        L_0x00a9:
            r3.setEnabled(r1)
            r4 = 0
            r0.addHeaderView(r3, r4, r1)
        L_0x00b0:
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.setContentHeight r1 = r6.MediaBrowserCompat$SearchResultReceiver
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.widget.ListAdapter) r1)
            androidx.appcompat.widget.MenuPopupWindow r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaDescriptionCompat()
            goto L_0x0008
        L_0x00be:
            if (r1 == 0) goto L_0x00c1
            return
        L_0x00c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTitleOptional.MediaDescriptionCompat():void");
    }
}
