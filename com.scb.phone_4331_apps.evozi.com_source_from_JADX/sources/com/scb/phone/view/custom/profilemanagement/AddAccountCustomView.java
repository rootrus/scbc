package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

public abstract class AddAccountCustomView extends RelativeLayout {
    public abstract void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder);

    public AddAccountCustomView(Context context) {
        super(context);
    }

    public AddAccountCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddAccountCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
