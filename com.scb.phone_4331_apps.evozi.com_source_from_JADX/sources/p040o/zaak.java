package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaak */
public final /* synthetic */ class zaak implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaak MediaBrowserCompat$ItemReceiver = new zaak();

    private /* synthetic */ zaak() {
    }

    public final Object write(Object obj) {
        return (NetworkFetcher) ((SingleDataEntity) obj).getData();
    }
}
