package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.zaag */
public final /* synthetic */ class zaag implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaag MediaBrowserCompat$ItemReceiver = new zaag();

    private /* synthetic */ zaag() {
    }

    public final Object write(Object obj) {
        Result result = (Result) obj;
        if (result.isError()) {
            return DebitCardResetOtpActivity.error(result.error());
        }
        return DebitCardResetOtpActivity.just(result.response());
    }
}
