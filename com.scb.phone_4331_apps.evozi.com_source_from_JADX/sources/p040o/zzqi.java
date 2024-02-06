package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzqi */
public final class zzqi implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractBiMap> {
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzqi(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zzqi read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        return new zzqi(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractBiMap MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper(this.read.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaSessionCompat$ResultReceiverWrapper != null) {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
