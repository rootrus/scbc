package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class StopChequeInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private StopChequeInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public StopChequeInputFragment_ViewBinding(final StopChequeInputFragment stopChequeInputFragment, View view) {
        super(stopChequeInputFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = stopChequeInputFragment;
        stopChequeInputFragment.editTextChequeNo = (CustomProxyNumber) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_cheque_no, "field 'editTextChequeNo'", CustomProxyNumber.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_stop_cheque_review, "field 'btnStopChequeReview' and method 'onReviewButtonClick'");
        stopChequeInputFragment.btnStopChequeReview = (Button) onStart.write(IconCompatParcelizer, R.id.btn_stop_cheque_review, "field 'btnStopChequeReview'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StopChequeInputFragment.this.onReviewButtonClick();
            }
        });
        stopChequeInputFragment.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'rootView'", RelativeLayout.class);
    }

    public final void read() {
        StopChequeInputFragment stopChequeInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (stopChequeInputFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            stopChequeInputFragment.editTextChequeNo = null;
            stopChequeInputFragment.btnStopChequeReview = null;
            stopChequeInputFragment.rootView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
