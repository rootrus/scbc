package com.kofax.mobile.sdk._internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;

/* renamed from: com.kofax.mobile.sdk._internal.view.j */
public interface C0776j {
    /* renamed from: a */
    int mo11923a(CaptureMessage.KUIMessageOrientation kUIMessageOrientation);

    /* renamed from: a */
    void mo11924a(Canvas canvas, Rect rect, CaptureMessage captureMessage, View view, int i);

    /* renamed from: a */
    void mo11925a(Matrix matrix, int i, int i2, CaptureMessage.KUIMessageOrientation kUIMessageOrientation);

    /* renamed from: a */
    void mo11926a(Matrix matrix, Rect rect, CaptureMessage captureMessage, int i, int i2, int i3);

    /* renamed from: a */
    void mo11927a(TextView textView, CaptureMessage.KUIMessageOrientation kUIMessageOrientation);

    /* renamed from: l */
    void mo11928l(Context context);
}
