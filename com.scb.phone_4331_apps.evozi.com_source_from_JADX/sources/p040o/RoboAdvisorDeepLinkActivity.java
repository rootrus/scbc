package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.RoboAdvisorDeepLinkActivity */
public final class RoboAdvisorDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DebitCardProductCatalogActivity[] MediaBrowserCompat$ItemReceiver;

    public RoboAdvisorDeepLinkActivity(DebitCardProductCatalogActivity[] debitCardProductCatalogActivityArr) {
        this.MediaBrowserCompat$ItemReceiver = debitCardProductCatalogActivityArr;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity = new ChequeInquiryDeepLinkActivity();
        write write2 = new write(debitCardRequestInputActivity, new AtomicBoolean(), chequeInquiryDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver.length + 1);
        debitCardRequestInputActivity.onSubscribe(chequeInquiryDeepLinkActivity);
        DebitCardProductCatalogActivity[] debitCardProductCatalogActivityArr = this.MediaBrowserCompat$ItemReceiver;
        int length = debitCardProductCatalogActivityArr.length;
        int i = 0;
        while (i < length) {
            DebitCardProductCatalogActivity debitCardProductCatalogActivity = debitCardProductCatalogActivityArr[i];
            if (!chequeInquiryDeepLinkActivity.isDisposed()) {
                if (debitCardProductCatalogActivity == null) {
                    chequeInquiryDeepLinkActivity.dispose();
                    write2.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                debitCardProductCatalogActivity.IconCompatParcelizer(write2);
                i++;
            } else {
                return;
            }
        }
        write2.onComplete();
    }

    /* renamed from: o.RoboAdvisorDeepLinkActivity$write */
    static final class write extends AtomicInteger implements DebitCardRequestInputActivity {
        private AtomicBoolean IconCompatParcelizer;
        private ChequeInquiryDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private DebitCardRequestInputActivity write;

        write(DebitCardRequestInputActivity debitCardRequestInputActivity, AtomicBoolean atomicBoolean, ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity, int i) {
            this.write = debitCardRequestInputActivity;
            this.IconCompatParcelizer = atomicBoolean;
            this.MediaBrowserCompat$CustomActionResultReceiver = chequeInquiryDeepLinkActivity;
            lazySet(i);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(bulkTransferDeepLinkActivity);
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            if (this.IconCompatParcelizer.compareAndSet(false, true)) {
                this.write.onError(th);
            } else {
                AlertController$RecycleListView.read.read(th);
            }
        }

        public final void onComplete() {
            if (decrementAndGet() == 0 && this.IconCompatParcelizer.compareAndSet(false, true)) {
                this.write.onComplete();
            }
        }
    }
}
