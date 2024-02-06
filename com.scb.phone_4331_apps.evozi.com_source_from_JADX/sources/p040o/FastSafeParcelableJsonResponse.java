package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.FastSafeParcelableJsonResponse */
public final /* synthetic */ class FastSafeParcelableJsonResponse implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ FastSafeParcelableJsonResponse MediaBrowserCompat$CustomActionResultReceiver = new FastSafeParcelableJsonResponse();

    private /* synthetic */ FastSafeParcelableJsonResponse() {
    }

    public final Object write(Object obj) {
        return (start) ((SingleDataEntity) obj).getData();
    }
}
