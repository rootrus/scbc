package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.C1251R;

/* renamed from: o.ResourceUtils */
public final /* synthetic */ class ResourceUtils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ ResourceUtils(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.read = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((C1251R.color) ((SingleDataEntity) obj).getData());
    }
}
