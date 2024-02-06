package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlETBAccountSetupActivity */
public final class HmlETBAccountSetupActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity read;
    private boolean write;

    public HmlETBAccountSetupActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
            this.read = bulkTransferDeepLinkActivity;
            try {
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th));
            }
        }
    }

    public final void dispose() {
        this.read.dispose();
    }

    public final boolean isDisposed() {
        return this.read.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.write) {
            if (this.read == null) {
                this.write = true;
                NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.MediaBrowserCompat$ItemReceiver.onSubscribe(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE);
                    try {
                        this.MediaBrowserCompat$ItemReceiver.onError(nullPointerException);
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        AlertController$RecycleListView.read.read((Throwable) new CompositeException(nullPointerException, th));
                    }
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    AlertController$RecycleListView.read.read((Throwable) new CompositeException(nullPointerException, th2));
                }
            } else if (t == null) {
                NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.read.dispose();
                    onError(nullPointerException2);
                } catch (Throwable th3) {
                    AlertController$RecycleListView.read.write(th3);
                    onError(new CompositeException(nullPointerException2, th3));
                }
            } else {
                try {
                    this.MediaBrowserCompat$ItemReceiver.onNext(t);
                } catch (Throwable th4) {
                    AlertController$RecycleListView.read.write(th4);
                    onError(new CompositeException(th, th4));
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.write) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.write = true;
        if (this.read == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE);
                try {
                    this.MediaBrowserCompat$ItemReceiver.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                AlertController$RecycleListView.read.write(th3);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.MediaBrowserCompat$ItemReceiver.onError(th);
            } catch (Throwable th4) {
                AlertController$RecycleListView.read.write(th4);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th4));
            }
        }
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            if (this.read == null) {
                NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.MediaBrowserCompat$ItemReceiver.onSubscribe(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE);
                    try {
                        this.MediaBrowserCompat$ItemReceiver.onError(nullPointerException);
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        AlertController$RecycleListView.read.read((Throwable) new CompositeException(nullPointerException, th));
                    }
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    AlertController$RecycleListView.read.read((Throwable) new CompositeException(nullPointerException, th2));
                }
            } else {
                try {
                    this.MediaBrowserCompat$ItemReceiver.onComplete();
                } catch (Throwable th3) {
                    AlertController$RecycleListView.read.write(th3);
                    AlertController$RecycleListView.read.read(th3);
                }
            }
        }
    }
}
