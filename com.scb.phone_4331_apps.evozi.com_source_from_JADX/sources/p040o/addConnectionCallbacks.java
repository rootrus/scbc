package p040o;

/* renamed from: o.addConnectionCallbacks */
public final class addConnectionCallbacks implements OPRStatusRewardsLandingActivity_ViewBinding<addApi> {
    private final HmlReviewDocumentActivity<stopAutoManage> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setHandler> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<registerConnectionCallbacks> read;

    private addConnectionCallbacks(HmlReviewDocumentActivity<registerConnectionCallbacks> hmlReviewDocumentActivity, HmlReviewDocumentActivity<stopAutoManage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setHandler> hmlReviewDocumentActivity3) {
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static addConnectionCallbacks MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<registerConnectionCallbacks> hmlReviewDocumentActivity, HmlReviewDocumentActivity<stopAutoManage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setHandler> hmlReviewDocumentActivity3) {
        return new addConnectionCallbacks(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new addApi(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}
