package p040o;

import p040o.AbstractMapBasedMultiset;
import p040o.AbstractMultimap;

/* renamed from: o.access$1300 */
public final class access$1300 implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMapBasedMultiset.EntrySet.C30061.C30071> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.Entries> write;

    private access$1300(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static access$1300 read(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity3) {
        return new access$1300(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2 = this.MediaBrowserCompat$ItemReceiver;
        this.write.get();
        return new IndoorBuilding(hmlReviewDocumentActivity.get(), hmlReviewDocumentActivity2.get()) {
        };
    }
}
