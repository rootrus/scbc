package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: o.setExpandedFormat */
class setExpandedFormat extends Drawable implements Drawable.Callback, Runnable {
    private Drawable IconCompatParcelizer;
    private setExpandedFormat$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver = 255;
    private Rect MediaBrowserCompat$MediaItem;
    private read MediaBrowserCompat$SearchResultReceiver;
    private long MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private Drawable MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token = -1;
    private long RatingCompat;
    private Runnable read;
    private int write = -1;

    setExpandedFormat() {
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.MediaSessionCompat$QueueItem;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.MediaBrowserCompat$SearchResultReceiver.getChangingConfigurations();
    }

    private boolean read() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect RatingCompat2 = this.MediaBrowserCompat$SearchResultReceiver.RatingCompat();
        if (RatingCompat2 != null) {
            rect.set(RatingCompat2);
            z = (RatingCompat2.right | ((RatingCompat2.left | RatingCompat2.top) | RatingCompat2.bottom)) != 0;
        } else {
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (read()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
        if (!this.MediaMetadataCompat || this.MediaBrowserCompat$ItemReceiver != i) {
            this.MediaMetadataCompat = true;
            this.MediaBrowserCompat$ItemReceiver = i;
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable == null) {
                return;
            }
            if (this.RatingCompat == 0) {
                drawable.setAlpha(i);
            } else {
                write(false);
            }
        }
    }

