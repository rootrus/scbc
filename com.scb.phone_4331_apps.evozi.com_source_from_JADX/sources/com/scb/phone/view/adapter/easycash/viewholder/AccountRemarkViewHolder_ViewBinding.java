package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AccountRemarkViewHolder_ViewBinding implements Unbinder {
    private AccountRemarkViewHolder IconCompatParcelizer;

    public AccountRemarkViewHolder_ViewBinding(AccountRemarkViewHolder accountRemarkViewHolder, View view) {
        this.IconCompatParcelizer = accountRemarkViewHolder;
        accountRemarkViewHolder.remark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.repayment_label, "field 'remark'", TextView.class);
    }

    public final void read() {
        AccountRemarkViewHolder accountRemarkViewHolder = this.IconCompatParcelizer;
        if (accountRemarkViewHolder != null) {
            this.IconCompatParcelizer = null;
            accountRemarkViewHolder.remark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
