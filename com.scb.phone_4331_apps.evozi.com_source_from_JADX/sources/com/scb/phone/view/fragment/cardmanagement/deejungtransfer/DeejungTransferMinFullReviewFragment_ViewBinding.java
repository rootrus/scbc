package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferMinFullReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungTransferMinFullReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public DeejungTransferMinFullReviewFragment_ViewBinding(final DeejungTransferMinFullReviewFragment deejungTransferMinFullReviewFragment, View view) {
        super(deejungTransferMinFullReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferMinFullReviewFragment;
        deejungTransferMinFullReviewFragment.txvInterestDeclaration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.min_max_transfer_declaration, "field 'txvInterestDeclaration'", TextView.class);
        deejungTransferMinFullReviewFragment.termsAndConditionsView = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'termsAndConditionsView'", TermsAndConditionsView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "field 'btnConfirm' and method 'handlleConfirmButtonClick'");
        deejungTransferMinFullReviewFragment.btnConfirm = (Button) onStart.write(IconCompatParcelizer, R.id.btn_confirm, "field 'btnConfirm'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferMinFullReviewFragment.this.handlleConfirmButtonClick();
            }
        });
    }

    public final void read() {
        DeejungTransferMinFullReviewFragment deejungTransferMinFullReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungTransferMinFullReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deejungTransferMinFullReviewFragment.txvInterestDeclaration = null;
            deejungTransferMinFullReviewFragment.termsAndConditionsView = null;
            deejungTransferMinFullReviewFragment.btnConfirm = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
