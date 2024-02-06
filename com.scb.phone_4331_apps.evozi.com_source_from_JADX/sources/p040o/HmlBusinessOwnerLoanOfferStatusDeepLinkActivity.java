package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.ProtocolViolationException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity */
public enum HmlBusinessOwnerLoanOfferStatusDeepLinkActivity implements BulkTransferDeepLinkActivity {
    ;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    private HmlBusinessOwnerLoanOfferStatusDeepLinkActivity(String str) {
    }

    public static boolean MediaBrowserCompat$ItemReceiver(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        return bulkTransferDeepLinkActivity == DISPOSED;
    }

    public static boolean write(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2;
        do {
            bulkTransferDeepLinkActivity2 = atomicReference.get();
            if (bulkTransferDeepLinkActivity2 == DISPOSED) {
                if (bulkTransferDeepLinkActivity == null) {
                    return false;
                }
                bulkTransferDeepLinkActivity.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bulkTransferDeepLinkActivity2, bulkTransferDeepLinkActivity));
        if (bulkTransferDeepLinkActivity2 == null) {
            return true;
        }
        bulkTransferDeepLinkActivity2.dispose();
        return true;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bulkTransferDeepLinkActivity, "d is null");
        if (atomicReference.compareAndSet((Object) null, bulkTransferDeepLinkActivity)) {
            return true;
        }
        bulkTransferDeepLinkActivity.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2;
        do {
            bulkTransferDeepLinkActivity2 = atomicReference.get();
            if (bulkTransferDeepLinkActivity2 == DISPOSED) {
                if (bulkTransferDeepLinkActivity == null) {
                    return false;
                }
                bulkTransferDeepLinkActivity.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bulkTransferDeepLinkActivity2, bulkTransferDeepLinkActivity));
        return true;
    }

    public static boolean read(AtomicReference<BulkTransferDeepLinkActivity> atomicReference) {
        BulkTransferDeepLinkActivity andSet;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = atomicReference.get();
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity hmlBusinessOwnerLoanOfferStatusDeepLinkActivity = DISPOSED;
        if (bulkTransferDeepLinkActivity == hmlBusinessOwnerLoanOfferStatusDeepLinkActivity || (andSet = atomicReference.getAndSet(hmlBusinessOwnerLoanOfferStatusDeepLinkActivity)) == hmlBusinessOwnerLoanOfferStatusDeepLinkActivity) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean IconCompatParcelizer(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2) {
        if (bulkTransferDeepLinkActivity2 == null) {
            AlertController$RecycleListView.read.read((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bulkTransferDeepLinkActivity == null) {
            return true;
        } else {
            bulkTransferDeepLinkActivity2.dispose();
            AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException("Disposable already set!"));
            return false;
        }
    }

    public static boolean read(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (atomicReference.compareAndSet((Object) null, bulkTransferDeepLinkActivity)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bulkTransferDeepLinkActivity.dispose();
        return false;
    }
}
