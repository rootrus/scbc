package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CounterEditText extends RelativeLayout {
    private final TextWatcher MediaBrowserCompat$ItemReceiver;
    @BindView
    public EditText editText;
    @BindView
    public TextView errorText;
    /* access modifiers changed from: private */
    public DefaultButton read;
    @BindView
    TextView textCounter;
    @BindView
    TextView titleText;
    /* access modifiers changed from: private */
    public int write;

    public void setDefaultButton(DefaultButton defaultButton) {
        this.read = defaultButton;
    }

    public CounterEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public CounterEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CounterEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = 20;
        this.MediaBrowserCompat$ItemReceiver = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CounterEditText.this.textCounter.setText(CounterEditText.this.getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(editable.length()), Integer.valueOf(CounterEditText.this.write)}));
                CounterEditText counterEditText = CounterEditText.this;
                counterEditText.errorText.setVisibility(4);
                counterEditText.editText.setBackground(setLastBaselineToBottomHeight.write(counterEditText.getContext(), R.drawable.shape_gray_rounded_rectangle));
                if (CounterEditText.this.read == null) {
                    return;
                }
                if (editable.length() <= 0 || editable.length() > CounterEditText.this.write) {
                    CounterEditText.this.read.setButtonEnabled(false);
                } else {
                    CounterEditText.this.read.setButtonEnabled(true);
                }
            }
        };
        LayoutInflater.from(getContext()).inflate(R.layout.f80552131493280, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCounterEditText, 0, 0);
            try {
                this.write = obtainStyledAttributes.getInteger(0, 20);
                this.titleText.setText(obtainStyledAttributes.getString(2));
                this.editText.setHint(obtainStyledAttributes.getString(1));
                if (this.write > 0) {
                    this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.write)});
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.textCounter.setText(getContext().getString(R.string.text_counter, new Object[]{0, Integer.valueOf(this.write)}));
        this.editText.removeTextChangedListener(this.MediaBrowserCompat$ItemReceiver);
        this.editText.addTextChangedListener(this.MediaBrowserCompat$ItemReceiver);
    }

    public void setText(String str) {
        this.editText.setText(str);
    }

    @OnClick
    public void onClickClear() {
        this.editText.setText("");
    }
}
