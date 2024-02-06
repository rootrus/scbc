package p040o;

/* renamed from: o.isHeld */
public final class isHeld implements OPRStatusRewardsLandingActivity_ViewBinding<setReferenceCounted> {
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<ImageField> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private isHeld(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ImageField> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
    }

    public static isHeld MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ImageField> hmlReviewDocumentActivity4) {
        return new isHeld(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new setReferenceCounted(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
    }
}
