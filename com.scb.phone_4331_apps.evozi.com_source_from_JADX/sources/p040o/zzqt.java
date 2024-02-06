package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Finalizer;

/* renamed from: o.zzqt */
public final class zzqt implements OPRStatusRewardsLandingActivity_ViewBinding<Finalizer.ShutDown> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzqt(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zzqt MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3) {
        return new zzqt(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Finalizer.ShutDown MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.mo13500x50fd9e4a(this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
