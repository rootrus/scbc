package com.scb.phone.view.custom.common;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class FullScreenProgressDialog extends Dialog {
    @BindView
    CustomViewProgressAnimationFull animationView;
    @BindView
    public TextView description;
    @BindView
    public TextView title;

    public FullScreenProgressDialog(Context context) {
        super(context, R.style.f95702131820785);
        requestWindowFeature(1);
        setContentView(R.layout.f84442131493670);
        ButterKnife.write((Dialog) this);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        CustomViewProgressAnimationFull customViewProgressAnimationFull = this.animationView;
        if (customViewProgressAnimationFull != null) {
            customViewProgressAnimationFull.IconCompatParcelizer.cancel();
        }
    }
}
