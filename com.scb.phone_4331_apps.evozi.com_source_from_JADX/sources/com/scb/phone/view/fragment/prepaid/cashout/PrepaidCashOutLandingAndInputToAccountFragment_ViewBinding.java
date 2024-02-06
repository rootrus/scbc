package com.scb.phone.view.fragment.prepaid.cashout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class PrepaidCashOutLandingAndInputToAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PrepaidCashOutLandingAndInputToAccountFragment IconCompatParcelizer;

    public PrepaidCashOutLandingAndInputToAccountFragment_ViewBinding(PrepaidCashOutLandingAndInputToAccountFragment prepaidCashOutLandingAndInputToAccountFragment, View view) {
        super(prepaidCashOutLandingAndInputToAccountFragment, view);
        this.IconCompatParcelizer = prepaidCashOutLandingAndInputToAccountFragment;
        prepaidCashOutLandingAndInputToAccountFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_out_to_account_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        PrepaidCashOutLandingAndInputToAccountFragment prepaidCashOutLandingAndInputToAccountFragment = this.IconCompatParcelizer;
        if (prepaidCashOutLandingAndInputToAccountFragment != null) {
            this.IconCompatParcelizer = null;
            prepaidCashOutLandingAndInputToAccountFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
