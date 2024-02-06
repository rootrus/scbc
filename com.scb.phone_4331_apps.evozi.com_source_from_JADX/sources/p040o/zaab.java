package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.zaab */
public final /* synthetic */ class zaab implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaab MediaBrowserCompat$CustomActionResultReceiver = new zaab();

    private /* synthetic */ zaab() {
    }

    public final Object write(Object obj) {
        Result result = (Result) obj;
        if (result.isError()) {
            return DebitCardResetOtpActivity.error(result.error());
        }
        return DebitCardResetOtpActivity.just(result.response());
    }
}
