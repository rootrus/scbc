package com.scb.phone.view.activity.directdebit;

import com.scb.phone.view.adapter.transferandpay.billpayment.BillPaymentSearchAdapter;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

final class DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<BillPaymentSearchAdapter> {
    public static final DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver read = new DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver();

    DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver() {
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        return new BillPaymentSearchAdapter();
    }
}
