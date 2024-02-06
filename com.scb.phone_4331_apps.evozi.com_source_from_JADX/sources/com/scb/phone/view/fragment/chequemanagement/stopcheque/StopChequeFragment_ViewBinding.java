package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class StopChequeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private StopChequeFragment write;

    public StopChequeFragment_ViewBinding(StopChequeFragment stopChequeFragment, View view) {
        super(stopChequeFragment, view);
        this.write = stopChequeFragment;
        stopChequeFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        stopChequeFragment.rootErrorNoAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_no_account, "field 'rootErrorNoAccount'", LinearLayout.class);
        stopChequeFragment.tvErrorNoAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_title, "field 'tvErrorNoAccountTitle'", TextView.class);
        stopChequeFragment.tvErrorNoAccountDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_detail, "field 'tvErrorNoAccountDetail'", TextView.class);
        stopChequeFragment.tvAccountFrom = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_top_account_lbl, "field 'tvAccountFrom'", TextView.class);
        stopChequeFragment.accountSourceSelected = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_account_source_select, "field 'accountSourceSelected'", FrameLayout.class);
    }

    public final void read() {
        StopChequeFragment stopChequeFragment = this.write;
        if (stopChequeFragment != null) {
            this.write = null;
            stopChequeFragment.scrollView = null;
            stopChequeFragment.rootErrorNoAccount = null;
            stopChequeFragment.tvErrorNoAccountTitle = null;
            stopChequeFragment.tvErrorNoAccountDetail = null;
            stopChequeFragment.tvAccountFrom = null;
            stopChequeFragment.accountSourceSelected = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
