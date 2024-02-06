package com.scb.phone.view.fragment.bankingagent;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public final class BankingEnterAmountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BankingEnterAmountFragment IconCompatParcelizer;

    public BankingEnterAmountFragment_ViewBinding(BankingEnterAmountFragment bankingEnterAmountFragment, View view) {
        super(bankingEnterAmountFragment, view);
        this.IconCompatParcelizer = bankingEnterAmountFragment;
        bankingEnterAmountFragment.reviewButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_review, "field 'reviewButton'", Button.class);
        bankingEnterAmountFragment.accountsViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_accounts, "field 'accountsViewPager'", NoSwipeViewPager.class);
        bankingEnterAmountFragment.accountsIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'accountsIndicator'", CircleIndicator.class);
        bankingEnterAmountFragment.agentLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_layout, "field 'agentLayout'", LinearLayout.class);
    }

    public final void read() {
        BankingEnterAmountFragment bankingEnterAmountFragment = this.IconCompatParcelizer;
        if (bankingEnterAmountFragment != null) {
            this.IconCompatParcelizer = null;
            bankingEnterAmountFragment.reviewButton = null;
            bankingEnterAmountFragment.accountsViewPager = null;
            bankingEnterAmountFragment.accountsIndicator = null;
            bankingEnterAmountFragment.agentLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
