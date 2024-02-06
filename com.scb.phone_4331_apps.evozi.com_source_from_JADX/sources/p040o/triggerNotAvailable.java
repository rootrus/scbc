package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.hml.HmlBusinessOwnerService;

/* renamed from: o.triggerNotAvailable */
public final class triggerNotAvailable implements OPRStatusRewardsLandingActivity_ViewBinding<HmlBusinessOwnerService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private triggerNotAvailable(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static triggerNotAvailable write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new triggerNotAvailable(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        HmlBusinessOwnerService AppCompatDialogFragment = this.MediaBrowserCompat$ItemReceiver.AppCompatDialogFragment(this.read.get());
        if (AppCompatDialogFragment != null) {
            return AppCompatDialogFragment;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
