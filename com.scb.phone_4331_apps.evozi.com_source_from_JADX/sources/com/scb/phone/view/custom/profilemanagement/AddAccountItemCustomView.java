package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.confirmRegistrationDirectDebit;
import p040o.getSignal;
import p040o.getStandAloneAddress;
import p040o.saveMerchantNickname;

public class AddAccountItemCustomView extends AddAccountCustomView {
    @BindView
    TextView accountText;
    @BindView
    TextView accountType;
    @BindView
    TextView branchText;
    public confirmRegistrationDirectDebit.read read;
    @BindView
    public CheckBox selectorCheckBox;
    @BindView
    View separator;

    public void setListener(confirmRegistrationDirectDebit.read read2) {
        this.read = read2;
    }

    public AddAccountItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddAccountItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddAccountItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80962131493322, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        getSignal getsignal = (getSignal) builder;
        this.accountText.setText(getsignal.MediaBrowserCompat$SearchResultReceiver);
        int i = 8;
        if (!TextUtils.isEmpty(getsignal.read)) {
            this.accountType.setVisibility(0);
            this.accountType.setText(getsignal.read);
        } else {
            this.accountType.setVisibility(8);
        }
        if (!TextUtils.isEmpty(getsignal.write)) {
            this.branchText.setVisibility(0);
            this.branchText.setText(getsignal.write);
        } else {
            this.branchText.setVisibility(8);
        }
        this.selectorCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        setOnClickListener((View.OnClickListener) null);
        this.selectorCheckBox.setChecked(getsignal.MediaMetadataCompat);
        this.selectorCheckBox.setOnCheckedChangeListener(new saveMerchantNickname(this, getsignal));
        setOnClickListener(new getStandAloneAddress(this, getsignal));
        View view = this.separator;
        if (!getsignal.MediaDescriptionCompat()) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
