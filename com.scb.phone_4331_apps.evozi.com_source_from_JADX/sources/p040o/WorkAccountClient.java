package p040o;

/* renamed from: o.WorkAccountClient */
public final class WorkAccountClient implements OPRStatusRewardsLandingActivity_ViewBinding<synchronizedMultimap$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindUnlinkAccountFragment> read;

    private WorkAccountClient(HmlReviewDocumentActivity<FragmentBuilder_BindUnlinkAccountFragment> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static WorkAccountClient MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<FragmentBuilder_BindUnlinkAccountFragment> hmlReviewDocumentActivity) {
        return new WorkAccountClient(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new synchronizedMultimap$MediaBrowserCompat$ItemReceiver(this.read.get());
    }
}
