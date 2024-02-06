package com.scb.phone.view.fragment.chequemanagement.chequestatus;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ChequeStatusFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ChequeStatusFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ChequeStatusFragment_ViewBinding(ChequeStatusFragment chequeStatusFragment, View view) {
        super(chequeStatusFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = chequeStatusFragment;
        chequeStatusFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lv_cheque_detail, "field 'recyclerView'", RecyclerView.class);
        chequeStatusFragment.viewPending = onStart.IconCompatParcelizer(view, R.id.view_pending, "field 'viewPending'");
        chequeStatusFragment.viewReturn = onStart.IconCompatParcelizer(view, R.id.view_return, "field 'viewReturn'");
        chequeStatusFragment.viewPaid = onStart.IconCompatParcelizer(view, R.id.view_paid, "field 'viewPaid'");
        chequeStatusFragment.tv_number_of_cheque = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_amount, "field 'tv_number_of_cheque'", TextView.class);
        chequeStatusFragment.ivExpand = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'ivExpand'", ImageView.class);
        chequeStatusFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        chequeStatusFragment.viewChequeSummaryInfo = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_cheque_summary_detail, "field 'viewChequeSummaryInfo'", LinearLayout.class);
        chequeStatusFragment.tvDownAccountLbl = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_down_account_lbl, "field 'tvDownAccountLbl'", TextView.class);
        chequeStatusFragment.tvNoCheque = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_no_cheque, "field 'tvNoCheque'", TextView.class);
        chequeStatusFragment.spFilter = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cheque_sp_filter, "field 'spFilter'", Spinner.class);
        chequeStatusFragment.tvTopAccountLbl = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_top_account_lbl, "field 'tvTopAccountLbl'", TextView.class);
        chequeStatusFragment.viewRoot = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_root, "field 'viewRoot'", LinearLayout.class);
        chequeStatusFragment.errorList = onStart.IconCompatParcelizer(view, R.id.error_list, "field 'errorList'");
        chequeStatusFragment.rootErrorNoAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_no_account, "field 'rootErrorNoAccount'", LinearLayout.class);
        chequeStatusFragment.tvErrorNoAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_title, "field 'tvErrorNoAccountTitle'", TextView.class);
        chequeStatusFragment.tvErrorNoAccountDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_detail, "field 'tvErrorNoAccountDetail'", TextView.class);
    }

    public final void read() {
        ChequeStatusFragment chequeStatusFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chequeStatusFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            chequeStatusFragment.recyclerView = null;
            chequeStatusFragment.viewPending = null;
            chequeStatusFragment.viewReturn = null;
            chequeStatusFragment.viewPaid = null;
            chequeStatusFragment.tv_number_of_cheque = null;
            chequeStatusFragment.ivExpand = null;
            chequeStatusFragment.scrollView = null;
            chequeStatusFragment.viewChequeSummaryInfo = null;
            chequeStatusFragment.tvDownAccountLbl = null;
            chequeStatusFragment.tvNoCheque = null;
            chequeStatusFragment.spFilter = null;
            chequeStatusFragment.tvTopAccountLbl = null;
            chequeStatusFragment.viewRoot = null;
            chequeStatusFragment.errorList = null;
            chequeStatusFragment.rootErrorNoAccount = null;
            chequeStatusFragment.tvErrorNoAccountTitle = null;
            chequeStatusFragment.tvErrorNoAccountDetail = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
