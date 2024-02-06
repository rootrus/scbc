package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.GoogleSigninService;

/* renamed from: o.triggerConnectionSuspended */
public final class triggerConnectionSuspended implements OPRStatusRewardsLandingActivity_ViewBinding<GoogleSigninService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private triggerConnectionSuspended(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static triggerConnectionSuspended IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new triggerConnectionSuspended(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        GoogleSigninService AppCompatActivity = this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity(this.read.get());
        if (AppCompatActivity != null) {
            return AppCompatActivity;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
