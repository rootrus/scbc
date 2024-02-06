package p040o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: o.setSplitBackground */
public class setSplitBackground {
    public int IconCompatParcelizer;
    public View MediaBrowserCompat$CustomActionResultReceiver;
    public setPrimaryBackground MediaBrowserCompat$ItemReceiver;
    public setStackedBackground$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private final MenuItemImpl MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f2641x50fd9e4a;
    private final Context MediaDescriptionCompat;
    private final PopupWindow.OnDismissListener MediaMetadataCompat;
    private final int MediaSessionCompat$Token;
    private final boolean RatingCompat;
    public boolean read;
    public PopupWindow.OnDismissListener write;

    public setSplitBackground(Context context, MenuItemImpl menuItemImpl, View view, boolean z, int i) {
        this(context, menuItemImpl, view, z, i, 0);
    }

    public setSplitBackground(Context context, MenuItemImpl menuItemImpl, View view, boolean z, int i, int i2) {
        this.IconCompatParcelizer = 8388611;
        this.MediaMetadataCompat = new PopupWindow.OnDismissListener() {
            public final void onDismiss() {
                setSplitBackground.this.MediaBrowserCompat$CustomActionResultReceiver();
            }
        };
        this.MediaDescriptionCompat = context;
        this.MediaBrowserCompat$SearchResultReceiver = menuItemImpl;
        this.MediaBrowserCompat$CustomActionResultReceiver = view;
        this.RatingCompat = z;
        this.f2641x50fd9e4a = i;
        this.MediaSessionCompat$Token = i2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [o.setPrimaryBackground] */
    /* JADX WARNING: type inference failed for: r7v1, types: [o.setTitleOptional] */
    /* JADX WARNING: type inference failed for: r1v13, types: [o.setTitle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.setPrimaryBackground write() {
        /*
            r14 = this;
            android.content.Context r0 = r14.MediaDescriptionCompat
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001e
            r0.getRealSize(r1)
            goto L_0x0021
        L_0x001e:
            r0.getSize(r1)
        L_0x0021:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.MediaDescriptionCompat
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p040o.AlertController$RecycleListView.IconCompatParcelizer.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x004d
            o.setTitle r0 = new o.setTitle
            android.content.Context r2 = r14.MediaDescriptionCompat
            android.view.View r3 = r14.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r14.f2641x50fd9e4a
            int r5 = r14.MediaSessionCompat$Token
            boolean r6 = r14.RatingCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x004d:
            o.setTitleOptional r0 = new o.setTitleOptional
            android.content.Context r8 = r14.MediaDescriptionCompat
            o.MenuItemImpl r9 = r14.MediaBrowserCompat$SearchResultReceiver
            android.view.View r10 = r14.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r14.f2641x50fd9e4a
            int r12 = r14.MediaSessionCompat$Token
            boolean r13 = r14.RatingCompat
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005f:
            o.MenuItemImpl r1 = r14.MediaBrowserCompat$SearchResultReceiver
            r0.MediaBrowserCompat$ItemReceiver((p040o.MenuItemImpl) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.MediaMetadataCompat
            r0.MediaBrowserCompat$ItemReceiver((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r0.IconCompatParcelizer(r1)
            o.setStackedBackground$MediaBrowserCompat$ItemReceiver r1 = r14.MediaBrowserCompat$MediaItem
            r0.MediaBrowserCompat$ItemReceiver((p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver) r1)
            boolean r1 = r14.read
            r0.read((boolean) r1)
            int r1 = r14.IconCompatParcelizer
            r0.MediaBrowserCompat$ItemReceiver((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSplitBackground.write():o.setPrimaryBackground");
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver = null;
        PopupWindow.OnDismissListener onDismissListener = this.write;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void write(int i, int i2, boolean z, boolean z2) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = write();
        }
        setPrimaryBackground setprimarybackground = this.MediaBrowserCompat$ItemReceiver;
        setprimarybackground.MediaBrowserCompat$CustomActionResultReceiver(z2);
        if (z) {
            if ((setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(this.MediaBrowserCompat$CustomActionResultReceiver)) & 7) == 5) {
                i -= this.MediaBrowserCompat$CustomActionResultReceiver.getWidth();
            }
            setprimarybackground.read(i);
            setprimarybackground.write(i2);
            int i3 = (int) ((this.MediaDescriptionCompat.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            setprimarybackground.MediaMetadataCompat = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        setprimarybackground.MediaDescriptionCompat();
    }

    public final void read() {
        setPrimaryBackground setprimarybackground = this.MediaBrowserCompat$ItemReceiver;
        if (setprimarybackground != null && setprimarybackground.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer() {
        setPrimaryBackground setprimarybackground = this.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (!(setprimarybackground != null && setprimarybackground.MediaBrowserCompat$CustomActionResultReceiver())) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                z = false;
            } else {
                write(0, 0, false, false);
            }
        }
        if (!z) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
