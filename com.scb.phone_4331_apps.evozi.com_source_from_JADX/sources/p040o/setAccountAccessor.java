package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.C1251R;

/* renamed from: o.setAccountAccessor */
public final /* synthetic */ class setAccountAccessor implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public /* synthetic */ setAccountAccessor(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((C1251R.dimen) ((SingleDataEntity) obj).getData());
    }
}
