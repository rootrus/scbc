package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindDirectDebitInputSelectedFragment;
import p040o.getEligibilityDetails;
import p040o.setLastBaselineToBottomHeight;

public class CustomATMInput extends RelativeLayout {
    /* access modifiers changed from: private */
    public write IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ScbEditText atmPin;
    @BindView
    protected ImageButton clearButton;
    @BindView
    protected TextView mErrorValidation;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(String str);

        void MediaBrowserCompat$ItemReceiver(boolean z);
    }

    public CustomATMInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81102131493336, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.atmPin.setLongClickable(false);
        this.atmPin.setTextIsSelectable(false);
        this.atmPin.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        this.atmPin.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                String unused = CustomATMInput.this.MediaBrowserCompat$CustomActionResultReceiver = editable.toString();
                int length = CustomATMInput.this.MediaBrowserCompat$CustomActionResultReceiver.length();
                CustomATMInput.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(CustomATMInput.this.IconCompatParcelizer());
                CustomATMInput.this.clearButton.setVisibility(length > 0 ? 0 : 8);
                CustomATMInput.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(CustomATMInput.this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
        this.atmPin.setOnFocusChangeListener(new getEligibilityDetails(this));
    }

    public void setStyle(int i, int i2) {
        if (getContext() != null) {
            this.atmPin.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
            this.atmPin.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i2));
        }
    }

    public void setCardInputListener(write write2) {
        this.IconCompatParcelizer = write2;
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.atmPin.setOnEditorActionListener(onEditorActionListener);
    }

    public void setHint(String str) {
        this.atmPin.setHint(str);
    }

    public final /* synthetic */ void write(boolean z) {
        int i = 8;
        if (z) {
            ImageButton imageButton = this.clearButton;
            if (!TextUtils.isEmpty(this.atmPin.getText())) {
                i = 0;
            }
            imageButton.setVisibility(i);
            return;
        }
        this.clearButton.setVisibility(8);
    }

    public final boolean IconCompatParcelizer() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            return length == 4 || length == 6;
        }
        return false;
    }

    public void setErrorValidationVisibility(int i) {
        this.mErrorValidation.setVisibility(i);
    }

    public void setErrorInLine(int i) {
        this.mErrorValidation.setText(i);
    }

    public void setATMNumber(String str) {
        this.atmPin.setText(str);
    }

    @OnClick
    public void onClearButtonClick() {
        this.atmPin.setText("");
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false);
    }
}
