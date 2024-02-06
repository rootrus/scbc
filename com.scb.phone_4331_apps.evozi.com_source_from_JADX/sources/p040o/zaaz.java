package p040o;

import com.scb.phone.data.network.service.BondService;
import com.scb.phone.data.network.service.BondTermsAndConditionsService;
import p040o.TaskRunner;

/* renamed from: o.zaaz */
public final class zaaz implements OPRStatusRewardsLandingActivity_ViewBinding<TaskRunner.TaskCompletedListener.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<BondTermsAndConditionsService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<BondService> MediaBrowserCompat$ItemReceiver;

    private zaaz(HmlReviewDocumentActivity<BondService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<BondTermsAndConditionsService> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static zaaz read(HmlReviewDocumentActivity<BondService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<BondTermsAndConditionsService> hmlReviewDocumentActivity2) {
        return new zaaz(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new TaskRunner.TaskCompletedListener.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
