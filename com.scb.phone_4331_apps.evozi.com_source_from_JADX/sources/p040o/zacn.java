package p040o;

import com.scb.phone.data.network.service.MobileNumberService;
import p040o.CheckCaptureModule;

/* renamed from: o.zacn */
public final class zacn implements OPRStatusRewardsLandingActivity_ViewBinding<CheckCaptureModule.KtaExceptionResponseDeserializer.write> {
    private final HmlReviewDocumentActivity<MobileNumberService> MediaBrowserCompat$CustomActionResultReceiver;

    private zacn(HmlReviewDocumentActivity<MobileNumberService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static zacn MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<MobileNumberService> hmlReviewDocumentActivity) {
        return new zacn(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new CheckCaptureModule.KtaExceptionResponseDeserializer.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
