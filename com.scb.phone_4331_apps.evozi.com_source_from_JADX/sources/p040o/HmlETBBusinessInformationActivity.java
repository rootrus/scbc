package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.ProtocolViolationException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlETBBusinessInformationActivity */
public abstract class HmlETBBusinessInformationActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();

    public void MediaBrowserCompat$ItemReceiver() {
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        boolean z;
        AtomicReference<BulkTransferDeepLinkActivity> atomicReference = this.MediaBrowserCompat$ItemReceiver;
        Class<?> cls = getClass();
        HmlLatestPersonalInformationDeepLinkActivity.write(bulkTransferDeepLinkActivity, "next is null");
        if (!atomicReference.compareAndSet((Object) null, bulkTransferDeepLinkActivity)) {
            bulkTransferDeepLinkActivity.dispose();
            if (atomicReference.get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException(AlertController$RecycleListView.m3034x50fd9e4a(cls.getName())));
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver.get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
    }
}
