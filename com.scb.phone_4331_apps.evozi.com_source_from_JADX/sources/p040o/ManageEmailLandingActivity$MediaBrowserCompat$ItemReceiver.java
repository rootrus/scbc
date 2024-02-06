package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ManageEmailLandingActivity$MediaBrowserCompat$ItemReceiver */
final class ManageEmailLandingActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private HmlBaseDeepLinkActivity<? super Throwable> write;

    ManageEmailLandingActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, HmlBaseDeepLinkActivity<? super Throwable> hmlBaseDeepLinkActivity, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerSuccessfulDeepLinkActivity;
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = hmlBaseDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        this.read.onNext(t);
    }

    public final void onError(Throwable th) {
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (j != Long.MAX_VALUE) {
            this.MediaBrowserCompat$CustomActionResultReceiver = j - 1;
        }
        if (j == 0) {
            this.read.onError(th);
            return;
        }
        try {
            if (!this.write.MediaBrowserCompat$CustomActionResultReceiver(th)) {
                this.read.onError(th);
            } else {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            this.read.onError(new CompositeException(th, th2));
        }
    }

    public final void onComplete() {
        this.read.onComplete();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                this.IconCompatParcelizer.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
