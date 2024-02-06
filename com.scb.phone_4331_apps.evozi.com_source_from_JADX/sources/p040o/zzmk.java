package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zzmk */
public final class zzmk implements OPRStatusRewardsLandingActivity_ViewBinding<C10858rotation> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69331> write;

    private zzmk(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69331> hmlReviewDocumentActivity3) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzmk IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69331> hmlReviewDocumentActivity3) {
        return new zzmk(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        C10858rotation MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
