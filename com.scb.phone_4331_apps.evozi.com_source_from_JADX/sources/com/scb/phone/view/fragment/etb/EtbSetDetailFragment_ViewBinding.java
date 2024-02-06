package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EtbSetDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EtbSetDetailFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EtbSetDetailFragment_ViewBinding(final EtbSetDetailFragment etbSetDetailFragment, View view) {
        super(etbSetDetailFragment, view);
        this.IconCompatParcelizer = etbSetDetailFragment;
        etbSetDetailFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        etbSetDetailFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        etbSetDetailFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        etbSetDetailFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        etbSetDetailFragment.limitIncremental = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_limit_incremental_text_view, "field 'limitIncremental'", TextView.class);
        etbSetDetailFragment.mAmountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'mAmountInputLayout'", TextInputLayout.class);
        etbSetDetailFragment.mAmountValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'mAmountValue'", AmountEditText.class);
        etbSetDetailFragment.customSpinnerMainAccount = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_main_account, "field 'customSpinnerMainAccount'", CustomSpinnerWithTitle.class);
        etbSetDetailFragment.customSpinnerDateOfDeduction = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_date_of_deduction, "field 'customSpinnerDateOfDeduction'", CustomSpinnerWithTitle.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        etbSetDetailFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbSetDetailFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.checkbox_consent, "field 'checkBoxConsent' and method 'onCheckedConsent'");
        etbSetDetailFragment.checkBoxConsent = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.checkbox_consent, "field 'checkBoxConsent'", CheckBox.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                EtbSetDetailFragment.this.onCheckedConsent(compoundButton, z);
            }
        });
        etbSetDetailFragment.tvSelectAccountLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_select_account_label, "field 'tvSelectAccountLabel'", TextView.class);
    }

    public final void read() {
        EtbSetDetailFragment etbSetDetailFragment = this.IconCompatParcelizer;
        if (etbSetDetailFragment != null) {
            this.IconCompatParcelizer = null;
            etbSetDetailFragment.textRemainingLimit = null;
            etbSetDetailFragment.remainingLimit = null;
            etbSetDetailFragment.remainingLimitError = null;
            etbSetDetailFragment.remainingLimitLinearLayout = null;
            etbSetDetailFragment.limitIncremental = null;
            etbSetDetailFragment.mAmountInputLayout = null;
            etbSetDetailFragment.mAmountValue = null;
            etbSetDetailFragment.customSpinnerMainAccount = null;
            etbSetDetailFragment.customSpinnerDateOfDeduction = null;
            etbSetDetailFragment.buttonNext = null;
            etbSetDetailFragment.checkBoxConsent = null;
            etbSetDetailFragment.tvSelectAccountLabel = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
