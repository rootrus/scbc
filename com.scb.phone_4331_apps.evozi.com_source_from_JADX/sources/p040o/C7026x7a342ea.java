package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ReviewDeviceActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C7026x7a342ea<T, R> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private ActivateChequeDeepLinkActivity<? super R> IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> read;

    C7026x7a342ea(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        this.IconCompatParcelizer = activateChequeDeepLinkActivity;
        this.read = directDebitDeepLinkActivity;
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        try {
            BillerDeepLinkActivity billerDeepLinkActivity = (BillerDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.write(t), "The single returned by the mapper is null");
            if (!isDisposed()) {
                billerDeepLinkActivity.IconCompatParcelizer(new C7027x10ca69f7(this, this.IconCompatParcelizer));
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.IconCompatParcelizer.onError(th);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.onError(th);
    }
}
