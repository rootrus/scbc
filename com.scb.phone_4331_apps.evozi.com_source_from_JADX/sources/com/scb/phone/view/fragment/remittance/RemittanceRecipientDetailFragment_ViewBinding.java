package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.TintInputViewGroup;
import com.scb.phone.view.custom.common.TintNoteEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceRecipientDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private RemittanceRecipientDetailFragment write;

    public RemittanceRecipientDetailFragment_ViewBinding(final RemittanceRecipientDetailFragment remittanceRecipientDetailFragment, View view) {
        super(remittanceRecipientDetailFragment, view);
        this.write = remittanceRecipientDetailFragment;
        remittanceRecipientDetailFragment.llContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_container, "field 'llContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.llBankViewsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_bank_views_container, "field 'llBankViewsContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.ivgReceivingBank = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_receiving_bank, "field 'ivgReceivingBank'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.swtAccountType = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_account_type, "field 'swtAccountType'", CustomSpinnerWithTitle.class);
        remittanceRecipientDetailFragment.ivgBankCode = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_bank_code, "field 'ivgBankCode'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgAccountNumber = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_account_number, "field 'ivgAccountNumber'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgSwiftCode = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_swift_code, "field 'ivgSwiftCode'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.llPersonalDetailViewsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_personal_detail_views_container, "field 'llPersonalDetailViewsContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.swtTitle = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_title, "field 'swtTitle'", CustomSpinnerWithTitle.class);
        remittanceRecipientDetailFragment.ivgFirstName = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_first_name, "field 'ivgFirstName'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgLastName = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_last_name, "field 'ivgLastName'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgNationality = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_nationality, "field 'ivgNationality'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.swtIdentificationType = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_identification_type, "field 'swtIdentificationType'", CustomSpinnerWithTitle.class);
        remittanceRecipientDetailFragment.ivgIdentificationNumber = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_identification_number, "field 'ivgIdentificationNumber'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.llAddressViewsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_address_views_container, "field 'llAddressViewsContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.ivgAddress = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_address, "field 'ivgAddress'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgCity = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_city, "field 'ivgCity'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgState = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_state, "field 'ivgState'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.ivgPostcode = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_postcode, "field 'ivgPostcode'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.llContactDetailViewsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_contact_detail_views_container, "field 'llContactDetailViewsContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.tvContactNumberTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_contact_number_title, "field 'tvContactNumberTitle'", TextView.class);
        remittanceRecipientDetailFragment.etCountryCode = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_country_code, "field 'etCountryCode'", CustomEditText.class);
        remittanceRecipientDetailFragment.etPhoneNumber = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_phone_number, "field 'etPhoneNumber'", CustomEditText.class);
        remittanceRecipientDetailFragment.ivgEmail = (TintInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_email, "field 'ivgEmail'", TintInputViewGroup.class);
        remittanceRecipientDetailFragment.llTransactionDetailViewsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_transaction_detail_views_container, "field 'llTransactionDetailViewsContainer'", LinearLayout.class);
        remittanceRecipientDetailFragment.swtPurpose = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_purpose, "field 'swtPurpose'", CustomSpinnerWithTitle.class);
        remittanceRecipientDetailFragment.etNote = (TintNoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_note, "field 'etNote'", TintNoteEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_action, "field 'btAction' and method 'onButtonClicked'");
        remittanceRecipientDetailFragment.btAction = (Button) onStart.write(IconCompatParcelizer, R.id.bt_action, "field 'btAction'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceRecipientDetailFragment.this.onButtonClicked();
            }
        });
    }

    public final void read() {
        RemittanceRecipientDetailFragment remittanceRecipientDetailFragment = this.write;
        if (remittanceRecipientDetailFragment != null) {
            this.write = null;
            remittanceRecipientDetailFragment.llContainer = null;
            remittanceRecipientDetailFragment.llBankViewsContainer = null;
            remittanceRecipientDetailFragment.ivgReceivingBank = null;
            remittanceRecipientDetailFragment.swtAccountType = null;
            remittanceRecipientDetailFragment.ivgBankCode = null;
            remittanceRecipientDetailFragment.ivgAccountNumber = null;
            remittanceRecipientDetailFragment.ivgSwiftCode = null;
            remittanceRecipientDetailFragment.llPersonalDetailViewsContainer = null;
            remittanceRecipientDetailFragment.swtTitle = null;
            remittanceRecipientDetailFragment.ivgFirstName = null;
            remittanceRecipientDetailFragment.ivgLastName = null;
            remittanceRecipientDetailFragment.ivgNationality = null;
            remittanceRecipientDetailFragment.swtIdentificationType = null;
            remittanceRecipientDetailFragment.ivgIdentificationNumber = null;
            remittanceRecipientDetailFragment.llAddressViewsContainer = null;
            remittanceRecipientDetailFragment.ivgAddress = null;
            remittanceRecipientDetailFragment.ivgCity = null;
            remittanceRecipientDetailFragment.ivgState = null;
            remittanceRecipientDetailFragment.ivgPostcode = null;
            remittanceRecipientDetailFragment.llContactDetailViewsContainer = null;
            remittanceRecipientDetailFragment.tvContactNumberTitle = null;
            remittanceRecipientDetailFragment.etCountryCode = null;
            remittanceRecipientDetailFragment.etPhoneNumber = null;
            remittanceRecipientDetailFragment.ivgEmail = null;
            remittanceRecipientDetailFragment.llTransactionDetailViewsContainer = null;
            remittanceRecipientDetailFragment.swtPurpose = null;
            remittanceRecipientDetailFragment.etNote = null;
            remittanceRecipientDetailFragment.btAction = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
