package p040o;

import com.scb.phone.view.adapter.chubb.PaymentInfoAdapter;

/* renamed from: o.acceptRemittanceTc */
public final /* synthetic */ class acceptRemittanceTc implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ PaymentInfoAdapter.ViewTypeMiniQrHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ acceptRemittanceTc(PaymentInfoAdapter.ViewTypeMiniQrHolder viewTypeMiniQrHolder) {
        this.MediaBrowserCompat$ItemReceiver = viewTypeMiniQrHolder;
    }

    public final void IconCompatParcelizer(Object obj) {
        PaymentInfoAdapter.ViewTypeMiniQrHolder viewTypeMiniQrHolder = this.MediaBrowserCompat$ItemReceiver;
        onCheckBoxClick.IconCompatParcelizer((Throwable) obj);
        viewTypeMiniQrHolder.imageQrCode.setVisibility(8);
        PaymentInfoAdapter.MediaBrowserCompat$ItemReceiver(PaymentInfoAdapter.this);
    }
}
