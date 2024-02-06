package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.getModelName */
public final class getModelName implements OPRStatusRewardsLandingActivity_ViewBinding<orientation> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a> write;

    private getModelName(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static getModelName write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a> hmlReviewDocumentActivity3) {
        return new getModelName(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        orientation IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
