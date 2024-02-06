package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzdr */
public final /* synthetic */ class zzdr implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzdr read = new zzdr();

    private /* synthetic */ zzdr() {
    }

    public final Object write(Object obj) {
        return (ScaleXYParser) ((SingleDataEntity) obj).getData();
    }
}
