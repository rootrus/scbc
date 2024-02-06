package com.scb.phone.view.custom.investment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.standardStopAndWait;

public class CustomSuccessInformation extends LinearLayout {
    @BindView
    TextView tvAccountNumber;
    @BindView
    TextView tvAccountTypeDesc;
    @BindView
    TextView tvBonus;
    @BindView
    TextView tvBranchDesc;
    @BindView
    TextView tvTitle;

    public CustomSuccessInformation(Context context) {
        super(context);
    }

    public CustomSuccessInformation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84922131493719, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setData(String str, String str2, String str3, String str4, String str5) {
        this.tvTitle.setText(str);
        this.tvAccountNumber.setText(str2);
        this.tvBranchDesc.setText(str3);
        this.tvAccountTypeDesc.setText(str4);
        this.tvBonus.setText(str5);
    }

    public void setData(standardStopAndWait standardstopandwait) {
        this.tvTitle.setText(standardstopandwait.MediaBrowserCompat$CustomActionResultReceiver);
        this.tvAccountNumber.setText(standardstopandwait.write);
        this.tvBranchDesc.setText(standardstopandwait.read);
        this.tvAccountTypeDesc.setText(standardstopandwait.IconCompatParcelizer);
        this.tvBonus.setText(standardstopandwait.MediaBrowserCompat$ItemReceiver);
    }
}
