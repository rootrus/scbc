package com.scb.phone.view.custom.ndid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.scb.phone.R;

public class OverlayWithCircleFocus extends LinearLayout {
    private boolean IconCompatParcelizer = true;
    private C1112x3acc57ff MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int read;
    private int write;

    public OverlayWithCircleFocus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayWithCircleFocus(Context context) {
        super(context);
    }

    public OverlayWithCircleFocus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnStateChangeListener(C1112x3acc57ff overlayWithCircleFocus$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = overlayWithCircleFocus$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        int width = getWidth();
        if (this.read == 0) {
            this.read = ((int) (((float) width) - ((24.0f * f) * 2.0f))) / 2;
        }
        this.write = width / 2;
        int height = ((int) ((((float) getHeight()) / ((float) getWidth())) * 50.0f * f)) + this.read;
        this.MediaBrowserCompat$ItemReceiver = height;
        if (((float) height) > (((float) getHeight()) * 0.1f) + ((float) this.read)) {
            this.MediaBrowserCompat$ItemReceiver = ((int) (((float) getHeight()) * 0.1f)) + this.read;
        }
        C1112x3acc57ff overlayWithCircleFocus$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (overlayWithCircleFocus$MediaBrowserCompat$CustomActionResultReceiver != null) {
            overlayWithCircleFocus$MediaBrowserCompat$CustomActionResultReceiver.read(this.MediaBrowserCompat$ItemReceiver, this.read);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.frame_liveness);
        int i = this.read << 1;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i, i, true);
        float f2 = (float) this.write;
        float f3 = (float) this.MediaBrowserCompat$ItemReceiver;
        float f4 = (float) this.read;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setColor(-65536);
        canvas2.drawCircle((float) this.write, (float) this.MediaBrowserCompat$ItemReceiver, (float) this.read, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        paint.setColor(-1);
        float f5 = f2 - f4;
        float f6 = f3 - f4;
        canvas2.drawBitmap(createScaledBitmap, f5, f6, paint);
        if (this.IconCompatParcelizer) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.line_focus);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), this.read << 1, true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
            paint.setColor(-1);
            canvas2.drawBitmap(createScaledBitmap2, f2 - ((float) createScaledBitmap2.getWidth()), f6, paint);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap2, 0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), matrix, true);
            canvas2.drawBitmap(createBitmap, f5, f3 - ((float) createBitmap.getHeight()), paint);
        }
    }

    public void setLineFocus(boolean z) {
        this.IconCompatParcelizer = z;
        invalidate();
    }

    public void setCircleRadius(int i) {
        this.read = i;
    }
}
