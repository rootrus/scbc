package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.hml.CustomLoanSuccessInformation;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBaseOnlineSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlBaseOnlineSuccessFragment MediaBrowserCompat$ItemReceiver;

    public HmlBaseOnlineSuccessFragment_ViewBinding(final HmlBaseOnlineSuccessFragment hmlBaseOnlineSuccessFragment, View view) {
        super(hmlBaseOnlineSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlBaseOnlineSuccessFragment;
        hmlBaseOnlineSuccessFragment.transactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'transactionDate'", TextView.class);
        hmlBaseOnlineSuccessFragment.referenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_reference_id, "field 'referenceId'", TextView.class);
        hmlBaseOnlineSuccessFragment.remarkTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_success_remark, "field 'remarkTextView'", TextView.class);
        hmlBaseOnlineSuccessFragment.saveSlip = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_save_slip, "field 'saveSlip'", Button.class);
        hmlBaseOnlineSuccessFragment.loanInfo = (CustomLoanSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.clsi_loan_info, "field 'loanInfo'", CustomLoanSuccessInformation.class);
        hmlBaseOnlineSuccessFragment.receivingAccount = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctps_receiving_account, "field 'receivingAccount'", CustomTransferAndPaySource.class);
        hmlBaseOnlineSuccessFragment.registerButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_register_scbs, "field 'registerButton'", Button.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_loan_setup_home, "field 'returnToHome' and method 'onAccountSummaryClick'");
        hmlBaseOnlineSuccessFragment.returnToHome = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_loan_setup_home, "field 'returnToHome'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseOnlineSuccessFragment.this.onAccountSummaryClick();
            }
        });
    }

    public void read() {
        HmlBaseOnlineSuccessFragment hmlBaseOnlineSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlBaseOnlineSuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlBaseOnlineSuccessFragment.transactionDate = null;
            hmlBaseOnlineSuccessFragment.referenceId = null;
            hmlBaseOnlineSuccessFragment.remarkTextView = null;
            hmlBaseOnlineSuccessFragment.saveSlip = null;
            hmlBaseOnlineSuccessFragment.loanInfo = null;
            hmlBaseOnlineSuccessFragment.receivingAccount = null;
            hmlBaseOnlineSuccessFragment.registerButton = null;
            hmlBaseOnlineSuccessFragment.returnToHome = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
