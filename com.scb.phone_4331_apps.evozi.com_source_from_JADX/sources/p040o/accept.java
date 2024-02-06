package p040o;

import p040o.RegistrationMethods;

/* renamed from: o.accept */
public final class accept implements OPRStatusRewardsLandingActivity_ViewBinding<withHolder> {
    private final HmlReviewDocumentActivity<RegistrationMethods.Builder> MediaBrowserCompat$ItemReceiver;

    private accept(HmlReviewDocumentActivity<RegistrationMethods.Builder> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static accept read(HmlReviewDocumentActivity<RegistrationMethods.Builder> hmlReviewDocumentActivity) {
        return new accept(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new withHolder(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
