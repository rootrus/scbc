package p040o;

import android.content.SharedPreferences;
import p040o.Functions;

/* renamed from: o.getKernelID_Separate */
public final class getKernelID_Separate implements OPRStatusRewardsLandingActivity_ViewBinding<Functions.IdentityFunction.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<SharedPreferences> IconCompatParcelizer;

    private getKernelID_Separate(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getKernelID_Separate write(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new getKernelID_Separate(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new Functions.IdentityFunction.IconCompatParcelizer(this.IconCompatParcelizer.get());
    }
}
