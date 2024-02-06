package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomLimit extends LinearLayout {
    @BindView
    public ViewGroup mLimitProgress;
    @BindView
    public TextView remainingLimit;

    public CustomLimit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84082131493634, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setOrientation(0);
        setGravity(8388613);
    }

    public void setText(String str) {
        this.mLimitProgress.setVisibility(8);
        this.remainingLimit.setVisibility(0);
        this.remainingLimit.setText(str);
    }
}
