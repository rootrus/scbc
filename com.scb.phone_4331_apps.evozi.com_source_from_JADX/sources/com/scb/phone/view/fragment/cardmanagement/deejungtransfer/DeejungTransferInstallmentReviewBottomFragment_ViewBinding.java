package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferInstallmentReviewBottomFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private DeejungTransferInstallmentReviewBottomFragment write;

    public DeejungTransferInstallmentReviewBottomFragment_ViewBinding(final DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment, View view) {
        super(deejungTransferInstallmentReviewBottomFragment, view);
        this.write = deejungTransferInstallmentReviewBottomFragment;
        deejungTransferInstallmentReviewBottomFragment.txvTermAndConditions = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'txvTermAndConditions'", TermsAndConditionsView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "field 'confirmButton' and method 'handleConfirmClick'");
        deejungTransferInstallmentReviewBottomFragment.confirmButton = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_confirm, "field 'confirmButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferInstallmentReviewBottomFragment.this.handleConfirmClick();
            }
        });
    }

    public final void read() {
        DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment = this.write;
        if (deejungTransferInstallmentReviewBottomFragment != null) {
            this.write = null;
            deejungTransferInstallmentReviewBottomFragment.txvTermAndConditions = null;
            deejungTransferInstallmentReviewBottomFragment.confirmButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
