package com.scb.phone.view.fragment.investment;

import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.redeem.TransactionsTabFragment;

public class TodayTransactionsTabFragment extends TransactionsTabFragment {
    public static TodayTransactionsTabFragment IconCompatParcelizer() {
        return new TodayTransactionsTabFragment();
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return getResources().getString(R.string.custom_today_no_transactions);
    }
}
