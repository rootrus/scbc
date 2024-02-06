package p040o;

import p040o.CredentialRequest;

/* renamed from: o.setCredentialPickerConfig */
public final class setCredentialPickerConfig implements OPRStatusRewardsLandingActivity_ViewBinding<setIdTokenNonce> {
    private final HmlReviewDocumentActivity<setShowCancelButton> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CredentialRequest.Builder> write;

    private setCredentialPickerConfig(HmlReviewDocumentActivity<CredentialRequest.Builder> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setShowCancelButton> hmlReviewDocumentActivity2) {
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
    }

    public static setCredentialPickerConfig write(HmlReviewDocumentActivity<CredentialRequest.Builder> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setShowCancelButton> hmlReviewDocumentActivity2) {
        return new setCredentialPickerConfig(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new setIdTokenNonce(this.write.get(), this.IconCompatParcelizer.get());
    }
}
