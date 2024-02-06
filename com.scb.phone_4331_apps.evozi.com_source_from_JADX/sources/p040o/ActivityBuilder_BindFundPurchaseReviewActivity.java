package p040o;

import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment;
import p040o.LookAndFeelParameters;

/* renamed from: o.ActivityBuilder_BindFundPurchaseReviewActivity */
public final class ActivityBuilder_BindFundPurchaseReviewActivity implements MileageQuantitySelectionActivity<HmlBusinessOwnerSubmissionReviewStepTwoFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment, UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse) {
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.presenter = userLogoutResponse;
    }
}
