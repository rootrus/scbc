package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashLoanTrackService;

/* renamed from: o.unbindService */
public final class unbindService implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashLoanTrackService> {
    private final EasycashServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    private unbindService(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = easycashServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static unbindService IconCompatParcelizer(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new unbindService(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashLoanTrackService MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat(this.write.get());
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
