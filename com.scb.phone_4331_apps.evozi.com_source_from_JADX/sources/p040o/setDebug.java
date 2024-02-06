package p040o;

import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerReviewSubmissionActivity;

/* renamed from: o.setDebug */
public final class setDebug implements MileageQuantitySelectionActivity<HmlBusinessOwnerReviewSubmissionActivity> {
    public static void read(HmlBusinessOwnerReviewSubmissionActivity hmlBusinessOwnerReviewSubmissionActivity, WebServiceCallResult webServiceCallResult) {
        hmlBusinessOwnerReviewSubmissionActivity.presenter = webServiceCallResult;
    }
}
