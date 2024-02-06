package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.onGetStartedClick;

public abstract class MailingAddressSelectAccountItem extends RelativeLayout {
    public abstract void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressSelectAccountItem(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressSelectAccountItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressSelectAccountItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }
}
