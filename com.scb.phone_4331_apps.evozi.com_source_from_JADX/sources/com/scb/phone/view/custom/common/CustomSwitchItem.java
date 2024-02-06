package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class CustomSwitchItem extends LinearLayout {
    @BindView
    TextView firstLabelTextView;
    @BindView
    TextView firstValueTextView;
    @BindView
    ImageView imageView;
    @BindView
    TextView secondLabelTextView;
    @BindView
    TextView secondValueTextView;

    public CustomSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84932131493720, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setFirstText(String str) {
        this.firstLabelTextView.setText(str);
    }

    public void setFirstValue(String str) {
        this.firstValueTextView.setText(str);
    }

    public void setSecondText(String str) {
        this.secondLabelTextView.setText(str);
    }

    public void setSecondValue(String str) {
        this.secondValueTextView.setText(str);
    }
}
