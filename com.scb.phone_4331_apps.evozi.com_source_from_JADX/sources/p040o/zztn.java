package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashCommercialInfoCaseModule;
import p040o.MultiProcessor;

/* renamed from: o.zztn */
public final class zztn implements OPRStatusRewardsLandingActivity_ViewBinding<MultiProcessor.Factory> {
    private final HmlReviewDocumentActivity<tailMap> IconCompatParcelizer;
    private final EasycashCommercialInfoCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zztn(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashCommercialInfoCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zztn read(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
        return new zztn(easycashCommercialInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        MultiProcessor.Factory MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
