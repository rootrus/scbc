package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaah */
public final /* synthetic */ class zaah implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaah write = new zaah();

    private /* synthetic */ zaah() {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity != null) {
            return (setInstance) singleDataEntity.getData();
        }
        return null;
    }
}
