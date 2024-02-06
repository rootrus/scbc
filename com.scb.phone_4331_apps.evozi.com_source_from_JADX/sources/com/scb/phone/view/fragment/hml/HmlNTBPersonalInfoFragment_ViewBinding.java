package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.custom.common.DateInputWithoutError;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlNTBPersonalInfoFragment_ViewBinding extends HmlBasePersonalInfoFragment_ViewBinding {
    private HmlNTBPersonalInfoFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View write;

    public HmlNTBPersonalInfoFragment_ViewBinding(final HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment, View view) {
        super(hmlNTBPersonalInfoFragment, view);
        this.IconCompatParcelizer = hmlNTBPersonalInfoFragment;
        hmlNTBPersonalInfoFragment.breadcrumbsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbsNtb'", ProgressStateBar.class);
        hmlNTBPersonalInfoFragment.titleSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_ntb_title, "field 'titleSpinner'", CustomSpinnerWithTitle.class);
        hmlNTBPersonalInfoFragment.titleError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_error, "field 'titleError'", TextView.class);
        hmlNTBPersonalInfoFragment.dateOfBirthArea = onStart.IconCompatParcelizer(view, R.id.ll_date_of_birth_container, "field 'dateOfBirthArea'");
        hmlNTBPersonalInfoFragment.firstNameEnglish = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_ntb_personal_info_first_name_eng, "field 'firstNameEnglish'", CommonInputViewGroup.class);
        hmlNTBPersonalInfoFragment.lastNameEnglish = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_ntb_personal_info_last_name_eng, "field 'lastNameEnglish'", CommonInputViewGroup.class);
        hmlNTBPersonalInfoFragment.birthDateInput = (DateInputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cd_hml_ntb_personal_info_birth_date, "field 'birthDateInput'", DateInputText.class);
        hmlNTBPersonalInfoFragment.nationalIdInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_hml_personal_info_national_id, "field 'nationalIdInput'", CommonInputViewGroup.class);
        hmlNTBPersonalInfoFragment.llNTBDatesSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_ntb_national_id_dates_section, "field 'llNTBDatesSection'", LinearLayout.class);
        hmlNTBPersonalInfoFragment.expiryDate = (DateInputWithoutError) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cd_ntb_national_id_expiry_date, "field 'expiryDate'", DateInputWithoutError.class);
        hmlNTBPersonalInfoFragment.issueDate = (DateInputWithoutError) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cd_ntb_national_id_issue_date, "field 'issueDate'", DateInputWithoutError.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_home_address, "field 'homeView' and method 'onHomeClick'");
        hmlNTBPersonalInfoFragment.homeView = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_home_address, "field 'homeView'", TextView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPersonalInfoFragment.this.onHomeClick();
            }
        });
        hmlNTBPersonalInfoFragment.addressCheckboxView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_address_checkbox, "field 'addressCheckboxView'", RelativeLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_address_checkbox, "field 'addressCheckbox' and method 'addressCheckboxCheckedChange'");
        hmlNTBPersonalInfoFragment.addressCheckbox = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.cb_address_checkbox, "field 'addressCheckbox'", CheckBox.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlNTBPersonalInfoFragment.this.addressCheckboxCheckedChange();
            }
        });
        hmlNTBPersonalInfoFragment.mailingAddressLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_layout_mailing_address, "field 'mailingAddressLayout'", RelativeLayout.class);
        hmlNTBPersonalInfoFragment.homeAddressArea = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_home_address_area, "field 'homeAddressArea'", LinearLayout.class);
        hmlNTBPersonalInfoFragment.homeAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_address_header, "field 'homeAddressTitle'", TextView.class);
        hmlNTBPersonalInfoFragment.homeAddressLayout = onStart.IconCompatParcelizer(view, R.id.rl_layout_home_address, "field 'homeAddressLayout'");
        hmlNTBPersonalInfoFragment.homeAddressError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_address_error, "field 'homeAddressError'", TextView.class);
        hmlNTBPersonalInfoFragment.nationalIdCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ic_national_id, "field 'nationalIdCard'", ImageView.class);
        hmlNTBPersonalInfoFragment.issueExpiryDateError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_issue_expiry_date_error, "field 'issueExpiryDateError'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.image_home_current, "method 'onHomeClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPersonalInfoFragment.this.onHomeClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.iv_about, "method 'onAboutClicked'");
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPersonalInfoFragment.this.onAboutClicked(view);
            }
        });
    }

    public final void read() {
        HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment = this.IconCompatParcelizer;
        if (hmlNTBPersonalInfoFragment != null) {
            this.IconCompatParcelizer = null;
            hmlNTBPersonalInfoFragment.breadcrumbsNtb = null;
            hmlNTBPersonalInfoFragment.titleSpinner = null;
            hmlNTBPersonalInfoFragment.titleError = null;
            hmlNTBPersonalInfoFragment.dateOfBirthArea = null;
            hmlNTBPersonalInfoFragment.firstNameEnglish = null;
            hmlNTBPersonalInfoFragment.lastNameEnglish = null;
            hmlNTBPersonalInfoFragment.birthDateInput = null;
            hmlNTBPersonalInfoFragment.nationalIdInput = null;
            hmlNTBPersonalInfoFragment.llNTBDatesSection = null;
            hmlNTBPersonalInfoFragment.expiryDate = null;
            hmlNTBPersonalInfoFragment.issueDate = null;
            hmlNTBPersonalInfoFragment.homeView = null;
            hmlNTBPersonalInfoFragment.addressCheckboxView = null;
            hmlNTBPersonalInfoFragment.addressCheckbox = null;
            hmlNTBPersonalInfoFragment.mailingAddressLayout = null;
            hmlNTBPersonalInfoFragment.homeAddressArea = null;
            hmlNTBPersonalInfoFragment.homeAddressTitle = null;
            hmlNTBPersonalInfoFragment.homeAddressLayout = null;
            hmlNTBPersonalInfoFragment.homeAddressError = null;
            hmlNTBPersonalInfoFragment.nationalIdCard = null;
            hmlNTBPersonalInfoFragment.issueExpiryDateError = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            ((CompoundButton) this.MediaBrowserCompat$CustomActionResultReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
