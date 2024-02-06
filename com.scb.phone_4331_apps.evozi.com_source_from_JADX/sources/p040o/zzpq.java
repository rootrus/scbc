package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzpq */
public final class zzpq implements OPRStatusRewardsLandingActivity_ViewBinding<forMap> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindBaseInvestmentSuccessFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzpq(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindBaseInvestmentSuccessFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static zzpq MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindBaseInvestmentSuccessFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4) {
        return new zzpq(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        forMap IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
