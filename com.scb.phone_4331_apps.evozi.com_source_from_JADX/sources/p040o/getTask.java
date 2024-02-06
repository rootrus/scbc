package p040o;

import com.scb.phone.data.network.service.DeviceService;
import p040o.C4768hj;

/* renamed from: o.getTask */
public final class getTask implements OPRStatusRewardsLandingActivity_ViewBinding<C4768hj.write> {
    private final HmlReviewDocumentActivity<DeviceService> MediaBrowserCompat$ItemReceiver;

    private getTask(HmlReviewDocumentActivity<DeviceService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getTask IconCompatParcelizer(HmlReviewDocumentActivity<DeviceService> hmlReviewDocumentActivity) {
        return new getTask(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4768hj.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
