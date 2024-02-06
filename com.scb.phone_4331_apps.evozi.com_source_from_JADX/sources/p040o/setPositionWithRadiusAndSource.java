package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;

/* renamed from: o.setPositionWithRadiusAndSource */
public final /* synthetic */ class setPositionWithRadiusAndSource implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ setPositionWithRadiusAndSource read = new setPositionWithRadiusAndSource();

    private /* synthetic */ setPositionWithRadiusAndSource() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !"3000".equals(((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer)) {
            return DebitCardResetOtpActivity.error(th);
        }
        return DebitCardResetOtpActivity.error((Throwable) new EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException());
    }
}
