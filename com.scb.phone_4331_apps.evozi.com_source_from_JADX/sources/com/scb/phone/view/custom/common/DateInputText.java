package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;

public class DateInputText extends ClearableEditText {
    private TextWatcher MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindCreditLimitDisplayFragment() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder(charSequence.toString().replaceAll("\\D+", ""));
            int i4 = i + i3;
            if (sb.length() > 2) {
                sb.insert(2, "/");
                if (i == 2 && i3 > 0) {
                    i4 += i3;
                }
                if (sb.length() > 5) {
                    sb.insert(5, "/");
                    if (i == 5 && i3 > 0) {
                        i4 += i3;
                    }
                }
            }
            DateInputText.this.inputEditText.removeTextChangedListener(this);
            DateInputText.this.setText(sb.toString());
            DateInputText.this.inputEditText.addTextChangedListener(this);
            DateInputText.this.setSelection(Math.min(i4, sb.length()));
            if (DateInputText.this.read != null) {
                DateInputText.this.read.read(DateInputText.this.inputEditText.getText().toString());
            }
        }
    };
    /* access modifiers changed from: private */
    public read read;

    public interface read {
        void read(String str);
    }

    public DateInputText(Context context) {
        super(context);
        setInputType(4);
        setMaxLength(10);
        setDigitsFilter("0123456789/");
        this.inputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public DateInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setInputType(4);
        setMaxLength(10);
        setDigitsFilter("0123456789/");
        this.inputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public DateInputText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setInputType(4);
        setMaxLength(10);
        setDigitsFilter("0123456789/");
        this.inputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setDateUpdatedListener(read read2) {
        this.read = read2;
    }

    public void setOnEditTextClickListener(View.OnClickListener onClickListener) {
        this.inputEditText.setOnClickListener(onClickListener);
    }
}
