package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.zaaf */
public final /* synthetic */ class zaaf implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaaf write = new zaaf();

    private /* synthetic */ zaaf() {
    }

    public final Object write(Object obj) {
        Result result = (Result) obj;
        if (result.isError()) {
            return DebitCardResetOtpActivity.error(result.error());
        }
        return DebitCardResetOtpActivity.just(result.response());
    }
}
