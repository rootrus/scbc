package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.CcSofHybridActivity_ViewBinding;

/* renamed from: o.zzqr */
public final class zzqr implements OPRStatusRewardsLandingActivity_ViewBinding<doGoAsync> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<include> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CcSofHybridActivity_ViewBinding.read> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> RatingCompat;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzqr(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CcSofHybridActivity_ViewBinding.read> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<include> hmlReviewDocumentActivity5) {
        this.IconCompatParcelizer = useCaseModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
    }

    public static zzqr read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CcSofHybridActivity_ViewBinding.read> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<include> hmlReviewDocumentActivity5) {
        return new zzqr(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        doGoAsync IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.RatingCompat.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
