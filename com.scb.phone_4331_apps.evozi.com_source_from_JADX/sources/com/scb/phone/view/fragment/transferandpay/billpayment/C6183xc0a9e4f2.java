package com.scb.phone.view.fragment.transferandpay.billpayment;

import p040o.ServerProjectProvider;

/* renamed from: com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentHistoryFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6183xc0a9e4f2 implements ServerProjectProvider.C70695.RatingCompat {
    private /* synthetic */ BillPaymentHistoryFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6183xc0a9e4f2(BillPaymentHistoryFragment billPaymentHistoryFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentHistoryFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        BillPaymentHistoryFragment billPaymentHistoryFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (billPaymentHistoryFragment.IconCompatParcelizer && !billPaymentHistoryFragment.isDetached()) {
            billPaymentHistoryFragment.IconCompatParcelizer = false;
            billPaymentHistoryFragment.MediaDescriptionCompat().write();
        }
    }
}
