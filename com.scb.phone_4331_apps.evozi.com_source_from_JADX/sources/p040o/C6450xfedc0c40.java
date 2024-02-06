package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.EasycashCreditPowerInputActivity;

/* renamed from: o.EasycashCreditPowerInputActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class C6450xfedc0c40 extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
    private /* synthetic */ EasycashCreditPowerInputActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    C6450xfedc0c40(EasycashCreditPowerInputActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onComplete() {
        EasycashCreditPowerInputActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.read(this);
        iconCompatParcelizer.onComplete();
    }

    public final void onError(Throwable th) {
        EasycashCreditPowerInputActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.read(this);
        iconCompatParcelizer.onError(th);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
