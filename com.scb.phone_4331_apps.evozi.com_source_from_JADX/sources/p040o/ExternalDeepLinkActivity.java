package p040o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.ExternalDeepLinkActivity */
public final class ExternalDeepLinkActivity extends AtomicReferenceArray<BulkTransferDeepLinkActivity> implements BulkTransferDeepLinkActivity {
    public ExternalDeepLinkActivity() {
        super(2);
    }

    public final boolean write(int i, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2;
        do {
            bulkTransferDeepLinkActivity2 = (BulkTransferDeepLinkActivity) get(i);
            if (bulkTransferDeepLinkActivity2 == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                bulkTransferDeepLinkActivity.dispose();
                return false;
            }
        } while (!compareAndSet(i, bulkTransferDeepLinkActivity2, bulkTransferDeepLinkActivity));
        if (bulkTransferDeepLinkActivity2 == null) {
            return true;
        }
        bulkTransferDeepLinkActivity2.dispose();
        return true;
    }

    public final void dispose() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        if (get(0) != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (!(((BulkTransferDeepLinkActivity) get(i)) == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED || (bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) getAndSet(i, HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED)) == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED || bulkTransferDeepLinkActivity == null)) {
                    bulkTransferDeepLinkActivity.dispose();
                }
            }
        }
    }

    public final boolean isDisposed() {
        return get(0) == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
