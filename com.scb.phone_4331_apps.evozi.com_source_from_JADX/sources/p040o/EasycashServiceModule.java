package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.DebitWithdrawalLimitAdapter;

/* renamed from: o.EasycashServiceModule */
public final /* synthetic */ class EasycashServiceModule implements View.OnClickListener {
    private final /* synthetic */ DebitWithdrawalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ EasycashServiceModule(DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = limitCustomViewHolder;
    }

    public final void onClick(View view) {
        DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        limitCustomViewHolder.MediaBrowserCompat$CustomActionResultReceiver(!limitCustomViewHolder.AlertController$RecycleListView);
    }
}
