package com.scb.phone.view.custom.ccrredemption.ecoupon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.onGetStartedClick;

public final class CustomECouponFooterButtonViewComponent extends ConstraintLayout {
    @BindView
    public Button btNext;

    public CustomECouponFooterButtonViewComponent(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomECouponFooterButtonViewComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomECouponFooterButtonViewComponent(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomECouponFooterButtonViewComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(context).inflate(R.layout.f81732131493399, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setBtNext(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.btNext = button;
    }

    public final void setName(String str) {
        onGetStartedClick.write((Object) str, "name");
        Button button = this.btNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNext");
        }
        button.setText(str);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        Button button = this.btNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNext");
        }
        button.setOnClickListener(new C5803xb2ecf7fe(onClickListener));
    }
}
