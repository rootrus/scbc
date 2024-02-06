package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomTileToggle;
import p040o.onStart;

public final class AccountRepaymentPlanSelectorViewHolder_ViewBinding extends AccountHeaderViewHolder_ViewBinding {
    private AccountRepaymentPlanSelectorViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public AccountRepaymentPlanSelectorViewHolder_ViewBinding(AccountRepaymentPlanSelectorViewHolder accountRepaymentPlanSelectorViewHolder, View view) {
        super(accountRepaymentPlanSelectorViewHolder, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = accountRepaymentPlanSelectorViewHolder;
        accountRepaymentPlanSelectorViewHolder.container = onStart.IconCompatParcelizer(view, R.id.view_repayment_plan_container, "field 'container'");
        accountRepaymentPlanSelectorViewHolder.repaymentToggle = (CustomTileToggle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_tile_toggle_repayment, "field 'repaymentToggle'", CustomTileToggle.class);
    }

    public final void read() {
        AccountRepaymentPlanSelectorViewHolder accountRepaymentPlanSelectorViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountRepaymentPlanSelectorViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            accountRepaymentPlanSelectorViewHolder.container = null;
            accountRepaymentPlanSelectorViewHolder.repaymentToggle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
