package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaao */
public final /* synthetic */ class zaao implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaao IconCompatParcelizer = new zaao();

    private /* synthetic */ zaao() {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity != null) {
            return (applyJustification) singleDataEntity.getData();
        }
        return null;
    }
}
