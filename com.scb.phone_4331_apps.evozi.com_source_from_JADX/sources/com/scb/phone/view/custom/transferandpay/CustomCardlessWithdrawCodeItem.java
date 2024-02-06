package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomCardlessWithdrawCodeItem extends RelativeLayout {
    @BindView
    TextView mCodeTextView;
    @BindView
    TextView mDateExpireTextView;
    @BindView
    TextView mWithdrawTextView;

    public CustomCardlessWithdrawCodeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81182131493344, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setText(String str) {
        this.mWithdrawTextView.setText(str);
    }

    public void setWithdrawCode(String str) {
        this.mCodeTextView.setText(str);
    }

    public void setDateExpire(String str) {
        this.mDateExpireTextView.setText(str);
    }
}
