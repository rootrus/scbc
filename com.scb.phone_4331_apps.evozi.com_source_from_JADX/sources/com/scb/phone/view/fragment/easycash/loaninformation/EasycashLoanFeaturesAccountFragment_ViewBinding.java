package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashLoanFeaturesAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashLoanFeaturesAccountFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashLoanFeaturesAccountFragment_ViewBinding(final EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment, View view) {
        super(easycashLoanFeaturesAccountFragment, view);
        this.IconCompatParcelizer = easycashLoanFeaturesAccountFragment;
        easycashLoanFeaturesAccountFragment.receivingAccountLabel = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.receiving_account_label, "field 'receivingAccountLabel'", CustomEasyCashSectionLabel.class);
        easycashLoanFeaturesAccountFragment.accountSelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_selector, "field 'accountSelector'", CustomAccountSelector.class);
        easycashLoanFeaturesAccountFragment.repayAccountLabel = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.repay_account_label, "field 'repayAccountLabel'", CustomEasyCashSectionLabel.class);
        easycashLoanFeaturesAccountFragment.layoutRepayAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_repay_account, "field 'layoutRepayAccount'", LinearLayout.class);
        easycashLoanFeaturesAccountFragment.accountRepaySelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_repay_selector, "field 'accountRepaySelector'", CustomAccountSelector.class);
        easycashLoanFeaturesAccountFragment.radioGroupRepayOption = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_repay_option, "field 'radioGroupRepayOption'", RadioGroup.class);
        easycashLoanFeaturesAccountFragment.radioButtonDirectDebit = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rdb_direct_debit, "field 'radioButtonDirectDebit'", RadioButton.class);
        easycashLoanFeaturesAccountFragment.radioButtonCash = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rdb_cash, "field 'radioButtonCash'", RadioButton.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnAction' and method 'onNextButtonClicked'");
        easycashLoanFeaturesAccountFragment.btnAction = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_action, "field 'btnAction'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashLoanFeaturesAccountFragment.this.onNextButtonClicked();
            }
        });
        easycashLoanFeaturesAccountFragment.textViewDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textview_disclaimer, "field 'textViewDisclaimer'", TextView.class);
    }

    public final void read() {
        EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment = this.IconCompatParcelizer;
        if (easycashLoanFeaturesAccountFragment != null) {
            this.IconCompatParcelizer = null;
            easycashLoanFeaturesAccountFragment.receivingAccountLabel = null;
            easycashLoanFeaturesAccountFragment.accountSelector = null;
            easycashLoanFeaturesAccountFragment.repayAccountLabel = null;
            easycashLoanFeaturesAccountFragment.layoutRepayAccount = null;
            easycashLoanFeaturesAccountFragment.accountRepaySelector = null;
            easycashLoanFeaturesAccountFragment.radioGroupRepayOption = null;
            easycashLoanFeaturesAccountFragment.radioButtonDirectDebit = null;
            easycashLoanFeaturesAccountFragment.radioButtonCash = null;
            easycashLoanFeaturesAccountFragment.btnAction = null;
            easycashLoanFeaturesAccountFragment.textViewDisclaimer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
