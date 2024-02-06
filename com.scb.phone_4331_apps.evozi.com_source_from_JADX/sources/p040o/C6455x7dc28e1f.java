package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashSpeedyCashIntroductionActivity$MediaBrowserCompat$ItemReceiver */
final class C6455x7dc28e1f<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
    final HmlBusinessOwnerSuccessfulDeepLinkActivity IconCompatParcelizer = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private boolean RatingCompat;
    private DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> read;
    private boolean write;

    C6455x7dc28e1f(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        if (!this.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
        }
    }

    public final void onError(Throwable th) {
        if (!this.RatingCompat) {
            this.RatingCompat = true;
            if (!this.MediaBrowserCompat$ItemReceiver || (th instanceof Exception)) {
                try {
                    DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) this.read.write(th);
                    if (debitCardResetPinSuccessActivity_ViewBinding == null) {
                        NullPointerException nullPointerException = new NullPointerException("Observable is null");
                        nullPointerException.initCause(th);
                        this.MediaBrowserCompat$CustomActionResultReceiver.onError(nullPointerException);
                        return;
                    }
                    debitCardResetPinSuccessActivity_ViewBinding.subscribe(this);
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    this.MediaBrowserCompat$CustomActionResultReceiver.onError(new CompositeException(th, th2));
                }
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            }
        } else if (this.write) {
            AlertController$RecycleListView.read.read(th);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            this.RatingCompat = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
