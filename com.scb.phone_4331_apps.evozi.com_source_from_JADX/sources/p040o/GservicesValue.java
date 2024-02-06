package p040o;

import com.scb.phone.data.network.service.easycash.EasycashCardService;
import com.scb.phone.data.network.service.easycash.EasycashMCMCDetailService;
import com.scb.phone.view.activity.hml.HmlNTBCompanyNameActivity;
import com.scb.phone.view.activity.hml.promptpay.HmlPromptPayVerificationActivity;

/* renamed from: o.GservicesValue */
public final class GservicesValue implements OPRStatusRewardsLandingActivity_ViewBinding<HmlNTBCompanyNameActivity.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<EasycashCardService> write;

    /* renamed from: o.GservicesValue$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<HmlPromptPayVerificationActivity.read> {
        private final HmlReviewDocumentActivity<EasycashMCMCDetailService> write;

        private zza(HmlReviewDocumentActivity<EasycashMCMCDetailService> hmlReviewDocumentActivity) {
            this.write = hmlReviewDocumentActivity;
        }

        public static zza MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<EasycashMCMCDetailService> hmlReviewDocumentActivity) {
            return new zza(hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            return new HmlPromptPayVerificationActivity.read(this.write.get());
        }
    }

    private GservicesValue(HmlReviewDocumentActivity<EasycashCardService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static GservicesValue write(HmlReviewDocumentActivity<EasycashCardService> hmlReviewDocumentActivity) {
        return new GservicesValue(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlNTBCompanyNameActivity.IconCompatParcelizer(this.write.get());
    }
}
