package p040o;

import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerListFragment;

/* renamed from: o.ActivityBuilder_ContributesThirdPartySlipDeepLinkActivity */
public final /* synthetic */ class ActivityBuilder_ContributesThirdPartySlipDeepLinkActivity implements Runnable {
    private final /* synthetic */ BillPaymentBillerListFragment read;

    public /* synthetic */ ActivityBuilder_ContributesThirdPartySlipDeepLinkActivity(BillPaymentBillerListFragment billPaymentBillerListFragment) {
        this.read = billPaymentBillerListFragment;
    }

    public final void run() {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver;
        BillPaymentBillerListFragment billPaymentBillerListFragment = this.read;
        if (billPaymentBillerListFragment.getActivity() != null && (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = billPaymentBillerListFragment.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
        }
    }
}
