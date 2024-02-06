package p040o;

import android.content.Context;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.LocalProjectProvider;

/* renamed from: o.finishUpdate */
public final class finishUpdate implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider.C6939a> {
    private final HmlReviewDocumentActivity<Context> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule write;

    private finishUpdate(RepositoryModule repositoryModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static finishUpdate MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new finishUpdate(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider.C6939a IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
