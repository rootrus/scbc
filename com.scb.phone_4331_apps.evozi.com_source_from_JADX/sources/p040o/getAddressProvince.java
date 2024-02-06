package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.PurchaseWithdrawalLimitAdapter;

/* renamed from: o.getAddressProvince */
public final /* synthetic */ class getAddressProvince implements View.OnClickListener {
    private final /* synthetic */ PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAddressProvince(PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = limitCustomViewHolder;
    }

    public final void onClick(View view) {
        PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        limitCustomViewHolder.MediaBrowserCompat$ItemReceiver(!limitCustomViewHolder.AlertController$RecycleListView);
    }
}
