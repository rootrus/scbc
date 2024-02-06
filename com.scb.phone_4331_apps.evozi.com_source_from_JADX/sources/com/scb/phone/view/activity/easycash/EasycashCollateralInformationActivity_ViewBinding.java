package com.scb.phone.view.activity.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashCollateralInformationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashCollateralInformationActivity write;

    public EasycashCollateralInformationActivity_ViewBinding(final EasycashCollateralInformationActivity easycashCollateralInformationActivity, View view) {
        super(easycashCollateralInformationActivity, view);
        this.write = easycashCollateralInformationActivity;
        easycashCollateralInformationActivity.layoutLocation = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_location, "field 'layoutLocation'", RelativeLayout.class);
        easycashCollateralInformationActivity.customSpinnerLoadType = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_location, "field 'customSpinnerLoadType'", CustomSpinnerWithTitle.class);
        easycashCollateralInformationActivity.amountLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_price_layout, "field 'amountLayout'", TextInputLayout.class);
        easycashCollateralInformationActivity.etPrice = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_price, "field 'etPrice'", AmountEditText.class);
        easycashCollateralInformationActivity.rgCollateralOwnership = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_collateral_ownership_option, "field 'rgCollateralOwnership'", RadioGroup.class);
        easycashCollateralInformationActivity.rgResidentialStatus = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_residential_status_option, "field 'rgResidentialStatus'", RadioGroup.class);
        easycashCollateralInformationActivity.rgFireInsurance = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_fire_insurance_option, "field 'rgFireInsurance'", RadioGroup.class);
        easycashCollateralInformationActivity.rgLifeInsurance = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_life_insurance_option, "field 'rgLifeInsurance'", RadioGroup.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_calculate, "field 'btnCalculate' and method 'onCalculateClick'");
        easycashCollateralInformationActivity.btnCalculate = (Button) onStart.write(IconCompatParcelizer, R.id.button_calculate, "field 'btnCalculate'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCollateralInformationActivity.this.onCalculateClick();
            }
        });
        easycashCollateralInformationActivity.textLocation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_location, "field 'textLocation'", TextView.class);
    }

    public final void read() {
        EasycashCollateralInformationActivity easycashCollateralInformationActivity = this.write;
        if (easycashCollateralInformationActivity != null) {
            this.write = null;
            easycashCollateralInformationActivity.layoutLocation = null;
            easycashCollateralInformationActivity.customSpinnerLoadType = null;
            easycashCollateralInformationActivity.amountLayout = null;
            easycashCollateralInformationActivity.etPrice = null;
            easycashCollateralInformationActivity.rgCollateralOwnership = null;
            easycashCollateralInformationActivity.rgResidentialStatus = null;
            easycashCollateralInformationActivity.rgFireInsurance = null;
            easycashCollateralInformationActivity.rgLifeInsurance = null;
            easycashCollateralInformationActivity.btnCalculate = null;
            easycashCollateralInformationActivity.textLocation = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
