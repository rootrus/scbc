package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.NTBBankingServiceActivity_ViewBinding */
public final class NTBBankingServiceActivity_ViewBinding<T> extends DebitCardCoachMarkActivity {
    private int IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetOtpActivity<T> read;
    private HmlBusinessOccupationInfoActivity write;

    public NTBBankingServiceActivity_ViewBinding(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, int i) {
        this.read = debitCardResetOtpActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.write = hmlBusinessOccupationInfoActivity;
        this.IconCompatParcelizer = i;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        if (!AlertController$RecycleListView.write((Object) this.read, this.MediaBrowserCompat$CustomActionResultReceiver, debitCardRequestInputActivity)) {
            this.read.subscribe(new IconCompatParcelizer(debitCardRequestInputActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.IconCompatParcelizer));
        }
    }

    /* renamed from: o.NTBBankingServiceActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final HmlBusinessOccupationInfoActivity IconCompatParcelizer;
        volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        final DebitCardRequestInputActivity MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> MediaBrowserCompat$MediaItem;
        private write MediaBrowserCompat$SearchResultReceiver = new write(this);
        HmlSuccessfulDeepLinkActivity<T> MediaDescriptionCompat;
        private volatile boolean MediaMetadataCompat;
        private int MediaSessionCompat$QueueItem;
        BulkTransferDeepLinkActivity RatingCompat;
        volatile boolean read;
        final HmlBusinessETBPersonalInfoActivity write = new HmlBusinessETBPersonalInfoActivity();

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, int i) {
            this.MediaBrowserCompat$ItemReceiver = debitCardRequestInputActivity;
            this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
            this.IconCompatParcelizer = hmlBusinessOccupationInfoActivity;
            this.MediaSessionCompat$QueueItem = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
                this.RatingCompat = bulkTransferDeepLinkActivity;
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                    int write2 = hmlLoanOfferStatusDeepLinkActivity.write(3);
                    if (write2 == 1) {
                        this.MediaDescriptionCompat = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaMetadataCompat = true;
                        this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                        read();
                        return;
                    } else if (write2 == 2) {
                        this.MediaDescriptionCompat = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                        return;
                    }
                }
                this.MediaDescriptionCompat = new HmlBaseEmailAboutActivity(this.MediaSessionCompat$QueueItem);
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (t != null) {
                this.MediaDescriptionCompat.IconCompatParcelizer(t);
            }
            read();
        }

        public final void onError(Throwable th) {
            if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.write, th)) {
                AlertController$RecycleListView.read.read(th);
            } else if (this.IconCompatParcelizer == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                this.read = true;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver);
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.write);
                if (read2 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                    this.MediaBrowserCompat$ItemReceiver.onError(read2);
                }
                if (getAndIncrement() == 0) {
                    this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                }
            } else {
                this.MediaMetadataCompat = true;
                read();
            }
        }

        public final void onComplete() {
            this.MediaMetadataCompat = true;
            read();
        }

        public final void dispose() {
            this.read = true;
            this.RatingCompat.dispose();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver);
            if (getAndIncrement() == 0) {
                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final boolean isDisposed() {
            return this.read;
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            boolean z;
            if (getAndIncrement() == 0) {
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.write;
                HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity = this.IconCompatParcelizer;
                while (!this.read) {
                    if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                        if (hmlBusinessOccupationInfoActivity != HmlBusinessOccupationInfoActivity.BOUNDARY || hmlBusinessETBPersonalInfoActivity.get() == null) {
                            boolean z2 = this.MediaMetadataCompat;
                            DebitCardProductCatalogActivity debitCardProductCatalogActivity = null;
                            try {
                                T read2 = this.MediaDescriptionCompat.read();
                                if (read2 != null) {
                                    debitCardProductCatalogActivity = (DebitCardProductCatalogActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(read2), "The mapper returned a null CompletableSource");
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.read = true;
                                    Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                                    if (read3 != null) {
                                        this.MediaBrowserCompat$ItemReceiver.onError(read3);
                                        return;
                                    } else {
                                        this.MediaBrowserCompat$ItemReceiver.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                                    debitCardProductCatalogActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver);
                                }
                            } catch (Throwable th) {
                                AlertController$RecycleListView.read.write(th);
                                this.read = true;
                                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                                this.RatingCompat.dispose();
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th);
                                this.MediaBrowserCompat$ItemReceiver.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                                return;
                            }
                        } else {
                            this.read = true;
                            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                            this.MediaBrowserCompat$ItemReceiver.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
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

        /* renamed from: o.NTBBankingServiceActivity_ViewBinding$IconCompatParcelizer$write */
        static final class write extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity {
            private IconCompatParcelizer<?> read;

            write(IconCompatParcelizer<?> iconCompatParcelizer) {
                this.read = iconCompatParcelizer;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void onError(Throwable th) {
                IconCompatParcelizer<?> iconCompatParcelizer = this.read;
                if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(iconCompatParcelizer.write, th)) {
                    AlertController$RecycleListView.read.read(th);
                } else if (iconCompatParcelizer.IconCompatParcelizer == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                    iconCompatParcelizer.read = true;
                    iconCompatParcelizer.RatingCompat.dispose();
                    Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(iconCompatParcelizer.write);
                    if (read2 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.onError(read2);
                    }
                    if (iconCompatParcelizer.getAndIncrement() == 0) {
                        iconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                    }
                } else {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
                    iconCompatParcelizer.read();
                }
            }

            public final void onComplete() {
                IconCompatParcelizer<?> iconCompatParcelizer = this.read;
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
                iconCompatParcelizer.read();
            }
        }
    }
}
