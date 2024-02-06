package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.FitWindowsFrameLayout */
class FitWindowsFrameLayout extends Drawable implements Drawable.Callback, LinearLayoutCompat, setOnFitSystemWindowsListener {
    static final PorterDuff.Mode read = PorterDuff.Mode.SRC_IN;
    read IconCompatParcelizer;
    Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private boolean MediaDescriptionCompat;
    private PorterDuff.Mode RatingCompat;
    private int write;

    /* access modifiers changed from: protected */
    public boolean IconCompatParcelizer() {
        return true;
    }

    FitWindowsFrameLayout(read read2, Resources resources) {
        this.IconCompatParcelizer = read2;
        MediaBrowserCompat$CustomActionResultReceiver(resources);
    }

    FitWindowsFrameLayout(Drawable drawable) {
        this.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver();
        write(drawable);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Resources resources) {
        read read2 = this.IconCompatParcelizer;
        if (read2 != null && read2.write != null) {
            write(this.IconCompatParcelizer.write.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.MediaBrowserCompat$CustomActionResultReceiver.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        read read2 = this.IconCompatParcelizer;
        return changingConfigurations | (read2 != null ? read2.getChangingConfigurations() : 0) | this.MediaBrowserCompat$CustomActionResultReceiver.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setColorFilter(colorFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.IconCompatParcelizer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.IconCompatParcelizer()
            if (r0 == 0) goto L_0x000d
            o.FitWindowsFrameLayout$read r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FitWindowsFrameLayout.isStateful():boolean");
    }

    public boolean setState(int[] iArr) {
        return MediaBrowserCompat$ItemReceiver(iArr) || this.MediaBrowserCompat$CustomActionResultReceiver.setState(iArr);
    }

    public int[] getState() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getState();
    }

    public Drawable getCurrent() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.MediaBrowserCompat$CustomActionResultReceiver.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getPadding(rect);
    }

    public void setAutoMirrored(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        read read2 = this.IconCompatParcelizer;
        if (read2 == null || !read2.write()) {
            return null;
        }
        this.IconCompatParcelizer.read = getChangingConfigurations();
        return this.IconCompatParcelizer;
    }

    public Drawable mutate() {
        if (!this.MediaDescriptionCompat && super.mutate() == this) {
            this.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver();
            Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (drawable != null) {
                drawable.mutate();
            }
            read read2 = this.IconCompatParcelizer;
            if (read2 != null) {
                Drawable drawable2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                read2.write = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.MediaDescriptionCompat = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public read MediaBrowserCompat$CustomActionResultReceiver() {
        return new C1179x2ca10612(this.IconCompatParcelizer, (Resources) null);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = colorStateList;
        MediaBrowserCompat$ItemReceiver(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.IconCompatParcelizer.IconCompatParcelizer = mode;
        MediaBrowserCompat$ItemReceiver(getState());
    }

    private boolean MediaBrowserCompat$ItemReceiver(int[] iArr) {
        if (!IconCompatParcelizer()) {
            return false;
        }
        ColorStateList colorStateList = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        PorterDuff.Mode mode = this.IconCompatParcelizer.IconCompatParcelizer;
        if (colorStateList == null || mode == null) {
            this.MediaBrowserCompat$ItemReceiver = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.MediaBrowserCompat$ItemReceiver && colorForState == this.write && mode == this.RatingCompat)) {
                setColorFilter(colorForState, mode);
                this.write = colorForState;
                this.RatingCompat = mode;
                this.MediaBrowserCompat$ItemReceiver = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void write(Drawable drawable) {
        Drawable drawable2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            read read2 = this.IconCompatParcelizer;
            if (read2 != null) {
                read2.write = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: o.FitWindowsFrameLayout$read */
    protected static abstract class read extends Drawable.ConstantState {
        PorterDuff.Mode IconCompatParcelizer = FitWindowsFrameLayout.read;
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver = null;
        int read;
        Drawable.ConstantState write;

        read(read read2, Resources resources) {
            if (read2 != null) {
                this.read = read2.read;
                this.write = read2.write;
                this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
                this.IconCompatParcelizer = read2.IconCompatParcelizer;
            }
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public int getChangingConfigurations() {
            int i = this.read;
            Drawable.ConstantState constantState = this.write;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        public boolean write() {
            return this.write != null;
        }
    }
}
