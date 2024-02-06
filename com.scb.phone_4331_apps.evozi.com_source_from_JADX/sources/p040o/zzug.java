package p040o;

import com.scb.phone.domain.p036di.prepaid.traveltab.PrepaidTravelCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzug */
public final class zzug implements OPRStatusRewardsLandingActivity_ViewBinding<checkPositionIndexes> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final PrepaidTravelCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> write;

    private zzug(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzug MediaBrowserCompat$CustomActionResultReceiver(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        return new zzug(prepaidTravelCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        checkPositionIndexes write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
