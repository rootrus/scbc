package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getChangingConfigurations */
public final class getChangingConfigurations implements OPRStatusRewardsLandingActivity_ViewBinding<getProjectAsync> {
    private final HmlReviewDocumentActivity<save> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindProductDetailFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;
    private final HmlReviewDocumentActivity<getHintPickerIntent> write;

    private getChangingConfigurations(RepositoryModule repositoryModule, HmlReviewDocumentActivity<IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindProductDetailFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<save> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getHintPickerIntent> hmlReviewDocumentActivity4) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static getChangingConfigurations write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindProductDetailFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<save> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getHintPickerIntent> hmlReviewDocumentActivity4) {
        return new getChangingConfigurations(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        getProjectAsync MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
