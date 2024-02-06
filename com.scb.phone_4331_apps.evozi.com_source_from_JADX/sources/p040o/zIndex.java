package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.ReviewInfoCase;

/* renamed from: o.zIndex */
public final /* synthetic */ class zIndex implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zIndex read = new zIndex();

    private /* synthetic */ zIndex() {
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof RetrofitException) {
            String str = ((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer;
            if ("9100".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new ReviewInfoCase.JobIncomeDangerousException());
            }
            if ("3046".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new ReviewInfoCase.FailUpdateRMException());
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}
