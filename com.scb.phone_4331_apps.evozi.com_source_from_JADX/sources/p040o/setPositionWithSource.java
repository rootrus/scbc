package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;

/* renamed from: o.setPositionWithSource */
public final /* synthetic */ class setPositionWithSource implements DirectDebitDeepLinkActivity {
    public /* synthetic */ setPositionWithSource(FatcaQuestionnaireCase fatcaQuestionnaireCase) {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !"9100".equals(((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer)) {
            return DebitCardResetOtpActivity.error(th);
        }
        return DebitCardResetOtpActivity.error((Throwable) new FatcaQuestionnaireCase.FatcaVerificationCodeException());
    }
}
