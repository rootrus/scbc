package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FriendsLandingActivity */
public final class FriendsLandingActivity<T> extends DebitCardCoachMarkActivity {
    private BillerDeepLinkActivity<T> IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> read;

    public FriendsLandingActivity(BillerDeepLinkActivity<T> billerDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        this.IconCompatParcelizer = billerDeepLinkActivity;
        this.read = directDebitDeepLinkActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(debitCardRequestInputActivity, this.read);
        debitCardRequestInputActivity.onSubscribe(iconCompatParcelizer);
        this.IconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer);
    }

    /* renamed from: o.FriendsLandingActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> IconCompatParcelizer;
        private DebitCardRequestInputActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = debitCardRequestInputActivity;
            this.IconCompatParcelizer = directDebitDeepLinkActivity;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            try {
                DebitCardProductCatalogActivity debitCardProductCatalogActivity = (DebitCardProductCatalogActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.IconCompatParcelizer.write(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    debitCardProductCatalogActivity.IconCompatParcelizer(this);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver.onComplete();
        }
    }
}
