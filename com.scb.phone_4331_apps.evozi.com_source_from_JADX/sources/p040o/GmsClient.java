package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.PromptPayService;

/* renamed from: o.GmsClient */
public final class GmsClient implements OPRStatusRewardsLandingActivity_ViewBinding<PromptPayService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;

    private GmsClient(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static GmsClient MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new GmsClient(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PromptPayService activityChooserModel = this.IconCompatParcelizer.setActivityChooserModel(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (activityChooserModel != null) {
            return activityChooserModel;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
