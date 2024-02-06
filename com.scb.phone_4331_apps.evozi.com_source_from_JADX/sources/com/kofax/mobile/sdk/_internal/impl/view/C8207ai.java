package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.kofax.mobile.sdk._internal.view.C8236l;
import com.kofax.mobile.sdk._internal.view.IReviewImageMenuListener;
import com.kofax.mobile.sdk.p015ak.C0860e;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ai */
public class C8207ai extends LinearLayout implements C8236l {

    /* renamed from: XG */
    private static final int f4279XG = -16777216;

    /* renamed from: XH */
    private static final int f4280XH = -1;

    /* renamed from: XI */
    protected Button f4281XI;

    /* renamed from: XJ */
    protected Button f4282XJ;
    /* access modifiers changed from: private */

    /* renamed from: XK */
    public IReviewImageMenuListener f4283XK;

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C8207ai(Context context) {
        super(context);
        m4488i(context);
        this.f4281XI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C8207ai.this.f4283XK != null) {
                    C8207ai.this.f4283XK.onAcceptButtonClick();
                }
            }
        });
        this.f4282XJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C8207ai.this.f4283XK != null) {
                    C8207ai.this.f4283XK.onRetakeButtonClick();
                }
            }
        });
    }

    /* renamed from: i */
    private void m4488i(Context context) {
        setOrientation(0);
        Button button = new Button(context);
        this.f4281XI = button;
        button.setText(C0860e.m2232b(context, "img_review_accept"));
        this.f4281XI.setBackgroundColor(f4279XG);
        this.f4281XI.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.weight = 1.0f;
        addView(this.f4281XI, layoutParams);
        Button button2 = new Button(context);
        this.f4282XJ = button2;
        button2.setText(C0860e.m2232b(context, "img_review_retake"));
        this.f4282XJ.setBackgroundColor(f4279XG);
        this.f4282XJ.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 5;
        layoutParams2.weight = 1.0f;
        addView(this.f4282XJ, layoutParams2);
    }

    public void setListener(IReviewImageMenuListener iReviewImageMenuListener) {
        this.f4283XK = iReviewImageMenuListener;
    }
}
