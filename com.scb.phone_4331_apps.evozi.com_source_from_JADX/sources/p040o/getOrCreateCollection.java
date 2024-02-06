package p040o;

/* renamed from: o.getOrCreateCollection */
public final class getOrCreateCollection implements OPRStatusRewardsLandingActivity_ViewBinding<iteratorOrListIterator> {
    private final HmlReviewDocumentActivity<classificationConfidence> write;

    private getOrCreateCollection(HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static getOrCreateCollection MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity) {
        return new getOrCreateCollection(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new iteratorOrListIterator(this.write.get());
    }
}
