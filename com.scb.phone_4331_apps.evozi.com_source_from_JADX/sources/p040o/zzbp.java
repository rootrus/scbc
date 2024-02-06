package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzbp */
public final /* synthetic */ class zzbp implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingActionActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzbp(BankingActionActivity bankingActionActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingActionActivity;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((isLimitAdTrackingEnabled) ((SingleDataEntity) obj).getData()));
    }
}
