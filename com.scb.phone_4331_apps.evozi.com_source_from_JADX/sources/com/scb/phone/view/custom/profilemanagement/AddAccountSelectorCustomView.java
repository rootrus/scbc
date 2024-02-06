package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
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
import p040o.getPhoneNumberFromServer;
import p040o.reviewConfirmation;
import p040o.setThreads;

public class AddAccountSelectorCustomView extends AddAccountCustomView {
    public confirmRegistrationDirectDebit.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CheckBox selectorCheckBox;
    @BindView
    TextView subTitle;
    @BindView
    TextView title;

    public void setListener(confirmRegistrationDirectDebit.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public AddAccountSelectorCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddAccountSelectorCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddAccountSelectorCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80982131493324, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        setThreads setthreads = (setThreads) builder;
        this.title.setText(setthreads.IconCompatParcelizer);
        this.subTitle.setText(setthreads.read);
        this.selectorCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        setOnClickListener((View.OnClickListener) null);
        this.selectorCheckBox.setChecked(setthreads.MediaBrowserCompat$ItemReceiver);
        this.selectorCheckBox.setOnCheckedChangeListener(new getPhoneNumberFromServer(this, setthreads));
        setOnClickListener(new reviewConfirmation(this, setthreads));
    }
}
