package p040o;

import retrofit2.Response;

/* renamed from: o.isAtLeastJellyBeanMR1 */
public final /* synthetic */ class isAtLeastJellyBeanMR1 implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ isAtLeastJellyBeanMR1 write = new isAtLeastJellyBeanMR1();

    private /* synthetic */ isAtLeastJellyBeanMR1() {
    }

    public final Object write(Object obj) {
        return ((Response) obj).headers().get("Api-Auth");
    }
}
