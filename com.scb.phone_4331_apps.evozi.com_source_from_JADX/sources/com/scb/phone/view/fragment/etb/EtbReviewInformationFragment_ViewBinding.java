package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomInformationList;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EtbReviewInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EtbReviewInformationFragment MediaBrowserCompat$ItemReceiver;

    public EtbReviewInformationFragment_ViewBinding(final EtbReviewInformationFragment etbReviewInformationFragment, View view) {
        super(etbReviewInformationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = etbReviewInformationFragment;
        etbReviewInformationFragment.vAccountInfo = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_account_information, "field 'vAccountInfo'", CustomInformationList.class);
        etbReviewInformationFragment.vOpeningDeposit = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_opening_deposit, "field 'vOpeningDeposit'", CustomInformationList.class);
        etbReviewInformationFragment.vMonthlyDeduction = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_monthly_deduction, "field 'vMonthlyDeduction'", CustomInformationList.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "field 'btnConfirm' and method 'onConfirmClick'");
        etbReviewInformationFragment.btnConfirm = (Button) onStart.write(IconCompatParcelizer, R.id.btn_confirm, "field 'btnConfirm'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbReviewInformationFragment.this.onConfirmClick();
            }
        });
    }

    public final void read() {
        EtbReviewInformationFragment etbReviewInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (etbReviewInformationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            etbReviewInformationFragment.vAccountInfo = null;
            etbReviewInformationFragment.vOpeningDeposit = null;
            etbReviewInformationFragment.vMonthlyDeduction = null;
            etbReviewInformationFragment.btnConfirm = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
