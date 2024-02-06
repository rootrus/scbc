package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Splitter;

/* renamed from: o.zztk */
public final class zztk implements OPRStatusRewardsLandingActivity_ViewBinding<Splitter.C38135> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zztk(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zztk MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity3) {
        return new zztk(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Splitter.C38135 IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.IconCompatParcelizer.get(), this.write.get(), this.read.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
