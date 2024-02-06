package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.FinalizableReferenceQueue;
import p040o.LocalProjectProvider;

/* renamed from: o.zzoi */
public final class zzoi implements OPRStatusRewardsLandingActivity_ViewBinding<FinalizableReferenceQueue.DirectLoader> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69386> write;

    private zzoi(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity3) {
        this.read = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzoi IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity3) {
        return new zzoi(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        FinalizableReferenceQueue.DirectLoader MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
