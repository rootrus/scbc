package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.sortChildDrawingOrder */
public final class sortChildDrawingOrder implements OPRStatusRewardsLandingActivity_ViewBinding<HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindTransferInputAmountFragment> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;

    private sortChildDrawingOrder(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindTransferInputAmountFragment> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static sortChildDrawingOrder MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindTransferInputAmountFragment> hmlReviewDocumentActivity) {
        return new sortChildDrawingOrder(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver read = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
