package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DocumentData;

/* renamed from: o.zzjs */
public final /* synthetic */ class zzjs implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzjs write = new zzjs();

    private /* synthetic */ zzjs() {
    }

    public final Object write(Object obj) {
        return (DocumentData.Justification) ((SingleDataEntity) obj).getData();
    }
}
