package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.lambda$setOnClickFloatingButton$1$NTBLandingActivity;

/* renamed from: o.lambda$setOnClickFloatingButton$1$NTBLandingActivity$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C10038x46877162 extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity {
    private lambda$setOnClickFloatingButton$1$NTBLandingActivity.read<?> read;

    C10038x46877162(lambda$setOnClickFloatingButton$1$NTBLandingActivity.read<?> read2) {
        this.read = read2;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onError(Throwable th) {
        lambda$setOnClickFloatingButton$1$NTBLandingActivity.read<?> read2 = this.read;
        if (!read2.read.compareAndSet(this, (Object) null) || !HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(read2.MediaBrowserCompat$CustomActionResultReceiver, th)) {
            AlertController$RecycleListView.read.read(th);
        } else if (!read2.write) {
            read2.dispose();
            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(read2.MediaBrowserCompat$CustomActionResultReceiver);
            if (read3 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                read2.MediaBrowserCompat$ItemReceiver.onError(read3);
            }
        } else if (read2.IconCompatParcelizer) {
            read2.MediaBrowserCompat$ItemReceiver.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(read2.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public final void onComplete() {
        lambda$setOnClickFloatingButton$1$NTBLandingActivity.read<?> read2 = this.read;
        if (read2.read.compareAndSet(this, (Object) null) && read2.IconCompatParcelizer) {
            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(read2.MediaBrowserCompat$CustomActionResultReceiver);
            if (read3 == null) {
                read2.MediaBrowserCompat$ItemReceiver.onComplete();
            } else {
                read2.MediaBrowserCompat$ItemReceiver.onError(read3);
            }
        }
    }
}
