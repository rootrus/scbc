package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.CheckBox;
import com.scb.phone.R;
import p040o.onStart;

public final class AccountEStatementViewHolder_ViewBinding extends AccountHeaderViewHolder_ViewBinding {
    private AccountEStatementViewHolder IconCompatParcelizer;

    public AccountEStatementViewHolder_ViewBinding(AccountEStatementViewHolder accountEStatementViewHolder, View view) {
        super(accountEStatementViewHolder, view);
        this.IconCompatParcelizer = accountEStatementViewHolder;
        accountEStatementViewHolder.checkboxEStatement = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checkbox_e_statement, "field 'checkboxEStatement'", CheckBox.class);
    }

    public final void read() {
        AccountEStatementViewHolder accountEStatementViewHolder = this.IconCompatParcelizer;
        if (accountEStatementViewHolder != null) {
            this.IconCompatParcelizer = null;
            accountEStatementViewHolder.checkboxEStatement = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
