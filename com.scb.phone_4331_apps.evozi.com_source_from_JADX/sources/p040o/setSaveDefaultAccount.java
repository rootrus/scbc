package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.DeepLinkEntry;

/* renamed from: o.setSaveDefaultAccount */
public final /* synthetic */ class setSaveDefaultAccount implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSaveDefaultAccount(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.IconCompatParcelizer((DeepLinkEntry.Type) ((SingleDataEntity) obj).getData()));
    }
}
