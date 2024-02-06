package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.TextLayer;

/* renamed from: o.zaar */
public final /* synthetic */ class zaar implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaar MediaBrowserCompat$ItemReceiver = new zaar();

    private /* synthetic */ zaar() {
    }

    public final Object write(Object obj) {
        TextLayer.C38582 r4 = (TextLayer.C38582) ((SingleDataEntity) obj).getData();
        return new getRating(r4.MediaBrowserCompat$ItemReceiver, r4.write, r4.read);
    }
}
