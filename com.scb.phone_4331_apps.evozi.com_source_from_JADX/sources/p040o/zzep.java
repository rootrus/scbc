package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LinkedHashTreeMap;

/* renamed from: o.zzep */
public final /* synthetic */ class zzep implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzep read = new zzep();

    private /* synthetic */ zzep() {
    }

    public final Object write(Object obj) {
        return (LinkedHashTreeMap.EntrySet) ((SingleDataEntity) obj).getData();
    }
}
