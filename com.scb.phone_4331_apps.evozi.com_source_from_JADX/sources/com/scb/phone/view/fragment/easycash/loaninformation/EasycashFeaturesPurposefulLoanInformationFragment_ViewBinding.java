package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesPurposefulLoanInformationFragment_ViewBinding extends C9174xb4f85216 {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashFeaturesPurposefulLoanInformationFragment MediaBrowserCompat$ItemReceiver;

    public EasycashFeaturesPurposefulLoanInformationFragment_ViewBinding(final EasycashFeaturesPurposefulLoanInformationFragment easycashFeaturesPurposefulLoanInformationFragment, View view) {
        super(easycashFeaturesPurposefulLoanInformationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashFeaturesPurposefulLoanInformationFragment;
        easycashFeaturesPurposefulLoanInformationFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesPurposefulLoanInformationFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashFeaturesPurposefulLoanInformationFragment easycashFeaturesPurposefulLoanInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashFeaturesPurposefulLoanInformationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashFeaturesPurposefulLoanInformationFragment.amountEditText = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
