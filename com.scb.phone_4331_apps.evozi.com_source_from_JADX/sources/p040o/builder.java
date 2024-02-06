package p040o;

import p040o.HintRequest;

/* renamed from: o.builder */
public final class builder implements OPRStatusRewardsLandingActivity_ViewBinding<HintRequest.Builder> {
    private final HmlReviewDocumentActivity<enableUsingApkIndependentContext> MediaBrowserCompat$CustomActionResultReceiver;

    private builder(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static builder IconCompatParcelizer(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity) {
        return new builder(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HintRequest.Builder(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
