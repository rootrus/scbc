package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getDetails;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSignal;

public class AddedAccountManagementSuccessSimpleCustomView extends ConstraintLayout implements getDetails {
    @BindView
    TextView leftText;

    public AddedAccountManagementSuccessSimpleCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddedAccountManagementSuccessSimpleCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddedAccountManagementSuccessSimpleCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80992131493325, this, true);
        setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        this.leftText.setText(((setSignal) builder).read);
    }
}
