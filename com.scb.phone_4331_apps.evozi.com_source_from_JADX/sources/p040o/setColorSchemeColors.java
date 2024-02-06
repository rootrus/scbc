package p040o;

import com.scb.phone.data.network.service.ManageChequeService;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setColorSchemeColors */
public final class setColorSchemeColors implements OPRStatusRewardsLandingActivity_ViewBinding<sz$MediaBrowserCompat$ItemReceiver> {
    private final DataModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<ManageChequeService> read;

    private setColorSchemeColors(DataModule dataModule, HmlReviewDocumentActivity<ManageChequeService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static setColorSchemeColors MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule, HmlReviewDocumentActivity<ManageChequeService> hmlReviewDocumentActivity) {
        return new setColorSchemeColors(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        sz$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
