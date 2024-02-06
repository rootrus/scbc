package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.FastPayService;

/* renamed from: o.getGetServiceRequestExtraArgs */
public final class getGetServiceRequestExtraArgs implements OPRStatusRewardsLandingActivity_ViewBinding<FastPayService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;

    private getGetServiceRequestExtraArgs(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getGetServiceRequestExtraArgs MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getGetServiceRequestExtraArgs(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FastPayService PlaybackStateCompat$CustomAction = this.IconCompatParcelizer.PlaybackStateCompat$CustomAction(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (PlaybackStateCompat$CustomAction != null) {
            return PlaybackStateCompat$CustomAction;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
