package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomTransferAndPayStatus extends RelativeLayout {
    @BindView
    TextView mDateTextView;
    @BindView
    TextView mStatusTextView;

    public CustomTransferAndPayStatus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85082131493735, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setRequestDateText(String str) {
        this.mDateTextView.setText(str);
    }

    public void setStatusText(String str) {
        this.mStatusTextView.setText(str);
    }
}
