package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlAdditionalDocumentActivity */
public final class HmlAdditionalDocumentActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private DirectDebitDeepLinkActivity<? super Throwable, ? extends BillerDeepLinkActivity<? extends T>> IconCompatParcelizer;
    private BillerDeepLinkActivity<? extends T> MediaBrowserCompat$ItemReceiver;

    public HmlAdditionalDocumentActivity(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends BillerDeepLinkActivity<? extends T>> directDebitDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = billerDeepLinkActivity;
        this.IconCompatParcelizer = directDebitDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IconCompatParcelizer(activateChequeDeepLinkActivity, this.IconCompatParcelizer));
    }

    /* renamed from: o.HmlAdditionalDocumentActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private DirectDebitDeepLinkActivity<? super Throwable, ? extends BillerDeepLinkActivity<? extends T>> MediaBrowserCompat$CustomActionResultReceiver;
        private ActivateChequeDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends BillerDeepLinkActivity<? extends T>> directDebitDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = activateChequeDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
        }

        public final void onError(Throwable th) {
            try {
                ((BillerDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.write(th), "The nextFunction returned a null SingleSource.")).IconCompatParcelizer(new PartnerSuccessRedirectActivity(this, this.MediaBrowserCompat$ItemReceiver));
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                this.MediaBrowserCompat$ItemReceiver.onError(new CompositeException(th, th2));
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
