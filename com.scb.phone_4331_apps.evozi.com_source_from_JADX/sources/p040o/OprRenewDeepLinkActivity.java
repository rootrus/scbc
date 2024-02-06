package p040o;

/* renamed from: o.OprRenewDeepLinkActivity */
public abstract class OprRenewDeepLinkActivity<T, U, V> extends PartnerInAppLoginDeepLinkActivity implements BankingAgentTransactionsDeepLinkActivity<T>, HmlCompanyNameActivity<U, V> {
    public Throwable IconCompatParcelizer;
    public volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final BankingAgentTransactionsDeepLinkActivity<? super V> MediaBrowserCompat$ItemReceiver;
    public volatile boolean read;
    public final HmlLoanOfferStatusDeepLinkBaseActivity<U> write;

    public void write(BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity, U u) {
    }

    public OprRenewDeepLinkActivity(BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity, HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.write = hmlLoanOfferStatusDeepLinkBaseActivity;
    }

    public final boolean read() {
        return this.read;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public final void write(U u, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity = this.write;
        boolean z = true;
        if (this.MediaMetadataCompat.get() != 0 || !this.MediaMetadataCompat.compareAndSet(0, 1)) {
            hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(u);
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (!z) {
                return;
            }
        } else {
            write(bankingAgentTransactionsDeepLinkActivity, u);
            if (this.MediaMetadataCompat.addAndGet(-1) == 0) {
                return;
            }
        }
        AlertController$RecycleListView.write(hmlLoanOfferStatusDeepLinkBaseActivity, bankingAgentTransactionsDeepLinkActivity, false, bulkTransferDeepLinkActivity, this);
    }

    public final void write(U u, boolean z, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity = this.write;
        boolean z2 = true;
        if (this.MediaMetadataCompat.get() != 0 || !this.MediaMetadataCompat.compareAndSet(0, 1)) {
            hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(u);
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z2 = false;
            }
            if (!z2) {
                return;
            }
        } else if (hmlLoanOfferStatusDeepLinkBaseActivity.write()) {
            write(bankingAgentTransactionsDeepLinkActivity, u);
            if (this.MediaMetadataCompat.addAndGet(-1) == 0) {
                return;
            }
        } else {
            hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(u);
        }
        AlertController$RecycleListView.write(hmlLoanOfferStatusDeepLinkBaseActivity, bankingAgentTransactionsDeepLinkActivity, false, bulkTransferDeepLinkActivity, this);
    }

    public final Throwable write() {
        return this.IconCompatParcelizer;
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        return this.MediaMetadataCompat.addAndGet(i);
    }
}
