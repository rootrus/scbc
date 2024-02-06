package p040o;

import com.scb.phone.data.network.service.CloseAccountService;
import p040o.C4310dy;

/* renamed from: o.zabq */
public final class zabq implements OPRStatusRewardsLandingActivity_ViewBinding<C4310dy.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<CloseAccountService> MediaBrowserCompat$ItemReceiver;

    private zabq(HmlReviewDocumentActivity<CloseAccountService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zabq read(HmlReviewDocumentActivity<CloseAccountService> hmlReviewDocumentActivity) {
        return new zabq(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4310dy.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
