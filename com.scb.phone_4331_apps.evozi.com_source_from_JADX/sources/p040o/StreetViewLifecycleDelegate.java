package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;

/* renamed from: o.StreetViewLifecycleDelegate */
public final /* synthetic */ class StreetViewLifecycleDelegate implements DirectDebitDeepLinkActivity {
    public /* synthetic */ StreetViewLifecycleDelegate(FatcaQuestionnaireCase fatcaQuestionnaireCase) {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.IconCompatParcelizer != null && "9100".equals(retrofitException.IconCompatParcelizer.write.IconCompatParcelizer)) {
                return DebitCardResetOtpActivity.error((Throwable) new FatcaQuestionnaireCase.FatcaVerificationCodeException());
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}
