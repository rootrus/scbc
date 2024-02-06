package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.ServerProjectProvider;
import p040o.notNull;

/* renamed from: o.getTranslateX */
public final class getTranslateX implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C706515> {
    private final HmlReviewDocumentActivity<zak> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<notNull.read> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> read;
    private final HmlReviewDocumentActivity<eH$MediaBrowserCompat$CustomActionResultReceiver> write;

    private getTranslateX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<eH$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zak> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<notNull.read> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
    }

    public static getTranslateX write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<eH$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zak> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<notNull.read> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity4) {
        return new getTranslateX(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C706515 MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
