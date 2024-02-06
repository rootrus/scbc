package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.HmlBusinessOwnerSuccessfulDeepLinkActivity */
public final class HmlBusinessOwnerSuccessfulDeepLinkActivity extends AtomicReference<BulkTransferDeepLinkActivity> implements BulkTransferDeepLinkActivity {
    public HmlBusinessOwnerSuccessfulDeepLinkActivity() {
    }

    public HmlBusinessOwnerSuccessfulDeepLinkActivity(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        lazySet(bulkTransferDeepLinkActivity);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
