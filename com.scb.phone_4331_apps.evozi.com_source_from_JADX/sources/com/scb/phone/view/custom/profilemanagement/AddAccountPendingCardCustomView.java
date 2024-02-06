package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C3077xfe724d07;
import p040o.C7101xb11ee437;
import p040o.getValidateMerchant;

public class AddAccountPendingCardCustomView extends AddAccountCustomView {
    public C7101xb11ee437 IconCompatParcelizer;
    @BindView
    Button buttonActivate;
    @BindView
    View separator;
    @BindView
    TextView subTitle;
    @BindView
    TextView title;

    public void setListener(C7101xb11ee437 confirmregistrationdirectdebit_mediabrowsercompat_customactionresultreceiver) {
        this.IconCompatParcelizer = confirmregistrationdirectdebit_mediabrowsercompat_customactionresultreceiver;
    }

    public AddAccountPendingCardCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddAccountPendingCardCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddAccountPendingCardCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80972131493323, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        C3077xfe724d07 autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage = (C3077xfe724d07) builder;
        this.title.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.IconCompatParcelizer);
        this.subTitle.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.read);
        this.buttonActivate.setOnClickListener(new getValidateMerchant(this, autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage));
        this.separator.setVisibility(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.MediaDescriptionCompat() ? 8 : 0);
    }
}
