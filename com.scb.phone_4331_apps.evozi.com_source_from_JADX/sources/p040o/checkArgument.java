package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.checkArgument */
public final /* synthetic */ class checkArgument implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ checkArgument read = new checkArgument();

    private /* synthetic */ checkArgument() {
    }

    public final Object write(Object obj) {
        return (pathSegments) ((SingleDataEntity) obj).getData();
    }
}
