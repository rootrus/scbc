package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class StopChequeHistoryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private StopChequeHistoryFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public StopChequeHistoryFragment_ViewBinding(final StopChequeHistoryFragment stopChequeHistoryFragment, View view) {
        super(stopChequeHistoryFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = stopChequeHistoryFragment;
        stopChequeHistoryFragment.viewNoHistory = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_no_stop_cheque_history, "field 'viewNoHistory'", LinearLayout.class);
        stopChequeHistoryFragment.viewError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_message_container, "field 'viewError'", LinearLayout.class);
        stopChequeHistoryFragment.recyclerViewStopChequeHistory = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_stop_cheque_history, "field 'recyclerViewStopChequeHistory'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_stop_cheque, "field 'btnStopCheque' and method 'onButtonStopChequeClick'");
        stopChequeHistoryFragment.btnStopCheque = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_stop_cheque, "field 'btnStopCheque'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StopChequeHistoryFragment.this.onButtonStopChequeClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_reload_stop_cheque_history, "method 'onButtonReloadClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StopChequeHistoryFragment.this.onButtonReloadClick();
            }
        });
    }

    public final void read() {
        StopChequeHistoryFragment stopChequeHistoryFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (stopChequeHistoryFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            stopChequeHistoryFragment.viewNoHistory = null;
            stopChequeHistoryFragment.viewError = null;
            stopChequeHistoryFragment.recyclerViewStopChequeHistory = null;
            stopChequeHistoryFragment.btnStopCheque = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
