package p040o;

import com.scb.phone.view.fragment.merchant.MerchantWalletIncomingTransactionFragment;
import java.util.List;

/* renamed from: o.ActivityBuilder_ContributeEasycashCommercialLoanIntroductionActivity */
public final /* synthetic */ class C6309xc961f838 implements Runnable {
    private final /* synthetic */ MerchantWalletIncomingTransactionFragment read;
    private final /* synthetic */ List write;

    public /* synthetic */ C6309xc961f838(MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment, List list) {
        this.read = merchantWalletIncomingTransactionFragment;
        this.write = list;
    }

    public final void run() {
        MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment = this.read;
        List list = this.write;
        merchantWalletIncomingTransactionFragment.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(false, (getCustomerContact$MediaBrowserCompat$ItemReceiver) null);
        merchantWalletIncomingTransactionFragment.MediaMetadataCompat.write(list);
    }
}
