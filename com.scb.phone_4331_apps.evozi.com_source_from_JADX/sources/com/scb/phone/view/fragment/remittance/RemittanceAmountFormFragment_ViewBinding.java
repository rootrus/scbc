package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.TintNoteEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceAmountFormFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RemittanceAmountFormFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public RemittanceAmountFormFragment_ViewBinding(final RemittanceAmountFormFragment remittanceAmountFormFragment, View view) {
        super(remittanceAmountFormFragment, view);
        this.IconCompatParcelizer = remittanceAmountFormFragment;
        remittanceAmountFormFragment.ivCountryFlag = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_country_flag, "field 'ivCountryFlag'", ImageView.class);
        remittanceAmountFormFragment.tvCountryName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_country_name, "field 'tvCountryName'", TextView.class);
        remittanceAmountFormFragment.tvExchangeRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_exchange_rate, "field 'tvExchangeRate'", TextView.class);
        remittanceAmountFormFragment.tvRateDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_rate_description, "field 'tvRateDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_edit, "field 'ivEdit' and method 'onEditClicked'");
        remittanceAmountFormFragment.ivEdit = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_edit, "field 'ivEdit'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceAmountFormFragment.this.onEditClicked();
            }
        });
        remittanceAmountFormFragment.tvTitleFromAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_from_amount, "field 'tvTitleFromAmount'", TextView.class);
        remittanceAmountFormFragment.clAmountFromContainer = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cl_amount_from_container, "field 'clAmountFromContainer'", ConstraintLayout.class);
        remittanceAmountFormFragment.etFromAmountValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_from_amount_value, "field 'etFromAmountValue'", AmountEditText.class);
        remittanceAmountFormFragment.clAmountToContainer = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cl_amount_to_container, "field 'clAmountToContainer'", ConstraintLayout.class);
        remittanceAmountFormFragment.tvTitleToAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_to_amount, "field 'tvTitleToAmount'", TextView.class);
        remittanceAmountFormFragment.etToAmountValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_to_amount_value, "field 'etToAmountValue'", AmountEditText.class);
        remittanceAmountFormFragment.tvMaxLimitTransaction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_max_limit_transaction, "field 'tvMaxLimitTransaction'", TextView.class);
        remittanceAmountFormFragment.tvPayNowRemainingDailyLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_paynow_remaining_daily_limit, "field 'tvPayNowRemainingDailyLimit'", TextView.class);
        remittanceAmountFormFragment.tvRemainingDailyLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remaining_daily_limit, "field 'tvRemainingDailyLimit'", TextView.class);
        remittanceAmountFormFragment.tvRemainingMonthlyLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remaining_monthly_limit, "field 'tvRemainingMonthlyLimit'", TextView.class);
        remittanceAmountFormFragment.tvRemainingTimesMonthly = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remaining_times_monthly, "field 'tvRemainingTimesMonthly'", TextView.class);
        remittanceAmountFormFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        remittanceAmountFormFragment.vSpace = onStart.IconCompatParcelizer(view, R.id.v_space, "field 'vSpace'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_action, "field 'btAction' and method 'onActionButtonClicked'");
        remittanceAmountFormFragment.btAction = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_action, "field 'btAction'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceAmountFormFragment.this.onActionButtonClicked();
            }
        });
        remittanceAmountFormFragment.csMobileSectionLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_mobile_section, "field 'csMobileSectionLayout'", ConstraintLayout.class);
        remittanceAmountFormFragment.etMobileInputField = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_mobile_input_field, "field 'etMobileInputField'", CustomEditText.class);
        remittanceAmountFormFragment.swtPurpose = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_purpose_type, "field 'swtPurpose'", CustomSpinnerWithTitle.class);
        remittanceAmountFormFragment.tvMoreTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_more_title, "field 'tvMoreTitle'", TextView.class);
        remittanceAmountFormFragment.etNote = (TintNoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_note, "field 'etNote'", TintNoteEditText.class);
        remittanceAmountFormFragment.tvMobileDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mobile_desc, "field 'tvMobileDesc'", TextView.class);
        remittanceAmountFormFragment.tvErrorAmountTo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_amount_to, "field 'tvErrorAmountTo'", TextView.class);
    }

    public final void read() {
        RemittanceAmountFormFragment remittanceAmountFormFragment = this.IconCompatParcelizer;
        if (remittanceAmountFormFragment != null) {
            this.IconCompatParcelizer = null;
            remittanceAmountFormFragment.ivCountryFlag = null;
            remittanceAmountFormFragment.tvCountryName = null;
            remittanceAmountFormFragment.tvExchangeRate = null;
            remittanceAmountFormFragment.tvRateDescription = null;
            remittanceAmountFormFragment.ivEdit = null;
            remittanceAmountFormFragment.tvTitleFromAmount = null;
            remittanceAmountFormFragment.clAmountFromContainer = null;
            remittanceAmountFormFragment.etFromAmountValue = null;
            remittanceAmountFormFragment.clAmountToContainer = null;
            remittanceAmountFormFragment.tvTitleToAmount = null;
            remittanceAmountFormFragment.etToAmountValue = null;
            remittanceAmountFormFragment.tvMaxLimitTransaction = null;
            remittanceAmountFormFragment.tvPayNowRemainingDailyLimit = null;
            remittanceAmountFormFragment.tvRemainingDailyLimit = null;
            remittanceAmountFormFragment.tvRemainingMonthlyLimit = null;
            remittanceAmountFormFragment.tvRemainingTimesMonthly = null;
            remittanceAmountFormFragment.tvRemark = null;
            remittanceAmountFormFragment.vSpace = null;
            remittanceAmountFormFragment.btAction = null;
            remittanceAmountFormFragment.csMobileSectionLayout = null;
            remittanceAmountFormFragment.etMobileInputField = null;
            remittanceAmountFormFragment.swtPurpose = null;
            remittanceAmountFormFragment.tvMoreTitle = null;
            remittanceAmountFormFragment.etNote = null;
            remittanceAmountFormFragment.tvMobileDesc = null;
            remittanceAmountFormFragment.tvErrorAmountTo = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
