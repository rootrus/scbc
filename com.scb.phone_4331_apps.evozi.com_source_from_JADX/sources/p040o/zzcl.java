package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzcl */
public final /* synthetic */ class zzcl implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzcl IconCompatParcelizer = new zzcl();

    private /* synthetic */ zzcl() {
    }

    public final Object write(Object obj) {
        return (encodedPathSegments) ((SingleDataEntity) obj).getData();
    }
}
