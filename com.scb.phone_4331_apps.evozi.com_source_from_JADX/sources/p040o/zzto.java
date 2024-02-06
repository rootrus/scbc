package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashCommercialInfoCaseModule;
import p040o.MultiProcessor;

/* renamed from: o.zzto */
public final class zzto implements OPRStatusRewardsLandingActivity_ViewBinding<MultiProcessor.Builder> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<tailMap> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashCommercialInfoCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    private zzto(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashCommercialInfoCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzto IconCompatParcelizer(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
        return new zzto(easycashCommercialInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        MultiProcessor.Builder IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
