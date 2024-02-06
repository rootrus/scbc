package com.scb.phone.view.fragment.deposit;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DepositMoreInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DepositMoreInfoFragment write;

    public DepositMoreInfoFragment_ViewBinding(final DepositMoreInfoFragment depositMoreInfoFragment, View view) {
        super(depositMoreInfoFragment, view);
        this.write = depositMoreInfoFragment;
        depositMoreInfoFragment.mLayoutOverdraftStatus = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_overdraft_status, "field 'mLayoutOverdraftStatus'", LinearLayout.class);
        depositMoreInfoFragment.mCustomProgressBarOverdraftStatus = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_progress_bar_overdraft_status, "field 'mCustomProgressBarOverdraftStatus'", CustomHorizontalProgressBar.class);
        depositMoreInfoFragment.mTextProductType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_product_type, "field 'mTextProductType'", TextView.class);
        depositMoreInfoFragment.mTextProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_product_name, "field 'mTextProductName'", TextView.class);
        depositMoreInfoFragment.mTextAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'mTextAccountName'", TextView.class);
        depositMoreInfoFragment.mImageIconExpandMore = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'mImageIconExpandMore'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_collapsed, "field 'mLayoutCollapsed' and method 'onLayoutCollapsedClick'");
        depositMoreInfoFragment.mLayoutCollapsed = (ViewGroup) onStart.write(IconCompatParcelizer2, R.id.layout_collapsed, "field 'mLayoutCollapsed'", ViewGroup.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositMoreInfoFragment.this.onLayoutCollapsedClick();
            }
        });
        depositMoreInfoFragment.mLayoutExpanded = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_expanded, "field 'mLayoutExpanded'", ViewGroup.class);
        depositMoreInfoFragment.mViewGroupBalance = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_balance_and_available_balance, "field 'mViewGroupBalance'", ViewGroup.class);
        depositMoreInfoFragment.mTextAccountBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_balance, "field 'mTextAccountBalance'", TextView.class);
        depositMoreInfoFragment.mTextAvailableBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_available_balance, "field 'mTextAvailableBalance'", TextView.class);
        depositMoreInfoFragment.mTextOverdraftInterestAccruedTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_overdraft_interest_accrued_title, "field 'mTextOverdraftInterestAccruedTitle'", TextView.class);
        depositMoreInfoFragment.mTextInterestAccruedTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_interest_accrued_title, "field 'mTextInterestAccruedTitle'", TextView.class);
        depositMoreInfoFragment.mTextInterestAccrued = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_interest_accrued, "field 'mTextInterestAccrued'", TextView.class);
        depositMoreInfoFragment.mTextOverdraftLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_overdraft_limit, "field 'mTextOverdraftLimit'", TextView.class);
        depositMoreInfoFragment.mTextOverdraftLimitUsed = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_overdraft_limit_used, "field 'mTextOverdraftLimitUsed'", TextView.class);
        depositMoreInfoFragment.mViewGroupOverdraftLimit = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_overdraft_limit, "field 'mViewGroupOverdraftLimit'", ViewGroup.class);
        depositMoreInfoFragment.mViewGroupInterestAccrued = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_interest_accrued, "field 'mViewGroupInterestAccrued'", ViewGroup.class);
        depositMoreInfoFragment.mViewGroupTransferLimits = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_transfer_limits, "field 'mViewGroupTransferLimits'", ViewGroup.class);
        depositMoreInfoFragment.mTextTransferOwnScbAccounts = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_own_scb_accounts, "field 'mTextTransferOwnScbAccounts'", TextView.class);
        depositMoreInfoFragment.mTextTransferOtherScbAccounts = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_other_scb_accounts, "field 'mTextTransferOtherScbAccounts'", TextView.class);
        depositMoreInfoFragment.mTextTransferOtherBankAccounts = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_other_bank_accounts, "field 'mTextTransferOtherBankAccounts'", TextView.class);
        depositMoreInfoFragment.mTextTransferPromptPay = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_prompt_pay, "field 'mTextTransferPromptPay'", TextView.class);
        depositMoreInfoFragment.mViewGroupTenorAndDepositAmount = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_tenor_and_deposit_amount, "field 'mViewGroupTenorAndDepositAmount'", ViewGroup.class);
        depositMoreInfoFragment.mTenorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_tenor_title, "field 'mTenorTitle'", TextView.class);
        depositMoreInfoFragment.mTextTenor = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_tenor, "field 'mTextTenor'", TextView.class);
        depositMoreInfoFragment.mTextDepositAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_deposit_amount, "field 'mTextDepositAmount'", TextView.class);
        depositMoreInfoFragment.mViewDepositAmountKey = onStart.IconCompatParcelizer(view, R.id.view_deposit_amount_key, "field 'mViewDepositAmountKey'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.export_statement_button, "field 'moreServices' and method 'onExportStatementButtonClick'");
        depositMoreInfoFragment.moreServices = (Button) onStart.write(IconCompatParcelizer3, R.id.export_statement_button, "field 'moreServices'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositMoreInfoFragment.this.onExportStatementButtonClick();
            }
        });
    }

    public final void read() {
        DepositMoreInfoFragment depositMoreInfoFragment = this.write;
        if (depositMoreInfoFragment != null) {
            this.write = null;
            depositMoreInfoFragment.mLayoutOverdraftStatus = null;
            depositMoreInfoFragment.mCustomProgressBarOverdraftStatus = null;
            depositMoreInfoFragment.mTextProductType = null;
            depositMoreInfoFragment.mTextProductName = null;
            depositMoreInfoFragment.mTextAccountName = null;
            depositMoreInfoFragment.mImageIconExpandMore = null;
            depositMoreInfoFragment.mLayoutCollapsed = null;
            depositMoreInfoFragment.mLayoutExpanded = null;
            depositMoreInfoFragment.mViewGroupBalance = null;
            depositMoreInfoFragment.mTextAccountBalance = null;
            depositMoreInfoFragment.mTextAvailableBalance = null;
            depositMoreInfoFragment.mTextOverdraftInterestAccruedTitle = null;
            depositMoreInfoFragment.mTextInterestAccruedTitle = null;
            depositMoreInfoFragment.mTextInterestAccrued = null;
            depositMoreInfoFragment.mTextOverdraftLimit = null;
            depositMoreInfoFragment.mTextOverdraftLimitUsed = null;
            depositMoreInfoFragment.mViewGroupOverdraftLimit = null;
            depositMoreInfoFragment.mViewGroupInterestAccrued = null;
            depositMoreInfoFragment.mViewGroupTransferLimits = null;
            depositMoreInfoFragment.mTextTransferOwnScbAccounts = null;
            depositMoreInfoFragment.mTextTransferOtherScbAccounts = null;
            depositMoreInfoFragment.mTextTransferOtherBankAccounts = null;
            depositMoreInfoFragment.mTextTransferPromptPay = null;
            depositMoreInfoFragment.mViewGroupTenorAndDepositAmount = null;
            depositMoreInfoFragment.mTenorTitle = null;
            depositMoreInfoFragment.mTextTenor = null;
            depositMoreInfoFragment.mTextDepositAmount = null;
            depositMoreInfoFragment.mViewDepositAmountKey = null;
            depositMoreInfoFragment.moreServices = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
