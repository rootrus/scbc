package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.closeaccount.AccountAmountCustomComponent;
import com.scb.phone.view.custom.common.MultilineDataComponent;
import com.scb.phone.view.custom.investment.CustomSuccessInformation;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CloseAccountSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public CloseAccountSuccessFragment_ViewBinding(final CloseAccountSuccessFragment closeAccountSuccessFragment, View view) {
        super(closeAccountSuccessFragment, view);
        this.IconCompatParcelizer = closeAccountSuccessFragment;
        closeAccountSuccessFragment.tvSuccessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvSuccessTitle'", TextView.class);
        closeAccountSuccessFragment.tvSuccessDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_desc, "field 'tvSuccessDescription'", TextView.class);
        closeAccountSuccessFragment.tvTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'tvTransactionDate'", TextView.class);
        closeAccountSuccessFragment.tvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'tvReferenceId'", TextView.class);
        closeAccountSuccessFragment.successInformation = (CustomSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_information, "field 'successInformation'", CustomSuccessInformation.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_slip_button, "field 'saveSlip'");
        closeAccountSuccessFragment.saveSlip = (Button) onStart.write(IconCompatParcelizer2, R.id.save_slip_button, "field 'saveSlip'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountSuccessFragment.this.onSaveSlipButtonClick();
            }
        });
        closeAccountSuccessFragment.accountAmountComponent = (AccountAmountCustomComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.closing_account_amount_data, "field 'accountAmountComponent'", AccountAmountCustomComponent.class);
        closeAccountSuccessFragment.receivingAccountData = (MultilineDataComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.receiving_account_data, "field 'receivingAccountData'", MultilineDataComponent.class);
        closeAccountSuccessFragment.layoutDepositDetails = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_deposit_details, "field 'layoutDepositDetails'", LinearLayout.class);
        closeAccountSuccessFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnButton'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountSuccessFragment.this.onReturnButton();
            }
        });
        View findViewById = view.findViewById(R.id.share_slip_button);
        if (findViewById != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    CloseAccountSuccessFragment.this.onShareSlipButtonClick();
                }
            });
        }
    }

    public final void read() {
        CloseAccountSuccessFragment closeAccountSuccessFragment = this.IconCompatParcelizer;
        if (closeAccountSuccessFragment != null) {
            this.IconCompatParcelizer = null;
            closeAccountSuccessFragment.tvSuccessTitle = null;
            closeAccountSuccessFragment.tvSuccessDescription = null;
            closeAccountSuccessFragment.tvTransactionDate = null;
            closeAccountSuccessFragment.tvReferenceId = null;
            closeAccountSuccessFragment.successInformation = null;
            closeAccountSuccessFragment.saveSlip = null;
            closeAccountSuccessFragment.accountAmountComponent = null;
            closeAccountSuccessFragment.receivingAccountData = null;
            closeAccountSuccessFragment.layoutDepositDetails = null;
            closeAccountSuccessFragment.recyclerView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            View view = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
