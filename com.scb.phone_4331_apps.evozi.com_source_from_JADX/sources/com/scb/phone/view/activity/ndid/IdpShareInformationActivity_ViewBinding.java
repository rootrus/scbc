package com.scb.phone.view.activity.ndid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.ndid.CustomIdpTitleWithLabelView;
import p040o.onCreateDialog;
import p040o.onStart;

public class IdpShareInformationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private IdpShareInformationActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public IdpShareInformationActivity_ViewBinding(final IdpShareInformationActivity idpShareInformationActivity, View view) {
        super(idpShareInformationActivity, view);
        this.MediaBrowserCompat$ItemReceiver = idpShareInformationActivity;
        idpShareInformationActivity.layoutPersonalInfoSection = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_personal_info_section, "field 'layoutPersonalInfoSection'", ViewGroup.class);
        idpShareInformationActivity.customThaiName = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_thai_name_container, "field 'customThaiName'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customEnglishName = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_english_name_container, "field 'customEnglishName'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customNationality = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_nationality_container, "field 'customNationality'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customCitizenId = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_citizen_id_container, "field 'customCitizenId'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customDateOfBirth = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_date_of_birth_container, "field 'customDateOfBirth'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customMaritalStatus = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_marital_status_container, "field 'customMaritalStatus'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customGender = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_gender_container, "field 'customGender'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.layoutContactInfoSection = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_contact_info_section, "field 'layoutContactInfoSection'", ViewGroup.class);
        idpShareInformationActivity.customHomeAddress = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_home_address_container, "field 'customHomeAddress'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customCurrentAddress = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_current_address_container, "field 'customCurrentAddress'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.layoutOccupationInfoSection = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_occupation_info_section, "field 'layoutOccupationInfoSection'", ViewGroup.class);
        idpShareInformationActivity.layoutAllContactNumberContainers = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_all_contact_number_container, "field 'layoutAllContactNumberContainers'", ViewGroup.class);
        idpShareInformationActivity.customSingleContactNumber = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_single_contact_number_container, "field 'customSingleContactNumber'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.layoutMultiContactNumberContainers = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_multi_contact_number_container, "field 'layoutMultiContactNumberContainers'", ViewGroup.class);
        idpShareInformationActivity.spnMultiContactNumberValue = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_multi_contact_number_value, "field 'spnMultiContactNumberValue'", Spinner.class);
        idpShareInformationActivity.customCompanyName = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_company_name_container, "field 'customCompanyName'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customJobTitle = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_job_title_container, "field 'customJobTitle'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customIncome = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_income_container, "field 'customIncome'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.customWorkAddress = (CustomIdpTitleWithLabelView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_work_address_container, "field 'customWorkAddress'", CustomIdpTitleWithLabelView.class);
        idpShareInformationActivity.textCreatedDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_customer_created_text, "field 'textCreatedDate'", TextView.class);
        idpShareInformationActivity.textCancellation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_warning_cancellation_text, "field 'textCancellation'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onClickConfirm'");
        idpShareInformationActivity.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                IdpShareInformationActivity.this.onClickConfirm();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_consent, "method 'onCheckedConsent'");
        this.write = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IdpShareInformationActivity.this.onCheckedConsent(compoundButton, z);
            }
        });
    }

    public final void read() {
        IdpShareInformationActivity idpShareInformationActivity = this.MediaBrowserCompat$ItemReceiver;
        if (idpShareInformationActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            idpShareInformationActivity.layoutPersonalInfoSection = null;
            idpShareInformationActivity.customThaiName = null;
            idpShareInformationActivity.customEnglishName = null;
            idpShareInformationActivity.customNationality = null;
            idpShareInformationActivity.customCitizenId = null;
            idpShareInformationActivity.customDateOfBirth = null;
            idpShareInformationActivity.customMaritalStatus = null;
            idpShareInformationActivity.customGender = null;
            idpShareInformationActivity.layoutContactInfoSection = null;
            idpShareInformationActivity.customHomeAddress = null;
            idpShareInformationActivity.customCurrentAddress = null;
            idpShareInformationActivity.layoutOccupationInfoSection = null;
            idpShareInformationActivity.layoutAllContactNumberContainers = null;
            idpShareInformationActivity.customSingleContactNumber = null;
            idpShareInformationActivity.layoutMultiContactNumberContainers = null;
            idpShareInformationActivity.spnMultiContactNumberValue = null;
            idpShareInformationActivity.customCompanyName = null;
            idpShareInformationActivity.customJobTitle = null;
            idpShareInformationActivity.customIncome = null;
            idpShareInformationActivity.customWorkAddress = null;
            idpShareInformationActivity.textCreatedDate = null;
            idpShareInformationActivity.textCancellation = null;
            idpShareInformationActivity.buttonNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            ((CompoundButton) this.write).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
