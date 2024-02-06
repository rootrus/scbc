package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScbEditText;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getActivateChequeVerification;
import p040o.getICheckDeserializerRtti;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNavigationContentDescription;
import p040o.verifyPin;

public class CustomPhone extends RelativeLayout {
    private InputFilter[] IconCompatParcelizer;
    public InputFilter[] MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private getActivateChequeVerification MediaMetadataCompat;
    private String RatingCompat;
    @BindView
    protected TextView errorValidation;
    @BindView
    TextView proxyLabel;
    @BindView
    public ScbEditText proxyNumberField;
    public TextWatcher read;
    public boolean write;

    public CustomPhone(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomPhone(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomPhone(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84302131493656, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.PhoneNumber);
            if (obtainStyledAttributes.getString(0) != null) {
                this.proxyNumberField.setHint(obtainStyledAttributes.getString(0));
            }
            if (obtainStyledAttributes.getString(3) != null) {
                this.proxyLabel.setText(obtainStyledAttributes.getString(3));
            }
            if (obtainStyledAttributes.getString(1) != null) {
                String string = obtainStyledAttributes.getString(1);
                this.MediaBrowserCompat$MediaItem = string;
                this.errorValidation.setText(string);
            }
            obtainStyledAttributes.recycle();
        }
        setNavigationContentDescription.read(this.errorValidation, (int) R.style.f97832131821003);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setNecessaryInfo(String str, String str2, getActivateChequeVerification getactivatechequeverification) {
        this.MediaMetadataCompat = getactivatechequeverification;
        this.read = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CustomPhone.this.MediaBrowserCompat$ItemReceiver(editable.toString());
            }
        };
        if (TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem)) {
            this.MediaBrowserCompat$MediaItem = this.errorValidation.getText().toString();
        }
        this.RatingCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = new InputFilter[]{new InputFilter.LengthFilter(10)};
        this.IconCompatParcelizer = new InputFilter[]{new InputFilter.LengthFilter(12)};
        if (!TextUtils.isEmpty(str)) {
            MediaBrowserCompat$ItemReceiver(str);
            IconCompatParcelizer();
        }
        this.proxyNumberField.setOnFocusChangeListener(new verifyPin(this));
        this.proxyNumberField.setOnPasteListener(new ScbEditText.IconCompatParcelizer());
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver(String str) {
        String replace = str.replace("-", "");
        this.MediaBrowserCompat$ItemReceiver = replace;
        getActivateChequeVerification getactivatechequeverification = this.MediaMetadataCompat;
        if (getactivatechequeverification == null || !getactivatechequeverification.IconCompatParcelizer(replace)) {
            this.write = false;
        } else {
            this.write = true;
        }
    }

    public final void IconCompatParcelizer() {
        getActivateChequeVerification getactivatechequeverification = this.MediaMetadataCompat;
        String str = "";
        if (getactivatechequeverification != null) {
            if (getactivatechequeverification.IconCompatParcelizer(TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver) ? str : this.MediaBrowserCompat$ItemReceiver)) {
                if (!TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver)) {
                    str = this.MediaBrowserCompat$ItemReceiver;
                }
                this.MediaBrowserCompat$SearchResultReceiver = getICheckDeserializerRtti.IconCompatParcelizer(false, true, str);
                this.proxyNumberField.setFilters(this.IconCompatParcelizer);
                this.proxyNumberField.setText(this.MediaBrowserCompat$SearchResultReceiver);
                read(false);
                return;
            }
        }
        if (TextUtils.isEmpty(TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver) ? str : this.MediaBrowserCompat$ItemReceiver)) {
            this.errorValidation.setText(this.MediaBrowserCompat$MediaItem);
        } else {
            this.errorValidation.setText(this.RatingCompat);
        }
        ScbEditText scbEditText = this.proxyNumberField;
        if (!TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver)) {
            str = this.MediaBrowserCompat$ItemReceiver;
        }
        scbEditText.setText(str);
        read(true);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.proxyNumberField.setText("");
        read(false);
    }

    public final void read(boolean z) {
        if (z) {
            this.errorValidation.setVisibility(0);
            this.proxyNumberField.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
            return;
        }
        this.errorValidation.setVisibility(8);
        this.proxyNumberField.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }
}
