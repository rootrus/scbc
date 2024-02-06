package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getThreads;

public class AccountManagementHeaderCustomView extends AccountManagementItem {
    @BindView
    TextView header;

    public AccountManagementHeaderCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AccountManagementHeaderCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountManagementHeaderCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80862131493312, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder, boolean z) {
        this.header.setText(((getThreads) builder).MediaBrowserCompat$CustomActionResultReceiver);
    }
}
