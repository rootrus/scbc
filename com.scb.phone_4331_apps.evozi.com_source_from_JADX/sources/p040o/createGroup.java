package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;

/* renamed from: o.createGroup */
public final /* synthetic */ class createGroup implements View.OnClickListener {
    private final /* synthetic */ FragmentBuilder_BindCardlessWithdrawAmountFragment IconCompatParcelizer;
    private final /* synthetic */ HmlOutcomeCounterAdapter.CounterOfferViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createGroup(HmlOutcomeCounterAdapter.CounterOfferViewHolder counterOfferViewHolder, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = counterOfferViewHolder;
        this.IconCompatParcelizer = fragmentBuilder_BindCardlessWithdrawAmountFragment;
    }

    public final void onClick(View view) {
        int i;
        HmlOutcomeCounterAdapter.CounterOfferViewHolder counterOfferViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment = this.IconCompatParcelizer;
        RecyclerView recyclerView = counterOfferViewHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) counterOfferViewHolder);
        }
        fragmentBuilder_BindCardlessWithdrawAmountFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
    }
}
