package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class DepositFragment_ViewBinding extends BaseCardFragment_ViewBinding {
    private DepositFragment write;

    public DepositFragment_ViewBinding(DepositFragment depositFragment, View view) {
        super(depositFragment, view);
        this.write = depositFragment;
        depositFragment.mTotalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.my_deposits_total_amount_text_view, "field 'mTotalAmount'", TextView.class);
        depositFragment.titleAccounts = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_accounts, "field 'titleAccounts'", TextView.class);
        depositFragment.layoutEmptyAccount = onStart.IconCompatParcelizer(view, R.id.layout_empty_account, "field 'layoutEmptyAccount'");
    }

    public final void read() {
        DepositFragment depositFragment = this.write;
        if (depositFragment != null) {
            this.write = null;
            depositFragment.mTotalAmount = null;
            depositFragment.titleAccounts = null;
            depositFragment.layoutEmptyAccount = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
