package com.scb.phone.view.fragment.easycash.creditpower;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class EasycashCreditPowerSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashCreditPowerSummaryFragment IconCompatParcelizer;

    public EasycashCreditPowerSummaryFragment_ViewBinding(EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment, View view) {
        super(easycashCreditPowerSummaryFragment, view);
        this.IconCompatParcelizer = easycashCreditPowerSummaryFragment;
        easycashCreditPowerSummaryFragment.rvLoans = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_loans, "field 'rvLoans'", RecyclerView.class);
        easycashCreditPowerSummaryFragment.btExit = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_exit, "field 'btExit'", Button.class);
    }

    public final void read() {
        EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment = this.IconCompatParcelizer;
        if (easycashCreditPowerSummaryFragment != null) {
            this.IconCompatParcelizer = null;
            easycashCreditPowerSummaryFragment.rvLoans = null;
            easycashCreditPowerSummaryFragment.btExit = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
