package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.scb.phone.R;
import p040o.setLastBaselineToBottomHeight;

public class CustomCheckBox extends AppCompatButton {
    public CustomCheckBox(Context context) {
        super(context);
    }

    public CustomCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSelectedState(boolean z) {
        setTextColor(setLastBaselineToBottomHeight.read(getContext(), z ? R.color.f67252131099881 : R.color.f66092131099764));
        setSelected(z);
    }

    public void setEnableState(boolean z, boolean z2) {
        if (!z) {
            setTextColor(setLastBaselineToBottomHeight.read(getContext(), z2 ? R.color.f66092131099764 : R.color.f66412131099797));
        }
        setEnabled(z2);
    }
}
