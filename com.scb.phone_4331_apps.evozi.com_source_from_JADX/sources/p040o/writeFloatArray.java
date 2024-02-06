package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.etb.ETBCheckIdentityCase;

/* renamed from: o.writeFloatArray */
public final /* synthetic */ class writeFloatArray implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeFloatArray read = new writeFloatArray();

    private /* synthetic */ writeFloatArray() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.write == RetrofitException.read.API_ERROR) {
                ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
                if (iLocationSourceDelegate.write != null && "3013".equals(iLocationSourceDelegate.write.IconCompatParcelizer)) {
                    return DebitCardResetOtpActivity.error((Throwable) new ETBCheckIdentityCase.ErrorCode3013Exception());
                }
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}
