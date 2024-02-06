package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashNcbConsentService;

/* renamed from: o.GmsLogger */
public final class GmsLogger implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashNcbConsentService> {
    private final EasycashServiceModule read;
    private final HmlReviewDocumentActivity<zaaa> write;

    private GmsLogger(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = easycashServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static GmsLogger read(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new GmsLogger(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashNcbConsentService MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.read.mo13328x50fd9e4a(this.write.get());
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
