package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;

/* renamed from: o.ListAppsActivityContract */
public final /* synthetic */ class ListAppsActivityContract implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ListAppsActivityContract(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver((namesAndValuesToQueryString) ((SingleDataEntity) obj).getData());
    }
}
