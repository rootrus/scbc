package p040o;

import com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity;
import com.scb.phone.view.adapter.accountsummary.C5725x3a81547f;
import com.scb.phone.view.fragment.accountsummary.MerchantWalletFragment;
import java.util.List;

/* renamed from: o.NTBPinLoginService */
public final /* synthetic */ class NTBPinLoginService implements C5725x3a81547f {
    private final /* synthetic */ MerchantWalletFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ NTBPinLoginService(MerchantWalletFragment merchantWalletFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = merchantWalletFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, List list) {
        MerchantWalletDetailActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getContext(), i, list);
    }
}
