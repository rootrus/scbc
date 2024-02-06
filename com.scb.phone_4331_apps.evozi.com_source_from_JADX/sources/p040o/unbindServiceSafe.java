package p040o;

import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;

/* renamed from: o.unbindServiceSafe */
public final /* synthetic */ class unbindServiceSafe implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ AnyTransferHistoryFragment.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ unbindServiceSafe(AnyTransferHistoryFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver((parseLayers) obj));
    }
}
