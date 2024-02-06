package p040o;

import com.scb.phone.data.network.service.PartnerConsentService;
import com.scb.phone.view.activity.cardmanagement.BaseAmortizationActivity;

/* renamed from: o.zaco */
public final class zaco implements OPRStatusRewardsLandingActivity_ViewBinding<BaseAmortizationActivity.read> {
    private final HmlReviewDocumentActivity<PartnerConsentService> MediaBrowserCompat$ItemReceiver;

    private zaco(HmlReviewDocumentActivity<PartnerConsentService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zaco write(HmlReviewDocumentActivity<PartnerConsentService> hmlReviewDocumentActivity) {
        return new zaco(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new BaseAmortizationActivity.read(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
