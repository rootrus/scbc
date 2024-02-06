package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class AccountSourceSelectFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AccountSourceSelectFragment IconCompatParcelizer;

    public AccountSourceSelectFragment_ViewBinding(AccountSourceSelectFragment accountSourceSelectFragment, View view) {
        super(accountSourceSelectFragment, view);
        this.IconCompatParcelizer = accountSourceSelectFragment;
        accountSourceSelectFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        accountSourceSelectFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        accountSourceSelectFragment.mToTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.to_text_view, "field 'mToTextView'", TextView.class);
        accountSourceSelectFragment.mFromTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.from_text_view, "field 'mFromTextView'", TextView.class);
        accountSourceSelectFragment.mTextDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view_disclaimer, "field 'mTextDisclaimer'", TextView.class);
        accountSourceSelectFragment.bottomDivider = onStart.IconCompatParcelizer(view, R.id.bottom_divider, "field 'bottomDivider'");
        accountSourceSelectFragment.mLlHappyCash = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_happy_cash, "field 'mLlHappyCash'", LinearLayout.class);
        accountSourceSelectFragment.mTvHappyCashAvailable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_happy_cash_available_value, "field 'mTvHappyCashAvailable'", TextView.class);
        accountSourceSelectFragment.mTvHappyCashUsed = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_happy_cash_used_value, "field 'mTvHappyCashUsed'", TextView.class);
        accountSourceSelectFragment.mTvHappyCashLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_happy_cash_limit_value, "field 'mTvHappyCashLimitValue'", TextView.class);
        accountSourceSelectFragment.mTvHappyCashLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_happy_cash_limit, "field 'mTvHappyCashLimit'", TextView.class);
        accountSourceSelectFragment.mPbHappyCash = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pb_happy_cash_used, "field 'mPbHappyCash'", ProgressBar.class);
        accountSourceSelectFragment.llHappyCashError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_happy_cash_error, "field 'llHappyCashError'", LinearLayout.class);
        accountSourceSelectFragment.groupHappyCashSuccess = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_happy_cash_success, "field 'groupHappyCashSuccess'", Group.class);
    }

    public final void read() {
        AccountSourceSelectFragment accountSourceSelectFragment = this.IconCompatParcelizer;
        if (accountSourceSelectFragment != null) {
            this.IconCompatParcelizer = null;
            accountSourceSelectFragment.mViewPager = null;
            accountSourceSelectFragment.mCircleIndicator = null;
            accountSourceSelectFragment.mToTextView = null;
            accountSourceSelectFragment.mFromTextView = null;
            accountSourceSelectFragment.mTextDisclaimer = null;
            accountSourceSelectFragment.bottomDivider = null;
            accountSourceSelectFragment.mLlHappyCash = null;
            accountSourceSelectFragment.mTvHappyCashAvailable = null;
            accountSourceSelectFragment.mTvHappyCashUsed = null;
            accountSourceSelectFragment.mTvHappyCashLimitValue = null;
            accountSourceSelectFragment.mTvHappyCashLimit = null;
            accountSourceSelectFragment.mPbHappyCash = null;
            accountSourceSelectFragment.llHappyCashError = null;
            accountSourceSelectFragment.groupHappyCashSuccess = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
