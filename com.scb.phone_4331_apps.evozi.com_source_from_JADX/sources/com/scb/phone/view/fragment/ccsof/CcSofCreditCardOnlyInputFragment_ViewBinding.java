package com.scb.phone.view.fragment.ccsof;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class CcSofCreditCardOnlyInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CcSofCreditCardOnlyInputFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public CcSofCreditCardOnlyInputFragment_ViewBinding(final CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment, View view) {
        super(ccSofCreditCardOnlyInputFragment, view);
        this.IconCompatParcelizer = ccSofCreditCardOnlyInputFragment;
        ccSofCreditCardOnlyInputFragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_image_icon, "field 'imageIcon'", ImageView.class);
        ccSofCreditCardOnlyInputFragment.tvMerchantTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_merchant_title, "field 'tvMerchantTitle'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvMerchantId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_merchant_id, "field 'tvMerchantId'", TextView.class);
        ccSofCreditCardOnlyInputFragment.etRef1 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_reference_label_input1, "field 'etRef1'", ScbEditText.class);
        ccSofCreditCardOnlyInputFragment.tvAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'tvAmount'", AmountEditText.class);
        ccSofCreditCardOnlyInputFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'btnReview' and method 'onReviewButtonClick'");
        ccSofCreditCardOnlyInputFragment.btnReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'btnReview'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CcSofCreditCardOnlyInputFragment.this.onReviewButtonClick();
            }
        });
        ccSofCreditCardOnlyInputFragment.installmentLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_installmentPlan, "field 'installmentLayout'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_apply_cc_ipp, "field 'cbApplyCcIpp' and method 'onCheckboxClick'");
        ccSofCreditCardOnlyInputFragment.cbApplyCcIpp = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.cb_apply_cc_ipp, "field 'cbApplyCcIpp'", CheckBox.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CcSofCreditCardOnlyInputFragment.this.onCheckboxClick();
            }
        });
        ccSofCreditCardOnlyInputFragment.availableInstallmentsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_available_installments_container, "field 'availableInstallmentsContainer'", LinearLayout.class);
        ccSofCreditCardOnlyInputFragment.selectedInstallmentDetailsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_selected_installment_details_container, "field 'selectedInstallmentDetailsContainer'", LinearLayout.class);
        ccSofCreditCardOnlyInputFragment.rvTenor = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_tenor, "field 'rvTenor'", RecyclerView.class);
        ccSofCreditCardOnlyInputFragment.tvMonthlyInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_monthly_interest_rate, "field 'tvMonthlyInterestRate'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvTotalPayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_total_payment, "field 'tvTotalPayment'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvPrincipalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_principal_amount, "field 'tvPrincipalAmount'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvInterestAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_interest_amount, "field 'tvInterestAmount'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvMonthlyPaymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_monthly_payment_amount, "field 'tvMonthlyPaymentAmount'", TextView.class);
        ccSofCreditCardOnlyInputFragment.tvPrincipalInterestCalculation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_principal_interest_calculation, "field 'tvPrincipalInterestCalculation'", TextView.class);
    }

    public final void read() {
        CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment = this.IconCompatParcelizer;
        if (ccSofCreditCardOnlyInputFragment != null) {
            this.IconCompatParcelizer = null;
            ccSofCreditCardOnlyInputFragment.imageIcon = null;
            ccSofCreditCardOnlyInputFragment.tvMerchantTitle = null;
            ccSofCreditCardOnlyInputFragment.tvMerchantId = null;
            ccSofCreditCardOnlyInputFragment.etRef1 = null;
            ccSofCreditCardOnlyInputFragment.tvAmount = null;
            ccSofCreditCardOnlyInputFragment.noteEditText = null;
            ccSofCreditCardOnlyInputFragment.btnReview = null;
            ccSofCreditCardOnlyInputFragment.installmentLayout = null;
            ccSofCreditCardOnlyInputFragment.cbApplyCcIpp = null;
            ccSofCreditCardOnlyInputFragment.availableInstallmentsContainer = null;
            ccSofCreditCardOnlyInputFragment.selectedInstallmentDetailsContainer = null;
            ccSofCreditCardOnlyInputFragment.rvTenor = null;
            ccSofCreditCardOnlyInputFragment.tvMonthlyInterestRate = null;
            ccSofCreditCardOnlyInputFragment.tvTotalPayment = null;
            ccSofCreditCardOnlyInputFragment.tvPrincipalAmount = null;
            ccSofCreditCardOnlyInputFragment.tvInterestAmount = null;
            ccSofCreditCardOnlyInputFragment.tvMonthlyPaymentAmount = null;
            ccSofCreditCardOnlyInputFragment.tvPrincipalInterestCalculation = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
