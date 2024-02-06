package p040o;

import com.scb.phone.view.fragment.directdebit.DirectDebitReviewFragment;
import p040o.Iterables;

/* renamed from: o.HmlService */
public final class HmlService implements MileageQuantitySelectionActivity<DirectDebitReviewFragment> {
    public static void MediaBrowserCompat$ItemReceiver(DirectDebitReviewFragment directDebitReviewFragment, XVrsMultiDetector xVrsMultiDetector) {
        directDebitReviewFragment.presenter = xVrsMultiDetector;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(DirectDebitReviewFragment directDebitReviewFragment, Iterables.C352414 r1) {
        directDebitReviewFragment.componentFactory = r1;
    }
}
