package p040o;

import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.DonationsFoundationDetailsActivity */
public final class DonationsFoundationDetailsActivity<T> extends NtbUserInfoActivity<T, T> {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity read;
    private TimeUnit write;

    public DonationsFoundationDetailsActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.write = timeUnit;
        this.read = bankingAgentDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read.write()));
    }

    /* renamed from: o.DonationsFoundationDetailsActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private TimeUnit MediaBrowserCompat$MediaItem;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
        private BankingAgentDeepLinkActivity.read MediaDescriptionCompat;
        private BulkTransferDeepLinkActivity read;
        volatile long write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            this.MediaBrowserCompat$MediaItem = timeUnit;
            this.MediaDescriptionCompat = read2;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                long j = this.write + 1;
                this.write = j;
                BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.read;
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
                C6436x9031140a donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6436x9031140a(t, j, this);
                this.read = donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem));
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.read;
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            this.IconCompatParcelizer.onError(th);
            this.MediaDescriptionCompat.dispose();
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.read;
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
                C6436x9031140a donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver = (C6436x9031140a) bulkTransferDeepLinkActivity;
                if (donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    donationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver.run();
                }
                this.IconCompatParcelizer.onComplete();
                this.MediaDescriptionCompat.dispose();
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
            this.MediaDescriptionCompat.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaDescriptionCompat.isDisposed();
        }
    }
}
