package com.scb.phone.view.fragment.easycash.issuer;

import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.custom.investment.onboarding.CustomTextViewNavigation;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashIssuerInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashIssuerInputFragment write;

    public EasycashIssuerInputFragment_ViewBinding(final EasycashIssuerInputFragment easycashIssuerInputFragment, View view) {
        super(easycashIssuerInputFragment, view);
        this.write = easycashIssuerInputFragment;
        easycashIssuerInputFragment.customSelectIssuer = (CustomTextViewNavigation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_add_issuer, "field 'customSelectIssuer'", CustomTextViewNavigation.class);
        easycashIssuerInputFragment.customSpinnerLoadType = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_loan_type, "field 'customSpinnerLoadType'", CustomSpinnerWithTitle.class);
        easycashIssuerInputFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_error_input, "field 'amountInputLayout'", TextInputLayout.class);
        easycashIssuerInputFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_done, "field 'buttonDone' and method 'onDoneButtonClick'");
        easycashIssuerInputFragment.buttonDone = (Button) onStart.write(IconCompatParcelizer2, R.id.button_done, "field 'buttonDone'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerInputFragment.this.onDoneButtonClick();
            }
        });
    }

    public final void read() {
        EasycashIssuerInputFragment easycashIssuerInputFragment = this.write;
        if (easycashIssuerInputFragment != null) {
            this.write = null;
            easycashIssuerInputFragment.customSelectIssuer = null;
            easycashIssuerInputFragment.customSpinnerLoadType = null;
            easycashIssuerInputFragment.amountInputLayout = null;
            easycashIssuerInputFragment.amountEditText = null;
            easycashIssuerInputFragment.buttonDone = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
