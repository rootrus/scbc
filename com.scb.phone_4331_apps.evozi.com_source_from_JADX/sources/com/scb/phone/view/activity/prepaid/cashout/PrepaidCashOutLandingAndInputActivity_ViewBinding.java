package com.scb.phone.view.activity.prepaid.cashout;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import p040o.onStart;

public final class PrepaidCashOutLandingAndInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrepaidCashOutLandingAndInputActivity IconCompatParcelizer;

    public PrepaidCashOutLandingAndInputActivity_ViewBinding(PrepaidCashOutLandingAndInputActivity prepaidCashOutLandingAndInputActivity, View view) {
        super(prepaidCashOutLandingAndInputActivity, view);
        this.IconCompatParcelizer = prepaidCashOutLandingAndInputActivity;
        prepaidCashOutLandingAndInputActivity.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        prepaidCashOutLandingAndInputActivity.mToAccountErrorLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.to_account_error_layout, "field 'mToAccountErrorLinearLayout'", LinearLayout.class);
        prepaidCashOutLandingAndInputActivity.mFragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_out_fragment_container, "field 'mFragmentContainer'", FrameLayout.class);
        prepaidCashOutLandingAndInputActivity.mFragmentInputContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_out_input_fragment_container, "field 'mFragmentInputContainer'", FrameLayout.class);
        prepaidCashOutLandingAndInputActivity.mFromAccountLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_layout_from_account, "field 'mFromAccountLinearLayout'", LinearLayout.class);
    }

    public final void read() {
        PrepaidCashOutLandingAndInputActivity prepaidCashOutLandingAndInputActivity = this.IconCompatParcelizer;
        if (prepaidCashOutLandingAndInputActivity != null) {
            this.IconCompatParcelizer = null;
            prepaidCashOutLandingAndInputActivity.mViewPager = null;
            prepaidCashOutLandingAndInputActivity.mToAccountErrorLinearLayout = null;
            prepaidCashOutLandingAndInputActivity.mFragmentContainer = null;
            prepaidCashOutLandingAndInputActivity.mFragmentInputContainer = null;
            prepaidCashOutLandingAndInputActivity.mFromAccountLinearLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
