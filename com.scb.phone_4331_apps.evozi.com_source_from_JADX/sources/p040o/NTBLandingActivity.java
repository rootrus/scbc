package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.NTBLandingActivity */
public final class NTBLandingActivity<T, R> extends DebitCardResetOtpActivity<R> {
    private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> IconCompatParcelizer;
    private HmlBusinessOccupationInfoActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetOtpActivity<T> MediaBrowserCompat$ItemReceiver;
    private int write;

    public NTBLandingActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, int i) {
        this.MediaBrowserCompat$ItemReceiver = debitCardResetOtpActivity;
        this.IconCompatParcelizer = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoActivity;
        this.write = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        if (!AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, bankingAgentTransactionsDeepLinkActivity)) {
            this.MediaBrowserCompat$ItemReceiver.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.NTBLandingActivity$write */
    static final class write<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final HmlBusinessOccupationInfoActivity IconCompatParcelizer;
        R MediaBrowserCompat$CustomActionResultReceiver;
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$ItemReceiver = new HmlBusinessETBPersonalInfoActivity();
        private volatile boolean MediaBrowserCompat$MediaItem;
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private HmlLoanOfferStatusDeepLinkBaseActivity<T> f5515x50fd9e4a;
        private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> MediaDescriptionCompat;
        private volatile boolean MediaMetadataCompat;
        private C9788xec6101f2<R> RatingCompat = new C9788xec6101f2<>(this);
        BulkTransferDeepLinkActivity read;
        volatile int write;

        write(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, int i, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity) {
            this.MediaBrowserCompat$SearchResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaDescriptionCompat = directDebitDeepLinkActivity;
            this.IconCompatParcelizer = hmlBusinessOccupationInfoActivity;
            this.f5515x50fd9e4a = new HmlBaseEmailAboutActivity(i);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$SearchResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.f5515x50fd9e4a.IconCompatParcelizer(t);
            read();
        }

        public final void onError(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, th)) {
                if (this.IconCompatParcelizer == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
                }
                this.MediaBrowserCompat$MediaItem = true;
                read();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$MediaItem = true;
            read();
        }

        public final void dispose() {
            this.MediaMetadataCompat = true;
            this.read.dispose();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
            if (getAndIncrement() == 0) {
                this.f5515x50fd9e4a.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }

        public final boolean isDisposed() {
            return this.MediaMetadataCompat;
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
                HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity = this.IconCompatParcelizer;
                HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity = this.f5515x50fd9e4a;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.MediaBrowserCompat$ItemReceiver;
                int i = 1;
                while (true) {
                    if (this.MediaMetadataCompat) {
                        hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
                        this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    } else {
                        int i2 = this.write;
                        if (hmlBusinessETBPersonalInfoActivity.get() == null || !(hmlBusinessOccupationInfoActivity == HmlBusinessOccupationInfoActivity.IMMEDIATE || (hmlBusinessOccupationInfoActivity == HmlBusinessOccupationInfoActivity.BOUNDARY && i2 == 0))) {
                            boolean z = false;
                            if (i2 == 0) {
                                boolean z2 = this.MediaBrowserCompat$MediaItem;
                                T read2 = hmlLoanOfferStatusDeepLinkBaseActivity.read();
                                if (read2 == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                                    if (read3 == null) {
                                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                                        return;
                                    } else {
                                        bankingAgentTransactionsDeepLinkActivity.onError(read3);
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        BaseChangePinWithMaxActivity baseChangePinWithMaxActivity = (BaseChangePinWithMaxActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.write(read2), "The mapper returned a null MaybeSource");
                                        this.write = 1;
                                        baseChangePinWithMaxActivity.read(this.RatingCompat);
                                    } catch (Throwable th) {
                                        AlertController$RecycleListView.read.write(th);
                                        this.read.dispose();
                                        hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th);
                                        bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                                        return;
                                    }
                                }
                            } else if (i2 == 2) {
                                R r = this.MediaBrowserCompat$CustomActionResultReceiver;
                                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                                bankingAgentTransactionsDeepLinkActivity.onNext(r);
                                this.write = 0;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
            }
        }
    }
}
