package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;

/* renamed from: o.tryAcquire */
public final /* synthetic */ class tryAcquire implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ tryAcquire read = new tryAcquire();

    private /* synthetic */ tryAcquire() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !"3000".equals(((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer)) {
            return DebitCardResetOtpActivity.error(th);
        }
        return DebitCardResetOtpActivity.error((Throwable) new EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException());
    }
}
