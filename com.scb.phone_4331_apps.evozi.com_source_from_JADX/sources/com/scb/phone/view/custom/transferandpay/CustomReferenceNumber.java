package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;

public class CustomReferenceNumber extends LinearLayout {
    @BindView
    TextView mReferenceNumberTextView;

    public CustomReferenceNumber(Context context) {
        super(context);
    }
}
