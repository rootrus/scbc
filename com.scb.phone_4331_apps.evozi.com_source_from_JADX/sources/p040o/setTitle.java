package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setTitle */
final class setTitle extends setPrimaryBackground implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int MediaDescriptionCompat = AlertController$RecycleListView.MediaMetadataCompat.abc_cascading_menu_item_layout;
    private int AlertController$RecycleListView;
    private final List<MenuItemImpl> AppCompatActivity = new ArrayList();
    private final int AppCompatDelegateImpl$ListMenuDecorView;
    private setStackedBackground$MediaBrowserCompat$ItemReceiver AppCompatDialogFragment;
    private boolean AppCompatViewInflater;
    final ViewTreeObserver.OnGlobalLayoutListener IconCompatParcelizer = new ViewTreeObserver.OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (setTitle.this.MediaBrowserCompat$CustomActionResultReceiver() && setTitle.this.read.size() > 0 && !setTitle.this.read.get(0).MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo()) {
                View view = setTitle.this.write;
                if (view == null || !view.isShown()) {
                    setTitle.this.IconCompatParcelizer();
                    return;
                }
                for (write write : setTitle.this.read) {
                    write.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
                }
            }
        }
    };
    private final boolean Keep;
    final Handler MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    ViewTreeObserver MediaBrowserCompat$MediaItem;
    private final View.OnAttachStateChangeListener MediaBrowserCompat$SearchResultReceiver = new View.OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (setTitle.this.MediaBrowserCompat$MediaItem != null) {
                if (!setTitle.this.MediaBrowserCompat$MediaItem.isAlive()) {
                    setTitle.this.MediaBrowserCompat$MediaItem = view.getViewTreeObserver();
                }
                setTitle.this.MediaBrowserCompat$MediaItem.removeGlobalOnLayoutListener(setTitle.this.IconCompatParcelizer);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2644x50fd9e4a;
    private final Context MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private final setOnMenuItemClickListener PlaybackStateCompat = new setOnMenuItemClickListener() {
        public final void IconCompatParcelizer(MenuItemImpl menuItemImpl, MenuItem menuItem) {
            setTitle.this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacksAndMessages(menuItemImpl);
        }

        public final void write(final MenuItemImpl menuItemImpl, final MenuItem menuItem) {
            final write write = null;
            setTitle.this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacksAndMessages((Object) null);
            int size = setTitle.this.read.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (menuItemImpl == setTitle.this.read.get(i).MediaBrowserCompat$ItemReceiver) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < setTitle.this.read.size()) {
                    write = setTitle.this.read.get(i2);
                }
                setTitle.this.MediaBrowserCompat$CustomActionResultReceiver.postAtTime(new Runnable() {
                    public final void run() {
                        if (write != null) {
                            setTitle.this.MediaBrowserCompat$ItemReceiver = true;
                            write.MediaBrowserCompat$ItemReceiver.read(false);
                            setTitle.this.MediaBrowserCompat$ItemReceiver = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            menuItemImpl.MediaBrowserCompat$ItemReceiver(menuItem, (setStackedBackground) null, 4);
                        }
                    }
                }, menuItemImpl, SystemClock.uptimeMillis() + 200);
            }
        }
    };
    private PopupWindow.OnDismissListener PlaybackStateCompat$CustomAction;
    private View RatingCompat;
    final List<write> read = new ArrayList();
    private int setBackgroundResource;
    private int setCheckable;
    private int setChecked;
    private final int setContentView;
    private final int setHasDecor;
    View write;

    public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    public final Parcelable RatingCompat() {
        return null;
    }

    public final boolean read() {
        return false;
    }

    public setTitle(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.setBackgroundResource = 0;
        this.MediaSessionCompat$ResultReceiverWrapper = 0;
        this.MediaSessionCompat$QueueItem = context;
        this.RatingCompat = view;
        this.AppCompatDelegateImpl$ListMenuDecorView = i;
        this.setContentView = i2;
        this.Keep = z;
        this.ParcelableVolumeInfo = false;
        this.AlertController$RecycleListView = SwitchCompat.m3079x50fd9e4a(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.setHasDecor = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_config_prefDialogWidth));
        this.MediaBrowserCompat$CustomActionResultReceiver = new Handler();
    }

    public final void read(boolean z) {
        this.ParcelableVolumeInfo = z;
    }

    public final void MediaDescriptionCompat() {
        if (!MediaBrowserCompat$CustomActionResultReceiver()) {
            for (MenuItemImpl MediaBrowserCompat$CustomActionResultReceiver2 : this.AppCompatActivity) {
                MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            this.AppCompatActivity.clear();
            View view = this.RatingCompat;
            this.write = view;
            if (view != null) {
                boolean z = this.MediaBrowserCompat$MediaItem == null;
                ViewTreeObserver viewTreeObserver = this.write.getViewTreeObserver();
                this.MediaBrowserCompat$MediaItem = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.IconCompatParcelizer);
                }
                this.write.addOnAttachStateChangeListener(this.MediaBrowserCompat$SearchResultReceiver);
            }
        }
    }

    public final void IconCompatParcelizer() {
        int size = this.read.size();
        if (size > 0) {
            write[] writeArr = (write[]) this.read.toArray(new write[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    write write2 = writeArr[size];
                    if (write2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                        write2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        IconCompatParcelizer();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        Context context = this.MediaSessionCompat$QueueItem;
        menuItemImpl.f2552x50fd9e4a.add(new WeakReference(this));
        IconCompatParcelizer(context, menuItemImpl);
        menuItemImpl.MediaDescriptionCompat = true;
        if (MediaBrowserCompat$CustomActionResultReceiver()) {
            MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl);
        } else {
            this.AppCompatActivity.add(menuItemImpl);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(p040o.MenuItemImpl r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.MediaSessionCompat$QueueItem
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            o.setContentHeight r3 = new o.setContentHeight
            boolean r4 = r0.Keep
            int r5 = MediaDescriptionCompat
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.MediaBrowserCompat$CustomActionResultReceiver()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.ParcelableVolumeInfo
            if (r4 == 0) goto L_0x0021
            r3.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.MediaBrowserCompat$CustomActionResultReceiver()
            if (r4 == 0) goto L_0x002d
            boolean r4 = p040o.setPrimaryBackground.read((p040o.MenuItemImpl) r17)
            r3.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x002d:
            android.content.Context r4 = r0.MediaSessionCompat$QueueItem
            int r6 = r0.setHasDecor
            int r4 = MediaBrowserCompat$CustomActionResultReceiver(r3, r4, r6)
            androidx.appcompat.widget.MenuPopupWindow r6 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r7 = r0.MediaSessionCompat$QueueItem
            int r8 = r0.AppCompatDelegateImpl$ListMenuDecorView
            int r9 = r0.setContentView
            r6.<init>(r7, r8, r9)
            o.setOnMenuItemClickListener r7 = r0.PlaybackStateCompat
            r6.read = r7
            r6.IconCompatParcelizer((android.widget.AdapterView.OnItemClickListener) r0)
            r6.IconCompatParcelizer((android.widget.PopupWindow.OnDismissListener) r0)
            android.view.View r7 = r0.RatingCompat
            r6.IconCompatParcelizer((android.view.View) r7)
            int r7 = r0.MediaSessionCompat$ResultReceiverWrapper
            r6.write((int) r7)
            r6.write((boolean) r5)
            r7 = 2
            r6.MediaBrowserCompat$ItemReceiver(r7)
            r6.MediaBrowserCompat$CustomActionResultReceiver((android.widget.ListAdapter) r3)
            r6.IconCompatParcelizer((int) r4)
            int r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            r6.write((int) r3)
            java.util.List<o.setTitle$write> r3 = r0.read
            int r3 = r3.size()
            r9 = 0
            if (r3 <= 0) goto L_0x00e1
            java.util.List<o.setTitle$write> r3 = r0.read
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            o.setTitle$write r3 = (p040o.setTitle.write) r3
            o.MenuItemImpl r10 = r3.MediaBrowserCompat$ItemReceiver
            int r11 = r10.size()
            r12 = r9
        L_0x0083:
            if (r12 >= r11) goto L_0x0099
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0096
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r12 = r12 + 1
            goto L_0x0083
        L_0x0099:
            r13 = 0
        L_0x009a:
            if (r13 == 0) goto L_0x00e2
            androidx.appcompat.widget.MenuPopupWindow r10 = r3.MediaBrowserCompat$CustomActionResultReceiver
            android.widget.ListView r10 = r10.write()
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b7
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            o.setContentHeight r11 = (p040o.setContentHeight) r11
            goto L_0x00ba
        L_0x00b7:
            o.setContentHeight r11 = (p040o.setContentHeight) r11
            r12 = r9
        L_0x00ba:
            int r14 = r11.getCount()
            r15 = r9
        L_0x00bf:
            r7 = -1
            if (r15 >= r14) goto L_0x00cb
            androidx.appcompat.view.menu.MenuItemImpl r8 = r11.getItem(r15)
            if (r13 == r8) goto L_0x00cc
            int r15 = r15 + 1
            goto L_0x00bf
        L_0x00cb:
            r15 = r7
        L_0x00cc:
            if (r15 == r7) goto L_0x00e2
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e2
            int r7 = r10.getChildCount()
            if (r15 >= r7) goto L_0x00e2
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e3
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            if (r7 == 0) goto L_0x01a8
            java.lang.reflect.Method r8 = androidx.appcompat.widget.MenuPopupWindow.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x00fc
            android.widget.PopupWindow r10 = r6.RatingCompat     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00f5 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00f5 }
            r11[r9] = r12     // Catch:{ Exception -> 0x00f5 }
            r8.invoke(r10, r11)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00fc
        L_0x00f5:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r10)
        L_0x00fc:
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r8 < r10) goto L_0x0108
            android.widget.PopupWindow r8 = r6.RatingCompat
            r10 = 0
            r8.setEnterTransition(r10)
        L_0x0108:
            java.util.List<o.setTitle$write> r8 = r0.read
            int r10 = r8.size()
            int r10 = r10 - r5
            java.lang.Object r8 = r8.get(r10)
            o.setTitle$write r8 = (p040o.setTitle.write) r8
            androidx.appcompat.widget.MenuPopupWindow r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            android.widget.ListView r8 = r8.write()
            r10 = 2
            int[] r11 = new int[r10]
            r8.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.write
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.AlertController$RecycleListView
            if (r12 != r5) goto L_0x013c
            r11 = r11[r9]
            int r8 = r8.getWidth()
            int r11 = r11 + r8
            int r11 = r11 + r4
            int r8 = r10.right
            if (r11 > r8) goto L_0x0143
            goto L_0x0141
        L_0x013c:
            r8 = r11[r9]
            int r8 = r8 - r4
            if (r8 >= 0) goto L_0x0143
        L_0x0141:
            r8 = r5
            goto L_0x0144
        L_0x0143:
            r8 = r9
        L_0x0144:
            if (r8 != r5) goto L_0x0148
            r10 = r5
            goto L_0x0149
        L_0x0148:
            r10 = r9
        L_0x0149:
            r0.AlertController$RecycleListView = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r8 < r11) goto L_0x0158
            r6.IconCompatParcelizer((android.view.View) r7)
            r8 = r9
            r13 = r8
            goto L_0x0189
        L_0x0158:
            r8 = 2
            int[] r11 = new int[r8]
            android.view.View r13 = r0.RatingCompat
            r13.getLocationOnScreen(r11)
            int[] r8 = new int[r8]
            r7.getLocationOnScreen(r8)
            int r13 = r0.MediaSessionCompat$ResultReceiverWrapper
            r13 = r13 & 7
            if (r13 != r12) goto L_0x017f
            r13 = r11[r9]
            android.view.View r14 = r0.RatingCompat
            int r14 = r14.getWidth()
            int r13 = r13 + r14
            r11[r9] = r13
            r13 = r8[r9]
            int r14 = r7.getWidth()
            int r13 = r13 + r14
            r8[r9] = r13
        L_0x017f:
            r13 = r8[r9]
            r14 = r11[r9]
            int r13 = r13 - r14
            r8 = r8[r5]
            r11 = r11[r5]
            int r8 = r8 - r11
        L_0x0189:
            int r11 = r0.MediaSessionCompat$ResultReceiverWrapper
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0195
            if (r10 != 0) goto L_0x019b
            int r4 = r7.getWidth()
            goto L_0x019d
        L_0x0195:
            if (r10 == 0) goto L_0x019d
            int r4 = r7.getWidth()
        L_0x019b:
            int r13 = r13 + r4
            goto L_0x019e
        L_0x019d:
            int r13 = r13 - r4
        L_0x019e:
            r6.read((int) r13)
            r6.read((boolean) r5)
            r6.MediaBrowserCompat$SearchResultReceiver(r8)
            goto L_0x01bf
        L_0x01a8:
            boolean r4 = r0.MediaSessionCompat$Token
            if (r4 == 0) goto L_0x01b1
            int r4 = r0.setChecked
            r6.read((int) r4)
        L_0x01b1:
            boolean r4 = r0.f2644x50fd9e4a
            if (r4 == 0) goto L_0x01ba
            int r4 = r0.setCheckable
            r6.MediaBrowserCompat$SearchResultReceiver(r4)
        L_0x01ba:
            android.graphics.Rect r4 = r0.MediaMetadataCompat
            r6.write((android.graphics.Rect) r4)
        L_0x01bf:
            o.setTitle$write r4 = new o.setTitle$write
            int r5 = r0.AlertController$RecycleListView
            r4.<init>(r6, r1, r5)
            java.util.List<o.setTitle$write> r5 = r0.read
            r5.add(r4)
            r6.MediaDescriptionCompat()
            android.widget.ListView r4 = r6.write()
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x01ff
            boolean r3 = r0.AppCompatViewInflater
            if (r3 == 0) goto L_0x01ff
            java.lang.CharSequence r3 = r1.MediaMetadataCompat
            if (r3 == 0) goto L_0x01ff
            int r3 = p040o.AlertController$RecycleListView.MediaMetadataCompat.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r9)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r9)
            java.lang.CharSequence r1 = r1.MediaMetadataCompat
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r9)
            r6.MediaDescriptionCompat()
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTitle.MediaBrowserCompat$CustomActionResultReceiver(o.MenuItemImpl):void");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.size() > 0 && this.read.get(0).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onDismiss() {
        write write2;
        int size = this.read.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                write2 = null;
                break;
            }
            write2 = this.read.get(i);
            if (!write2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                break;
            }
            i++;
        }
        if (write2 != null) {
            write2.MediaBrowserCompat$ItemReceiver.read(false);
        }
    }

    public final void write(boolean z) {
        for (write write2 : this.read) {
            ListAdapter adapter = write2.MediaBrowserCompat$CustomActionResultReceiver.write().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((setContentHeight) adapter).notifyDataSetChanged();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        this.AppCompatDialogFragment = setstackedbackground_mediabrowsercompat_itemreceiver;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(setCustomView setcustomview) {
        for (write next : this.read) {
            if (setcustomview == next.MediaBrowserCompat$ItemReceiver) {
                next.MediaBrowserCompat$CustomActionResultReceiver.write().requestFocus();
                return true;
            }
        }
        if (!setcustomview.hasVisibleItems()) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver((MenuItemImpl) setcustomview);
        setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.AppCompatDialogFragment;
        if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
            setstackedbackground_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(setcustomview);
        }
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        if (this.setBackgroundResource != i) {
            this.setBackgroundResource = i;
            this.MediaSessionCompat$ResultReceiverWrapper = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i, SwitchCompat.m3079x50fd9e4a(this.RatingCompat));
        }
    }

    public final void IconCompatParcelizer(View view) {
        if (this.RatingCompat != view) {
            this.RatingCompat = view;
            this.MediaSessionCompat$ResultReceiverWrapper = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(this.setBackgroundResource, SwitchCompat.m3079x50fd9e4a(view));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(PopupWindow.OnDismissListener onDismissListener) {
        this.PlaybackStateCompat$CustomAction = onDismissListener;
    }

    public final ListView write() {
        if (this.read.isEmpty()) {
            return null;
        }
        List<write> list = this.read;
        return list.get(list.size() - 1).MediaBrowserCompat$CustomActionResultReceiver.write();
    }

    public final void read(int i) {
        this.MediaSessionCompat$Token = true;
        this.setChecked = i;
    }

    public final void write(int i) {
        this.f2644x50fd9e4a = true;
        this.setCheckable = i;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.AppCompatViewInflater = z;
    }

    /* renamed from: o.setTitle$write */
    static class write {
        public final int IconCompatParcelizer;
        public final MenuPopupWindow MediaBrowserCompat$CustomActionResultReceiver;
        public final MenuItemImpl MediaBrowserCompat$ItemReceiver;

        public write(MenuPopupWindow menuPopupWindow, MenuItemImpl menuItemImpl, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = menuPopupWindow;
            this.MediaBrowserCompat$ItemReceiver = menuItemImpl;
            this.IconCompatParcelizer = i;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        int size = this.read.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuItemImpl == this.read.get(i).MediaBrowserCompat$ItemReceiver) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.read.size()) {
                this.read.get(i2).MediaBrowserCompat$ItemReceiver.read(false);
            }
            write remove = this.read.remove(i);
            remove.MediaBrowserCompat$ItemReceiver.write((setStackedBackground) this);
            if (this.MediaBrowserCompat$ItemReceiver) {
                MenuPopupWindow menuPopupWindow = remove.MediaBrowserCompat$CustomActionResultReceiver;
                if (Build.VERSION.SDK_INT >= 23) {
                    menuPopupWindow.RatingCompat.setExitTransition((Transition) null);
                }
                remove.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(0);
            }
            remove.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            int size2 = this.read.size();
            if (size2 > 0) {
                this.AlertController$RecycleListView = this.read.get(size2 - 1).IconCompatParcelizer;
            } else {
                this.AlertController$RecycleListView = SwitchCompat.m3079x50fd9e4a(this.RatingCompat) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                IconCompatParcelizer();
                setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.AppCompatDialogFragment;
                if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
                    setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, true);
                }
                ViewTreeObserver viewTreeObserver = this.MediaBrowserCompat$MediaItem;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.MediaBrowserCompat$MediaItem.removeGlobalOnLayoutListener(this.IconCompatParcelizer);
                    }
                    this.MediaBrowserCompat$MediaItem = null;
                }
                this.write.removeOnAttachStateChangeListener(this.MediaBrowserCompat$SearchResultReceiver);
                this.PlaybackStateCompat$CustomAction.onDismiss();
            } else if (z) {
                this.read.get(0).MediaBrowserCompat$ItemReceiver.read(false);
            }
        }
    }
}
