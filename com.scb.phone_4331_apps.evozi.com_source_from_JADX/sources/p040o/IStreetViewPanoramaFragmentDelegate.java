package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;

/* renamed from: o.IStreetViewPanoramaFragmentDelegate */
public final /* synthetic */ class IStreetViewPanoramaFragmentDelegate implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ IStreetViewPanoramaFragmentDelegate MediaBrowserCompat$CustomActionResultReceiver = new IStreetViewPanoramaFragmentDelegate();

    private /* synthetic */ IStreetViewPanoramaFragmentDelegate() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !"3000".equals(((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer)) {
            return DebitCardResetOtpActivity.error(th);
        }
        return DebitCardResetOtpActivity.error((Throwable) new EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException());
    }
}
