package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p040o.AlertController$RecycleListView;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;

public class ForegroundLinearLayout extends LinearLayoutCompat {
    private boolean IconCompatParcelizer;
    private final Rect MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private final Rect RatingCompat;
    private int read;
    private Drawable write;

    public ForegroundLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RatingCompat = new Rect();
        this.MediaBrowserCompat$CustomActionResultReceiver = new Rect();
        this.read = 119;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompat$ItemReceiver = false;
        TypedArray MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.ForegroundLinearLayout, i, 0, new int[0]);
        this.read = MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.ForegroundLinearLayout_android_foregroundGravity, this.read);
        Drawable drawable = MediaBrowserCompat$ItemReceiver2.getDrawable(nAllocationSetSurface$MediaSessionCompat$Token.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.ForegroundLinearLayout_foregroundInsidePadding, true);
        MediaBrowserCompat$ItemReceiver2.recycle();
    }

    public int getForegroundGravity() {
        return this.read;
    }

    public void setForegroundGravity(int i) {
        if (this.read != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.read = i;
            if (i == 119 && this.write != null) {
                this.write.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.write;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.write;
        if (drawable != null && drawable.isStateful()) {
            this.write.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.write;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.write);
            }
            this.write = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.read == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.write;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.MediaBrowserCompat$ItemReceiver = z | this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.write;
        if (drawable != null) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = false;
                Rect rect = this.RatingCompat;
                Rect rect2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.IconCompatParcelizer) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.read, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
