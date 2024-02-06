package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4299ds;

/* renamed from: o.getLocalMatrix */
public final class getLocalMatrix implements OPRStatusRewardsLandingActivity_ViewBinding<IIdImageProcessingListener> {
    private final HmlReviewDocumentActivity<C4299ds.write> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CaptureDocumentActivity_ViewBinding> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private getLocalMatrix(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4299ds.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CaptureDocumentActivity_ViewBinding> hmlReviewDocumentActivity2) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static getLocalMatrix MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4299ds.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CaptureDocumentActivity_ViewBinding> hmlReviewDocumentActivity2) {
        return new getLocalMatrix(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        IIdImageProcessingListener MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
