package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaal */
public final /* synthetic */ class zaal implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zaal IconCompatParcelizer = new zaal();

    private /* synthetic */ zaal() {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity != null) {
            return (ContentModelParser) singleDataEntity.getData();
        }
        return null;
    }
}
