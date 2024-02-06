package p040o;

import android.content.Context;

/* renamed from: o.zzmb */
public final class zzmb implements OPRStatusRewardsLandingActivity_ViewBinding<HmlSensitiveConsentActivity> {
    private final HmlReviewDocumentActivity<Context> write;

    private zzmb(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zzmb write(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new zzmb(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlSensitiveConsentActivity(this.write.get());
    }
}
