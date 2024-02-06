package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.ICaptureMenuListener;
import com.kofax.mobile.sdk.p015ak.C0859c;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.c */
public class C8217c extends RelativeLayout implements C8234b {

    /* renamed from: Vo */
    protected ImageView f4326Vo;

    /* renamed from: Vp */
    protected ImageView f4327Vp;

    /* renamed from: Vq */
    protected ImageView f4328Vq;

    /* renamed from: Vr */
    protected ToggleButton f4329Vr;
    /* access modifiers changed from: private */

    /* renamed from: Vs */
    public ICaptureMenuListener f4330Vs = null;

    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C8217c(Context context) {
        super(context);
        m4513i(context);
        this.f4326Vo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C8217c.this.f4330Vs != null) {
                    C8217c.this.f4330Vs.onExitButtonClick();
                }
            }
        });
        this.f4327Vp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C8217c.this.f4327Vp.setEnabled(false);
                if (C8217c.this.f4330Vs != null) {
                    C8217c.this.f4330Vs.onForceCaptureButtonClick();
                }
            }
        });
        this.f4328Vq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C8217c.this.f4330Vs != null) {
                    C8217c.this.f4330Vs.onGalleryButtonClick();
                }
            }
        });
        this.f4329Vr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (C8217c.this.f4330Vs != null) {
                    C8217c.this.f4330Vs.onTorchChange(z);
                }
            }
        });
    }

    /* renamed from: i */
    private void m4513i(Context context) {
        C8216as asVar = new C8216as(777);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(Color.parseColor("#000000"));
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        ToggleButton toggleButton = new ToggleButton(context);
        this.f4329Vr = toggleButton;
        toggleButton.setId(asVar.mo54661sp());
        this.f4329Vr.setBackgroundDrawable(m4514j(context));
        this.f4329Vr.setGravity(17);
        this.f4329Vr.setVisibility(8);
        this.f4329Vr.setTextOff("");
        this.f4329Vr.setTextOn("");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = 5;
        layoutParams.addRule(14, -1);
        this.f4329Vr.setLayoutParams(layoutParams);
        relativeLayout.addView(this.f4329Vr);
        ImageView imageView = new ImageView(context);
        this.f4327Vp = imageView;
        imageView.setId(asVar.mo54661sp());
        ImageView imageView2 = new ImageView(context);
        this.f4328Vq = imageView2;
        imageView2.setId(asVar.mo54661sp());
        this.f4328Vq.setImageBitmap(C0859c.m2231a(context, "gallery_icon"));
        this.f4328Vq.setVisibility(4);
        this.f4328Vq.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = 5;
        layoutParams2.addRule(14, -1);
        layoutParams2.addRule(3, this.f4329Vr.getId());
        this.f4328Vq.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f4328Vq);
        this.f4327Vp.setImageBitmap(C0859c.m2231a(context, "camera_icon"));
        this.f4327Vp.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13, -1);
        layoutParams3.addRule(14, -1);
        this.f4327Vp.setLayoutParams(layoutParams3);
        relativeLayout.addView(this.f4327Vp);
        ImageView imageView3 = new ImageView(context);
        this.f4326Vo = imageView3;
        imageView3.setId(asVar.mo54661sp());
        this.f4326Vo.setImageBitmap(C0859c.m2231a(context, "capture_close"));
        this.f4326Vo.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.bottomMargin = 5;
        layoutParams4.addRule(12, -1);
        layoutParams4.addRule(14, -1);
        this.f4326Vo.setLayoutParams(layoutParams4);
        relativeLayout.addView(this.f4326Vo);
        addView(relativeLayout, new RelativeLayout.LayoutParams(-2, -1));
    }

    /* renamed from: j */
    private StateListDrawable m4514j(Context context) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), C0859c.m2231a(context, "torchon"));
        bitmapDrawable.setGravity(17);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), C0859c.m2231a(context, "torchoff"));
        bitmapDrawable2.setGravity(17);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912, -16842910}, bitmapDrawable);
        stateListDrawable.addState(new int[]{-16842912, -16842910}, bitmapDrawable2);
        stateListDrawable.addState(new int[]{16842912, 16842910}, bitmapDrawable);
        return stateListDrawable;
    }

    public void setExitButtonEnabled(boolean z) {
        if (z) {
            this.f4326Vo.setVisibility(0);
        } else {
            this.f4326Vo.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo54662a(boolean z, int i) {
        if (z) {
            this.f4327Vp.postDelayed(new Runnable() {
                public void run() {
                    C8217c.this.f4327Vp.setVisibility(0);
                }
            }, (long) (i * 1000));
        } else {
            this.f4327Vp.setVisibility(4);
        }
    }

    public void setGalleryButtonEnabled(boolean z) {
        if (z) {
            this.f4328Vq.setVisibility(0);
        } else {
            this.f4328Vq.setVisibility(4);
        }
    }

    public void setTorchButtonEnabled(boolean z) {
        if (z) {
            this.f4329Vr.setVisibility(0);
        } else {
            this.f4329Vr.setVisibility(8);
        }
    }

    public void setTorchButtonChecked(boolean z) {
        this.f4329Vr.setChecked(z);
    }

    /* renamed from: rH */
    public boolean mo54664rH() {
        return this.f4329Vr.isChecked();
    }

    public void setListener(ICaptureMenuListener iCaptureMenuListener) {
        this.f4330Vs = iCaptureMenuListener;
    }
}
