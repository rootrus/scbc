package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.ServerProjectProvider;

/* renamed from: o.zzpk */
public final class zzpk implements OPRStatusRewardsLandingActivity_ViewBinding<getUserPropertiesAs> {
    private final HmlReviewDocumentActivity<getAncestor> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<ServerProjectProvider.C70695> write;

    private zzpk(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C70695> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
    }

    public static zzpk read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C70695> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity4) {
        return new zzpk(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        getUserPropertiesAs MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
