package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.NTBLandingActivity;

/* renamed from: o.NTBLandingActivity$write$MediaBrowserCompat$CustomActionResultReceiver */
final class C9788xec6101f2<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BaseChangePinWithMaxActivity_ViewBinding<R> {
    private NTBLandingActivity.write<?, R> IconCompatParcelizer;

    C9788xec6101f2(NTBLandingActivity.write<?, R> write) {
        this.IconCompatParcelizer = write;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
        NTBLandingActivity.write<?, R> write = this.IconCompatParcelizer;
        write.MediaBrowserCompat$CustomActionResultReceiver = r;
        write.write = 2;
        write.read();
    }

    public final void onError(Throwable th) {
        NTBLandingActivity.write<?, R> write = this.IconCompatParcelizer;
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(write.MediaBrowserCompat$ItemReceiver, th)) {
            if (write.IconCompatParcelizer != HmlBusinessOccupationInfoActivity.END) {
                write.read.dispose();
            }
            write.write = 0;
            write.read();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        NTBLandingActivity.write<?, R> write = this.IconCompatParcelizer;
        write.write = 0;
        write.read();
    }
}
