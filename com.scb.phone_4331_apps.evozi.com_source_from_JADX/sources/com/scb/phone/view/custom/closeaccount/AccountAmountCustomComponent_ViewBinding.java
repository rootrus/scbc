package com.scb.phone.view.custom.closeaccount;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAmountRow;
import p040o.onStart;

public class AccountAmountCustomComponent_ViewBinding implements Unbinder {
    private AccountAmountCustomComponent IconCompatParcelizer;

    public AccountAmountCustomComponent_ViewBinding(AccountAmountCustomComponent accountAmountCustomComponent, View view) {
        this.IconCompatParcelizer = accountAmountCustomComponent;
        accountAmountCustomComponent.amount = (CustomAmountRow) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_row, "field 'amount'", CustomAmountRow.class);
        accountAmountCustomComponent.interest = (CustomAmountRow) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_row, "field 'interest'", CustomAmountRow.class);
        accountAmountCustomComponent.tax = (CustomAmountRow) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tax_row, "field 'tax'", CustomAmountRow.class);
        accountAmountCustomComponent.closingFee = (CustomAmountRow) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.closing_fee_row, "field 'closingFee'", CustomAmountRow.class);
        accountAmountCustomComponent.fee = (CustomAmountRow) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee_row, "field 'fee'", CustomAmountRow.class);
        accountAmountCustomComponent.netAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_net_amount, "field 'netAmount'", TextView.class);
        accountAmountCustomComponent.netAmountButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_net_amount_button, "field 'netAmountButton'", TextView.class);
    }

    public final void read() {
        AccountAmountCustomComponent accountAmountCustomComponent = this.IconCompatParcelizer;
        if (accountAmountCustomComponent != null) {
            this.IconCompatParcelizer = null;
            accountAmountCustomComponent.amount = null;
            accountAmountCustomComponent.interest = null;
            accountAmountCustomComponent.tax = null;
            accountAmountCustomComponent.closingFee = null;
            accountAmountCustomComponent.fee = null;
            accountAmountCustomComponent.netAmount = null;
            accountAmountCustomComponent.netAmountButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
