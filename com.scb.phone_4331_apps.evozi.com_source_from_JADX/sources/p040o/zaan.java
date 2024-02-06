package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaan */
public final /* synthetic */ class zaan implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaan read = new zaan();

    private /* synthetic */ zaan() {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity != null) {
            return (TextLayer) singleDataEntity.getData();
        }
        return null;
    }
}
