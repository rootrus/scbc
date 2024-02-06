package com.scb.phone.view.fragment.chequemanagement.activatecheque;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScbEditText;
import com.scb.phone.view.custom.common.ScbTextInputLayout;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ActivateChequeInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private ActivateChequeInputFragment write;

    public ActivateChequeInputFragment_ViewBinding(final ActivateChequeInputFragment activateChequeInputFragment, View view) {
        super(activateChequeInputFragment, view);
        this.write = activateChequeInputFragment;
        activateChequeInputFragment.rootErrorNoAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_no_account, "field 'rootErrorNoAccount'", LinearLayout.class);
        activateChequeInputFragment.tvErrorNoAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_title, "field 'tvErrorNoAccountTitle'", TextView.class);
        activateChequeInputFragment.tvErrorNoAccountDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_detail, "field 'tvErrorNoAccountDetail'", TextView.class);
        activateChequeInputFragment.scbTextInputLayout = (ScbTextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.stil_activate_cheque_input, "field 'scbTextInputLayout'", ScbTextInputLayout.class);
        activateChequeInputFragment.editText = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_activate_input, "field 'editText'", ScbEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_activate_cheque_review, "field 'btnActivateChequeReview' and method 'onReviewButtonClick'");
        activateChequeInputFragment.btnActivateChequeReview = (Button) onStart.write(IconCompatParcelizer, R.id.btn_activate_cheque_review, "field 'btnActivateChequeReview'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ActivateChequeInputFragment.this.onReviewButtonClick();
            }
        });
        activateChequeInputFragment.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'rootView'", RelativeLayout.class);
    }

    public final void read() {
        ActivateChequeInputFragment activateChequeInputFragment = this.write;
        if (activateChequeInputFragment != null) {
            this.write = null;
            activateChequeInputFragment.rootErrorNoAccount = null;
            activateChequeInputFragment.tvErrorNoAccountTitle = null;
            activateChequeInputFragment.tvErrorNoAccountDetail = null;
            activateChequeInputFragment.scbTextInputLayout = null;
            activateChequeInputFragment.editText = null;
            activateChequeInputFragment.btnActivateChequeReview = null;
            activateChequeInputFragment.rootView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
