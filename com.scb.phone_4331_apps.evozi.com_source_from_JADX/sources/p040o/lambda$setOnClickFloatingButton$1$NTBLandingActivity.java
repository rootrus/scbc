package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$setOnClickFloatingButton$1$NTBLandingActivity */
public final class lambda$setOnClickFloatingButton$1$NTBLandingActivity<T> extends DebitCardCoachMarkActivity {
    private DebitCardResetOtpActivity<T> IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;

    public lambda$setOnClickFloatingButton$1$NTBLandingActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
        this.IconCompatParcelizer = debitCardResetOtpActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        if (!AlertController$RecycleListView.write((Object) this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, debitCardRequestInputActivity)) {
            this.IconCompatParcelizer.subscribe(new read(debitCardRequestInputActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver));
        }
    }

    /* renamed from: o.lambda$setOnClickFloatingButton$1$NTBLandingActivity$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private static C10038x46877162 MediaBrowserCompat$MediaItem = new C10038x46877162((read<?>) null);
        volatile boolean IconCompatParcelizer;
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        final DebitCardRequestInputActivity MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> MediaBrowserCompat$SearchResultReceiver;
        private BulkTransferDeepLinkActivity RatingCompat;
        final AtomicReference<C10038x46877162> read = new AtomicReference<>();
        final boolean write;

        read(DebitCardRequestInputActivity debitCardRequestInputActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = debitCardRequestInputActivity;
            this.MediaBrowserCompat$SearchResultReceiver = directDebitDeepLinkActivity;
            this.write = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
                this.RatingCompat = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            C10038x46877162 lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver;
            try {
                DebitCardProductCatalogActivity debitCardProductCatalogActivity = (DebitCardProductCatalogActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.write(t), "The mapper returned a null CompletableSource");
                C10038x46877162 lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver2 = new C10038x46877162(this);
                do {
                    lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver = this.read.get();
                    if (lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver == MediaBrowserCompat$MediaItem) {
                        return;
                    }
                } while (!this.read.compareAndSet(lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver, lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver2));
                if (lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver != null) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver);
                }
                debitCardProductCatalogActivity.IconCompatParcelizer(lambda_setonclickfloatingbutton_1_ntblandingactivity_read_mediabrowsercompat_customactionresultreceiver2);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.RatingCompat.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                AlertController$RecycleListView.read.read(th);
            } else if (this.write) {
                onComplete();
            } else {
                C10038x46877162 andSet = this.read.getAndSet(MediaBrowserCompat$MediaItem);
                if (!(andSet == null || andSet == MediaBrowserCompat$MediaItem)) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
                }
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (read2 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                    this.MediaBrowserCompat$ItemReceiver.onError(read2);
                }
            }
        }

        public final void onComplete() {
            this.IconCompatParcelizer = true;
            if (this.read.get() == null) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (read2 == null) {
                    this.MediaBrowserCompat$ItemReceiver.onComplete();
                } else {
                    this.MediaBrowserCompat$ItemReceiver.onError(read2);
                }
            }
        }

        public final void dispose() {
            this.RatingCompat.dispose();
            C10038x46877162 andSet = this.read.getAndSet(MediaBrowserCompat$MediaItem);
            if (andSet != null && andSet != MediaBrowserCompat$MediaItem) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
            }
        }

        public final boolean isDisposed() {
            return this.read.get() == MediaBrowserCompat$MediaItem;
        }
    }
}
