package com.scb.phone.view.custom.common;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.math.BigDecimal;
import p040o.FindUsService;
import p040o.confirmFastPayBillPayment;
import p040o.confirmFastPayTransfer;
import p040o.getICheckDeserializerRtti;
import p040o.updateFastPayProfileWithOtp;
import p040o.verifyFastPayBillPayment;

public class CustomDeltaInput extends LinearLayout {
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public write MediaBrowserCompat$ItemReceiver;
    public TextWatcher MediaBrowserCompat$MediaItem;
    private read MediaBrowserCompat$SearchResultReceiver;
    private double MediaMetadataCompat;
    @BindView
    public RelativeLayout container;
    @BindView
    ImageButton decreaseButton;
    @BindView
    public TextView errorMessage;
    @BindView
    ImageButton increaseButton;
    @BindView
    public AmountEditText inputValue;
    @BindView
    public TextView limitMessage;
    protected CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver read;
    public IconCompatParcelizer write;

    public interface read {
        void write(double d, boolean z);
    }

    public interface IconCompatParcelizer {
        void aB_();
    }

    public interface write {
        void aC_();
    }

    public CustomDeltaInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f81632131493389, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.decreaseButton.setEnabled(false);
        this.MediaBrowserCompat$MediaItem = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CustomDeltaInput.this.inputValue.removeTextChangedListener(this);
                int selectionStart = CustomDeltaInput.this.inputValue.getSelectionStart();
                int length = CustomDeltaInput.this.inputValue.getText().length();
                if (!TextUtils.isEmpty(editable.toString())) {
                    CustomDeltaInput.this.setActualValue(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(editable.toString()).doubleValue());
                } else {
                    double unused = CustomDeltaInput.this.IconCompatParcelizer = 0.0d;
                }
                CustomDeltaInput.this.inputValue.addTextChangedListener(this);
                if (CustomDeltaInput.this.inputValue.getText().length() - length == 1) {
                    selectionStart++;
                }
                if (selectionStart >= CustomDeltaInput.this.inputValue.getText().length()) {
                    selectionStart = CustomDeltaInput.this.inputValue.getText().length();
                }
                CustomDeltaInput.this.inputValue.setSelection(selectionStart);
            }
        };
        this.inputValue.setImeOptions(6);
        this.inputValue.addTextChangedListener(this.MediaBrowserCompat$MediaItem);
        this.inputValue.setCustomHint(getResources().getString(R.string.transfer_to_account_amount_hint));
        this.inputValue.setHandleDismissKeyboard(new confirmFastPayBillPayment(this));
        this.inputValue.setOnEditorActionListener(new verifyFastPayBillPayment(this));
    }

    public CustomDeltaInput(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$ItemReceiver(double d) {
        this.increaseButton.setOnClickListener(new updateFastPayProfileWithOtp(this, d));
        this.decreaseButton.setOnClickListener(new confirmFastPayTransfer(this, d));
    }

    private void write() {
        if (this.IconCompatParcelizer <= this.MediaBrowserCompat$CustomActionResultReceiver && this.decreaseButton.isEnabled()) {
            this.decreaseButton.setEnabled(false);
        }
        if (this.IconCompatParcelizer >= this.MediaMetadataCompat && this.increaseButton.isEnabled()) {
            this.increaseButton.setEnabled(false);
        }
        if (this.IconCompatParcelizer > this.MediaBrowserCompat$CustomActionResultReceiver && !this.decreaseButton.isEnabled()) {
            this.decreaseButton.setEnabled(true);
        }
        if (this.IconCompatParcelizer < this.MediaMetadataCompat && !this.increaseButton.isEnabled()) {
            this.increaseButton.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(double d) {
        double d2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        setActualValue(Math.min(Math.max(d, d2), this.MediaMetadataCompat));
    }

    public void setActualValue(double d) {
        this.IconCompatParcelizer = d;
        this.inputValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d));
        write();
        read read2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (read2 != null) {
            read2.write(d, MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    public void setActualValueOnly(double d) {
        this.IconCompatParcelizer = d;
    }

    public void setActualValueUI(double d) {
        this.inputValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d));
        write();
        read read2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (read2 != null) {
            read2.write(d, MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    public void setDelta(double d) {
        MediaBrowserCompat$ItemReceiver(d);
    }

    public void setMinValue(double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }

    public final double read() {
        return this.MediaMetadataCompat;
    }

    public void setMaxValue(double d) {
        this.MediaMetadataCompat = d;
    }

    public void setErrorMessage(String str) {
        this.errorMessage.setText(str);
    }

    public final void IconCompatParcelizer() {
        if (getContext() != null) {
            this.limitMessage.setVisibility(0);
            this.limitMessage.setText(String.format(getContext().getString(R.string.personal_limit_max_label), new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat)}));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.inputValue.setCustomHint(String.format("%s - %s", new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat)}));
    }

    public void setOnValueChangedListener(read read2) {
        this.MediaBrowserCompat$SearchResultReceiver = read2;
    }

    public void setOnIncrementChangeListener(CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setOnDismissKeyboardListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public void setOnKeyboardDoneListener(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public void setOnFocusLostListener(View.OnFocusChangeListener onFocusChangeListener) {
        setOnFocusLostListener(onFocusChangeListener, true);
    }

    public void setOnFocusLostListener(View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        this.inputValue.setOnFocusChangeListener(new FindUsService(this, z, onFocusChangeListener));
    }

    public void setOnClickInputAmountListener(View.OnClickListener onClickListener) {
        this.inputValue.setOnClickListener(onClickListener);
    }

    public void setHint(int i) {
        this.inputValue.setHint(i);
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = BigDecimal.valueOf(this.IconCompatParcelizer).compareTo(BigDecimal.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver)) >= 0 && BigDecimal.valueOf(this.IconCompatParcelizer).compareTo(BigDecimal.valueOf(this.MediaMetadataCompat)) <= 0;
        if (!z) {
            this.errorMessage.setVisibility(0);
        } else {
            this.errorMessage.setVisibility(8);
        }
        return z;
    }

    public final /* synthetic */ void IconCompatParcelizer(double d) {
        double doubleValue = BigDecimal.valueOf(this.IconCompatParcelizer).add(BigDecimal.valueOf(d)).doubleValue();
        double d2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        setActualValue(Math.min(Math.max(doubleValue, d2), this.MediaMetadataCompat));
        CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        if (customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver != null) {
            customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
        }
        this.inputValue.requestFocus();
    }

    public final /* synthetic */ void read(double d) {
        double doubleValue = BigDecimal.valueOf(this.IconCompatParcelizer).subtract(BigDecimal.valueOf(d)).doubleValue();
        double d2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        setActualValue(Math.min(Math.max(doubleValue, d2), this.MediaMetadataCompat));
        CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        if (customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver != null) {
            customDeltaInput$MediaBrowserCompat$CustomActionResultReceiver.mo13975x50fd9e4a();
        }
        this.inputValue.requestFocus();
    }
}
