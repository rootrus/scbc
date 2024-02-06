package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import p040o.DeepLinkEntry;

/* renamed from: o.SignInButtonCreator */
public final /* synthetic */ class SignInButtonCreator implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ SignInButtonCreator(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.write = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.write.MediaMetadataCompat.IconCompatParcelizer((DeepLinkEntry.Type) ((SingleDataEntity) obj).getData()));
    }
}
