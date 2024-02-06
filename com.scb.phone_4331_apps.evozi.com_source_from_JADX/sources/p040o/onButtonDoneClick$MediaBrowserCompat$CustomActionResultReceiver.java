package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver */
final class onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver<T, U> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private volatile boolean IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    volatile boolean MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private HmlSuccessfulDeepLinkActivity<T> MediaDescriptionCompat;
    private read<U> MediaMetadataCompat;
    private int RatingCompat;
    private volatile boolean read;
    private BankingAgentTransactionsDeepLinkActivity<? super U> write;

    onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, int i) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaMetadataCompat = new read<>(bankingAgentTransactionsDeepLinkActivity, this);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
            if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                int write2 = hmlLoanOfferStatusDeepLinkActivity.write(3);
                if (write2 == 1) {
                    this.RatingCompat = write2;
                    this.MediaDescriptionCompat = hmlLoanOfferStatusDeepLinkActivity;
                    this.read = true;
                    this.write.onSubscribe(this);
                    IconCompatParcelizer();
                    return;
                } else if (write2 == 2) {
                    this.RatingCompat = write2;
                    this.MediaDescriptionCompat = hmlLoanOfferStatusDeepLinkActivity;
                    this.write.onSubscribe(this);
                    return;
                }
            }
            this.MediaDescriptionCompat = new HmlBaseEmailAboutActivity(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.read) {
            if (this.RatingCompat == 0) {
                this.MediaDescriptionCompat.IconCompatParcelizer(t);
            }
            IconCompatParcelizer();
        }
    }

    public final void onError(Throwable th) {
        if (this.read) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.read = true;
        dispose();
        this.write.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            IconCompatParcelizer();
        }
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }

    public final void dispose() {
        this.IconCompatParcelizer = true;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
        this.MediaBrowserCompat$SearchResultReceiver.dispose();
        if (getAndIncrement() == 0) {
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        if (getAndIncrement() == 0) {
            while (!this.IconCompatParcelizer) {
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    boolean z = this.read;
                    try {
                        T read2 = this.MediaDescriptionCompat.read();
                        boolean z2 = read2 == null;
                        if (z && z2) {
                            this.IconCompatParcelizer = true;
                            this.write.onComplete();
                            return;
                        } else if (!z2) {
                            try {
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(read2), "The mapper returned a null ObservableSource");
                                this.MediaBrowserCompat$ItemReceiver = true;
                                debitCardResetPinSuccessActivity_ViewBinding.subscribe(this.MediaMetadataCompat);
                            } catch (Throwable th) {
                                AlertController$RecycleListView.read.write(th);
                                dispose();
                                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                                this.write.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        AlertController$RecycleListView.read.write(th2);
                        dispose();
                        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                        this.write.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<U> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<U> {
        private BankingAgentTransactionsDeepLinkActivity<? super U> MediaBrowserCompat$CustomActionResultReceiver;
        private onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver<?, ?> MediaBrowserCompat$ItemReceiver;

        read(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver<?, ?> onbuttondoneclick_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = onbuttondoneclick_mediabrowsercompat_customactionresultreceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(U u) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(u);
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver<?, ?> onbuttondoneclick_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
            onbuttondoneclick_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = false;
            onbuttondoneclick_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
        }
    }
}
