package p040o;

import android.content.SharedPreferences;

/* renamed from: o.getX */
public final class getX implements OPRStatusRewardsLandingActivity_ViewBinding<Short4> {
    private final HmlReviewDocumentActivity<SharedPreferences> write;

    private getX(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static getX write(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new getX(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new Short4(this.write.get());
    }
}
