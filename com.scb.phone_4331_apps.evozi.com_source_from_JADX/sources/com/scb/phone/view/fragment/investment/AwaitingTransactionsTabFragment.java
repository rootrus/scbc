package com.scb.phone.view.fragment.investment;

import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.redeem.TransactionsTabFragment;

public class AwaitingTransactionsTabFragment extends TransactionsTabFragment {
    public static AwaitingTransactionsTabFragment IconCompatParcelizer() {
        return new AwaitingTransactionsTabFragment();
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return getResources().getString(R.string.custom_awaiting_no_transactions);
    }
}
