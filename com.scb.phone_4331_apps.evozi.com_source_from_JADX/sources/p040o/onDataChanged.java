package p040o;

import com.scb.phone.data.network.service.EkycService;
import com.scb.phone.data.network.service.hml.HmlConsentService;
import com.scb.phone.data.network.service.hml.HmlDocumentUploadService;
import com.scb.phone.data.network.service.hml.HmlService;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;

/* renamed from: o.onDataChanged */
public final class onDataChanged implements OPRStatusRewardsLandingActivity_ViewBinding<BaseDiscoverSearchActivity.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<HmlService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<EkycService> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<HmlDocumentUploadService> read;
    private final HmlReviewDocumentActivity<HmlConsentService> write;

    private onDataChanged(HmlReviewDocumentActivity<HmlService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlConsentService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EkycService> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<HmlDocumentUploadService> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
    }

    public static onDataChanged MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<HmlService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlConsentService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EkycService> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<HmlDocumentUploadService> hmlReviewDocumentActivity4) {
        return new onDataChanged(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new BaseDiscoverSearchActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
    }
}
