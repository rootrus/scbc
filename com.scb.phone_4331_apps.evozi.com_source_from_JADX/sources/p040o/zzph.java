package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzph */
public final class zzph implements OPRStatusRewardsLandingActivity_ViewBinding<whenAll> {
    private final HmlReviewDocumentActivity<getAncestor> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> RatingCompat;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<ServerProjectProvider> write;

    private zzph(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity5) {
        this.read = useCaseModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
    }

    public static zzph read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity5) {
        return new zzph(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        whenAll IconCompatParcelizer2 = this.read.IconCompatParcelizer(this.RatingCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
