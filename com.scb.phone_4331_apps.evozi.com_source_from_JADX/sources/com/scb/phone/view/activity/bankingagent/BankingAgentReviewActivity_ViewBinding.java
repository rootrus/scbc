package com.scb.phone.view.activity.bankingagent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class BankingAgentReviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BankingAgentReviewActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public BankingAgentReviewActivity_ViewBinding(final BankingAgentReviewActivity bankingAgentReviewActivity, View view) {
        super(bankingAgentReviewActivity, view);
        this.IconCompatParcelizer = bankingAgentReviewActivity;
        bankingAgentReviewActivity.toAccountNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_name, "field 'toAccountNameTextView'", TextView.class);
        bankingAgentReviewActivity.toAccountNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_no, "field 'toAccountNoTextView'", TextView.class);
        bankingAgentReviewActivity.agentIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_agent_icon, "field 'agentIconImageView'", ImageView.class);
        bankingAgentReviewActivity.agentNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agent_name, "field 'agentNameTextView'", TextView.class);
        bankingAgentReviewActivity.amountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amountTextView'", TextView.class);
        bankingAgentReviewActivity.withDrawalRemarkTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_widthdrawal_remark, "field 'withDrawalRemarkTextView'", TextView.class);
        bankingAgentReviewActivity.accountLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_label, "field 'accountLabelTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_generate_qr, "method 'clickGenerateQR'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingAgentReviewActivity.this.clickGenerateQR();
            }
        });
    }

    public final void read() {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.IconCompatParcelizer;
        if (bankingAgentReviewActivity != null) {
            this.IconCompatParcelizer = null;
            bankingAgentReviewActivity.toAccountNameTextView = null;
            bankingAgentReviewActivity.toAccountNoTextView = null;
            bankingAgentReviewActivity.agentIconImageView = null;
            bankingAgentReviewActivity.agentNameTextView = null;
            bankingAgentReviewActivity.amountTextView = null;
            bankingAgentReviewActivity.withDrawalRemarkTextView = null;
            bankingAgentReviewActivity.accountLabelTextView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
