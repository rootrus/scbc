package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.EtbOtpActivity;

/* renamed from: o.EtbOtpActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class C6473xf9987bbb extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<U> {
    private /* synthetic */ EtbOtpActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    C6473xf9987bbb(EtbOtpActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(U u) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        EtbOtpActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.read);
        BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = iconCompatParcelizer.IconCompatParcelizer;
        if (iconCompatParcelizer.getAndIncrement() == 0) {
            Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
            if (read != null) {
                bankingAgentTransactionsDeepLinkActivity.onError(read);
            } else {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        EtbOtpActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.read);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver, th, (AtomicInteger) iconCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer);
    }

    public final void onComplete() {
        EtbOtpActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.read);
        BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = iconCompatParcelizer.IconCompatParcelizer;
        if (iconCompatParcelizer.getAndIncrement() == 0) {
            Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
            if (read != null) {
                bankingAgentTransactionsDeepLinkActivity.onError(read);
            } else {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
            }
        }
    }
}
