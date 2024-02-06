package com.scb.phone.view.fragment.bond;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomInfoArrow;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.TintInputViewGroup;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BondInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BondInputFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public BondInputFragment_ViewBinding(final BondInputFragment bondInputFragment, View view) {
        super(bondInputFragment, view);
        this.IconCompatParcelizer = bondInputFragment;
        bondInputFragment.root = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'root'", ViewGroup.class);
        bondInputFragment.bondAccounts = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_account_selector, "field 'bondAccounts'", CustomAccountSelector.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bond_selection, "field 'bondSelection' and method 'onBondSelectionClick'");
        bondInputFragment.bondSelection = (CustomInfoArrow) onStart.write(IconCompatParcelizer2, R.id.bond_selection, "field 'bondSelection'", CustomInfoArrow.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BondInputFragment.this.onBondSelectionClick();
            }
        });
        bondInputFragment.pricePerUnit = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.price_per_unit, "field 'pricePerUnit'", CustomTransferAndPayItem.class);
        bondInputFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        bondInputFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_edit_text, "field 'amountEditText'", AmountEditText.class);
        bondInputFragment.unit = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unit, "field 'unit'", CustomTransferAndPayItem.class);
        bondInputFragment.amountPayable = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_payable, "field 'amountPayable'", CustomTransferAndPayItem.class);
        bondInputFragment.bondCalculationDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_calculation_disclaimer, "field 'bondCalculationDisclaimer'", TextView.class);
        bondInputFragment.bondAccountDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_account_disclaimer, "field 'bondAccountDisclaimer'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.review_button, "field 'reviewButton' and method 'onReviewButtomClick'");
        bondInputFragment.reviewButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.review_button, "field 'reviewButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BondInputFragment.this.onReviewButtomClick();
            }
        });
        bondInputFragment.mobileNumberInput = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_mobile_number, "field 'mobileNumberInput'", TintInputViewGroup.class);
        bondInputFragment.tvBondMobileLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bond_mobile_number_label, "field 'tvBondMobileLabel'", TextView.class);
        bondInputFragment.tvSelectBondLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_select_bond_label, "field 'tvSelectBondLabel'", TextView.class);
    }

    public final void read() {
        BondInputFragment bondInputFragment = this.IconCompatParcelizer;
        if (bondInputFragment != null) {
            this.IconCompatParcelizer = null;
            bondInputFragment.root = null;
            bondInputFragment.bondAccounts = null;
            bondInputFragment.bondSelection = null;
            bondInputFragment.pricePerUnit = null;
            bondInputFragment.amountInputLayout = null;
            bondInputFragment.amountEditText = null;
            bondInputFragment.unit = null;
            bondInputFragment.amountPayable = null;
            bondInputFragment.bondCalculationDisclaimer = null;
            bondInputFragment.bondAccountDisclaimer = null;
            bondInputFragment.reviewButton = null;
            bondInputFragment.mobileNumberInput = null;
            bondInputFragment.tvBondMobileLabel = null;
            bondInputFragment.tvSelectBondLabel = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
