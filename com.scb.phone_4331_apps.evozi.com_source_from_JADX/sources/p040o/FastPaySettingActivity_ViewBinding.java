package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPaySettingActivity_ViewBinding */
public final class FastPaySettingActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private BankingAgentDeepLinkActivity write;

    public FastPaySettingActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = bankingAgentDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.write));
    }

    /* renamed from: o.FastPaySettingActivity_ViewBinding$read */
    static final class read<T> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!get()) {
                this.read.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (get()) {
                AlertController$RecycleListView.read.read(th);
            } else {
                this.read.onError(th);
            }
        }

        public final void onComplete() {
            if (!get()) {
                this.read.onComplete();
            }
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(new C9733xfe9f33(this));
            }
        }

        public final boolean isDisposed() {
            return get();
        }
    }
}
