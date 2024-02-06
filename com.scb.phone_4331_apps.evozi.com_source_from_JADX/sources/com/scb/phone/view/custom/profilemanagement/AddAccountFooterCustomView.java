package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver;
import p040o.setBinaries;
import p040o.verificationBankAccount;

public class AddAccountFooterCustomView extends AddAccountCustomView {
    public confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button buttonContinue;

    public void setListener(confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver;
    }

    public AddAccountFooterCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddAccountFooterCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddAccountFooterCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80942131493320, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.buttonContinue.setOnClickListener((View.OnClickListener) null);
        setButtonEnabled(true);
        this.buttonContinue.setOnClickListener(new verificationBankAccount(this));
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        this.buttonContinue.setEnabled(((setBinaries) builder).IconCompatParcelizer);
    }

    public void setButtonEnabled(boolean z) {
        this.buttonContinue.setEnabled(z);
    }
}
