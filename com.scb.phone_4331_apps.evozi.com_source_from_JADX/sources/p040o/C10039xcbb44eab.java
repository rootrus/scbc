package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$showCoachMark$0$NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver */
final class C10039xcbb44eab<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
    volatile int MediaBrowserCompat$CustomActionResultReceiver;
    R MediaBrowserCompat$ItemReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$MediaItem;
    private volatile boolean MediaBrowserCompat$SearchResultReceiver;
    private volatile boolean MediaDescriptionCompat;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> MediaMetadataCompat;
    private HmlLoanOfferStatusDeepLinkBaseActivity<T> MediaSessionCompat$ResultReceiverWrapper;
    private read<R> RatingCompat = new read<>(this);
    final HmlBusinessOccupationInfoActivity read;
    BulkTransferDeepLinkActivity write;

    C10039xcbb44eab(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, int i, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity) {
        this.MediaBrowserCompat$MediaItem = bankingAgentTransactionsDeepLinkActivity;
        this.MediaMetadataCompat = directDebitDeepLinkActivity;
        this.read = hmlBusinessOccupationInfoActivity;
        this.MediaSessionCompat$ResultReceiverWrapper = new HmlBaseEmailAboutActivity(i);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(t);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onError(Throwable th) {
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
            if (this.read == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
            }
            this.MediaBrowserCompat$SearchResultReceiver = true;
            MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void dispose() {
        this.MediaDescriptionCompat = true;
        this.write.dispose();
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
        if (getAndIncrement() == 0) {
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final boolean isDisposed() {
        return this.MediaDescriptionCompat;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getAndIncrement() == 0) {
            BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
            HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity = this.read;
            HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity = this.MediaSessionCompat$ResultReceiverWrapper;
            HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.IconCompatParcelizer;
            int i = 1;
            while (true) {
                if (this.MediaDescriptionCompat) {
                    hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
                    this.MediaBrowserCompat$ItemReceiver = null;
                } else {
                    int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (hmlBusinessETBPersonalInfoActivity.get() == null || !(hmlBusinessOccupationInfoActivity == HmlBusinessOccupationInfoActivity.IMMEDIATE || (hmlBusinessOccupationInfoActivity == HmlBusinessOccupationInfoActivity.BOUNDARY && i2 == 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.MediaBrowserCompat$SearchResultReceiver;
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
                                    BillerDeepLinkActivity billerDeepLinkActivity = (BillerDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaMetadataCompat.write(read2), "The mapper returned a null SingleSource");
                                    this.MediaBrowserCompat$CustomActionResultReceiver = 1;
                                    billerDeepLinkActivity.IconCompatParcelizer(this.RatingCompat);
                                } catch (Throwable th) {
                                    AlertController$RecycleListView.read.write(th);
                                    this.write.dispose();
                                    hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
                                    HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th);
                                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.MediaBrowserCompat$ItemReceiver;
                            this.MediaBrowserCompat$ItemReceiver = null;
                            bankingAgentTransactionsDeepLinkActivity.onNext(r);
                            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            hmlLoanOfferStatusDeepLinkBaseActivity.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$ItemReceiver = null;
            bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
        }
    }

    /* renamed from: o.lambda$showCoachMark$0$NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver$read */
    static final class read<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<R> {
        private C10039xcbb44eab<?, R> write;

        read(C10039xcbb44eab<?, R> lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver) {
            this.write = lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
            C10039xcbb44eab<?, R> lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver = this.write;
            lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = r;
            lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = 2;
            lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            C10039xcbb44eab<?, R> lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver = this.write;
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.IconCompatParcelizer, th)) {
                if (lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.read != HmlBusinessOccupationInfoActivity.END) {
                    lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.write.dispose();
                }
                lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = 0;
                lambda_showcoachmark_0_ntbbankingserviceactivity_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }
    }
}
