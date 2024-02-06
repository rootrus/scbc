package p040o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.setChecked */
public class setChecked extends Drawable implements Drawable.Callback {
    public Drawable MediaBrowserCompat$CustomActionResultReceiver;

    public setChecked(Drawable drawable) {
        Drawable drawable2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getChangingConfigurations();
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

    public boolean isStateful() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.setState(iArr);
    }

    public int[] getState() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getState();
    }

    public void jumpToCurrentState() {
        setBaselineAligned.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
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

    public void setAutoMirrored(boolean z) {
        setBaselineAligned.read(this.MediaBrowserCompat$CustomActionResultReceiver, z);
    }

    public boolean isAutoMirrored() {
        return setBaselineAligned.MediaDescriptionCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setTint(int i) {
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        setBaselineAligned.read(this.MediaBrowserCompat$CustomActionResultReceiver, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        setBaselineAligned.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, mode);
    }

    public void setHotspot(float f, float f2) {
        setBaselineAligned.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, i, i2, i3, i4);
    }
}
