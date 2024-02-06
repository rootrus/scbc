package com.scb.phone.view.fragment.debitatm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DebitWithdrawalLimitFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitWithdrawalLimitFragment MediaBrowserCompat$ItemReceiver;

    public DebitWithdrawalLimitFragment_ViewBinding(DebitWithdrawalLimitFragment debitWithdrawalLimitFragment, View view) {
        super(debitWithdrawalLimitFragment, view);
        this.MediaBrowserCompat$ItemReceiver = debitWithdrawalLimitFragment;
        debitWithdrawalLimitFragment.mPersonalLimitScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_scrollview, "field 'mPersonalLimitScrollView'", NestedScrollView.class);
        debitWithdrawalLimitFragment.debitRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_debit, "field 'debitRecyclerView'", RecyclerView.class);
        debitWithdrawalLimitFragment.purchaseRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_purchase, "field 'purchaseRecyclerView'", RecyclerView.class);
        debitWithdrawalLimitFragment.layoutPurchaseLimit = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_purchase_limit, "field 'layoutPurchaseLimit'", LinearLayout.class);
    }

    public final void read() {
        DebitWithdrawalLimitFragment debitWithdrawalLimitFragment = this.MediaBrowserCompat$ItemReceiver;
        if (debitWithdrawalLimitFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            debitWithdrawalLimitFragment.mPersonalLimitScrollView = null;
            debitWithdrawalLimitFragment.debitRecyclerView = null;
            debitWithdrawalLimitFragment.purchaseRecyclerView = null;
            debitWithdrawalLimitFragment.layoutPurchaseLimit = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
