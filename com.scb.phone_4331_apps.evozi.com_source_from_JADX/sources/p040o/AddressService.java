package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.PurchaseWithdrawalLimitAdapter;

/* renamed from: o.AddressService */
public final /* synthetic */ class AddressService implements View.OnFocusChangeListener {
    private final /* synthetic */ PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ AddressService(PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
    }

    public final void onFocusChange(View view, boolean z) {
        PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (!z) {
            limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        }
    }
}
