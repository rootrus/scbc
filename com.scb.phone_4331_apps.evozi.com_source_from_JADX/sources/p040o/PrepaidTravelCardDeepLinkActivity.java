package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.PrepaidTravelCardDeepLinkActivity */
public final class PrepaidTravelCardDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DebitCardMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver;

    public PrepaidTravelCardDeepLinkActivity(DebitCardMarketConductActivity debitCardMarketConductActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardMarketConductActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(debitCardRequestInputActivity);
        debitCardRequestInputActivity.onSubscribe(iconCompatParcelizer);
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(iconCompatParcelizer);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            if (!iconCompatParcelizer.write(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    /* renamed from: o.PrepaidTravelCardDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardOtpActivationActivity, BulkTransferDeepLinkActivity {
        private DebitCardRequestInputActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputActivity;
        }

        public final void IconCompatParcelizer() {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
            if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED && (bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) getAndSet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED)) != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                try {
                    this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                } finally {
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                }
            }
        }

        public final void read(Throwable th) {
            if (!write(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }

        public final boolean write(Throwable th) {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED || (bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) getAndSet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED)) == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                return false;
            }
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            } finally {
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }
}
