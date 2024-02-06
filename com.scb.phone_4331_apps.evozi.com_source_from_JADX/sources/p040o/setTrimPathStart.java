package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.ManageRecipientGroupActivity;

/* renamed from: o.setTrimPathStart */
public final class setTrimPathStart implements OPRStatusRewardsLandingActivity_ViewBinding<elementSet> {
    private final HmlReviewDocumentActivity<ManageRecipientGroupActivity.write> IconCompatParcelizer;
    private final RepositoryModule write;

    private setTrimPathStart(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ManageRecipientGroupActivity.write> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static setTrimPathStart MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ManageRecipientGroupActivity.write> hmlReviewDocumentActivity) {
        return new setTrimPathStart(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        elementSet read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
