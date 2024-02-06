package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.MobileNumberService;
import p040o.getDevices;

public class AddedAccountManagementSuccessFooterCustomView extends RelativeLayout {
    public getDevices.read MediaBrowserCompat$ItemReceiver;
    @BindView
    Button doneButton;

    public void setListener(getDevices.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public void setButtonLabel(int i) {
        this.doneButton.setText(i);
    }

    public AddedAccountManagementSuccessFooterCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddedAccountManagementSuccessFooterCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddedAccountManagementSuccessFooterCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80852131493311, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.doneButton.setOnClickListener(new MobileNumberService(this));
    }
}
