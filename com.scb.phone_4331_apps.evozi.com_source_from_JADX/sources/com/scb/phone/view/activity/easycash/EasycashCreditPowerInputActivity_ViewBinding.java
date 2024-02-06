package com.scb.phone.view.activity.easycash;

import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.easycash.CustomCheckBoxLayout;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashCreditPowerInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasycashCreditPowerInputActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashCreditPowerInputActivity_ViewBinding(final EasycashCreditPowerInputActivity easycashCreditPowerInputActivity, View view) {
        super(easycashCreditPowerInputActivity, view);
        this.MediaBrowserCompat$ItemReceiver = easycashCreditPowerInputActivity;
        easycashCreditPowerInputActivity.cbPowerCredit = (CustomCheckBoxLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_checkbox_power_credit, "field 'cbPowerCredit'", CustomCheckBoxLayout.class);
        easycashCreditPowerInputActivity.monthlyIncomeError = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_income_error_layout, "field 'monthlyIncomeError'", TextInputLayout.class);
        easycashCreditPowerInputActivity.monthlyIncomeAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_income_amount, "field 'monthlyIncomeAmount'", AmountEditText.class);
        easycashCreditPowerInputActivity.monthlyPaymentError = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_payment_error_layout, "field 'monthlyPaymentError'", TextInputLayout.class);
        easycashCreditPowerInputActivity.monthlyPaymentAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_payment_amount, "field 'monthlyPaymentAmount'", AmountEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.calculation_button, "field 'btnCalculation' and method 'onClickedAction'");
        easycashCreditPowerInputActivity.btnCalculation = (Button) onStart.write(IconCompatParcelizer, R.id.calculation_button, "field 'btnCalculation'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCreditPowerInputActivity.this.onClickedAction();
            }
        });
    }

    public final void read() {
        EasycashCreditPowerInputActivity easycashCreditPowerInputActivity = this.MediaBrowserCompat$ItemReceiver;
        if (easycashCreditPowerInputActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashCreditPowerInputActivity.cbPowerCredit = null;
            easycashCreditPowerInputActivity.monthlyIncomeError = null;
            easycashCreditPowerInputActivity.monthlyIncomeAmount = null;
            easycashCreditPowerInputActivity.monthlyPaymentError = null;
            easycashCreditPowerInputActivity.monthlyPaymentAmount = null;
            easycashCreditPowerInputActivity.btnCalculation = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
