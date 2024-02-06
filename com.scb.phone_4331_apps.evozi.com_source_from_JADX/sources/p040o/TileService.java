package p040o;

import com.scb.phone.view.fragment.chubb.review.ChubbReviewFragment;
import p040o.LinkedTreeMap;

/* renamed from: o.TileService */
public final class TileService implements MileageQuantitySelectionActivity<ChubbReviewFragment> {
    public static void MediaBrowserCompat$ItemReceiver(ChubbReviewFragment chubbReviewFragment, LinkedTreeMap.LinkedTreeMapIterator linkedTreeMapIterator) {
        chubbReviewFragment.chubbReviewPresenter = linkedTreeMapIterator;
    }
}
