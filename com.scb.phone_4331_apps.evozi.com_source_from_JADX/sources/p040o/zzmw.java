package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zzmw */
public final class zzmw implements OPRStatusRewardsLandingActivity_ViewBinding<setMode> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<C7515tZ> read;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69353> write;

    private zzmw(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<LocalProjectProvider.C69353> hmlReviewDocumentActivity6) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
    }

    public static zzmw MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<LocalProjectProvider.C69353> hmlReviewDocumentActivity6) {
        return new zzmw(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        setMode read2 = this.IconCompatParcelizer.read(this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
