package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzbq */
public final /* synthetic */ class zzbq implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingActionActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzbq(BankingActionActivity bankingActionActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingActionActivity;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((isLimitAdTrackingEnabled) ((SingleDataEntity) obj).getData()));
    }
}
