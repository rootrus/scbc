package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.zaaj */
public final /* synthetic */ class zaaj implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaaj write = new zaaj();

    private /* synthetic */ zaaj() {
    }

    public final Object write(Object obj) {
        Result result = (Result) obj;
        if (result.isError()) {
            return DebitCardResetOtpActivity.error(result.error());
        }
        return DebitCardResetOtpActivity.just(result.response());
    }
}
