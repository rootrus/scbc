package p040o;

import com.scb.phone.view.fragment.bulktransfer.BulkTransferSuccessFragment;

/* renamed from: o.confirmAccounts */
public final /* synthetic */ class confirmAccounts implements findFragmentByWho {
    private final /* synthetic */ BulkTransferSuccessFragment write;

    public /* synthetic */ confirmAccounts(BulkTransferSuccessFragment bulkTransferSuccessFragment) {
        this.write = bulkTransferSuccessFragment;
    }

    public final Object IconCompatParcelizer(Object obj) {
        BulkTransferSuccessFragment bulkTransferSuccessFragment = this.write;
        return DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new BulkTransferSuccessFragment.IndividualScreenshot(bulkTransferSuccessFragment), (SettableFuture) obj, bulkTransferSuccessFragment.getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer());
    }
}
