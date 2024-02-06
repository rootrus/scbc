package com.scb.phone.view.custom.investment.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getChequeStatusIssueSummary;

public class CustomFundAddressDetail extends LinearLayout {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    public CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public CheckBox checkbox1;
    @BindView
    public CheckBox checkbox2;
    @BindView
    TextView labelCheckboxTitle1;
    @BindView
    TextView labelCheckboxTitle2;
    @BindView
    LinearLayout layoutCheckbox1;
    @BindView
    LinearLayout layoutCheckbox2;
    private String read;
    @BindView
    CustomTextViewNavigation viewCustomAddress;
    private String write;

    public void setOnCustomFundAddressDetailCompletion(CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver customFundAddressDetail$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = customFundAddressDetail$MediaBrowserCompat$ItemReceiver;
    }

    public CustomFundAddressDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomFundAddressDetail, 0, 0);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getString(4);
        this.IconCompatParcelizer = obtainStyledAttributes.getString(2);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(0);
        this.write = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84232131493649, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.layoutCheckbox2.setVisibility(8);
        this.viewCustomAddress.setOnClickDetailNavigationCompletion(new getChequeStatusIssueSummary(this));
        this.viewCustomAddress.setLabelTitle(this.MediaBrowserCompat$SearchResultReceiver);
        this.viewCustomAddress.setPlaceholderText(this.IconCompatParcelizer);
        this.labelCheckboxTitle1.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.labelCheckboxTitle2.setText(this.write);
    }

    public CustomFundAddressDetail(Context context) {
        super(context);
    }

    @OnClick
    public void onCheckbox1Click() {
        CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver customFundAddressDetail$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (customFundAddressDetail$MediaBrowserCompat$ItemReceiver != null) {
            customFundAddressDetail$MediaBrowserCompat$ItemReceiver.write(1, this.checkbox1.isChecked());
        }
    }

    @OnClick
    public void onCheckbox2Click() {
        CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver customFundAddressDetail$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (customFundAddressDetail$MediaBrowserCompat$ItemReceiver != null) {
            customFundAddressDetail$MediaBrowserCompat$ItemReceiver.write(2, this.checkbox2.isChecked());
        }
    }

    public void setCheckbox2Visibility(int i) {
        this.layoutCheckbox2.setVisibility(i);
    }

    public void setAddressDetailTitle(String str) {
        this.viewCustomAddress.setLabelTitle(str);
    }

    public void setPlaceholderDetailText(String str) {
        this.viewCustomAddress.setPlaceholderText(str);
    }

    public void setDescriptionText(String str) {
        this.read = str;
        this.viewCustomAddress.setDescriptionText(str);
    }

    public void setCheckbox1Checked(boolean z, boolean z2) {
        if (z2) {
            this.checkbox1.setChecked(z);
        }
        this.checkbox2.setEnabled(!this.checkbox1.isChecked());
        MediaBrowserCompat$ItemReceiver();
    }

    public void setCheckbox2Checked(boolean z, boolean z2) {
        if (z2) {
            this.checkbox2.setChecked(z);
        }
        this.checkbox1.setEnabled(!this.checkbox2.isChecked());
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.checkbox1.isChecked() || this.checkbox2.isChecked()) {
            this.viewCustomAddress.setDescriptionText("");
            this.viewCustomAddress.setPlaceholderText("");
            this.viewCustomAddress.setEnableNavigationArea(false);
            return;
        }
        this.viewCustomAddress.setDescriptionText(this.read);
        this.viewCustomAddress.setPlaceholderText(this.IconCompatParcelizer);
        this.viewCustomAddress.setEnableNavigationArea(true);
    }
}
