package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.scb.phone.R;
import p040o.onStart;

public class AccountRepaymentSelectorViewHolder_ViewBinding extends AccountSelectorViewHolder_ViewBinding {
    private AccountRepaymentSelectorViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public AccountRepaymentSelectorViewHolder_ViewBinding(AccountRepaymentSelectorViewHolder accountRepaymentSelectorViewHolder, View view) {
        super(accountRepaymentSelectorViewHolder, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = accountRepaymentSelectorViewHolder;
        accountRepaymentSelectorViewHolder.radioGroup = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_repay_option, "field 'radioGroup'", RadioGroup.class);
        accountRepaymentSelectorViewHolder.radioButtonDirectDebit = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rdb_direct_debit, "field 'radioButtonDirectDebit'", RadioButton.class);
        accountRepaymentSelectorViewHolder.radioButtonCash = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rdb_cash, "field 'radioButtonCash'", RadioButton.class);
    }

    public final void read() {
        AccountRepaymentSelectorViewHolder accountRepaymentSelectorViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountRepaymentSelectorViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            accountRepaymentSelectorViewHolder.radioGroup = null;
            accountRepaymentSelectorViewHolder.radioButtonDirectDebit = null;
            accountRepaymentSelectorViewHolder.radioButtonCash = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
