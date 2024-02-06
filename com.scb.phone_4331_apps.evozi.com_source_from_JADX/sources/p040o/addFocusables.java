package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.onPause;

/* renamed from: o.addFocusables */
public final class addFocusables implements OPRStatusRewardsLandingActivity_ViewBinding<onPause.read> {
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleWeeklyFragment> write;

    private addFocusables(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleWeeklyFragment> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static addFocusables read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleWeeklyFragment> hmlReviewDocumentActivity) {
        return new addFocusables(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        onPause.read read = this.MediaBrowserCompat$ItemReceiver.read(this.write.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
