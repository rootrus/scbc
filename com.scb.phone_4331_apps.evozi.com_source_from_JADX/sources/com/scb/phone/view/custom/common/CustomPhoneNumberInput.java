package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;

public class CustomPhoneNumberInput extends CommonInputViewGroup {
    public CustomPhoneNumberInput(Context context) {
        super(context);
    }

    public CustomPhoneNumberInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomPhoneNumberInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static InputFilter[] read(int i) {
        return new InputFilter[]{new InputFilter.LengthFilter(i)};
    }
}
