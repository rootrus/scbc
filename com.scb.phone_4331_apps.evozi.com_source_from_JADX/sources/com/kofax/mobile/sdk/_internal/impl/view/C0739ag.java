package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.kofax.mobile.sdk._internal.view.C0777k;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ag */
public class C0739ag extends RelativeLayout implements C0777k {

    /* renamed from: XF */
    ProgressBar f1728XF;

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0739ag(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(14, -1);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, 16842874);
        this.f1728XF = progressBar;
        progressBar.setLayoutParams(layoutParams);
        addView(this.f1728XF);
        setVisibility(8);
    }

    /* renamed from: r */
    public void mo11839r(int i) {
        setVisibility(0);
        setBackgroundColor(i);
    }

    public void hideProgressBar() {
        setVisibility(8);
    }
}
