package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.ServerProjectProvider;

/* renamed from: o.zznk */
public final class zznk implements OPRStatusRewardsLandingActivity_ViewBinding<selectFocus> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ServerProjectProvider.C706515> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    private zznk(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zznk IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        return new zznk(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        selectFocus write = this.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
