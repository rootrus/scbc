package p040o;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.clickLoan */
public final class clickLoan<T, U extends Collection<? super T>> extends NtbUserInfoActivity<T, U> {
    private int MediaBrowserCompat$ItemReceiver;
    private int read;
    private Callable<U> write;

    public clickLoan(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, int i, int i2, Callable<U> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.write = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = this.read;
        if (i == i2) {
            clickLoan$MediaBrowserCompat$ItemReceiver clickloan_mediabrowsercompat_itemreceiver = new clickLoan$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, i2, this.write);
            if (clickloan_mediabrowsercompat_itemreceiver.write()) {
                this.IconCompatParcelizer.subscribe(clickloan_mediabrowsercompat_itemreceiver);
                return;
            }
            return;
        }
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$ItemReceiver, this.write));
    }

    /* renamed from: o.clickLoan$read */
    static final class read<T, U extends Collection<? super T>> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super U> IconCompatParcelizer;
        private ArrayDeque<U> MediaBrowserCompat$CustomActionResultReceiver = new ArrayDeque<>();
        private int MediaBrowserCompat$ItemReceiver;
        private int MediaBrowserCompat$MediaItem;
        private BulkTransferDeepLinkActivity MediaMetadataCompat;
        private long read;
        private Callable<U> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, int i, int i2, Callable<U> callable) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.MediaBrowserCompat$MediaItem = i2;
            this.write = callable;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaMetadataCompat, bulkTransferDeepLinkActivity)) {
                this.MediaMetadataCompat = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaMetadataCompat.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaMetadataCompat.isDisposed();
        }

        public final void onNext(T t) {
            long j = this.read;
            this.read = 1 + j;
            if (j % ((long) this.MediaBrowserCompat$MediaItem) == 0) {
                try {
                    this.MediaBrowserCompat$CustomActionResultReceiver.offer((Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.clear();
                    this.MediaMetadataCompat.dispose();
                    this.IconCompatParcelizer.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.MediaBrowserCompat$ItemReceiver <= collection.size()) {
                    it.remove();
                    this.IconCompatParcelizer.onNext(collection);
                }
            }
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            while (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                this.IconCompatParcelizer.onNext(this.MediaBrowserCompat$CustomActionResultReceiver.poll());
            }
            this.IconCompatParcelizer.onComplete();
        }
    }
}
