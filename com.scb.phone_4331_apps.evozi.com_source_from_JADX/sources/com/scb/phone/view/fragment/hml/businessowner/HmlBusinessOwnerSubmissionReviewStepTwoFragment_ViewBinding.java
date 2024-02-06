package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlBusinessOwnerSubmissionReviewStepTwoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private HmlBusinessOwnerSubmissionReviewStepTwoFragment write;

    public HmlBusinessOwnerSubmissionReviewStepTwoFragment_ViewBinding(final HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment, View view) {
        super(hmlBusinessOwnerSubmissionReviewStepTwoFragment, view);
        this.write = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.businessInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_business_info, "field 'businessInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.loanInfoInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_loan_info, "field 'loanInfoInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.incomeInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_income_info, "field 'incomeInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.bankAccountsInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_bank_account_info, "field 'bankAccountsInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.ownStoreInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_own_store_info, "field 'ownStoreInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.storeOrProductInfoContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_store_or_product_info, "field 'storeOrProductInfoContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.uploadedDocumentsContainer = onStart.IconCompatParcelizer(view, R.id.cl_uploaded_documents_container, "field 'uploadedDocumentsContainer'");
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.tvFilesAttached = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_attached_documents_label, "field 'tvFilesAttached'", TextView.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.checkBoxTermsConditions = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_terms_and_conditions, "field 'checkBoxTermsConditions'", CheckBox.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.textViewTermsConditions = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_terms_conditions_label, "field 'textViewTermsConditions'", TextView.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.consentSection = onStart.IconCompatParcelizer(view, R.id.consent_container, "field 'consentSection'");
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.consentsContainer = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_consents, "field 'consentsContainer'", CustomSeparatedViews.class);
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.ownStoreHeader = onStart.IconCompatParcelizer(view, R.id.tv_own_store_info_header, "field 'ownStoreHeader'");
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.storeOrProductHeader = onStart.IconCompatParcelizer(view, R.id.tv_store_or_product_info_header, "field 'storeOrProductHeader'");
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.b_confirm, "field 'confirmButton' and method 'confirmButtonClick'");
        hmlBusinessOwnerSubmissionReviewStepTwoFragment.confirmButton = (Button) onStart.write(IconCompatParcelizer, R.id.b_confirm, "field 'confirmButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerSubmissionReviewStepTwoFragment.this.confirmButtonClick();
            }
        });
    }

    public final void read() {
        HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment = this.write;
        if (hmlBusinessOwnerSubmissionReviewStepTwoFragment != null) {
            this.write = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.businessInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.loanInfoInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.incomeInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.bankAccountsInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.ownStoreInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.storeOrProductInfoContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.uploadedDocumentsContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.tvFilesAttached = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.checkBoxTermsConditions = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.textViewTermsConditions = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.consentSection = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.consentsContainer = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.ownStoreHeader = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.storeOrProductHeader = null;
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.confirmButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
