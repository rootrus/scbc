package p040o;

import com.scb.phone.view.activity.loan.LoanPaymentReviewActivity;

/* renamed from: o.PaFaceDetectFrame */
public final class PaFaceDetectFrame implements MileageQuantitySelectionActivity<LoanPaymentReviewActivity> {
    public static void write(LoanPaymentReviewActivity loanPaymentReviewActivity, getSessionKey getsessionkey) {
        loanPaymentReviewActivity.loanPaymentReviewPresenter = getsessionkey;
    }
}
