package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickOpenAccount */
public final class clickOpenAccount<T> extends DebitCardResetOtpActivity<T> {
    private Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] MediaBrowserCompat$ItemReceiver;

    public clickOpenAccount(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBindingArr;
        this.MediaBrowserCompat$CustomActionResultReceiver = iterable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        int i;
        DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardResetPinSuccessActivity_ViewBindingArr == null) {
            debitCardResetPinSuccessActivity_ViewBindingArr = new DebitCardResetOtpActivity[8];
            try {
                i = 0;
                for (DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding : this.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (debitCardResetPinSuccessActivity_ViewBinding == null) {
                        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new NullPointerException("One of the sources is null"), (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                        return;
                    }
                    if (i == debitCardResetPinSuccessActivity_ViewBindingArr.length) {
                        DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr2 = new DebitCardResetPinSuccessActivity_ViewBinding[((i >> 2) + i)];
                        System.arraycopy(debitCardResetPinSuccessActivity_ViewBindingArr, 0, debitCardResetPinSuccessActivity_ViewBindingArr2, 0, i);
                        debitCardResetPinSuccessActivity_ViewBindingArr = debitCardResetPinSuccessActivity_ViewBindingArr2;
                    }
                    debitCardResetPinSuccessActivity_ViewBindingArr[i] = debitCardResetPinSuccessActivity_ViewBinding;
                    i++;
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                return;
            }
        } else {
            i = debitCardResetPinSuccessActivity_ViewBindingArr.length;
        }
        if (i == 0) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        } else if (i == 1) {
            debitCardResetPinSuccessActivity_ViewBindingArr[0].subscribe(bankingAgentTransactionsDeepLinkActivity);
        } else {
            new read(bankingAgentTransactionsDeepLinkActivity, i).MediaBrowserCompat$CustomActionResultReceiver(debitCardResetPinSuccessActivity_ViewBindingArr);
        }
    }

    /* renamed from: o.clickOpenAccount$read */
    static final class read<T> implements BulkTransferDeepLinkActivity {
        private write<T>[] IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private AtomicInteger read = new AtomicInteger();

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = new write[i];
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr) {
            write<T>[] writeArr = this.IconCompatParcelizer;
            int length = writeArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                writeArr[i] = new write<>(this, i2, this.MediaBrowserCompat$CustomActionResultReceiver);
                i = i2;
            }
            this.read.lazySet(0);
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.read.get() == 0; i3++) {
                debitCardResetPinSuccessActivity_ViewBindingArr[i3].subscribe(writeArr[i3]);
            }
        }

        public final boolean IconCompatParcelizer(int i) {
            int i2 = this.read.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.read.compareAndSet(0, i)) {
                    return false;
                }
                write<T>[] writeArr = this.IconCompatParcelizer;
                int length = writeArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(writeArr[i3]);
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 != i) {
                return false;
            } else {
                return true;
            }
        }

        public final void dispose() {
            if (this.read.get() != -1) {
                this.read.lazySet(-1);
                for (write<T> read2 : this.IconCompatParcelizer) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2);
                }
            }
        }

        public final boolean isDisposed() {
            return this.read.get() == -1;
        }
    }

    /* renamed from: o.clickOpenAccount$write */
    static final class write<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private read<T> MediaBrowserCompat$CustomActionResultReceiver;
        private boolean read;
        private int write;

        write(read<T> read2, int i, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = read2;
            this.write = i;
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            if (this.read) {
                this.IconCompatParcelizer.onNext(t);
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write)) {
                this.read = true;
                this.IconCompatParcelizer.onNext(t);
            } else {
                ((BulkTransferDeepLinkActivity) get()).dispose();
            }
        }

        public final void onError(Throwable th) {
            if (this.read) {
                this.IconCompatParcelizer.onError(th);
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write)) {
                this.read = true;
                this.IconCompatParcelizer.onError(th);
            } else {
                AlertController$RecycleListView.read.read(th);
            }
        }

        public final void onComplete() {
            if (this.read) {
                this.IconCompatParcelizer.onComplete();
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write)) {
                this.read = true;
                this.IconCompatParcelizer.onComplete();
            }
        }
    }
}
