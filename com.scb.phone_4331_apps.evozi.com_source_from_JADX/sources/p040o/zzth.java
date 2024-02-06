package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashBusinessAndMaritalInfoCaseModule;

/* renamed from: o.zzth */
public final class zzth implements OPRStatusRewardsLandingActivity_ViewBinding<onNewItem> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashBusinessAndMaritalInfoCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<headMap> read;

    private zzth(EasycashBusinessAndMaritalInfoCaseModule easycashBusinessAndMaritalInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headMap> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashBusinessAndMaritalInfoCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzth IconCompatParcelizer(EasycashBusinessAndMaritalInfoCaseModule easycashBusinessAndMaritalInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headMap> hmlReviewDocumentActivity3) {
        return new zzth(easycashBusinessAndMaritalInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        onNewItem MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
