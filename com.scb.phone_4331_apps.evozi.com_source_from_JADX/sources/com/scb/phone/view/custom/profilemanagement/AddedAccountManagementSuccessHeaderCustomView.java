package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getDetails;
import p040o.setLastBaselineToBottomHeight;

public class AddedAccountManagementSuccessHeaderCustomView extends RelativeLayout implements getDetails {
    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
    }

    public AddedAccountManagementSuccessHeaderCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddedAccountManagementSuccessHeaderCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddedAccountManagementSuccessHeaderCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80872131493313, this, true);
        setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        ButterKnife.IconCompatParcelizer(this);
    }
}
