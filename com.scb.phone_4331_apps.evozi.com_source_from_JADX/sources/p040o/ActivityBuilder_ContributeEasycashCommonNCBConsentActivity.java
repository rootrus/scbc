package p040o;

import com.scb.phone.view.fragment.merchant.MerchantWalletIncomingTransactionFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashCommonNCBConsentActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashCommonNCBConsentActivity implements Runnable {
    private final /* synthetic */ MerchantWalletIncomingTransactionFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeEasycashCommonNCBConsentActivity(MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = merchantWalletIncomingTransactionFragment;
    }

    public final void run() {
        MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        merchantWalletIncomingTransactionFragment.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(true, new ActivityBuilder_ContributeEasycashCarInformationActivity(merchantWalletIncomingTransactionFragment));
    }
}
