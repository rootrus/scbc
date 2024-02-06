package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.C1251R;

/* renamed from: o.getSaveDefaultAccount */
public final /* synthetic */ class getSaveDefaultAccount implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ getSaveDefaultAccount(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.write = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((C1251R.color) ((SingleDataEntity) obj).getData());
    }
}
