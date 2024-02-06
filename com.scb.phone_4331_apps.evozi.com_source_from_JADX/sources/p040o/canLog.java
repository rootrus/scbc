package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashMCMCService;

/* renamed from: o.canLog */
public final class canLog implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashMCMCService> {
    private final EasycashServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    private canLog(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = easycashServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static canLog write(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new canLog(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashMCMCService MediaSessionCompat$Token = this.IconCompatParcelizer.MediaSessionCompat$Token(this.write.get());
        if (MediaSessionCompat$Token != null) {
            return MediaSessionCompat$Token;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
