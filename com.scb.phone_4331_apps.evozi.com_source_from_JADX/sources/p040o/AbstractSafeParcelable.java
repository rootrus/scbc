package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;

/* renamed from: o.AbstractSafeParcelable */
public final /* synthetic */ class AbstractSafeParcelable implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ AbstractSafeParcelable(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver((namesAndValuesToQueryString) ((SingleDataEntity) obj).getData());
    }
}
