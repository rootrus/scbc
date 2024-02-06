package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashInputIncomeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashInputIncomeFragment write;

    public EasycashInputIncomeFragment_ViewBinding(final EasycashInputIncomeFragment easycashInputIncomeFragment, View view) {
        super(easycashInputIncomeFragment, view);
        this.write = easycashInputIncomeFragment;
        easycashInputIncomeFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        easycashInputIncomeFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        easycashInputIncomeFragment.repaymentHeaderLayout = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.repayment_header_layout, "field 'repaymentHeaderLayout'", CustomEasyCashSectionLabel.class);
        easycashInputIncomeFragment.repaymentInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_repayment_input_layout, "field 'repaymentInputLayout'", TextInputLayout.class);
        easycashInputIncomeFragment.repaymentEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_willing_repayment, "field 'repaymentEditText'", AmountEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_calculate, "field 'buttonCalculate' and method 'onDoneButtonClick'");
        easycashInputIncomeFragment.buttonCalculate = (Button) onStart.write(IconCompatParcelizer, R.id.button_calculate, "field 'buttonCalculate'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashInputIncomeFragment.this.onDoneButtonClick();
            }
        });
        easycashInputIncomeFragment.tvDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_text, "field 'tvDisclaimer'", TextView.class);
    }

    public final void read() {
        EasycashInputIncomeFragment easycashInputIncomeFragment = this.write;
        if (easycashInputIncomeFragment != null) {
            this.write = null;
            easycashInputIncomeFragment.amountInputLayout = null;
            easycashInputIncomeFragment.amountEditText = null;
            easycashInputIncomeFragment.repaymentHeaderLayout = null;
            easycashInputIncomeFragment.repaymentInputLayout = null;
            easycashInputIncomeFragment.repaymentEditText = null;
            easycashInputIncomeFragment.buttonCalculate = null;
            easycashInputIncomeFragment.tvDisclaimer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
