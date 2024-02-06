package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzeg */
public final /* synthetic */ class zzeg implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ onConnectionFailed MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ zzeg(onConnectionFailed onconnectionfailed) {
        this.MediaBrowserCompat$ItemReceiver = onconnectionfailed;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((SingleDataEntity) obj);
    }
}
