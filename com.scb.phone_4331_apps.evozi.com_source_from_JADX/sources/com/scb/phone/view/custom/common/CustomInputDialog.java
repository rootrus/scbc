package com.scb.phone.view.custom.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.getFundAccounts;

public class CustomInputDialog extends Dialog {
    public Context MediaBrowserCompat$ItemReceiver;
    @BindView
    public EditText mEditTextView;
    @BindView
    public TextView mErrorTextView;
    @BindView
    Button mNegativeButton;
    @BindView
    public Button mPositiveButton;
    @BindView
    public TextView mTextTextView;
    @BindView
    public TextView mTitleTextView;

    private CustomInputDialog(Context context) {
        super(context, R.style.f95602131820775);
        this.MediaBrowserCompat$ItemReceiver = context;
        requestWindowFeature(1);
        setContentView(R.layout.f82152131493441);
        ButterKnife.write((Dialog) this);
        this.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CustomInputDialog.MediaBrowserCompat$CustomActionResultReceiver(CustomInputDialog.this.mEditTextView.getText());
            }
        });
    }

    public static CustomInputDialog MediaBrowserCompat$ItemReceiver(Context context) {
        return new CustomInputDialog(context);
    }

    public final CustomInputDialog write(String str, DialogInterface.OnClickListener onClickListener) {
        if (!(str == null || onClickListener == null)) {
            this.mNegativeButton.setVisibility(0);
            this.mNegativeButton.setText(str);
            this.mNegativeButton.setOnClickListener(new getFundAccounts(this, onClickListener));
        }
        return this;
    }

    public final CustomInputDialog read(String str) {
        this.mEditTextView.setText(String.valueOf(str));
        this.mEditTextView.setVisibility(0);
        EditText editText = this.mEditTextView;
        editText.setSelection(editText.getText().length());
        return this;
    }

    public final CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver() {
        this.mEditTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.mEditTextView.setInputType(1);
        this.mEditTextView.setLines(1);
        this.mEditTextView.setMaxLines(1);
        return this;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Spannable spannable) {
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan removeSpan : uRLSpanArr) {
                spannable.removeSpan(removeSpan);
            }
        }
    }
}
