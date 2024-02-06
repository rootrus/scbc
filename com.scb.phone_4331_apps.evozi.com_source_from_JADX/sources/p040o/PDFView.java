package p040o;

import com.scb.phone.view.activity.hml.HmlSelectedOfferReviewActivity;
import p040o.Iterables;

/* renamed from: o.PDFView */
public final class PDFView implements MileageQuantitySelectionActivity<HmlSelectedOfferReviewActivity> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity, getPersonalShortCuts getpersonalshortcuts) {
        hmlSelectedOfferReviewActivity.selectedOfferReviewPresenter = getpersonalshortcuts;
    }

    public static void IconCompatParcelizer(HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity, Iterables.C351911.C35201 r1) {
        hmlSelectedOfferReviewActivity.itemFactory = r1;
    }
}
