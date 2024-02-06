package p040o;

import com.scb.phone.data.network.service.ProfileService;

/* renamed from: o.zacl */
public final class zacl implements OPRStatusRewardsLandingActivity_ViewBinding<CheckCaptureModule> {
    private final HmlReviewDocumentActivity<ProfileService> write;

    private zacl(HmlReviewDocumentActivity<ProfileService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zacl read(HmlReviewDocumentActivity<ProfileService> hmlReviewDocumentActivity) {
        return new zacl(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new CheckCaptureModule(this.write.get());
    }
}
