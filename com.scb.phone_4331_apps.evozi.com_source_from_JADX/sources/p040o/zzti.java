package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashBusinessAndMaritalInfoCaseModule;

/* renamed from: o.zzti */
public final class zzti implements OPRStatusRewardsLandingActivity_ViewBinding<onMissing> {
    private final EasycashBusinessAndMaritalInfoCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<headMap> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzti(EasycashBusinessAndMaritalInfoCaseModule easycashBusinessAndMaritalInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headMap> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashBusinessAndMaritalInfoCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zzti MediaBrowserCompat$CustomActionResultReceiver(EasycashBusinessAndMaritalInfoCaseModule easycashBusinessAndMaritalInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headMap> hmlReviewDocumentActivity3) {
        return new zzti(easycashBusinessAndMaritalInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        onMissing read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.write.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
