package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzqy */
public final class zzqy implements OPRStatusRewardsLandingActivity_ViewBinding<logEventNoInterceptor> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzqy(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
    }

    public static zzqy read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        return new zzqy(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        logEventNoInterceptor IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
