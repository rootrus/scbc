package p040o;

import com.scb.phone.domain.p036di.prepaid.traveltab.PrepaidTravelCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzrl */
public final class zzrl implements OPRStatusRewardsLandingActivity_ViewBinding<badElementIndex> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final PrepaidTravelCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> write;

    private zzrl(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzrl IconCompatParcelizer(PrepaidTravelCaseModule prepaidTravelCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.WrappedSortedSet> hmlReviewDocumentActivity3) {
        return new zzrl(prepaidTravelCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        badElementIndex IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
