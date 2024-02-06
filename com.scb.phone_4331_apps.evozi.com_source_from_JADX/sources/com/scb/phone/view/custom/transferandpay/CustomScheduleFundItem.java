package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomScheduleFundItem extends LinearLayout {
    @BindView
    TextView effectiveDescription;
    @BindView
    TextView effectiveLabel;
    @BindView
    LinearLayout effectiveLayout;
    @BindView
    TextView effectiveText;
    @BindView
    TextView transactionLabel;
    @BindView
    TextView transactionText;
    @BindView
    public LinearLayout transferLayout;

    public CustomScheduleFundItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84672131493694, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setEffectiveDateLabel(String str) {
        this.effectiveLabel.setText(str);
    }

    public void setEffectiveDate(String str, boolean z) {
        this.effectiveText.setText(str);
        if (z) {
            this.effectiveText.setTextAppearance(getContext(), R.style.f97712131820990);
        }
    }

    public void setTransactionDateLabel(String str) {
        this.transactionLabel.setText(str);
    }

    public void setTransactionDate(String str) {
        this.transactionText.setText(str);
    }

    public void setEffectiveDescription(String str) {
        this.effectiveDescription.setVisibility(0);
        this.effectiveDescription.setText(str);
    }
}
