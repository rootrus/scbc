package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomAmountRow extends ConstraintLayout {
    @BindView
    TextView amount;
    @BindView
    TextView title;

    public CustomAmountRow(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public CustomAmountRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomAmountRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f81082131493334, this, true);
        ButterKnife.IconCompatParcelizer(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomAmountRow);
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        this.title.setText(string);
    }

    public void setAmount(String str) {
        this.amount.setText(str);
    }
}
