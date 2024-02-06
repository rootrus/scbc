package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.getProcessName;

/* renamed from: o.setFillAlpha */
public final class setFillAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider_MembersInjector> {
    private final HmlReviewDocumentActivity<getProcessName.read> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getChimeraLifecycleFragmentImpl> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseDepositInputFragment> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private setFillAlpha(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getProcessName.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseDepositInputFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getChimeraLifecycleFragmentImpl> hmlReviewDocumentActivity3) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static setFillAlpha read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getProcessName.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseDepositInputFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getChimeraLifecycleFragmentImpl> hmlReviewDocumentActivity3) {
        return new setFillAlpha(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider_MembersInjector read2 = this.read.read(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
