package p040o;

import com.scb.phone.view.activity.investment.assessment.RiskLevelAssessmentActivity;

/* renamed from: o.setZoomEnabled */
public final class setZoomEnabled implements MileageQuantitySelectionActivity<RiskLevelAssessmentActivity> {
    public static void read(RiskLevelAssessmentActivity riskLevelAssessmentActivity, SendImage sendImage) {
        riskLevelAssessmentActivity.presenter = sendImage;
    }
}
