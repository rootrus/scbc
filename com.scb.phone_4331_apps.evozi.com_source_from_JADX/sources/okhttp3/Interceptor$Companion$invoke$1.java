package okhttp3;

import okhttp3.Interceptor;
import p040o.FundFactSheetActivity;
import p040o.onGetStartedClick;

public final class Interceptor$Companion$invoke$1 implements Interceptor {
    final /* synthetic */ FundFactSheetActivity $block;

    public Interceptor$Companion$invoke$1(FundFactSheetActivity fundFactSheetActivity) {
        this.$block = fundFactSheetActivity;
    }

    public final Response intercept(Interceptor.Chain chain) {
        onGetStartedClick.write((Object) chain, "chain");
        return (Response) this.$block.invoke(chain);
    }
}
