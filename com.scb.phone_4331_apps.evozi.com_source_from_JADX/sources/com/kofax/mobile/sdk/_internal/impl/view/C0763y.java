package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0776j;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.y */
public class C0763y implements C0776j {

    /* renamed from: Xj */
    private int f1866Xj;

    /* renamed from: jN */
    private int f1867jN;

    /* renamed from: l */
    public void mo11928l(Context context) {
        this.f1867jN = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f1866Xj = context.getResources().getConfiguration().orientation;
    }

    /* renamed from: a */
    public void mo11927a(TextView textView, CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        float width = ((float) textView.getWidth()) / 2.0f;
        float height = ((float) textView.getHeight()) / 2.0f;
        float a = (float) mo11923a(kUIMessageOrientation);
        if (Build.VERSION.SDK_INT < 11) {
            RotateAnimation rotateAnimation = new RotateAnimation(a, 90.0f + a, width, height);
            rotateAnimation.setDuration(100);
            rotateAnimation.setFillAfter(true);
            textView.startAnimation(rotateAnimation);
            return;
        }
        textView.setPivotX(width);
        textView.setPivotY(height);
        textView.setRotation(a);
    }

    /* renamed from: a */
    public void mo11925a(Matrix matrix, int i, int i2, CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        matrix.postRotate((float) mo11923a(kUIMessageOrientation), ((float) i) / 2.0f, ((float) i2) / 2.0f);
    }

    /* renamed from: a */
    public int mo11923a(CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        if (kUIMessageOrientation != null) {
            int i = 0;
            if (!m1776a(this.f1866Xj, kUIMessageOrientation)) {
                i = 90;
            }
            return m1778c(kUIMessageOrientation) ? i + CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static boolean m1776a(int i, CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        if (kUIMessageOrientation == CaptureMessage.KUIMessageOrientation.UNKNOWN || i == 0) {
            return true;
        }
        if (i == 1) {
            return m1777b(kUIMessageOrientation);
        }
        if (i == 2) {
            return !m1777b(kUIMessageOrientation);
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private static boolean m1777b(CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        return kUIMessageOrientation == CaptureMessage.KUIMessageOrientation.PORTRAIT || kUIMessageOrientation == CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT;
    }

    /* renamed from: c */
    private static boolean m1778c(CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        return kUIMessageOrientation == CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT || kUIMessageOrientation == CaptureMessage.KUIMessageOrientation.REVERSELANDSCAPE;
    }

    /* renamed from: a */
    public void mo11924a(Canvas canvas, Rect rect, CaptureMessage captureMessage, View view, int i) {
        PointF a = m1775a(rect, captureMessage, view.getMeasuredWidth(), view.getMeasuredHeight(), i);
        canvas.translate(a.x, a.y);
    }

    /* renamed from: a */
    public void mo11926a(Matrix matrix, Rect rect, CaptureMessage captureMessage, int i, int i2, int i3) {
        PointF a = m1775a(rect, captureMessage, i, i2, i3);
        matrix.postTranslate(a.x, a.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r13 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r13 != false) goto L_0x00a2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PointF m1775a(android.graphics.Rect r9, com.kofax.mobile.sdk._internal.capture.CaptureMessage r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            int r1 = r10.getPosX()
            r2 = -1
            if (r1 == r2) goto L_0x0022
            int r1 = r10.getPosY()
            if (r1 == r2) goto L_0x0022
            int r9 = r10.getPosX()
            float r9 = (float) r9
            r0.x = r9
            int r9 = r10.getPosY()
            float r9 = (float) r9
            r0.y = r9
            goto L_0x00a8
        L_0x0022:
            r1 = 0
            r2 = 1
            if (r13 != r2) goto L_0x0028
            r3 = r2
            goto L_0x0029
        L_0x0028:
            r3 = r1
        L_0x0029:
            float r4 = r9.exactCenterX()
            float r9 = r9.exactCenterY()
            r5 = 2
            int r11 = r11 / r5
            float r11 = (float) r11
            float r11 = r4 - r11
            int r12 = r12 / r5
            float r12 = (float) r12
            float r12 = r9 - r12
            if (r3 != 0) goto L_0x00a4
            if (r13 != 0) goto L_0x0040
            r3 = r2
            goto L_0x0041
        L_0x0040:
            r3 = r1
        L_0x0041:
            if (r13 != r5) goto L_0x0045
            r13 = r2
            goto L_0x0046
        L_0x0045:
            r13 = r1
        L_0x0046:
            com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r6 = r10.getOrientation()
            com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r7 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.LANDSCAPE
            if (r6 == r7) goto L_0x005a
            int r6 = r8.f1867jN
            int r7 = r8.f1866Xj
            boolean r6 = com.kofax.mobile.sdk._internal.view.C0779p.m1851n(r6, r7)
            if (r6 != 0) goto L_0x005a
            r6 = r1
            goto L_0x005b
        L_0x005a:
            r6 = r2
        L_0x005b:
            com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r10 = r10.getOrientation()
            com.kofax.mobile.sdk._internal.capture.CaptureMessage$KUIMessageOrientation r7 = com.kofax.mobile.sdk._internal.capture.CaptureMessage.KUIMessageOrientation.PORTRAIT
            if (r10 == r7) goto L_0x006d
            int r10 = r8.f1867jN
            int r7 = r8.f1866Xj
            boolean r10 = com.kofax.mobile.sdk._internal.view.C0779p.m1851n(r10, r7)
            if (r10 != 0) goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            int r10 = r8.f1866Xj
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r5) goto L_0x0087
            if (r6 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
            goto L_0x009a
        L_0x0079:
            if (r6 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            if (r1 == 0) goto L_0x0082
            if (r3 != 0) goto L_0x0092
        L_0x0082:
            if (r1 == 0) goto L_0x00a4
            if (r13 == 0) goto L_0x00a4
            goto L_0x008b
        L_0x0087:
            if (r6 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x008e
        L_0x008b:
            float r4 = r4 / r2
            float r11 = r11 + r4
            goto L_0x00a4
        L_0x008e:
            if (r6 == 0) goto L_0x0095
            if (r13 == 0) goto L_0x0095
        L_0x0092:
            float r4 = r4 / r2
            float r11 = r11 - r4
            goto L_0x00a4
        L_0x0095:
            if (r1 == 0) goto L_0x009d
            if (r3 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            float r9 = r9 / r2
            float r12 = r12 - r9
            goto L_0x00a4
        L_0x009d:
            if (r1 == 0) goto L_0x00a4
            if (r13 != 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            float r9 = r9 / r2
            float r12 = r12 + r9
        L_0x00a4:
            r0.x = r11
            r0.y = r12
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.view.C0763y.m1775a(android.graphics.Rect, com.kofax.mobile.sdk._internal.capture.CaptureMessage, int, int, int):android.graphics.PointF");
    }
}
