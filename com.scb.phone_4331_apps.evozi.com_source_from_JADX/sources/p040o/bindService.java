package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashMCMCDetailService;

/* renamed from: o.bindService */
public final class bindService implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashMCMCDetailService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final EasycashServiceModule write;

    private bindService(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = easycashServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static bindService MediaBrowserCompat$ItemReceiver(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new bindService(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashMCMCDetailService MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
