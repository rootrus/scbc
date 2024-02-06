package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.C1251R;

/* renamed from: o.getButtonSize */
public final /* synthetic */ class getButtonSize implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ getButtonSize(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.read = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((C1251R.C1253id) ((SingleDataEntity) obj).getData());
    }
}
