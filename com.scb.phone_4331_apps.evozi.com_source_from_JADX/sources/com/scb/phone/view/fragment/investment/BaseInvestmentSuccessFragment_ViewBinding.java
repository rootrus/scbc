package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class BaseInvestmentSuccessFragment_ViewBinding extends BaseInvestmentSwitchSuccessReviewFragment_ViewBinding {
    private BaseInvestmentSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BaseInvestmentSuccessFragment_ViewBinding(BaseInvestmentSuccessFragment baseInvestmentSuccessFragment, View view) {
        super(baseInvestmentSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseInvestmentSuccessFragment;
        baseInvestmentSuccessFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        baseInvestmentSuccessFragment.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
        baseInvestmentSuccessFragment.remark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_success_remark_value, "field 'remark'", TextView.class);
    }

    public void read() {
        BaseInvestmentSuccessFragment baseInvestmentSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseInvestmentSuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseInvestmentSuccessFragment.textTitle = null;
            baseInvestmentSuccessFragment.textDateTime = null;
            baseInvestmentSuccessFragment.remark = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
