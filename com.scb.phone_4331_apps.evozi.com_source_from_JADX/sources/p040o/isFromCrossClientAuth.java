package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.DeepLinkEntry;

/* renamed from: o.isFromCrossClientAuth */
public final /* synthetic */ class isFromCrossClientAuth implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public /* synthetic */ isFromCrossClientAuth(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.MediaMetadataCompat.IconCompatParcelizer((DeepLinkEntry.Type) ((SingleDataEntity) obj).getData()));
    }
}
