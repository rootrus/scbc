package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0776j;
import com.kofax.mobile.sdk._internal.view.C0778o;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ap */
public class C0740ap implements C0778o {

    /* renamed from: V */
    private Context f1729V;
    @HmlPinActivity

    /* renamed from: VS */
    C0776j f1730VS;
    @HmlPinActivity

    /* renamed from: Vu */
    C0769a f1731Vu;

    /* renamed from: Wg */
    private TextView f1732Wg;

    /* renamed from: XX */
    private LinearLayout f1733XX;

    /* renamed from: XY */
    private CaptureMessage f1734XY = null;

    /* renamed from: XZ */
    private int f1735XZ;

    /* renamed from: Ya */
    private int f1736Ya = 5;

    /* renamed from: Yb */
    private Rect f1737Yb;

    @HmlPinActivity
    C0740ap(Context context) {
        this.f1729V = context;
        this.f1735XZ = Build.VERSION.SDK_INT;
        this.f1737Yb = new Rect();
        this.f1732Wg = new TextView(this.f1729V);
        this.f1733XX = new LinearLayout(this.f1729V);
    }

    /* renamed from: sm */
    public CaptureMessage mo11845sm() {
        return this.f1734XY;
    }

    /* renamed from: c */
    public void mo11840c(CaptureMessage captureMessage) {
        this.f1734XY = captureMessage;
    }

    /* renamed from: f */
    public void mo11842f(int i, int i2, int i3, int i4) {
        this.f1730VS.mo11928l(this.f1729V);
        this.f1737Yb.set(i, i2, i3, i4);
        mo11843g(this.f1731Vu.mo11768rE());
    }

    /* renamed from: g */
    public void mo11843g(Rect rect) {
        CaptureMessage captureMessage = this.f1734XY;
        if (captureMessage != null) {
            m1689a(captureMessage, this.f1732Wg, this.f1733XX, this.f1737Yb, rect);
        }
    }

    /* renamed from: a */
    private void m1689a(CaptureMessage captureMessage, TextView textView, LinearLayout linearLayout, Rect rect, Rect rect2) {
        if (captureMessage.getTextSize() != -1) {
            textView.setTextSize((float) captureMessage.getTextSize());
        }
        textView.setTextColor(captureMessage.getTextColor());
        textView.setText(captureMessage.getMessage());
        textView.setBackgroundColor(captureMessage.getBackgroundColor());
        textView.setSingleLine(false);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setLines(4);
        if (captureMessage.getBackground() != null) {
            if (this.f1735XZ < 16) {
                textView.setBackgroundDrawable(captureMessage.getBackground());
            } else {
                textView.setBackground(captureMessage.getBackground());
            }
        }
        if (captureMessage.getTypeface() != null) {
            textView.setTypeface(captureMessage.getTypeface());
        }
        textView.setGravity(17);
        int i = this.f1736Ya;
        textView.setPadding(i, i, i, i);
        int width = rect.width();
        int height = rect.height();
        if (rect2 != null) {
            width = Math.abs(rect2.right - rect2.left);
            height = Math.abs(rect2.top - rect2.bottom);
        }
        if (captureMessage.getHeight() == 0 || captureMessage.getWidth() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        linearLayout.addView(textView);
        linearLayout.measure(width, height);
        m1688a(textView, captureMessage, width, height);
        linearLayout.layout(0, 0, width, height);
        this.f1730VS.mo11927a(textView, captureMessage.getOrientation());
    }

    /* renamed from: a */
    private void m1688a(View view, CaptureMessage captureMessage, int i, int i2) {
        Point c = m1690c(i, i2, this.f1730VS.mo11923a(captureMessage.getOrientation()));
        view.measure(m1691m(captureMessage.getWidth(), c.x), m1691m(captureMessage.getHeight(), c.y));
    }

    /* renamed from: c */
    private static Point m1690c(int i, int i2, int i3) {
        if (i3 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 != 0) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        return new Point(i, i2);
    }

    /* renamed from: m */
    private static int m1691m(int i, int i2) {
        int i3;
        if (i != -1) {
            i3 = 1073741824;
        } else {
            int i4 = i2;
            i3 = Integer.MIN_VALUE;
            i = i4;
        }
        return View.MeasureSpec.makeMeasureSpec(i, i3);
    }

    public void draw(Canvas canvas, Rect rect) {
        canvas.save();
        C0776j jVar = this.f1730VS;
        CaptureMessage captureMessage = this.f1734XY;
        jVar.mo11924a(canvas, rect, captureMessage, this.f1732Wg, captureMessage.getPosition());
        this.f1733XX.draw(canvas);
        canvas.restore();
    }

    public void setAlpha(float f) {
        this.f1732Wg.setAlpha(f);
    }

    /* renamed from: sn */
    public int mo11846sn() {
        return this.f1732Wg.getHeight();
    }
}
