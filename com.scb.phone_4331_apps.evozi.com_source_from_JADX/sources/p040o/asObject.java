package p040o;

/* renamed from: o.asObject */
public final class asObject implements OPRStatusRewardsLandingActivity_ViewBinding<LifecycleActivity> {
    private final HmlReviewDocumentActivity<IStatusCallback> read;

    private asObject(HmlReviewDocumentActivity<IStatusCallback> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static asObject write(HmlReviewDocumentActivity<IStatusCallback> hmlReviewDocumentActivity) {
        return new asObject(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new LifecycleActivity(this.read.get());
    }
}
