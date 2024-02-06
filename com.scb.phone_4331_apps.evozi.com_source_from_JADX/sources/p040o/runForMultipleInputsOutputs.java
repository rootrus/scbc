package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.runForMultipleInputsOutputs */
public final class runForMultipleInputsOutputs implements OPRStatusRewardsLandingActivity_ViewBinding<logEventInternal> {
    private final HmlReviewDocumentActivity<LocalProjectProvider> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> read;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> write;

    private runForMultipleInputsOutputs(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
    }

    public static runForMultipleInputsOutputs read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new runForMultipleInputsOutputs(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        logEventInternal IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
