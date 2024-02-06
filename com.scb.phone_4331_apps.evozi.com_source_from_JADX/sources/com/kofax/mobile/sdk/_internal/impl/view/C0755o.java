package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.view.C0773f;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.o */
public class C0755o extends RelativeLayout implements C0773f {

    /* renamed from: Wd */
    private C0747h f1794Wd;

    /* renamed from: We */
    private C0747h f1795We;

    /* renamed from: Wf */
    private C0747h f1796Wf;
    /* access modifiers changed from: private */

    /* renamed from: Wg */
    public TextView f1797Wg;

    /* renamed from: Wh */
    private LinearLayout f1798Wh;

    /* renamed from: Wi */
    private C0761x f1799Wi;

    /* renamed from: Wj */
    private C0761x f1800Wj;

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0755o(Context context) {
        super(context);
        C0747h hVar = new C0747h(context);
        this.f1794Wd = hVar;
        addView(hVar);
        C0747h hVar2 = new C0747h(context);
        this.f1795We = hVar2;
        addView(hVar2);
        C0747h hVar3 = new C0747h(context);
        this.f1796Wf = hVar3;
        addView(hVar3);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1798Wh = linearLayout;
        linearLayout.setOrientation(1);
        this.f1798Wh.setBackgroundColor(Color.parseColor("#60000000"));
        this.f1798Wh.setPadding(30, 30, 0, 0);
        this.f1798Wh.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        addView(this.f1798Wh);
        C0761x xVar = new C0761x(context);
        this.f1799Wi = xVar;
        xVar.setVisibility(4);
        this.f1798Wh.addView(this.f1799Wi);
        C0761x xVar2 = new C0761x(context);
        this.f1800Wj = xVar2;
        xVar2.setVisibility(4);
        this.f1798Wh.addView(this.f1800Wj);
        TextView textView = new TextView(context);
        this.f1797Wg = textView;
        textView.setTextColor(-1);
        this.f1798Wh.addView(this.f1797Wg);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1794Wd.layout(i, i2, i3, i4);
        this.f1795We.layout(i, i2, i3, i4);
        this.f1796Wf.layout(i, i2, i3, i4);
        this.f1798Wh.setLayoutParams(new RelativeLayout.LayoutParams(i3, i4));
    }

    public void setBoundsData(BoundingTetragon boundingTetragon, int i, int i2) {
        this.f1794Wd.setBoundsData(boundingTetragon, i, i2);
    }

    public void showDebugData(final String... strArr) {
        post(new Runnable() {
            public void run() {
                if (strArr != null) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        String[] strArr = strArr;
                        if (i < strArr.length) {
                            sb.append(strArr[i]);
                            sb.append("\n");
                            i++;
                        } else {
                            C0755o.this.f1797Wg.setText(sb.toString());
                            return;
                        }
                    }
                }
            }
        });
    }

    public void showFocusAreas(List<Rect> list, int i, int i2, boolean z) {
        if (list == null || list.size() <= 0) {
            this.f1795We.setBoundsData((BoundingTetragon) null, 0, 0);
            return;
        }
        Rect rect = list.get(0);
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.left;
        BoundingTetragon boundingTetragon = new BoundingTetragon(i3, i4, rect.width() + i5, rect.top, rect.left, rect.top + rect.height(), rect.width() + rect.left, rect.top + rect.height());
        this.f1795We.setBorderColor(z ? -16711936 : -65536);
        this.f1795We.setBoundsData(boundingTetragon, i, i2);
    }

    public void showIndicators(boolean z, String str, boolean z2, String str2) {
        this.f1799Wi.setVisibility(0);
        this.f1799Wi.mo11921b(z, str);
        this.f1800Wj.setVisibility(0);
        this.f1800Wj.mo11921b(z2, str2);
    }

    public void setVisible(boolean z) {
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    public void showRect(Rect rect) {
        if (rect != null) {
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.left;
            int width = rect.width();
            BoundingTetragon boundingTetragon = new BoundingTetragon(i, i2, width + i3, rect.top, rect.left, rect.top + rect.height(), rect.width() + rect.left, rect.top + rect.height());
            this.f1796Wf.setBorderColor(-16711936);
            this.f1796Wf.setBoundsData(boundingTetragon, getWidth(), getHeight());
            return;
        }
        this.f1796Wf.setBoundsData((BoundingTetragon) null, 0, 0);
    }
}
