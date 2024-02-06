package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzce */
public final /* synthetic */ class zzce implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzce MediaBrowserCompat$ItemReceiver = new zzce();

    private /* synthetic */ zzce() {
    }

    public final Object write(Object obj) {
        return (DeepLink) ((SingleDataEntity) obj).getData();
    }
}
