package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzmh */
public final class zzmh implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMapBasedMultiset> {
    private final HmlReviewDocumentActivity<getRegionName> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private zzmh(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getRegionName> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zzmh IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getRegionName> hmlReviewDocumentActivity3) {
        return new zzmh(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractMapBasedMultiset read = this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
