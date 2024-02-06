package p040o;

import com.scb.phone.view.fragment.closeaccount.CloseAccountReviewFragment;

/* renamed from: o.TopUpService */
public final class TopUpService implements MileageQuantitySelectionActivity<CloseAccountReviewFragment> {
    public static void read(CloseAccountReviewFragment closeAccountReviewFragment, getBoundFields getboundfields) {
        closeAccountReviewFragment.presenter = getboundfields;
    }
}
