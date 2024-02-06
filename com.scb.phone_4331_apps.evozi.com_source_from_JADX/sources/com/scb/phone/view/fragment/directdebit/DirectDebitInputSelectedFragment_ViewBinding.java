package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DirectDebitInputSelectedFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private DirectDebitInputSelectedFragment write;

    public DirectDebitInputSelectedFragment_ViewBinding(final DirectDebitInputSelectedFragment directDebitInputSelectedFragment, View view) {
        super(directDebitInputSelectedFragment, view);
        this.write = directDebitInputSelectedFragment;
        directDebitInputSelectedFragment.mReferenceTextView1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_direct_debit_ref1, "field 'mReferenceTextView1'", TextView.class);
        directDebitInputSelectedFragment.mReferenceTextView2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_direct_debit_ref2, "field 'mReferenceTextView2'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_direct_debit_review, "field 'mButton' and method 'onContinueButtonClicked'");
        directDebitInputSelectedFragment.mButton = (Button) onStart.write(IconCompatParcelizer, R.id.bt_direct_debit_review, "field 'mButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DirectDebitInputSelectedFragment.this.onContinueButtonClicked();
            }
        });
        directDebitInputSelectedFragment.mCustomTransferAndPayBiller = (CustomTransferAndPayBiller) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.direct_debit_custom_transfer_and_pay_biller, "field 'mCustomTransferAndPayBiller'", CustomTransferAndPayBiller.class);
        directDebitInputSelectedFragment.mReferenceEditText1 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.direct_debit_ref1_et, "field 'mReferenceEditText1'", ScbEditText.class);
        directDebitInputSelectedFragment.mReferenceEditText2 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.direct_debit_ref2_et, "field 'mReferenceEditText2'", ScbEditText.class);
    }

    public final void read() {
        DirectDebitInputSelectedFragment directDebitInputSelectedFragment = this.write;
        if (directDebitInputSelectedFragment != null) {
            this.write = null;
            directDebitInputSelectedFragment.mReferenceTextView1 = null;
            directDebitInputSelectedFragment.mReferenceTextView2 = null;
            directDebitInputSelectedFragment.mButton = null;
            directDebitInputSelectedFragment.mCustomTransferAndPayBiller = null;
            directDebitInputSelectedFragment.mReferenceEditText1 = null;
            directDebitInputSelectedFragment.mReferenceEditText2 = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
