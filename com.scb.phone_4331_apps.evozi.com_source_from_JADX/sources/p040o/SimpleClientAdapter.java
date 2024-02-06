package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.SimpleClientAdapter */
public final /* synthetic */ class SimpleClientAdapter implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ SimpleClientAdapter write = new SimpleClientAdapter();

    private /* synthetic */ SimpleClientAdapter() {
    }

    public final Object write(Object obj) {
        return (notifySuccessListeners) ((SingleDataEntity) obj).getData();
    }
}
