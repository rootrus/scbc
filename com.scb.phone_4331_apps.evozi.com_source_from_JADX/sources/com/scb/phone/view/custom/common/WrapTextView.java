package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p040o.preauthorization;

public class WrapTextView extends AppCompatTextView {
    public WrapTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WrapTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WrapTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTransformationMethod(new preauthorization());
    }
}
