package p040o;

import com.scb.phone.view.activity.transferandpay.topup.TopUpReviewActivity;

/* renamed from: o.setActiveAlpha */
public final class setActiveAlpha implements MileageQuantitySelectionActivity<TopUpReviewActivity> {
    public static void write(TopUpReviewActivity topUpReviewActivity, getProcessingParameters getprocessingparameters) {
        topUpReviewActivity.topUpReviewPresenter = getprocessingparameters;
    }
}
