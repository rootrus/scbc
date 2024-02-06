package com.scb.phone.view.custom.ndid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.scb.phone.R;
import p040o.setLastBaselineToBottomHeight;

public class OverlayNationalIdFocus extends LinearLayout {
    private OverlayNationalIdFocus$MediaBrowserCompat$ItemReceiver write;

    public OverlayNationalIdFocus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAlpha(0.84f);
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
    }

    public OverlayNationalIdFocus(Context context) {
        super(context);
        setAlpha(0.84f);
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
    }

    public OverlayNationalIdFocus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAlpha(0.84f);
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.overlay_national_id);
        int width = (int) (((float) decodeResource.getWidth()) * 0.46f);
        int height = (int) (((float) decodeResource.getHeight()) * 0.46f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, width, height, true);
        if (!decodeResource.isRecycled()) {
            decodeResource.recycle();
        }
        int width2 = (int) (((float) ((getWidth() - ((int) (((float) getWidth()) * 0.1f))) - width)) / 2.0f);
        int height2 = ((int) (((float) (getHeight() - height)) / 2.0f)) + getPaddingTop();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f = (float) width2;
        float f2 = (float) height2;
        canvas.drawRect(new RectF(f, f2, (float) (width2 + width), (float) (height2 + height)), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        paint.setColor(-1);
        canvas.drawBitmap(createScaledBitmap, f, f2, paint);
        OverlayNationalIdFocus$MediaBrowserCompat$ItemReceiver overlayNationalIdFocus$MediaBrowserCompat$ItemReceiver = this.write;
        if (overlayNationalIdFocus$MediaBrowserCompat$ItemReceiver != null) {
            overlayNationalIdFocus$MediaBrowserCompat$ItemReceiver.read(width2, width);
        }
    }

    public void setOnStateChangeListener(OverlayNationalIdFocus$MediaBrowserCompat$ItemReceiver overlayNationalIdFocus$MediaBrowserCompat$ItemReceiver) {
        this.write = overlayNationalIdFocus$MediaBrowserCompat$ItemReceiver;
    }
}
