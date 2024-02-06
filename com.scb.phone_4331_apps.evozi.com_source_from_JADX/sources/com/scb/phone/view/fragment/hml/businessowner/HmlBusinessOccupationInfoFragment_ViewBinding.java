package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomExternalSelector;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HmlBusinessOccupationInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlBusinessOccupationInfoFragment IconCompatParcelizer;

    public HmlBusinessOccupationInfoFragment_ViewBinding(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment, View view) {
        super(hmlBusinessOccupationInfoFragment, view);
        this.IconCompatParcelizer = hmlBusinessOccupationInfoFragment;
        hmlBusinessOccupationInfoFragment.ivgRegistered = (CustomExternalSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_registered_business_name, "field 'ivgRegistered'", CustomExternalSelector.class);
        hmlBusinessOccupationInfoFragment.ivgContactNumber = (CustomPhoneNumberInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_business_contact_number, "field 'ivgContactNumber'", CustomPhoneNumberInput.class);
        hmlBusinessOccupationInfoFragment.yearsSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_year, "field 'yearsSpinner'", CustomSpinnerWithTitle.class);
        hmlBusinessOccupationInfoFragment.monthsSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_month, "field 'monthsSpinner'", CustomSpinnerWithTitle.class);
        hmlBusinessOccupationInfoFragment.experienceError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_experience_error, "field 'experienceError'", TextView.class);
        hmlBusinessOccupationInfoFragment.professionButtons = (CustomAcceptDeclineButtons) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bts_model_consent, "field 'professionButtons'", CustomAcceptDeclineButtons.class);
        hmlBusinessOccupationInfoFragment.cbProfession = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_profession, "field 'cbProfession'", CheckBox.class);
        hmlBusinessOccupationInfoFragment.tvProfessionLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession_label, "field 'tvProfessionLabel'", TextView.class);
        hmlBusinessOccupationInfoFragment.tvProfessionFooter = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession_footer, "field 'tvProfessionFooter'", TextView.class);
        hmlBusinessOccupationInfoFragment.tvProfessionError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession_error, "field 'tvProfessionError'", TextView.class);
        hmlBusinessOccupationInfoFragment.addressSelector = (CustomExternalSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.es_business_address, "field 'addressSelector'", CustomExternalSelector.class);
        hmlBusinessOccupationInfoFragment.tvNameFooter = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_business_name_footer, "field 'tvNameFooter'", TextView.class);
        hmlBusinessOccupationInfoFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'nextButton'", Button.class);
    }

    public final void read() {
        HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment = this.IconCompatParcelizer;
        if (hmlBusinessOccupationInfoFragment != null) {
            this.IconCompatParcelizer = null;
            hmlBusinessOccupationInfoFragment.ivgRegistered = null;
            hmlBusinessOccupationInfoFragment.ivgContactNumber = null;
            hmlBusinessOccupationInfoFragment.yearsSpinner = null;
            hmlBusinessOccupationInfoFragment.monthsSpinner = null;
            hmlBusinessOccupationInfoFragment.experienceError = null;
            hmlBusinessOccupationInfoFragment.professionButtons = null;
            hmlBusinessOccupationInfoFragment.cbProfession = null;
            hmlBusinessOccupationInfoFragment.tvProfessionLabel = null;
            hmlBusinessOccupationInfoFragment.tvProfessionFooter = null;
            hmlBusinessOccupationInfoFragment.tvProfessionError = null;
            hmlBusinessOccupationInfoFragment.addressSelector = null;
            hmlBusinessOccupationInfoFragment.tvNameFooter = null;
            hmlBusinessOccupationInfoFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
