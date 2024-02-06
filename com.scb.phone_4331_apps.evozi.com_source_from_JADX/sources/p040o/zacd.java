package p040o;

import com.scb.phone.data.network.service.EkycService;
import p040o.getAddress1FieldName;

/* renamed from: o.zacd */
public final class zacd implements OPRStatusRewardsLandingActivity_ViewBinding<getAddress1FieldName.read> {
    private final HmlReviewDocumentActivity<EkycService> IconCompatParcelizer;

    private zacd(HmlReviewDocumentActivity<EkycService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zacd MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<EkycService> hmlReviewDocumentActivity) {
        return new zacd(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getAddress1FieldName.read(this.IconCompatParcelizer.get());
    }
}