    public int getAlpha() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public void setDither(boolean z) {
        if (this.MediaBrowserCompat$SearchResultReceiver.setHasDecor != z) {
            this.MediaBrowserCompat$SearchResultReceiver.setHasDecor = z;
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null) {
                drawable.setDither(this.MediaBrowserCompat$SearchResultReceiver.setHasDecor);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = true;
        if (this.MediaBrowserCompat$SearchResultReceiver.ParcelableVolumeInfo != colorFilter) {
            this.MediaBrowserCompat$SearchResultReceiver.ParcelableVolumeInfo = colorFilter;
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompat$SearchResultReceiver.AppCompatViewInflater = true;
        if (this.MediaBrowserCompat$SearchResultReceiver.setPadding != colorStateList) {
            this.MediaBrowserCompat$SearchResultReceiver.setPadding = colorStateList;
            setBaselineAligned.read(this.IconCompatParcelizer, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.MediaBrowserCompat$SearchResultReceiver.setExpandedFormat = true;
        if (this.MediaBrowserCompat$SearchResultReceiver.setTitle != mode) {
            this.MediaBrowserCompat$SearchResultReceiver.setTitle = mode;
            setBaselineAligned.IconCompatParcelizer(this.IconCompatParcelizer, mode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.MediaSessionCompat$QueueItem;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean isStateful() {
        return this.MediaBrowserCompat$SearchResultReceiver.ParcelableVolumeInfo();
    }

    public void setAutoMirrored(boolean z) {
        if (this.MediaBrowserCompat$SearchResultReceiver.write != z) {
            this.MediaBrowserCompat$SearchResultReceiver.write = z;
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null) {
                setBaselineAligned.read(drawable, this.MediaBrowserCompat$SearchResultReceiver.write);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.MediaBrowserCompat$SearchResultReceiver.write;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.MediaSessionCompat$QueueItem;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.MediaSessionCompat$QueueItem = null;
            this.MediaSessionCompat$Token = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.MediaMetadataCompat) {
                this.IconCompatParcelizer.setAlpha(this.MediaBrowserCompat$ItemReceiver);
            }
        }
        if (this.MediaDescriptionCompat != 0) {
            this.MediaDescriptionCompat = 0;
            z = true;
        }
        if (this.RatingCompat != 0) {
            this.RatingCompat = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            setBaselineAligned.IconCompatParcelizer(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.MediaBrowserCompat$MediaItem;
        if (rect == null) {
            this.MediaBrowserCompat$MediaItem = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(drawable, i, i2, i3, i4);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.MediaBrowserCompat$MediaItem;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.MediaSessionCompat$QueueItem;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.MediaSessionCompat$QueueItem;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i, MediaBrowserCompat$CustomActionResultReceiver());
    }

    public int getIntrinsicWidth() {
        if (this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem()) {
            return this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat();
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem()) {
            return this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem();
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem()) {
            return this.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat();
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem()) {
            return this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        read read2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (read2 != null) {
            read2.MediaSessionCompat$ResultReceiverWrapper();
        }
        if (drawable == this.IconCompatParcelizer && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.IconCompatParcelizer && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.IconCompatParcelizer && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.MediaSessionCompat$QueueItem;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public int getOpacity() {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.MediaBrowserCompat$SearchResultReceiver.mo19824x50fd9e4a();
    }

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    /* access modifiers changed from: package-private */
    public boolean IconCompatParcelizer(int i) {
        if (i == this.write) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.MediaBrowserCompat$SearchResultReceiver.AppCompatActivity > 0) {
            Drawable drawable = this.MediaSessionCompat$QueueItem;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.IconCompatParcelizer;
            if (drawable2 != null) {
                this.MediaSessionCompat$QueueItem = drawable2;
                this.MediaSessionCompat$Token = this.write;
                this.MediaDescriptionCompat = ((long) this.MediaBrowserCompat$SearchResultReceiver.AppCompatActivity) + uptimeMillis;
            } else {
                this.MediaSessionCompat$QueueItem = null;
                this.MediaSessionCompat$Token = -1;
                this.MediaDescriptionCompat = 0;
            }
        } else {
            Drawable drawable3 = this.IconCompatParcelizer;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.MediaBrowserCompat$SearchResultReceiver.setCheckable) {
            this.IconCompatParcelizer = null;
            this.write = -1;
        } else {
            Drawable IconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(i);
            this.IconCompatParcelizer = IconCompatParcelizer2;
            this.write = i;
            if (IconCompatParcelizer2 != null) {
                if (this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource > 0) {
                    this.RatingCompat = uptimeMillis + ((long) this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource);
                }
                read(IconCompatParcelizer2);
            }
        }
        if (!(this.RatingCompat == 0 && this.MediaDescriptionCompat == 0)) {
            Runnable runnable = this.read;
            if (runnable == null) {
                this.read = this;
            } else {
                unscheduleSelf(runnable);
            }
            write(true);
        }
        invalidateSelf();
        return true;
    }

    private void read(Drawable drawable) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new setExpandedFormat$MediaBrowserCompat$ItemReceiver();
        }
        setExpandedFormat$MediaBrowserCompat$ItemReceiver setexpandedformat_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        setexpandedformat_mediabrowsercompat_itemreceiver.read = drawable.getCallback();
        drawable.setCallback(setexpandedformat_mediabrowsercompat_itemreceiver);
        try {
            if (this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource <= 0 && this.MediaMetadataCompat) {
                drawable.setAlpha(this.MediaBrowserCompat$ItemReceiver);
            }
            if (this.MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView) {
                drawable.setColorFilter(this.MediaBrowserCompat$SearchResultReceiver.ParcelableVolumeInfo);
            } else {
                if (this.MediaBrowserCompat$SearchResultReceiver.AppCompatViewInflater) {
                    setBaselineAligned.read(drawable, this.MediaBrowserCompat$SearchResultReceiver.setPadding);
                }
                if (this.MediaBrowserCompat$SearchResultReceiver.setExpandedFormat) {
                    setBaselineAligned.IconCompatParcelizer(drawable, this.MediaBrowserCompat$SearchResultReceiver.setTitle);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.MediaBrowserCompat$SearchResultReceiver.setHasDecor);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.MediaBrowserCompat$SearchResultReceiver.write);
            }
            Rect rect = this.MediaBrowserCompat$MediaItem;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            setExpandedFormat$MediaBrowserCompat$ItemReceiver setexpandedformat_mediabrowsercompat_itemreceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            Drawable.Callback callback = setexpandedformat_mediabrowsercompat_itemreceiver2.read;
            setexpandedformat_mediabrowsercompat_itemreceiver2.read = null;
            drawable.setCallback(callback);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.MediaMetadataCompat = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.IconCompatParcelizer
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.RatingCompat
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.MediaBrowserCompat$ItemReceiver
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            o.setExpandedFormat$read r9 = r13.MediaBrowserCompat$SearchResultReceiver
            int r9 = r9.setBackgroundResource
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.IconCompatParcelizer
            int r3 = 255 - r3
            int r10 = r13.MediaBrowserCompat$ItemReceiver
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.RatingCompat = r7
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.MediaSessionCompat$QueueItem
            if (r9 == 0) goto L_0x0064
            long r10 = r13.MediaDescriptionCompat
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0066
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0051
            r9.setVisible(r6, r6)
            r0 = 0
            r13.MediaSessionCompat$QueueItem = r0
            r0 = -1
            r13.MediaSessionCompat$Token = r0
            goto L_0x0064
        L_0x0051:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            o.setExpandedFormat$read r4 = r13.MediaBrowserCompat$SearchResultReceiver
            int r4 = r4.AppCompatActivity
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.MediaSessionCompat$QueueItem
            int r5 = r13.MediaBrowserCompat$ItemReceiver
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0067
        L_0x0064:
            r13.MediaDescriptionCompat = r7
        L_0x0066:
            r0 = r3
        L_0x0067:
            if (r14 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            java.lang.Runnable r14 = r13.read
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setExpandedFormat.write(boolean):void");
    }

    public Drawable getCurrent() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: package-private */
    public final void write(Resources resources) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(resources);
    }

    public void applyTheme(Resources.Theme theme) {
        this.MediaBrowserCompat$SearchResultReceiver.read(theme);
    }

    public boolean canApplyTheme() {
        return this.MediaBrowserCompat$SearchResultReceiver.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.MediaBrowserCompat$SearchResultReceiver.write()) {
            return null;
        }
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = getChangingConfigurations();
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public Drawable mutate() {
        if (!this.MediaSessionCompat$ResultReceiverWrapper && super.mutate() == this) {
            read MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
            this.MediaSessionCompat$ResultReceiverWrapper = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public read MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    /* renamed from: o.setExpandedFormat$read */
    static abstract class read extends Drawable.ConstantState {
        boolean ActionMenuItemView;
        int AlertController$RecycleListView;
        int AppCompatActivity;
        boolean AppCompatDelegateImpl$ListMenuDecorView;
        Drawable[] AppCompatDialogFragment;
        boolean AppCompatViewInflater;
        boolean ExpandedMenuView;
        boolean IconCompatParcelizer;
        Rect Keep;
        int MediaBrowserCompat$ItemReceiver;
        boolean MediaBrowserCompat$MediaItem;
        boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        int f2628x50fd9e4a;
        boolean MediaDescriptionCompat;
        boolean MediaMetadataCompat;
        int MediaSessionCompat$QueueItem;
        int MediaSessionCompat$ResultReceiverWrapper;
        int MediaSessionCompat$Token;
        ColorFilter ParcelableVolumeInfo;
        int PlaybackStateCompat = 160;
        boolean PlaybackStateCompat$CustomAction;
        boolean RatingCompat;
        int setBackgroundResource;
        int setCheckable;
        int setChecked;
        SparseArray<Drawable.ConstantState> setContentView;
        boolean setExpandedFormat;
        boolean setHasDecor;
        boolean setIcon;
        int setItemInvoker;
        ColorStateList setPadding;
        final setExpandedFormat setPopupCallback;
        Resources setShortcut;
        PorterDuff.Mode setTitle;
        boolean write;

        read(read read, setExpandedFormat setexpandedformat, Resources resources) {
            Resources resources2;
            this.ExpandedMenuView = false;
            this.PlaybackStateCompat$CustomAction = false;
            this.setHasDecor = true;
            this.setBackgroundResource = 0;
            this.AppCompatActivity = 0;
            this.setPopupCallback = setexpandedformat;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = read != null ? read.setShortcut : null;
            }
            this.setShortcut = resources2;
            int MediaBrowserCompat$ItemReceiver2 = setExpandedFormat.MediaBrowserCompat$ItemReceiver(resources, read != null ? read.PlaybackStateCompat : 0);
            this.PlaybackStateCompat = MediaBrowserCompat$ItemReceiver2;
            if (read != null) {
                this.MediaBrowserCompat$ItemReceiver = read.MediaBrowserCompat$ItemReceiver;
                this.MediaSessionCompat$Token = read.MediaSessionCompat$Token;
                this.MediaMetadataCompat = true;
                this.IconCompatParcelizer = true;
                this.ExpandedMenuView = read.ExpandedMenuView;
                this.PlaybackStateCompat$CustomAction = read.PlaybackStateCompat$CustomAction;
                this.setHasDecor = read.setHasDecor;
                this.ActionMenuItemView = read.ActionMenuItemView;
                this.setChecked = read.setChecked;
                this.setBackgroundResource = read.setBackgroundResource;
                this.AppCompatActivity = read.AppCompatActivity;
                this.write = read.write;
                this.ParcelableVolumeInfo = read.ParcelableVolumeInfo;
                this.AppCompatDelegateImpl$ListMenuDecorView = read.AppCompatDelegateImpl$ListMenuDecorView;
                this.setPadding = read.setPadding;
                this.setTitle = read.setTitle;
                this.AppCompatViewInflater = read.AppCompatViewInflater;
                this.setExpandedFormat = read.setExpandedFormat;
                if (read.PlaybackStateCompat == MediaBrowserCompat$ItemReceiver2) {
                    if (read.MediaBrowserCompat$MediaItem) {
                        this.Keep = new Rect(read.Keep);
                        this.MediaBrowserCompat$MediaItem = true;
                    }
                    if (read.MediaDescriptionCompat) {
                        this.AlertController$RecycleListView = read.AlertController$RecycleListView;
                        this.MediaSessionCompat$ResultReceiverWrapper = read.MediaSessionCompat$ResultReceiverWrapper;
                        this.f2628x50fd9e4a = read.f2628x50fd9e4a;
                        this.MediaSessionCompat$QueueItem = read.MediaSessionCompat$QueueItem;
                        this.MediaDescriptionCompat = true;
                    }
                }
                if (read.MediaBrowserCompat$SearchResultReceiver) {
                    this.setItemInvoker = read.setItemInvoker;
                    this.MediaBrowserCompat$SearchResultReceiver = true;
                }
                if (read.RatingCompat) {
                    this.setIcon = read.setIcon;
                    this.RatingCompat = true;
                }
                Drawable[] drawableArr = read.AppCompatDialogFragment;
                this.AppCompatDialogFragment = new Drawable[drawableArr.length];
                this.setCheckable = read.setCheckable;
                SparseArray<Drawable.ConstantState> sparseArray = read.setContentView;
                if (sparseArray != null) {
                    this.setContentView = sparseArray.clone();
                } else {
                    this.setContentView = new SparseArray<>(this.setCheckable);
                }
                int i = this.setCheckable;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.setContentView.put(i2, constantState);
                        } else {
                            this.AppCompatDialogFragment[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.AppCompatDialogFragment = new Drawable[10];
            this.setCheckable = 0;
        }

        public int getChangingConfigurations() {
            return this.MediaBrowserCompat$ItemReceiver | this.MediaSessionCompat$Token;
        }

        public final int read(Drawable drawable) {
            int i = this.setCheckable;
            if (i >= this.AppCompatDialogFragment.length) {
                write(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.setPopupCallback);
            this.AppCompatDialogFragment[i] = drawable;
            this.setCheckable++;
            this.MediaSessionCompat$Token = drawable.getChangingConfigurations() | this.MediaSessionCompat$Token;
            MediaSessionCompat$ResultReceiverWrapper();
            this.Keep = null;
            this.MediaBrowserCompat$MediaItem = false;
            this.MediaDescriptionCompat = false;
            this.MediaMetadataCompat = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        public void MediaSessionCompat$ResultReceiverWrapper() {
            this.MediaBrowserCompat$SearchResultReceiver = false;
            this.RatingCompat = false;
        }

        /* access modifiers changed from: package-private */
        public final int IconCompatParcelizer() {
            return this.AppCompatDialogFragment.length;
        }

        private void MediaSessionCompat$Token() {
            SparseArray<Drawable.ConstantState> sparseArray = this.setContentView;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.AppCompatDialogFragment[this.setContentView.keyAt(i)] = MediaBrowserCompat$CustomActionResultReceiver(this.setContentView.valueAt(i).newDrawable(this.setShortcut));
                }
                this.setContentView = null;
            }
        }

        private Drawable MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.setChecked);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.setPopupCallback);
            return mutate;
        }

        public final int read() {
            return this.setCheckable;
        }

        public final Drawable IconCompatParcelizer(int i) {
            int indexOfKey;
            Drawable drawable = this.AppCompatDialogFragment[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.setContentView;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(this.setContentView.valueAt(indexOfKey).newDrawable(this.setShortcut));
            this.AppCompatDialogFragment[i] = MediaBrowserCompat$CustomActionResultReceiver;
            this.setContentView.removeAt(indexOfKey);
            if (this.setContentView.size() == 0) {
                this.setContentView = null;
            }
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            int i3 = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.setChecked = i;
            return z;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(Resources resources) {
            if (resources != null) {
                this.setShortcut = resources;
                int MediaBrowserCompat$ItemReceiver2 = setExpandedFormat.MediaBrowserCompat$ItemReceiver(resources, this.PlaybackStateCompat);
                int i = this.PlaybackStateCompat;
                this.PlaybackStateCompat = MediaBrowserCompat$ItemReceiver2;
                if (i != MediaBrowserCompat$ItemReceiver2) {
                    this.MediaDescriptionCompat = false;
                    this.MediaBrowserCompat$MediaItem = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void read(Resources.Theme theme) {
            if (theme != null) {
                MediaSessionCompat$Token();
                int i = this.setCheckable;
                Drawable[] drawableArr = this.AppCompatDialogFragment;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.MediaSessionCompat$Token |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                MediaBrowserCompat$CustomActionResultReceiver(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.setContentView.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$ItemReceiver() {
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.ActionMenuItemView = true;
        }

        public final void read(boolean z) {
            this.ExpandedMenuView = z;
        }

        public final Rect RatingCompat() {
            Rect rect = null;
            if (this.ExpandedMenuView) {
                return null;
            }
            if (this.Keep != null || this.MediaBrowserCompat$MediaItem) {
                return this.Keep;
            }
            MediaSessionCompat$Token();
            Rect rect2 = new Rect();
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    if (rect2.left > rect.left) {
                        rect.left = rect2.left;
                    }
                    if (rect2.top > rect.top) {
                        rect.top = rect2.top;
                    }
                    if (rect2.right > rect.right) {
                        rect.right = rect2.right;
                    }
                    if (rect2.bottom > rect.bottom) {
                        rect.bottom = rect2.bottom;
                    }
                }
            }
            this.MediaBrowserCompat$MediaItem = true;
            this.Keep = rect;
            return rect;
        }

        public final void write(boolean z) {
            this.PlaybackStateCompat$CustomAction = z;
        }

        public final boolean MediaSessionCompat$QueueItem() {
            return this.PlaybackStateCompat$CustomAction;
        }

        public final int MediaDescriptionCompat() {
            if (!this.MediaDescriptionCompat) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return this.AlertController$RecycleListView;
        }

        public final int MediaBrowserCompat$MediaItem() {
            if (!this.MediaDescriptionCompat) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return this.MediaSessionCompat$ResultReceiverWrapper;
        }

        public final int MediaMetadataCompat() {
            if (!this.MediaDescriptionCompat) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return this.f2628x50fd9e4a;
        }

        public final int MediaBrowserCompat$SearchResultReceiver() {
            if (!this.MediaDescriptionCompat) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return this.MediaSessionCompat$QueueItem;
        }

        /* access modifiers changed from: protected */
        public void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaDescriptionCompat = true;
            MediaSessionCompat$Token();
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            this.MediaSessionCompat$ResultReceiverWrapper = -1;
            this.AlertController$RecycleListView = -1;
            this.MediaSessionCompat$QueueItem = 0;
            this.f2628x50fd9e4a = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.AlertController$RecycleListView) {
                    this.AlertController$RecycleListView = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.MediaSessionCompat$ResultReceiverWrapper) {
                    this.MediaSessionCompat$ResultReceiverWrapper = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2628x50fd9e4a) {
                    this.f2628x50fd9e4a = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.MediaSessionCompat$QueueItem) {
                    this.MediaSessionCompat$QueueItem = minimumHeight;
                }
            }
        }

        public final void write(int i) {
            this.setBackgroundResource = i;
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            this.AppCompatActivity = i;
        }

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final int mo19824x50fd9e4a() {
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                return this.setItemInvoker;
            }
            MediaSessionCompat$Token();
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.setItemInvoker = opacity;
            this.MediaBrowserCompat$SearchResultReceiver = true;
            return opacity;
        }

        public final boolean ParcelableVolumeInfo() {
            if (this.RatingCompat) {
                return this.setIcon;
            }
            MediaSessionCompat$Token();
            int i = this.setCheckable;
            Drawable[] drawableArr = this.AppCompatDialogFragment;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.setIcon = z;
            this.RatingCompat = true;
            return z;
        }

        public void write(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.AppCompatDialogFragment, 0, drawableArr, 0, i);
            this.AppCompatDialogFragment = drawableArr;
        }

        public boolean write() {
            synchronized (this) {
                if (this.MediaMetadataCompat) {
                    boolean z = this.IconCompatParcelizer;
                    return z;
                }
                MediaSessionCompat$Token();
                this.MediaMetadataCompat = true;
                int i = this.setCheckable;
                Drawable[] drawableArr = this.AppCompatDialogFragment;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        this.IconCompatParcelizer = false;
                        return false;
                    }
                }
                this.IconCompatParcelizer = true;
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(read read2) {
        this.MediaBrowserCompat$SearchResultReceiver = read2;
        int i = this.write;
        if (i >= 0) {
            Drawable IconCompatParcelizer2 = read2.IconCompatParcelizer(i);
            this.IconCompatParcelizer = IconCompatParcelizer2;
            if (IconCompatParcelizer2 != null) {
                read(IconCompatParcelizer2);
            }
        }
        this.MediaSessionCompat$Token = -1;
        this.MediaSessionCompat$QueueItem = null;
    }

    static int MediaBrowserCompat$ItemReceiver(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public void run() {
        write(true);
        invalidateSelf();
    }
}
