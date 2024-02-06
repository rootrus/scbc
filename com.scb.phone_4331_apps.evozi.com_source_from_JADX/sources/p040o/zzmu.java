package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zzmu */
public final class zzmu implements OPRStatusRewardsLandingActivity_ViewBinding<setAutoFocusEnabled> {
    private final HmlReviewDocumentActivity<refreshIfEmpty> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> RatingCompat;
    private final HmlReviewDocumentActivity<getAncestor> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzmu(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
    }

    public static zzmu IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity6) {
        return new zzmu(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        setAutoFocusEnabled IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.read.get(), this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
