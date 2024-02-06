package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setIsFromCrossClientAuth */
public final /* synthetic */ class setIsFromCrossClientAuth implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ setIsFromCrossClientAuth(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.write = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.write.read.IconCompatParcelizer((BaseDeepLinkDelegate) ((SingleDataEntity) obj).getData()));
    }
}
