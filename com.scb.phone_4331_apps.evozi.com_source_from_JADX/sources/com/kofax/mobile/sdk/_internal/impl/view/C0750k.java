package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0779p;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.k */
public class C0750k extends LinearLayout {

    /* renamed from: VE */
    private static final int f1761VE = 7;

    /* renamed from: VF */
    private static final int f1762VF = 2;

    public C0750k(Context context, CaptureMessage captureMessage, Bitmap bitmap) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.addView(linearLayout);
        addView(linearLayout2);
        int a = C0779p.m1848a(context, 3.0f);
        int a2 = C0779p.m1848a(context, 15.0f);
        int a3 = C0779p.m1848a(context, 50.0f);
        int a4 = C0779p.m1848a(context, 100.0f);
        int textSize = captureMessage.getTextSize();
        linearLayout2.setPadding(a2, a2, a2, a2);
        linearLayout.setGravity(17);
        linearLayout.setPadding(a, a, a, a);
        if (captureMessage.getHeight() > 0) {
            linearLayout.setMinimumHeight(captureMessage.getHeight());
        }
        if (captureMessage.getWidth() > 0) {
            linearLayout.setMinimumWidth(captureMessage.getWidth());
        }
        linearLayout.setOrientation(1);
        if (bitmap != null) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setMaxHeight(a3);
            imageView.setMaxWidth(a3);
            imageView.setImageBitmap(bitmap);
            linearLayout.addView(imageView);
        }
        TextView textView = new TextView(context);
        textView.setTextSize((float) textSize);
        textView.setMaxWidth(a4);
        textView.setTextColor(captureMessage.getTextColor());
        if (captureMessage.getTypeface() != null) {
            textView.setTypeface(captureMessage.getTypeface());
        }
        textView.setText(captureMessage.getMessage());
        textView.setGravity(17);
        Paint paint = new Paint(textView.getPaint());
        float measureText = paint.measureText(captureMessage.getMessage());
        float applyDimension = TypedValue.applyDimension(2, 7.0f, getContext().getResources().getDisplayMetrics());
        boolean matches = captureMessage.getMessage().matches("\\S+");
        while (a4 > 0) {
            float f = (float) a4;
            if (measureText / 2.0f <= f && (!matches || measureText <= f)) {
                break;
            }
            float textSize2 = paint.getTextSize();
            paint.setTextSize(textSize2 - 1.0f);
            float measureText2 = paint.measureText(captureMessage.getMessage());
            if (textSize2 < applyDimension) {
                break;
            }
            measureText = measureText2;
        }
        textView.setTextSize(0, paint.getTextSize());
        linearLayout.addView(textView);
        if (captureMessage.getBackground() != null) {
            setBackgroundDrawable(captureMessage.getBackground());
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(captureMessage.getBackgroundColor());
            setBackgroundDrawable(shapeDrawable);
        }
        if (captureMessage.getBackground() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 16) {
            setBackgroundDrawable(captureMessage.getBackground());
        } else {
            setBackground(captureMessage.getBackground());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getMeasuredHeight() <= 0) {
                childAt.measure(-2, -2);
            }
            i3 += childAt.getMeasuredHeight();
            if (i4 <= childAt.getMeasuredWidth()) {
                i4 = childAt.getMeasuredWidth();
            }
        }
        int i6 = i3 > i4 ? i3 : i4;
        if (i3 > i4) {
            int i7 = (i3 - i4) / 2;
            setPadding(i7, 0, i7, 0);
        } else {
            int i8 = (i4 - i3) / 2;
            setPadding(0, i8, 0, i8);
        }
        setMeasuredDimension(i6, i6);
    }

    public Bitmap getViewBitmap() {
        measure(-2, -2);
        Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        draw(canvas);
        return createBitmap;
    }
}
