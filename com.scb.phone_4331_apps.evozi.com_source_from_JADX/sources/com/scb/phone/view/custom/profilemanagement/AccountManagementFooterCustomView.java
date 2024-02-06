package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.acceptMerchantTermsAndConditions;
import p040o.setBinaries;
import p040o.updateDevice$MediaBrowserCompat$CustomActionResultReceiver;

public class AccountManagementFooterCustomView extends AccountManagementItem {
    @BindView
    Button doneButton;
    public updateDevice$MediaBrowserCompat$CustomActionResultReceiver write;

    public void setListener(updateDevice$MediaBrowserCompat$CustomActionResultReceiver updatedevice_mediabrowsercompat_customactionresultreceiver) {
        this.write = updatedevice_mediabrowsercompat_customactionresultreceiver;
    }

    public AccountManagementFooterCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AccountManagementFooterCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountManagementFooterCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80842131493310, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.doneButton.setOnClickListener(new acceptMerchantTermsAndConditions(this));
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder, boolean z) {
        this.doneButton.setEnabled(((setBinaries) builder).IconCompatParcelizer);
        this.doneButton.setVisibility(z ? 8 : 0);
    }
}
