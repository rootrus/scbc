package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.emailverification.EnterVerificationCodeUseCase;

/* renamed from: o.newFaceDetector */
public final /* synthetic */ class newFaceDetector implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ newFaceDetector read = new newFaceDetector();

    private /* synthetic */ newFaceDetector() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !"3001".equals(((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer)) {
            return DebitCardResetOtpActivity.error(th);
        }
        return DebitCardResetOtpActivity.error((Throwable) new EnterVerificationCodeUseCase.EmailMeVerificationCodeNeededException());
    }
}
