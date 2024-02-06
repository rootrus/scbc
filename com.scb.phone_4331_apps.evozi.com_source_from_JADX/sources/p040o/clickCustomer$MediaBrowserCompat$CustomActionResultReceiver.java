package p040o;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickCustomer$MediaBrowserCompat$CustomActionResultReceiver */
final class clickCustomer$MediaBrowserCompat$CustomActionResultReceiver<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, Iterator<T>, BulkTransferDeepLinkActivity {
    private Condition IconCompatParcelizer;
    private HmlBaseEmailAboutActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
    private volatile Throwable MediaBrowserCompat$ItemReceiver;
    private Lock read;
    private volatile boolean write;

    clickCustomer$MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HmlBaseEmailAboutActivity<>(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.read = reentrantLock;
        this.IconCompatParcelizer = reentrantLock.newCondition();
    }

    public final boolean hasNext() {
        while (!isDisposed()) {
            boolean z = this.write;
            boolean write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            if (z) {
                Throwable th = this.MediaBrowserCompat$ItemReceiver;
                if (th != null) {
                    throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
                } else if (write2) {
                    return false;
                }
            }
            if (!write2) {
                return true;
            }
            boolean z2 = AlertController$RecycleListView.read.read;
            this.read.lock();
            while (!this.write && this.MediaBrowserCompat$CustomActionResultReceiver.write() && !isDisposed()) {
                try {
                    this.IconCompatParcelizer.await();
                } catch (InterruptedException e) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
                    MediaBrowserCompat$ItemReceiver();
                    throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(e);
                } catch (Throwable th2) {
                    this.read.unlock();
                    throw th2;
                }
            }
            this.read.unlock();
        }
        Throwable th3 = this.MediaBrowserCompat$ItemReceiver;
        if (th3 == null) {
            return false;
        }
        throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th3);
    }

    public final T next() {
        if (hasNext()) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }
        throw new NoSuchElementException();
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(t);
        MediaBrowserCompat$ItemReceiver();
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = th;
        this.write = true;
        MediaBrowserCompat$ItemReceiver();
    }

    public final void onComplete() {
        this.write = true;
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        this.read.lock();
        try {
            this.IconCompatParcelizer.signalAll();
        } finally {
            this.read.unlock();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        MediaBrowserCompat$ItemReceiver();
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
