package p040o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.FastPayInputActivity;

/* renamed from: o.FastPayOtpActivity */
public final class FastPayOtpActivity<T, U, V> extends NtbUserInfoActivity<T, T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<U> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> read;

    /* renamed from: o.FastPayOtpActivity$IconCompatParcelizer */
    interface IconCompatParcelizer extends FastPayInputActivity.read {
        void MediaBrowserCompat$CustomActionResultReceiver(long j, Throwable th);
    }

    public FastPayOtpActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        super(debitCardResetOtpActivity);
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            FastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver fastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver = new FastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity, this.read);
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(fastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver);
            DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            if (debitCardResetPinSuccessActivity_ViewBinding != null) {
                FastPayOtpActivity$MediaBrowserCompat$ItemReceiver fastPayOtpActivity$MediaBrowserCompat$ItemReceiver = new FastPayOtpActivity$MediaBrowserCompat$ItemReceiver(0, fastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver);
                if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(fastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, fastPayOtpActivity$MediaBrowserCompat$ItemReceiver)) {
                    debitCardResetPinSuccessActivity_ViewBinding.subscribe(fastPayOtpActivity$MediaBrowserCompat$ItemReceiver);
                }
            }
            this.IconCompatParcelizer.subscribe(fastPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding2 = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardResetPinSuccessActivity_ViewBinding2 != null) {
            FastPayOtpActivity$MediaBrowserCompat$ItemReceiver fastPayOtpActivity$MediaBrowserCompat$ItemReceiver2 = new FastPayOtpActivity$MediaBrowserCompat$ItemReceiver(0, read2);
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(read2.MediaBrowserCompat$ItemReceiver, fastPayOtpActivity$MediaBrowserCompat$ItemReceiver2)) {
                debitCardResetPinSuccessActivity_ViewBinding2.subscribe(fastPayOtpActivity$MediaBrowserCompat$ItemReceiver2);
            }
        }
        this.IconCompatParcelizer.subscribe(read2);
    }

    /* renamed from: o.FastPayOtpActivity$read */
    static final class read<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, IconCompatParcelizer {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$CustomActionResultReceiver;
        final HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$ItemReceiver = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        private AtomicReference<BulkTransferDeepLinkActivity> MediaMetadataCompat;
        private AtomicLong read;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.write = directDebitDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
            this.read = new AtomicLong();
            this.MediaMetadataCompat = new AtomicReference<>();
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            long j = this.read.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.read.compareAndSet(j, j2)) {
                    BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) this.MediaBrowserCompat$ItemReceiver.get();
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                    this.IconCompatParcelizer.onNext(t);
                    try {
                        DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        FastPayOtpActivity$MediaBrowserCompat$ItemReceiver fastPayOtpActivity$MediaBrowserCompat$ItemReceiver = new FastPayOtpActivity$MediaBrowserCompat$ItemReceiver(j2, this);
                        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, fastPayOtpActivity$MediaBrowserCompat$ItemReceiver)) {
                            debitCardResetPinSuccessActivity_ViewBinding.subscribe(fastPayOtpActivity$MediaBrowserCompat$ItemReceiver);
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.MediaMetadataCompat.get().dispose();
                        this.read.getAndSet(Long.MAX_VALUE);
                        this.IconCompatParcelizer.onError(th);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.read.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.MediaBrowserCompat$ItemReceiver.dispose();
                this.IconCompatParcelizer.onError(th);
                this.MediaBrowserCompat$ItemReceiver.dispose();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            if (this.read.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.MediaBrowserCompat$ItemReceiver.dispose();
                this.IconCompatParcelizer.onComplete();
                this.MediaBrowserCompat$ItemReceiver.dispose();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(long j) {
            if (this.read.compareAndSet(j, Long.MAX_VALUE)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
                DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                debitCardResetPinSuccessActivity_ViewBinding.subscribe(new FastPayInputActivity$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this));
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(long j, Throwable th) {
            if (this.read.compareAndSet(j, Long.MAX_VALUE)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
                this.IconCompatParcelizer.onError(th);
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
