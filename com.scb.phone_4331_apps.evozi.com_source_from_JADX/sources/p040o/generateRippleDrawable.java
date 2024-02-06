package p040o;

import android.content.Context;

/* renamed from: o.generateRippleDrawable */
public final class generateRippleDrawable implements OPRStatusRewardsLandingActivity_ViewBinding<regenerateBackground> {
    private final HmlReviewDocumentActivity<Context> IconCompatParcelizer;

    private generateRippleDrawable(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static generateRippleDrawable write(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new generateRippleDrawable(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new regenerateBackground(this.IconCompatParcelizer.get());
    }
}
