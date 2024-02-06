package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.setTextOff;

public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable IconCompatParcelizer;
    Rect MediaBrowserCompat$CustomActionResultReceiver;
    private Rect MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(setTextOff settextoff) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = new Rect();
        TypedArray MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.ScrimInsetsFrameLayout, i, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2.getDrawable(nAllocationSetSurface$MediaSessionCompat$Token.ScrimInsetsFrameLayout_insetForeground);
        MediaBrowserCompat$ItemReceiver2.recycle();
        setWillNotDraw(true);
        SwitchCompat.write((View) this, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
            public final setTextOff write(View view, setTextOff settextoff) {
                if (ScrimInsetsFrameLayout.this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    ScrimInsetsFrameLayout.this.MediaBrowserCompat$CustomActionResultReceiver = new Rect();
                }
                ScrimInsetsFrameLayout.this.MediaBrowserCompat$CustomActionResultReceiver.set(settextoff.MediaBrowserCompat$CustomActionResultReceiver(), settextoff.read(), settextoff.write(), settextoff.IconCompatParcelizer());
                ScrimInsetsFrameLayout.this.MediaBrowserCompat$CustomActionResultReceiver(settextoff);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!settextoff.MediaBrowserCompat$MediaItem() || ScrimInsetsFrameLayout.this.IconCompatParcelizer == null);
                SwitchCompat.setItemInvoker(ScrimInsetsFrameLayout.this);
                return settextoff.MediaBrowserCompat$ItemReceiver();
            }
        });
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && this.IconCompatParcelizer != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.MediaBrowserCompat$ItemReceiver.set(0, 0, width, this.MediaBrowserCompat$CustomActionResultReceiver.top);
            this.IconCompatParcelizer.setBounds(this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer.draw(canvas);
            this.MediaBrowserCompat$ItemReceiver.set(0, height - this.MediaBrowserCompat$CustomActionResultReceiver.bottom, width, height);
            this.IconCompatParcelizer.setBounds(this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer.draw(canvas);
            this.MediaBrowserCompat$ItemReceiver.set(0, this.MediaBrowserCompat$CustomActionResultReceiver.top, this.MediaBrowserCompat$CustomActionResultReceiver.left, height - this.MediaBrowserCompat$CustomActionResultReceiver.bottom);
            this.IconCompatParcelizer.setBounds(this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer.draw(canvas);
            this.MediaBrowserCompat$ItemReceiver.set(width - this.MediaBrowserCompat$CustomActionResultReceiver.right, this.MediaBrowserCompat$CustomActionResultReceiver.top, width, height - this.MediaBrowserCompat$CustomActionResultReceiver.bottom);
            this.IconCompatParcelizer.setBounds(this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
