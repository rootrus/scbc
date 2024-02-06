package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.createParcel */
public final /* synthetic */ class createParcel implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ createParcel write = new createParcel();

    private /* synthetic */ createParcel() {
    }

    public final Object write(Object obj) {
        return (fromRawFile) ((SingleDataEntity) obj).getData();
    }
}
