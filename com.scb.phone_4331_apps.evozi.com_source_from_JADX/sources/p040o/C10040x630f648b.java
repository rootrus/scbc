package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.lambda$showEmailNotificationError$3$ManageEmailInputActivity;

/* renamed from: o.lambda$showEmailNotificationError$3$ManageEmailInputActivity$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C10040x630f648b extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object> {
    private /* synthetic */ lambda$showEmailNotificationError$3$ManageEmailInputActivity.read read;

    C10040x630f648b(lambda$showEmailNotificationError$3$ManageEmailInputActivity.read read2) {
        this.read = read2;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(Object obj) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onError(Throwable th) {
        lambda$showEmailNotificationError$3$ManageEmailInputActivity.read read2 = this.read;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2.IconCompatParcelizer);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) read2.write, th, (AtomicInteger) read2, read2.read);
    }

    public final void onComplete() {
        lambda$showEmailNotificationError$3$ManageEmailInputActivity.read read2 = this.read;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2.IconCompatParcelizer);
        BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = read2.write;
        HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = read2.read;
        if (read2.getAndIncrement() == 0) {
            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
            if (read3 != null) {
                bankingAgentTransactionsDeepLinkActivity.onError(read3);
            } else {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
            }
        }
    }
}
