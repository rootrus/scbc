package p040o;

import com.scb.phone.data.network.service.ISprintService;
import p040o.C4998nC;

/* renamed from: o.zacg */
public final class zacg implements OPRStatusRewardsLandingActivity_ViewBinding<C4998nC.read> {
    private final HmlReviewDocumentActivity<ISprintService> MediaBrowserCompat$ItemReceiver;

    private zacg(HmlReviewDocumentActivity<ISprintService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zacg IconCompatParcelizer(HmlReviewDocumentActivity<ISprintService> hmlReviewDocumentActivity) {
        return new zacg(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4998nC.read(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
