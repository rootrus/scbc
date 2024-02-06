package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import okhttp3.internal.cache.DiskLruCache;
import p040o.FragmentBuilder_BindBilledTabFragment;
import p040o.FundDiscoverService;
import p040o.getDiscoverConfig;
import p040o.searchFund;

public class CustomFundsActions extends RelativeLayout {
    public FragmentBuilder_BindBilledTabFragment IconCompatParcelizer;
    @BindView
    DefaultButton purchaseButton;
    @BindView
    DefaultButton redeemButton;
    @BindView
    DefaultButton switchButton;

    public CustomFundsActions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81972131493423, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.purchaseButton.setOnClickListener(new searchFund(this));
        this.redeemButton.setOnClickListener(new FundDiscoverService(this));
        this.switchButton.setOnClickListener(new getDiscoverConfig(this));
    }

    public void setButtonEnabled(String str, String str2) {
        if ("BUTTON_PURCHASE".equals(str)) {
            this.purchaseButton.setButtonEnabled(DiskLruCache.VERSION_1.equals(str2));
        } else if ("BUTTON_REDEEM".equals(str)) {
            this.redeemButton.setButtonEnabled(DiskLruCache.VERSION_1.equals(str2));
        } else if ("BUTTON_SWITCH".equals(str)) {
            this.switchButton.setButtonEnabled(DiskLruCache.VERSION_1.equals(str2));
        }
    }

    public void setOnCustomFundsActionsClickListener(FragmentBuilder_BindBilledTabFragment fragmentBuilder_BindBilledTabFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindBilledTabFragment;
    }
}
