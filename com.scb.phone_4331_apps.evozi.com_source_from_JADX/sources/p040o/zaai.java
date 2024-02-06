package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.zaai */
public final /* synthetic */ class zaai implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaai IconCompatParcelizer = new zaai();

    private /* synthetic */ zaai() {
    }

    public final Object write(Object obj) {
        Result result = (Result) obj;
        if (result.isError()) {
            return DebitCardResetOtpActivity.error(result.error());
        }
        return DebitCardResetOtpActivity.just(result.response());
    }
}
