package com.google.maps.android.p003ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.maps.android.ui.RotationLayout */
public class RotationLayout extends FrameLayout {
    private int MediaBrowserCompat$CustomActionResultReceiver;

    public RotationLayout(Context context) {
        super(context);
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i3 == 1 || i3 == 3) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setViewRotation(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ((i + 360) % 360) / 90;
    }

    public void dispatchDraw(Canvas canvas) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate((float) getWidth(), BitmapDescriptorFactory.HUE_RED);
            canvas.rotate(90.0f, (float) (getWidth() / 2), BitmapDescriptorFactory.HUE_RED);
            canvas.translate((float) (getHeight() / 2), (float) (getWidth() / 2));
        } else if (i == 2) {
            canvas.rotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        } else {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) getHeight());
            canvas.rotate(270.0f, (float) (getWidth() / 2), BitmapDescriptorFactory.HUE_RED);
            canvas.translate((float) (getHeight() / 2), (float) ((-getWidth()) / 2));
        }
        super.dispatchDraw(canvas);
    }
}
