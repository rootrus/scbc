package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.NdidIdpDeepLinkActivity */
public final class NdidIdpDeepLinkActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    public HmlSuccessfulDeepLinkActivity<T> IconCompatParcelizer;
    private PartnerConsentUuidDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int read;
    public volatile boolean write;

    public NdidIdpDeepLinkActivity(PartnerConsentUuidDeepLinkActivity<T> partnerConsentUuidDeepLinkActivity, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = partnerConsentUuidDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity;
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
            if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                int write2 = hmlLoanOfferStatusDeepLinkActivity.write(3);
                if (write2 == 1) {
                    this.read = write2;
                    this.IconCompatParcelizer = hmlLoanOfferStatusDeepLinkActivity;
                    this.write = true;
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this);
                    return;
                } else if (write2 == 2) {
                    this.read = write2;
                    this.IconCompatParcelizer = hmlLoanOfferStatusDeepLinkActivity;
                    return;
                }
            }
            int i = -this.MediaBrowserCompat$ItemReceiver;
            if (i < 0) {
                hmlSuccessfulDeepLinkActivity = new HmlBaseEmailAboutActivity<>(-i);
            } else {
                hmlSuccessfulDeepLinkActivity = new HmlBaseConsentActivity<>(i);
            }
            this.IconCompatParcelizer = hmlSuccessfulDeepLinkActivity;
        }
    }

    public final void onNext(T t) {
        if (this.read == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(this, t);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.write();
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this, th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
