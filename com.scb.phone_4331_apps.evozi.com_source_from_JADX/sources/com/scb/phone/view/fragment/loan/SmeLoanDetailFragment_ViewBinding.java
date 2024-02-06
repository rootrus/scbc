package com.scb.phone.view.fragment.loan;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomBillsToPay;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SmeLoanDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SmeLoanDetailFragment IconCompatParcelizer;

    public SmeLoanDetailFragment_ViewBinding(SmeLoanDetailFragment smeLoanDetailFragment, View view) {
        super(smeLoanDetailFragment, view);
        this.IconCompatParcelizer = smeLoanDetailFragment;
        smeLoanDetailFragment.mSmeLoanBillToPayLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_sme_loan_bill_to_pay, "field 'mSmeLoanBillToPayLinearLayout'", LinearLayout.class);
        smeLoanDetailFragment.mCustomBillsToPay = (CustomBillsToPay) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_bills_to_pay, "field 'mCustomBillsToPay'", CustomBillsToPay.class);
        smeLoanDetailFragment.mSmeLoanDetailTotalLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_sme_loan_detail_total_label, "field 'mSmeLoanDetailTotalLabelTextView'", TextView.class);
        smeLoanDetailFragment.mSmeLoanDetailEmptyStateLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_sme_loan_detail_empty_state, "field 'mSmeLoanDetailEmptyStateLinearLayout'", LinearLayout.class);
        smeLoanDetailFragment.mSmeLoanDetailEmptyStateMessageTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_sme_loan_detail_empty_state_message, "field 'mSmeLoanDetailEmptyStateMessageTextView'", TextView.class);
        smeLoanDetailFragment.mSmeLoanDetailListLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_sme_loan_detail_list, "field 'mSmeLoanDetailListLinearLayout'", LinearLayout.class);
        smeLoanDetailFragment.mSmeLoanDetailRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_sme_loan_detail, "field 'mSmeLoanDetailRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        SmeLoanDetailFragment smeLoanDetailFragment = this.IconCompatParcelizer;
        if (smeLoanDetailFragment != null) {
            this.IconCompatParcelizer = null;
            smeLoanDetailFragment.mSmeLoanBillToPayLinearLayout = null;
            smeLoanDetailFragment.mCustomBillsToPay = null;
            smeLoanDetailFragment.mSmeLoanDetailTotalLabelTextView = null;
            smeLoanDetailFragment.mSmeLoanDetailEmptyStateLinearLayout = null;
            smeLoanDetailFragment.mSmeLoanDetailEmptyStateMessageTextView = null;
            smeLoanDetailFragment.mSmeLoanDetailListLinearLayout = null;
            smeLoanDetailFragment.mSmeLoanDetailRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
