package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.PreregisteredMobileActivity */
public final class PreregisteredMobileActivity<T, R> extends DebitCardResetOtpActivity<R> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> read;
    private DebitCardResetOtpActivity<T> write;

    public PreregisteredMobileActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        this.write = debitCardResetOtpActivity;
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        if (!AlertController$RecycleListView.IconCompatParcelizer((Object) this.write, this.read, bankingAgentTransactionsDeepLinkActivity)) {
            this.write.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.PreregisteredMobileActivity$read */
    static final class read<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        static IconCompatParcelizer<Object> MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer<>((read) null);
        final AtomicReference<IconCompatParcelizer<R>> IconCompatParcelizer = new AtomicReference<>();
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$MediaItem;
        private volatile boolean MediaBrowserCompat$SearchResultReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> MediaMetadataCompat;
        private volatile boolean RatingCompat;
        final boolean read;
        BulkTransferDeepLinkActivity write;

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
            this.MediaBrowserCompat$MediaItem = bankingAgentTransactionsDeepLinkActivity;
            this.MediaMetadataCompat = directDebitDeepLinkActivity;
            this.read = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$MediaItem.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            IconCompatParcelizer<Object> iconCompatParcelizer;
            IconCompatParcelizer iconCompatParcelizer2 = this.IconCompatParcelizer.get();
            if (iconCompatParcelizer2 != null) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer2);
            }
            try {
                BillerDeepLinkActivity billerDeepLinkActivity = (BillerDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaMetadataCompat.write(t), "The mapper returned a null SingleSource");
                IconCompatParcelizer iconCompatParcelizer3 = new IconCompatParcelizer(this);
                do {
                    iconCompatParcelizer = this.IconCompatParcelizer.get();
                    if (iconCompatParcelizer == MediaBrowserCompat$ItemReceiver) {
                        return;
                    }
                } while (!this.IconCompatParcelizer.compareAndSet(iconCompatParcelizer, iconCompatParcelizer3));
                billerDeepLinkActivity.IconCompatParcelizer(iconCompatParcelizer3);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.write.dispose();
                this.IconCompatParcelizer.getAndSet(MediaBrowserCompat$ItemReceiver);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            IconCompatParcelizer<Object> andSet;
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                if (!(this.read || (andSet = this.IconCompatParcelizer.getAndSet(MediaBrowserCompat$ItemReceiver)) == null || andSet == MediaBrowserCompat$ItemReceiver)) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
                }
                this.RatingCompat = true;
                read();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.RatingCompat = true;
            read();
        }

        public final void dispose() {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            this.write.dispose();
            IconCompatParcelizer<Object> andSet = this.IconCompatParcelizer.getAndSet(MediaBrowserCompat$ItemReceiver);
            if (andSet != null && andSet != MediaBrowserCompat$ItemReceiver) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                AtomicReference<IconCompatParcelizer<R>> atomicReference = this.IconCompatParcelizer;
                int i = 1;
                while (!this.MediaBrowserCompat$SearchResultReceiver) {
                    if (hmlBusinessETBPersonalInfoActivity.get() == null || this.read) {
                        boolean z = this.RatingCompat;
                        IconCompatParcelizer iconCompatParcelizer = atomicReference.get();
                        boolean z2 = iconCompatParcelizer == null;
                        if (z && z2) {
                            Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                            if (read2 != null) {
                                bankingAgentTransactionsDeepLinkActivity.onError(read2);
                                return;
                            } else {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                        } else if (z2 || iconCompatParcelizer.MediaBrowserCompat$ItemReceiver == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(iconCompatParcelizer, (Object) null);
                            bankingAgentTransactionsDeepLinkActivity.onNext(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                        }
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                        return;
                    }
                }
            }
        }

        /* renamed from: o.PreregisteredMobileActivity$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<R> {
            volatile R MediaBrowserCompat$ItemReceiver;
            private read<?, R> read;

            IconCompatParcelizer(read<?, R> read2) {
                this.read = read2;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
                this.MediaBrowserCompat$ItemReceiver = r;
                this.read.read();
            }

            public final void onError(Throwable th) {
                read<?, R> read2 = this.read;
                if (!read2.IconCompatParcelizer.compareAndSet(this, (Object) null) || !HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(read2.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                    AlertController$RecycleListView.read.read(th);
                    return;
                }
                if (!read2.read) {
                    read2.write.dispose();
                    IconCompatParcelizer<Object> andSet = read2.IconCompatParcelizer.getAndSet(read.MediaBrowserCompat$ItemReceiver);
                    if (!(andSet == null || andSet == read.MediaBrowserCompat$ItemReceiver)) {
                        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
                    }
                }
                read2.read();
            }
        }
    }
}
