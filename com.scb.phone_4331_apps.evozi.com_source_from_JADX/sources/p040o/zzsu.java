package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.ServerProjectProvider;

/* renamed from: o.zzsu */
public final class zzsu implements OPRStatusRewardsLandingActivity_ViewBinding<FinalizableWeakReference> {
    private final HmlReviewDocumentActivity<ServerProjectProvider.C706515> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final UseCaseModule write;

    private zzsu(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zzsu write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        return new zzsu(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        FinalizableWeakReference MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
