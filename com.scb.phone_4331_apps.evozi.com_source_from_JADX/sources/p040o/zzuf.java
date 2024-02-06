package p040o;

import com.scb.phone.domain.p036di.prepaid.traveltab.PrepaidTravelCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzuf */
public final class zzuf implements OPRStatusRewardsLandingActivity_ViewBinding<badPositionIndexes> {
    private final PrepaidTravelCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzuf(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = prepaidTravelCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzuf read(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        return new zzuf(prepaidTravelCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        badPositionIndexes MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
