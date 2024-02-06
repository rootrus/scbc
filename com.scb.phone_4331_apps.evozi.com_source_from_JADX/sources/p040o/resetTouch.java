package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.zzge;

/* renamed from: o.resetTouch */
public final class resetTouch implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindBaseInvestmentSuccessFragment> {
    private final HmlReviewDocumentActivity<zzge.zzk> IconCompatParcelizer;
    private final RepositoryModule write;

    private resetTouch(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzk> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static resetTouch MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzk> hmlReviewDocumentActivity) {
        return new resetTouch(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindBaseInvestmentSuccessFragment IconCompatParcelizer2 = this.write.IconCompatParcelizer(this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
