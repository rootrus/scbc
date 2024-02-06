package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bankingactions.BankingActionAdapter;

/* renamed from: o.getError */
public final /* synthetic */ class getError implements View.OnClickListener {
    private final /* synthetic */ BankingActionAdapter.CustomViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getError(BankingActionAdapter.CustomViewHolder customViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = customViewHolder;
    }

    public final void onClick(View view) {
        BankingActionAdapter.CustomViewHolder customViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (BankingActionAdapter.this.read != null && customViewHolder.AlertController$RecycleListView) {
            BankingActionAdapter.this.read.IconCompatParcelizer(customViewHolder.PlaybackStateCompat);
        }
    }
}
