package p040o;

import com.scb.phone.data.network.p034di.prepaid.PrepaidServiceModule;
import com.scb.phone.data.network.service.prepaid.PrepaidRequestService;
import com.scb.phone.view.activity.hml.HmlBaseLoanReviewActivity;
import p040o.Iterables;

/* renamed from: o.v */
public final class C5442v implements OPRStatusRewardsLandingActivity_ViewBinding<PrepaidRequestService> {
    private final PrepaidServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private C5442v(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static C5442v MediaBrowserCompat$CustomActionResultReceiver(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new C5442v(prepaidServiceModule, hmlReviewDocumentActivity);
    }

    /* renamed from: o.v$a */
    public final class C5444a<T extends addImage> implements MileageQuantitySelectionActivity<HmlBaseLoanReviewActivity<T>> {
        public static <T extends addImage> void IconCompatParcelizer(HmlBaseLoanReviewActivity<T> hmlBaseLoanReviewActivity, T t) {
            hmlBaseLoanReviewActivity.hmlLoanReviewPresenter = t;
        }

        public static <T extends addImage> void IconCompatParcelizer(HmlBaseLoanReviewActivity<T> hmlBaseLoanReviewActivity, Iterables.C351911 r1) {
            hmlBaseLoanReviewActivity.itemFactory = r1;
        }
    }

    public final /* synthetic */ Object get() {
        PrepaidRequestService MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
