package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.SignInButtonConfig */
public final /* synthetic */ class SignInButtonConfig implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public /* synthetic */ SignInButtonConfig(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.read.IconCompatParcelizer((BaseDeepLinkDelegate) ((SingleDataEntity) obj).getData()));
    }
}
