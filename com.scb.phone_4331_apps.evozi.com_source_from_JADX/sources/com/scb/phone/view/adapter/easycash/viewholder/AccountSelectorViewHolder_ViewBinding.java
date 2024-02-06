package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import p040o.onStart;

public class AccountSelectorViewHolder_ViewBinding extends AccountHeaderViewHolder_ViewBinding {
    private AccountSelectorViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public AccountSelectorViewHolder_ViewBinding(AccountSelectorViewHolder accountSelectorViewHolder, View view) {
        super(accountSelectorViewHolder, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = accountSelectorViewHolder;
        accountSelectorViewHolder.accountSelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_selector, "field 'accountSelector'", CustomAccountSelector.class);
    }

    public void read() {
        AccountSelectorViewHolder accountSelectorViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountSelectorViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            accountSelectorViewHolder.accountSelector = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
