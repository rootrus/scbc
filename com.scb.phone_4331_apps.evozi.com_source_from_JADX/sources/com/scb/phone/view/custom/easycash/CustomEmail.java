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
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.LogoutService;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.changePin;
import p040o.getActivateChequeConfirm;
import p040o.getActivateChequeVerification;
import p040o.getMigrationFLag;
import p040o.getPreloadAndResumeCheck;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNavigationContentDescription;

public class CustomEmail extends RelativeLayout {
    /* access modifiers changed from: private */
    public getActivateChequeVerification IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    @BindView
    public CustomEditText emailEditText;
    @BindView
    TextView errorText;
    @BindView
    TextView titleText;
    private String write;

    public CustomEmail(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomEmail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomEmail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = 100;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81782131493404, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.EmailText);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInteger(2, this.MediaBrowserCompat$ItemReceiver);
            if (obtainStyledAttributes.getString(3) != null) {
                this.titleText.setText(obtainStyledAttributes.getString(3));
            }
            if (obtainStyledAttributes.getString(0) != null) {
                this.emailEditText.setHint(obtainStyledAttributes.getString(0));
            }
            if (obtainStyledAttributes.getString(1) != null) {
                String string = obtainStyledAttributes.getString(1);
                this.MediaBrowserCompat$CustomActionResultReceiver = string;
                this.errorText.setText(string);
            }
            obtainStyledAttributes.recycle();
        }
        this.emailEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.MediaBrowserCompat$ItemReceiver), changePin.MediaBrowserCompat$ItemReceiver});
        setNavigationContentDescription.read(this.errorText, (int) R.style.f97832131821003);
    }

    public void setNecessaryInfo(String str, String str2, getActivateChequeVerification getactivatechequeverification) {
        this.IconCompatParcelizer = getactivatechequeverification;
        if (TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = this.errorText.getText().toString();
        }
        this.write = str2;
        if (!TextUtils.isEmpty(str)) {
            this.emailEditText.setText(str);
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.emailEditText.setOnBackListener(new getPreloadAndResumeCheck(this));
        this.emailEditText.setOnEditorActionListener(new LogoutService(this));
        this.emailEditText.setOnFocusChangeListener(new getActivateChequeConfirm(this));
        this.emailEditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CustomEmail.this.MediaBrowserCompat$ItemReceiver(false);
                CustomEmail.this.IconCompatParcelizer.IconCompatParcelizer(editable.toString());
            }
        });
        this.emailEditText.setOnPasteListener(new getMigrationFLag(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String obj = this.emailEditText.getText().toString();
        if (!TextUtils.isEmpty(obj) && this.IconCompatParcelizer.IconCompatParcelizer(obj)) {
            MediaBrowserCompat$ItemReceiver(false);
            return;
        }
        if (TextUtils.isEmpty(this.emailEditText.getText().toString())) {
            this.errorText.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            this.errorText.setText(this.write);
        }
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.errorText.setVisibility(0);
            this.emailEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
            return;
        }
        this.errorText.setVisibility(8);
        this.emailEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }
}
