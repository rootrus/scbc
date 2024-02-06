package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBulkTransferGroupsFragment;
import p040o.FundOnboardingService;
import p040o.setLastBaselineToBottomHeight;

public class CustomFundSelect extends RelativeLayout {
    public FragmentBuilder_BindBulkTransferGroupsFragment MediaBrowserCompat$ItemReceiver;
    @BindView
    RelativeLayout container;
    @BindView
    public TextView description;
    @BindView
    TextView fundAvailableAmount;
    @BindView
    TextView fundAvailableUnits;
    @BindView
    TextView fundCode;
    @BindView
    public LinearLayout fundInfo;
    @BindView
    TextView fundTitle;
    @BindView
    ImageView icon;
    private Context read;
    @BindView
    public View topDivider;

    public CustomFundSelect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f82962131493522, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.container.setOnClickListener(new FundOnboardingService(this));
    }

    public void setFundTitle(int i) {
        this.fundTitle.setText(i);
    }

    public void setFundCode(String str) {
        this.fundCode.setText(str);
    }

    public void setFundIconEmpty() {
        this.icon.setImageDrawable(setLastBaselineToBottomHeight.write(this.read, R.drawable.ic_dark_chevron_up));
    }

    public void setFundIconEdit() {
        this.icon.setImageDrawable(setLastBaselineToBottomHeight.write(this.read, R.drawable.ic_accent_edit));
    }

    public void setDescription(String str) {
        this.description.setText(str);
    }

    public void setInfo(String str, String str2) {
        if (this.fundInfo.getVisibility() != 0) {
            this.fundInfo.setVisibility(0);
        }
        this.fundAvailableAmount.setText(str);
        this.fundAvailableUnits.setText(str2);
    }

    public void setOnFundSelectClickListener(FragmentBuilder_BindBulkTransferGroupsFragment fragmentBuilder_BindBulkTransferGroupsFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBulkTransferGroupsFragment;
    }

    public void setEnableFund(boolean z) {
        setEnabled(z);
        this.fundCode.setTextColor(getResources().getColor(z ? R.color.f66092131099764 : R.color.f66402131099796));
        this.fundCode.setEnabled(z);
        this.icon.setAlpha(z ? 1.0f : 0.5f);
    }
}
