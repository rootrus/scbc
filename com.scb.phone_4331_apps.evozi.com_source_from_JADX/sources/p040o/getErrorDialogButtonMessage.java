package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LimitService;

/* renamed from: o.getErrorDialogButtonMessage */
public final class getErrorDialogButtonMessage implements OPRStatusRewardsLandingActivity_ViewBinding<LimitService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getErrorDialogButtonMessage(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getErrorDialogButtonMessage MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getErrorDialogButtonMessage(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LimitService ActionMenuPresenter$OverflowMenuButton = this.MediaBrowserCompat$ItemReceiver.ActionMenuPresenter$OverflowMenuButton(this.read.get());
        if (ActionMenuPresenter$OverflowMenuButton != null) {
            return ActionMenuPresenter$OverflowMenuButton;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
