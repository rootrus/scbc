package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.DeepLinkEntry;

/* renamed from: o.ResolveAccountRequest */
public final /* synthetic */ class ResolveAccountRequest implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ ResolveAccountRequest(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.read = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.read.MediaMetadataCompat.IconCompatParcelizer((DeepLinkEntry.Type) ((SingleDataEntity) obj).getData()));
    }
}
