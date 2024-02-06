package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.ThirdPartyWebActivity;

/* renamed from: o.arrowScroll */
public final class arrowScroll implements OPRStatusRewardsLandingActivity_ViewBinding<addToMap> {
    private final HmlReviewDocumentActivity<ThirdPartyWebActivity.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule write;

    private arrowScroll(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ThirdPartyWebActivity.IconCompatParcelizer> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static arrowScroll write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ThirdPartyWebActivity.IconCompatParcelizer> hmlReviewDocumentActivity) {
        return new arrowScroll(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        addToMap read = this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
