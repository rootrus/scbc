package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.x */
public class C0761x extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: Wg */
    public TextView f1859Wg = null;

    /* renamed from: Xd */
    private Bitmap f1860Xd;

    /* renamed from: Xe */
    private Bitmap f1861Xe;
    /* access modifiers changed from: private */

    /* renamed from: Xf */
    public ImageView f1862Xf = null;

    public C0761x(Context context) {
        super(context);
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f1862Xf = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1862Xf.setLayoutParams(layoutParams);
        addView(this.f1862Xf);
        TextView textView = new TextView(context);
        this.f1859Wg = textView;
        textView.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        this.f1859Wg.setLayoutParams(layoutParams2);
        addView(this.f1859Wg);
    }

    /* renamed from: b */
    public void mo11921b(final boolean z, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (z) {
                    C0761x.this.f1862Xf.setImageBitmap(C0761x.this.getGreenCircle());
                } else {
                    C0761x.this.f1862Xf.setImageBitmap(C0761x.this.getRedCircle());
                }
                C0761x.this.f1859Wg.setText(str);
                C0761x.this.invalidate();
            }
        });
    }

    /* access modifiers changed from: private */
    public Bitmap getGreenCircle() {
        if (this.f1860Xd == null) {
            this.f1860Xd = Bitmap.createBitmap(90, 90, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f1860Xd);
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-16711936);
            canvas.drawCircle(45.0f, 45.0f, 30.0f, paint);
        }
        return this.f1860Xd;
    }

    /* access modifiers changed from: private */
    public Bitmap getRedCircle() {
        if (this.f1861Xe == null) {
            this.f1861Xe = Bitmap.createBitmap(90, 90, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f1861Xe);
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-65536);
            canvas.drawCircle(45.0f, 45.0f, 30.0f, paint);
        }
        return this.f1861Xe;
    }
}
