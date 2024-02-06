package p040o;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.FastPayOtpActivity;

/* renamed from: o.FastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class FastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver<T> extends AtomicLong implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, FastPayOtpActivity.IconCompatParcelizer {
    final HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> read;
    private AtomicReference<BulkTransferDeepLinkActivity> write = new AtomicReference<>();

    FastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = directDebitDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) this.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
                this.MediaBrowserCompat$ItemReceiver.onNext(t);
                try {
                    DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.write(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                    FastPayOtpActivity$MediaBrowserCompat$ItemReceiver fastPayOtpActivity$MediaBrowserCompat$ItemReceiver = new FastPayOtpActivity$MediaBrowserCompat$ItemReceiver(j2, this);
                    if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, fastPayOtpActivity$MediaBrowserCompat$ItemReceiver)) {
                        debitCardResetPinSuccessActivity_ViewBinding.subscribe(fastPayOtpActivity$MediaBrowserCompat$ItemReceiver);
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.write.get().dispose();
                    getAndSet(Long.MAX_VALUE);
                    this.MediaBrowserCompat$ItemReceiver.onError(th);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            this.MediaBrowserCompat$ItemReceiver.onComplete();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
            this.MediaBrowserCompat$ItemReceiver.onError(new TimeoutException());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j, Throwable th) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.write.get());
    }
}
