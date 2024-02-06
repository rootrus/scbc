package com.pingan.p031ai.face.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.pingan.ai.face.view.AuroraView */
public class AuroraView extends View {
    public AuroraColorChangeListener auroraColorChangeListener;
    public int color = 0;

    /* renamed from: cx */
    public int f5372cx;

    /* renamed from: cy */
    public int f5373cy;
    public Canvas mCanvas;
    public Bitmap mCircleBmp;
    public Paint mCirclePaint;
    public Paint mPaint;
    public PorterDuffXfermode mPorterDuff;
    public int mRadius;
    public RectF mRectF;
    public Paint mRectPaint;

    /* renamed from: com.pingan.ai.face.view.AuroraView$AuroraColorChangeListener */
    public interface AuroraColorChangeListener {
        void onDrawColor(int i);
    }

    public AuroraView(Context context) {
        super(context);
        init();
    }

    public AuroraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AuroraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mPaint = new Paint();
        this.mRectPaint = new Paint();
        this.mCirclePaint = new Paint();
        this.mPorterDuff = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.mRectF = new RectF();
    }

    public native void onDraw(Canvas canvas);

    public native void setAuroraColorChangeListener(AuroraColorChangeListener auroraColorChangeListener2);

    public native void setAuroraViewColor(int i);

    public native void setCircleRadius(int i);

    public native void setCircleXY(int i, int i2);
}
