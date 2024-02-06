package com.scb.phone.view.custom.bulktransfer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomEffectiveDate extends LinearLayout {
    @BindView
    TextView effectiveDate;

    public CustomEffectiveDate(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.f91282131494355, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setOrientation(1);
    }

    public CustomEffectiveDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.f91282131494355, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setOrientation(1);
    }

    public void setEffectiveDate(String str) {
        this.effectiveDate.setText(str);
    }
}
