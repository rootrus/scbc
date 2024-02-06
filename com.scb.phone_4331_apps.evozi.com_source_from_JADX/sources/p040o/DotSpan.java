package p040o;

import com.scb.phone.view.activity.sme.gifting.GiftingMoneyReviewActivity;

/* renamed from: o.DotSpan */
public final class DotSpan implements MileageQuantitySelectionActivity<GiftingMoneyReviewActivity> {
    public static void write(GiftingMoneyReviewActivity giftingMoneyReviewActivity, showProgressBar showprogressbar) {
        giftingMoneyReviewActivity.giftingMoneyReviewPresenter = showprogressbar;
    }
}
