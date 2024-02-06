package com.scb.phone.view.fragment.investment.redeem;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.UnitsEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class AmountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AmountFragment write;

    public AmountFragment_ViewBinding(AmountFragment amountFragment, View view) {
        super(amountFragment, view);
        this.write = amountFragment;
        amountFragment.mInputAmountLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_amount_value_input_layout, "field 'mInputAmountLayout'", TextInputLayout.class);
        amountFragment.mTextInputEditAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_amount_value_edit_text, "field 'mTextInputEditAmount'", AmountEditText.class);
        amountFragment.mInputUnitsLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_units_value_input_layout, "field 'mInputUnitsLayout'", TextInputLayout.class);
        amountFragment.mTextInputEditUnits = (UnitsEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_units_value_edit_text, "field 'mTextInputEditUnits'", UnitsEditText.class);
        amountFragment.mAllContainerLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.all_container_layout, "field 'mAllContainerLayout'", LinearLayout.class);
        amountFragment.mAmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_amount_text_view, "field 'mAmountTextView'", TextView.class);
        amountFragment.mUnitsTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_units_text_view, "field 'mUnitsTextView'", TextView.class);
        amountFragment.llFundAvailableUnitSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_fund_available_unit_section, "field 'llFundAvailableUnitSection'", LinearLayout.class);
        amountFragment.tvFundPeriodTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_fund_period_title, "field 'tvFundPeriodTitle'", TextView.class);
        amountFragment.tvFundAvailableUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_fund_available_unit, "field 'tvFundAvailableUnit'", TextView.class);
    }

    public final void read() {
        AmountFragment amountFragment = this.write;
        if (amountFragment != null) {
            this.write = null;
            amountFragment.mInputAmountLayout = null;
            amountFragment.mTextInputEditAmount = null;
            amountFragment.mInputUnitsLayout = null;
            amountFragment.mTextInputEditUnits = null;
            amountFragment.mAllContainerLayout = null;
            amountFragment.mAmountTextView = null;
            amountFragment.mUnitsTextView = null;
            amountFragment.llFundAvailableUnitSection = null;
            amountFragment.tvFundPeriodTitle = null;
            amountFragment.tvFundAvailableUnit = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
