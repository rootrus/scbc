package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.additionaldocument.C5561xfdfcc7cf;
import p040o.Api;
import p040o.ServerProjectProvider;
import p040o.nativeIsGuidanceAvailable;

/* renamed from: o.onSecondaryPointerUp */
public final class onSecondaryPointerUp implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C70673> {
    private final HmlReviewDocumentActivity<Api.zab> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C5561xfdfcc7cf> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<areEdgesInView$MediaBrowserCompat$ItemReceiver> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<nativeIsGuidanceAvailable.read> read;
    private final HmlReviewDocumentActivity<zaj> write;

    private onSecondaryPointerUp(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5561xfdfcc7cf> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zaj> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Api.zab> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<nativeIsGuidanceAvailable.read> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<areEdgesInView$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.MediaMetadataCompat = hmlReviewDocumentActivity5;
    }

    public static onSecondaryPointerUp read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5561xfdfcc7cf> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zaj> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Api.zab> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<nativeIsGuidanceAvailable.read> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<areEdgesInView$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new onSecondaryPointerUp(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C70673 read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaMetadataCompat.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
