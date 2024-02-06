package p040o;

import p040o.ContactUsActivity;
import p040o.getDocumentRectangle;

/* renamed from: o.getStatusCode */
public final class getStatusCode implements OPRStatusRewardsLandingActivity_ViewBinding<getDocumentRectangle.write> {
    private final HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar> IconCompatParcelizer;

    private getStatusCode(HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getStatusCode write(HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar> hmlReviewDocumentActivity) {
        return new getStatusCode(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getDocumentRectangle.write(this.IconCompatParcelizer.get());
    }
}
