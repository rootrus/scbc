package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;

/* renamed from: o.setPivotY */
public final class setPivotY implements OPRStatusRewardsLandingActivity_ViewBinding<IdRegion> {
    private final HmlReviewDocumentActivity<DurationEmploymentForBusinessDialog.read> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private setPivotY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<DurationEmploymentForBusinessDialog.read> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setPivotY write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<DurationEmploymentForBusinessDialog.read> hmlReviewDocumentActivity) {
        return new setPivotY(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        IdRegion write = this.read.write(this.MediaBrowserCompat$ItemReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
