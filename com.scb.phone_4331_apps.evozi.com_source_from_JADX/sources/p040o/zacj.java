package p040o;

import com.scb.phone.data.network.service.NTBPinLoginService;
import com.scb.phone.service.SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.zacj */
public final class zacj implements OPRStatusRewardsLandingActivity_ViewBinding<SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<NTBPinLoginService> IconCompatParcelizer;

    private zacj(HmlReviewDocumentActivity<NTBPinLoginService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zacj IconCompatParcelizer(HmlReviewDocumentActivity<NTBPinLoginService> hmlReviewDocumentActivity) {
        return new zacj(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
    }
}
