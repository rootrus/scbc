package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.confirmPurchase;
import p040o.confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver;

public class ReviewAccountFooterCustomView extends RelativeLayout {
    public confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    @BindView
    Button buttonConfirm;

    public void setListener(confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver;
    }

    public ReviewAccountFooterCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReviewAccountFooterCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 1);
    }

    public ReviewAccountFooterCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84632131493690, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.buttonConfirm.setOnClickListener(new confirmPurchase(this));
    }
}
