package p040o;

import p040o.CreditCardBilledDetailActivity;
import retrofit2.Response;

/* renamed from: o.zzlh */
public final /* synthetic */ class zzlh implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CreditCardBilledDetailActivity.IconCompatParcelizer write;

    public /* synthetic */ zzlh(CreditCardBilledDetailActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        CreditCardBilledDetailActivity.IconCompatParcelizer iconCompatParcelizer = this.write;
        Response response = (Response) obj;
        if (!response.isSuccessful() || response.body() == null || !"1000".equals(((setCurrentItemInternal) response.body()).getStatus().write())) {
            return Boolean.FALSE;
        }
        iconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver(response.headers().get("Api-Auth"));
        return Boolean.TRUE;
    }
}
