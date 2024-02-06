package p040o;

import com.scb.phone.data.network.service.FastPayService;
import p040o.getCityFieldName;

/* renamed from: o.zacb */
public final class zacb implements OPRStatusRewardsLandingActivity_ViewBinding<getCityFieldName.write> {
    private final HmlReviewDocumentActivity<FastPayService> MediaBrowserCompat$CustomActionResultReceiver;

    private zacb(HmlReviewDocumentActivity<FastPayService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static zacb write(HmlReviewDocumentActivity<FastPayService> hmlReviewDocumentActivity) {
        return new zacb(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getCityFieldName.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
