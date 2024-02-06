package p040o;

/* renamed from: o.Ascii */
public final class Ascii implements OPRStatusRewardsLandingActivity_ViewBinding<isLowerCase> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<removeIfEmpty> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private Ascii(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3) {
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static Ascii IconCompatParcelizer(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3) {
        return new Ascii(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new isLowerCase(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
    }
}
