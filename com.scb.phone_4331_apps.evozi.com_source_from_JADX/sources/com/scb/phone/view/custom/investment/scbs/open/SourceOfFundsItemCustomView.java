package com.scb.phone.view.custom.investment.scbs.open;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class SourceOfFundsItemCustomView extends RelativeLayout {
    @BindView
    public TextView textView;

    public SourceOfFundsItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SourceOfFundsItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SourceOfFundsItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84782131493705, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
