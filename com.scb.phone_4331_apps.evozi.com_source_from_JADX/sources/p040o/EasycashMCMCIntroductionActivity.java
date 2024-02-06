package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashMCMCIntroductionActivity */
public final class EasycashMCMCIntroductionActivity<T> extends NtbUserInfoActivity<T, T> {
    private BillerDeepLinkActivity<? extends T> MediaBrowserCompat$ItemReceiver;

    public EasycashMCMCIntroductionActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        super(debitCardResetOtpActivity);
        this.MediaBrowserCompat$ItemReceiver = billerDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        this.IconCompatParcelizer.subscribe(iconCompatParcelizer);
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.EasycashMCMCIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        volatile int IconCompatParcelizer;
        final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        final write<T> MediaBrowserCompat$ItemReceiver = new write<>(this);
        T MediaBrowserCompat$MediaItem;
        private volatile boolean MediaBrowserCompat$SearchResultReceiver;
        private volatile boolean MediaMetadataCompat;
        private volatile HmlLoanOfferStatusDeepLinkBaseActivity<T> RatingCompat;
        final HmlBusinessETBPersonalInfoActivity read = new HmlBusinessETBPersonalInfoActivity();
        final AtomicReference<BulkTransferDeepLinkActivity> write = new AtomicReference<>();

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                HmlLoanOfferStatusDeepLinkBaseActivity hmlLoanOfferStatusDeepLinkBaseActivity = this.RatingCompat;
                if (hmlLoanOfferStatusDeepLinkBaseActivity == null) {
                    hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseEmailAboutActivity(DebitCardResetOtpActivity.bufferSize());
                    this.RatingCompat = hmlLoanOfferStatusDeepLinkBaseActivity;
                }
                hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            write();
        }

        public final void onError(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.read, th)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
                if (getAndIncrement() == 0) {
                    write();
                    return;
                }
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.MediaMetadataCompat = true;
            if (getAndIncrement() == 0) {
                write();
            }
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.write.get());
        }

        public final void dispose() {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
            if (getAndIncrement() == 0) {
                this.RatingCompat = null;
                this.MediaBrowserCompat$MediaItem = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 1;
            while (!this.MediaBrowserCompat$SearchResultReceiver) {
                if (this.read.get() != null) {
                    this.MediaBrowserCompat$MediaItem = null;
                    this.RatingCompat = null;
                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.read));
                    return;
                }
                int i2 = this.IconCompatParcelizer;
                if (i2 == 1) {
                    T t = this.MediaBrowserCompat$MediaItem;
                    this.MediaBrowserCompat$MediaItem = null;
                    this.IconCompatParcelizer = 2;
                    bankingAgentTransactionsDeepLinkActivity.onNext(t);
                    i2 = 2;
                }
                boolean z = this.MediaMetadataCompat;
                HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity = this.RatingCompat;
                T read2 = hmlLoanOfferStatusDeepLinkBaseActivity != null ? hmlLoanOfferStatusDeepLinkBaseActivity.read() : null;
                boolean z2 = read2 == null;
                if (z && z2 && i2 == 2) {
                    this.RatingCompat = null;
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                }
            }
            this.MediaBrowserCompat$MediaItem = null;
            this.RatingCompat = null;
        }

        /* renamed from: o.EasycashMCMCIntroductionActivity$IconCompatParcelizer$write */
        static final class write<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T> {
            private IconCompatParcelizer<T> MediaBrowserCompat$ItemReceiver;

            write(IconCompatParcelizer<T> iconCompatParcelizer) {
                this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
                IconCompatParcelizer<T> iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
                if (iconCompatParcelizer.compareAndSet(0, 1)) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
                    iconCompatParcelizer.IconCompatParcelizer = 2;
                } else {
                    iconCompatParcelizer.MediaBrowserCompat$MediaItem = t;
                    iconCompatParcelizer.IconCompatParcelizer = 1;
                    if (iconCompatParcelizer.getAndIncrement() != 0) {
                        return;
                    }
                }
                iconCompatParcelizer.write();
            }

            public final void onError(Throwable th) {
                IconCompatParcelizer<T> iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
                if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(iconCompatParcelizer.read, th)) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.write);
                    if (iconCompatParcelizer.getAndIncrement() == 0) {
                        iconCompatParcelizer.write();
                        return;
                    }
                    return;
                }
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}
