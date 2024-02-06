package com.scb.phone.view.fragment.investment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import p040o.checkForPreviousCrash;

public class BaseInvestmentSuccessFragment extends BaseInvestmentSwitchSuccessReviewFragment {
    @BindView
    TextView remark;
    @BindView
    TextView textDateTime;
    @BindView
    TextView textTitle;

    public final void IconCompatParcelizer(checkForPreviousCrash checkforpreviouscrash, View view, Context context, String str) {
        super.read(checkforpreviouscrash.IconCompatParcelizer, view, context, str);
        ButterKnife.IconCompatParcelizer(this, view);
        this.textTitle.setText(checkforpreviouscrash.MediaBrowserCompat$CustomActionResultReceiver);
        this.textDateTime.setText(checkforpreviouscrash.read);
        this.remark.setText(checkforpreviouscrash.MediaBrowserCompat$ItemReceiver);
    }
}
