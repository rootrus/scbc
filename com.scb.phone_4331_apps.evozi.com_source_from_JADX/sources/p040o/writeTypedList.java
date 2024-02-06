package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LinkedHashTreeMap;

/* renamed from: o.writeTypedList */
public final /* synthetic */ class writeTypedList implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeTypedList IconCompatParcelizer = new writeTypedList();

    private /* synthetic */ writeTypedList() {
    }

    public final Object write(Object obj) {
        return (LinkedHashTreeMap.Node) ((SingleDataEntity) obj).getData();
    }
}
