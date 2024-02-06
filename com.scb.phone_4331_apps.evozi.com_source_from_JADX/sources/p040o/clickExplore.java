package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickExplore */
public final class clickExplore<T, U extends Collection<? super T>, Open, Close> extends NtbUserInfoActivity<T, U> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends Open> MediaBrowserCompat$CustomActionResultReceiver;
    private Callable<U> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super Open, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends Close>> write;

    public clickExplore(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends Open> debitCardResetPinSuccessActivity_ViewBinding2, DirectDebitDeepLinkActivity<? super Open, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends Close>> directDebitDeepLinkActivity, Callable<U> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        clickExplore$MediaBrowserCompat$CustomActionResultReceiver clickexplore_mediabrowsercompat_customactionresultreceiver = new clickExplore$MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.MediaBrowserCompat$ItemReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(clickexplore_mediabrowsercompat_customactionresultreceiver);
        this.IconCompatParcelizer.subscribe(clickexplore_mediabrowsercompat_customactionresultreceiver);
    }

    /* renamed from: o.clickExplore$read */
    static final class read<T, C extends Collection<? super T>> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
        private clickExplore$MediaBrowserCompat$CustomActionResultReceiver<T, C, ?, ?> MediaBrowserCompat$ItemReceiver;
        private long write;

        read(clickExplore$MediaBrowserCompat$CustomActionResultReceiver<T, C, ?, ?> clickexplore_mediabrowsercompat_customactionresultreceiver, long j) {
            this.MediaBrowserCompat$ItemReceiver = clickexplore_mediabrowsercompat_customactionresultreceiver;
            this.write = j;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(Object obj) {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) get();
            if (bulkTransferDeepLinkActivity != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
                bulkTransferDeepLinkActivity.dispose();
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, this.write);
            }
        }

        public final void onError(Throwable th) {
            if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
                clickExplore$MediaBrowserCompat$CustomActionResultReceiver<T, C, ?, ?> clickexplore_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver);
                clickexplore_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
                clickexplore_mediabrowsercompat_customactionresultreceiver.onError(th);
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, this.write);
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }
    }
}
