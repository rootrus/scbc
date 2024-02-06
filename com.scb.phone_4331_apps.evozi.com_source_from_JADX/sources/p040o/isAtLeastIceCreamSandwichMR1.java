package p040o;

import retrofit2.Response;

/* renamed from: o.isAtLeastIceCreamSandwichMR1 */
public final /* synthetic */ class isAtLeastIceCreamSandwichMR1 implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ isAtLeastIceCreamSandwichMR1 read = new isAtLeastIceCreamSandwichMR1();

    private /* synthetic */ isAtLeastIceCreamSandwichMR1() {
    }

    public final Object write(Object obj) {
        Response response = (Response) obj;
        String str = response.headers().get("Api-Auth");
        if (str == null) {
            zabr.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) response.body());
        }
        return DebitCardResetOtpActivity.just(str);
    }
}
