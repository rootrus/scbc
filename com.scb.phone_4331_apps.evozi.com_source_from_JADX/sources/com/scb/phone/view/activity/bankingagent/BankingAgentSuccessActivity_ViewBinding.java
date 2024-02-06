package com.scb.phone.view.activity.bankingagent;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class BankingAgentSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentSuccessActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public BankingAgentSuccessActivity_ViewBinding(final BankingAgentSuccessActivity bankingAgentSuccessActivity, View view) {
        super(bankingAgentSuccessActivity, view);
        this.MediaBrowserCompat$ItemReceiver = bankingAgentSuccessActivity;
        bankingAgentSuccessActivity.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleTextView'", TextView.class);
        bankingAgentSuccessActivity.transactionDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'transactionDateTextView'", TextView.class);
        bankingAgentSuccessActivity.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'refIdTextView'", TextView.class);
        bankingAgentSuccessActivity.accountLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_label, "field 'accountLabelTextView'", TextView.class);
        bankingAgentSuccessActivity.accountNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_name, "field 'accountNameTextView'", TextView.class);
        bankingAgentSuccessActivity.accountNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_no, "field 'accountNoTextView'", TextView.class);
        bankingAgentSuccessActivity.agentIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_agent_icon, "field 'agentIcon'", ImageView.class);
        bankingAgentSuccessActivity.agentNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agent_name, "field 'agentNameTextView'", TextView.class);
        bankingAgentSuccessActivity.agentNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agent_no, "field 'agentNoTextView'", TextView.class);
        bankingAgentSuccessActivity.amountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amountTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_save_slip, "field 'saveButton' and method 'clickSaveSlip'");
        bankingAgentSuccessActivity.saveButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_save_slip, "field 'saveButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingAgentSuccessActivity.this.clickSaveSlip();
            }
        });
        bankingAgentSuccessActivity.buttonDivider = onStart.IconCompatParcelizer(view, R.id.divider_buttons, "field 'buttonDivider'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_share_slip, "method 'clickShareSlip'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingAgentSuccessActivity.this.clickShareSlip();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_return_to_account, "method 'clickReturnToAccount'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingAgentSuccessActivity.this.clickReturnToAccount();
            }
        });
    }

    public final void read() {
        BankingAgentSuccessActivity bankingAgentSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
        if (bankingAgentSuccessActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            bankingAgentSuccessActivity.titleTextView = null;
            bankingAgentSuccessActivity.transactionDateTextView = null;
            bankingAgentSuccessActivity.refIdTextView = null;
            bankingAgentSuccessActivity.accountLabelTextView = null;
            bankingAgentSuccessActivity.accountNameTextView = null;
            bankingAgentSuccessActivity.accountNoTextView = null;
            bankingAgentSuccessActivity.agentIcon = null;
            bankingAgentSuccessActivity.agentNameTextView = null;
            bankingAgentSuccessActivity.agentNoTextView = null;
            bankingAgentSuccessActivity.amountTextView = null;
            bankingAgentSuccessActivity.saveButton = null;
            bankingAgentSuccessActivity.buttonDivider = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
