package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.CheckCaptureModule;

/* renamed from: o.endDrag */
public final class endDrag implements OPRStatusRewardsLandingActivity_ViewBinding<newOnDeviceIdExtractor> {
    private final HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer.write> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindTakePhotoFragment> read;
    private final RepositoryModule write;

    private endDrag(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindTakePhotoFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static endDrag IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindTakePhotoFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        return new endDrag(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        newOnDeviceIdExtractor write2 = this.write.write(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
