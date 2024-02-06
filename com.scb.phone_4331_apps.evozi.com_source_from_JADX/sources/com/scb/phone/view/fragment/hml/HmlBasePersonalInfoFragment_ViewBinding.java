package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.CustomLaserIdInput;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBasePersonalInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBasePersonalInfoFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlBasePersonalInfoFragment_ViewBinding(final HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment, View view) {
        super(hmlBasePersonalInfoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlBasePersonalInfoFragment;
        hmlBasePersonalInfoFragment.root = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_root, "field 'root'", LinearLayout.class);
        hmlBasePersonalInfoFragment.firstNameView = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_first_name, "field 'firstNameView'", CommonInputViewGroup.class);
        hmlBasePersonalInfoFragment.nameSection = onStart.IconCompatParcelizer(view, R.id.hml_name_section, "field 'nameSection'");
        hmlBasePersonalInfoFragment.nameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_personal_info_name_input, "field 'nameValue'", TextView.class);
        hmlBasePersonalInfoFragment.lastNameView = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_last_name, "field 'lastNameView'", CommonInputViewGroup.class);
        hmlBasePersonalInfoFragment.mobileNumberView = (CustomPhoneNumberInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_mobile_number, "field 'mobileNumberView'", CustomPhoneNumberInput.class);
        hmlBasePersonalInfoFragment.emailView = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_email_address, "field 'emailView'", CommonInputViewGroup.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.tv_mailing_address, "field 'mailingView' and method 'onMailingClick'");
        hmlBasePersonalInfoFragment.mailingView = (TextView) onStart.write(IconCompatParcelizer, R.id.tv_mailing_address, "field 'mailingView'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBasePersonalInfoFragment.this.onMailingClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.image_arrow_current, "field 'mailingArrow' and method 'onMailingClick'");
        hmlBasePersonalInfoFragment.mailingArrow = (ImageView) onStart.write(IconCompatParcelizer2, R.id.image_arrow_current, "field 'mailingArrow'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBasePersonalInfoFragment.this.onMailingClick();
            }
        });
        hmlBasePersonalInfoFragment.laserIdInput = (CustomLaserIdInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_laser_id, "field 'laserIdInput'", CustomLaserIdInput.class);
        hmlBasePersonalInfoFragment.incomeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_input_income_error, "field 'incomeError'", TextView.class);
        hmlBasePersonalInfoFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'nextButton'", Button.class);
        hmlBasePersonalInfoFragment.income = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_income, "field 'income'", CustomEditText.class);
        hmlBasePersonalInfoFragment.separator = onStart.IconCompatParcelizer(view, R.id.vw_separator, "field 'separator'");
        hmlBasePersonalInfoFragment.maritalStatusSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_marital_status, "field 'maritalStatusSpinner'", CustomSpinnerWithTitle.class);
        hmlBasePersonalInfoFragment.educationLevelSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_education_level, "field 'educationLevelSpinner'", CustomSpinnerWithTitle.class);
        hmlBasePersonalInfoFragment.residentialStatusSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_residential_status, "field 'residentialStatusSpinner'", CustomSpinnerWithTitle.class);
        hmlBasePersonalInfoFragment.residentialStatusError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_residential_status_error, "field 'residentialStatusError'", TextView.class);
        hmlBasePersonalInfoFragment.maritalStatusError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_marital_status_error, "field 'maritalStatusError'", TextView.class);
        hmlBasePersonalInfoFragment.educationalLevelError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_education_level_error, "field 'educationalLevelError'", TextView.class);
        hmlBasePersonalInfoFragment.mailingViewError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mailing_address_error, "field 'mailingViewError'", TextView.class);
        hmlBasePersonalInfoFragment.sameAddressCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_address_checkbox, "field 'sameAddressCheckBox'", CheckBox.class);
        hmlBasePersonalInfoFragment.baseExpiredDate = (DateInputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cd_national_id_expiry_date, "field 'baseExpiredDate'", DateInputText.class);
        hmlBasePersonalInfoFragment.emailRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email_remark, "field 'emailRemark'", TextView.class);
        hmlBasePersonalInfoFragment.mobileNumberOtpMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_personal_info_mobile_number_otp_msg, "field 'mobileNumberOtpMsg'", TextView.class);
    }

    public void read() {
        HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlBasePersonalInfoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlBasePersonalInfoFragment.root = null;
            hmlBasePersonalInfoFragment.firstNameView = null;
            hmlBasePersonalInfoFragment.nameSection = null;
            hmlBasePersonalInfoFragment.nameValue = null;
            hmlBasePersonalInfoFragment.lastNameView = null;
            hmlBasePersonalInfoFragment.mobileNumberView = null;
            hmlBasePersonalInfoFragment.emailView = null;
            hmlBasePersonalInfoFragment.mailingView = null;
            hmlBasePersonalInfoFragment.mailingArrow = null;
            hmlBasePersonalInfoFragment.laserIdInput = null;
            hmlBasePersonalInfoFragment.incomeError = null;
            hmlBasePersonalInfoFragment.nextButton = null;
            hmlBasePersonalInfoFragment.income = null;
            hmlBasePersonalInfoFragment.separator = null;
            hmlBasePersonalInfoFragment.maritalStatusSpinner = null;
            hmlBasePersonalInfoFragment.educationLevelSpinner = null;
            hmlBasePersonalInfoFragment.residentialStatusSpinner = null;
            hmlBasePersonalInfoFragment.residentialStatusError = null;
            hmlBasePersonalInfoFragment.maritalStatusError = null;
            hmlBasePersonalInfoFragment.educationalLevelError = null;
            hmlBasePersonalInfoFragment.mailingViewError = null;
            hmlBasePersonalInfoFragment.sameAddressCheckBox = null;
            hmlBasePersonalInfoFragment.baseExpiredDate = null;
            hmlBasePersonalInfoFragment.emailRemark = null;
            hmlBasePersonalInfoFragment.mobileNumberOtpMsg = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
