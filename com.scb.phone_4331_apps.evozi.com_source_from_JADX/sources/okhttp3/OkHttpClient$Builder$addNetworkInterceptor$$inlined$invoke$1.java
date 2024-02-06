package okhttp3;

import okhttp3.Interceptor;
import p040o.FundFactSheetActivity;
import p040o.onGetStartedClick;

public final class OkHttpClient$Builder$addNetworkInterceptor$$inlined$invoke$1 implements Interceptor {
    final /* synthetic */ FundFactSheetActivity $block$inlined;

    public OkHttpClient$Builder$addNetworkInterceptor$$inlined$invoke$1(FundFactSheetActivity fundFactSheetActivity) {
        this.$block$inlined = fundFactSheetActivity;
    }

    public final Response intercept(Interceptor.Chain chain) {
        onGetStartedClick.write((Object) chain, "chain");
        return (Response) this.$block$inlined.invoke(chain);
    }
}
