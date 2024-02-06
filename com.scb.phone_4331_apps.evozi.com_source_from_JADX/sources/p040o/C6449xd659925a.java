package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.EasycashCommonNCBConsentActivity;

/* renamed from: o.EasycashCommonNCBConsentActivity$read$MediaBrowserCompat$ItemReceiver */
final class C6449xd659925a extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
    private /* synthetic */ EasycashCommonNCBConsentActivity.read IconCompatParcelizer;

    C6449xd659925a(EasycashCommonNCBConsentActivity.read read) {
        this.IconCompatParcelizer = read;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onComplete() {
        EasycashCommonNCBConsentActivity.read read = this.IconCompatParcelizer;
        read.read.read(this);
        read.onComplete();
    }

    public final void onError(Throwable th) {
        EasycashCommonNCBConsentActivity.read read = this.IconCompatParcelizer;
        read.read.read(this);
        read.onError(th);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
