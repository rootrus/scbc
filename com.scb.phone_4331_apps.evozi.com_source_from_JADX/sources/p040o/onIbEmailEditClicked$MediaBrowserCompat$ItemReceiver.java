package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.onIbEmailEditClicked;

/* renamed from: o.onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver */
abstract class onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> extends AtomicReference<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    BulkTransferDeepLinkActivity IconCompatParcelizer;
    final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
    final BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private DebitCardResetPinSuccessActivity_ViewBinding<?> write;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer();

    /* access modifiers changed from: package-private */
    public abstract void read();

    onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<?> debitCardResetPinSuccessActivity_ViewBinding) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
            this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
            if (this.MediaBrowserCompat$ItemReceiver.get() == null) {
                this.write.subscribe(new onIbEmailEditClicked.write(this));
            }
        }
    }

    public void onNext(T t) {
        lazySet(t);
    }

    public void onError(Throwable th) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
        this.read.onError(th);
    }

    public void onComplete() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
        IconCompatParcelizer();
    }

    public void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.dispose();
    }

    public boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver.get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
