package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.InputText;
import com.scb.phone.view.custom.easycash.CustomEmail;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseEasycashReferralSendFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseEasycashReferralSendFragment MediaBrowserCompat$ItemReceiver;

    public BaseEasycashReferralSendFragment_ViewBinding(BaseEasycashReferralSendFragment baseEasycashReferralSendFragment, View view) {
        super(baseEasycashReferralSendFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseEasycashReferralSendFragment;
        baseEasycashReferralSendFragment.headerInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_info_referral, "field 'headerInfo'", TextView.class);
        baseEasycashReferralSendFragment.loansDetails = (InputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loans_edit_text, "field 'loansDetails'", InputText.class);
        baseEasycashReferralSendFragment.errorAmount = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'errorAmount'", TextInputLayout.class);
        baseEasycashReferralSendFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        baseEasycashReferralSendFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        baseEasycashReferralSendFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        baseEasycashReferralSendFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        baseEasycashReferralSendFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        baseEasycashReferralSendFragment.titleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_name_text, "field 'titleName'", TextView.class);
        baseEasycashReferralSendFragment.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_text, "field 'name'", TextView.class);
        baseEasycashReferralSendFragment.phoneEditText = (CustomPhone) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.phone_edit_text, "field 'phoneEditText'", CustomPhone.class);
        baseEasycashReferralSendFragment.emailEditText = (CustomEmail) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_edit_text, "field 'emailEditText'", CustomEmail.class);
        baseEasycashReferralSendFragment.buttonSend = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_send, "field 'buttonSend'", DefaultButton.class);
        baseEasycashReferralSendFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        baseEasycashReferralSendFragment.vPrivacyNotice = onStart.IconCompatParcelizer(view, R.id.v_privacy_notice, "field 'vPrivacyNotice'");
    }

    public void read() {
        BaseEasycashReferralSendFragment baseEasycashReferralSendFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseEasycashReferralSendFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseEasycashReferralSendFragment.headerInfo = null;
            baseEasycashReferralSendFragment.loansDetails = null;
            baseEasycashReferralSendFragment.errorAmount = null;
            baseEasycashReferralSendFragment.amountEditText = null;
            baseEasycashReferralSendFragment.remainingLimitLinearLayout = null;
            baseEasycashReferralSendFragment.textRemainingLimit = null;
            baseEasycashReferralSendFragment.remainingLimit = null;
            baseEasycashReferralSendFragment.remainingLimitError = null;
            baseEasycashReferralSendFragment.titleName = null;
            baseEasycashReferralSendFragment.name = null;
            baseEasycashReferralSendFragment.phoneEditText = null;
            baseEasycashReferralSendFragment.emailEditText = null;
            baseEasycashReferralSendFragment.buttonSend = null;
            baseEasycashReferralSendFragment.tvPrivacyNotice = null;
            baseEasycashReferralSendFragment.vPrivacyNotice = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
