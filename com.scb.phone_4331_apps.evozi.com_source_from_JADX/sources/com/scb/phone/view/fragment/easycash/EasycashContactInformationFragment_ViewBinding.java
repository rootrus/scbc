package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashContactInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private EasycashContactInformationFragment write;

    public EasycashContactInformationFragment_ViewBinding(final EasycashContactInformationFragment easycashContactInformationFragment, View view) {
        super(easycashContactInformationFragment, view);
        this.write = easycashContactInformationFragment;
        easycashContactInformationFragment.addressInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_mailing_address, "field 'addressInfo'", TextView.class);
        easycashContactInformationFragment.textAddressError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_mailing_address_error, "field 'textAddressError'", TextView.class);
        easycashContactInformationFragment.consentList = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.consent_list, "field 'consentList'", CustomSeparatedViews.class);
        easycashContactInformationFragment.termsAndConditionsCheck = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agree_terms_conditions_checkbox, "field 'termsAndConditionsCheck'", CheckBox.class);
        easycashContactInformationFragment.termsConditionsText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agree_terms_conditions_text, "field 'termsConditionsText'", TextView.class);
        easycashContactInformationFragment.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_text, "field 'tvName'", TextView.class);
        easycashContactInformationFragment.englishNameGroup = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.english_name, "field 'englishNameGroup'", LinearLayout.class);
        easycashContactInformationFragment.firstName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_first_name, "field 'firstName'", CommonInputViewGroup.class);
        easycashContactInformationFragment.lastName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_last_name, "field 'lastName'", CommonInputViewGroup.class);
        easycashContactInformationFragment.tvEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_text, "field 'tvEmail'", TextView.class);
        easycashContactInformationFragment.phoneEditText = (CustomPhone) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.phone_edit_text, "field 'phoneEditText'", CustomPhone.class);
        easycashContactInformationFragment.mImageIconExpandMore = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'mImageIconExpandMore'", ImageView.class);
        easycashContactInformationFragment.refCodeExpandView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_code_expand_view, "field 'refCodeExpandView'", LinearLayout.class);
        easycashContactInformationFragment.refCode1 = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_code_1, "field 'refCode1'", CommonInputViewGroup.class);
        easycashContactInformationFragment.refCode2 = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_code_2, "field 'refCode2'", CommonInputViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'btnNext' and method 'nextButtonClick'");
        easycashContactInformationFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashContactInformationFragment.this.nextButtonClick();
            }
        });
        easycashContactInformationFragment.labelConsentSection = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_consent_section, "field 'labelConsentSection'", CustomEasyCashSectionLabel.class);
        easycashContactInformationFragment.layoutConsentContent = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_consent_content, "field 'layoutConsentContent'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ref_code_collapse_view, "method 'onLayoutCollapsedClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashContactInformationFragment.this.onLayoutCollapsedClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.layout_mailing_address, "method 'onAddressClick'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashContactInformationFragment.this.onAddressClick();
            }
        });
    }

    public final void read() {
        EasycashContactInformationFragment easycashContactInformationFragment = this.write;
        if (easycashContactInformationFragment != null) {
            this.write = null;
            easycashContactInformationFragment.addressInfo = null;
            easycashContactInformationFragment.textAddressError = null;
            easycashContactInformationFragment.consentList = null;
            easycashContactInformationFragment.termsAndConditionsCheck = null;
            easycashContactInformationFragment.termsConditionsText = null;
            easycashContactInformationFragment.tvName = null;
            easycashContactInformationFragment.englishNameGroup = null;
            easycashContactInformationFragment.firstName = null;
            easycashContactInformationFragment.lastName = null;
            easycashContactInformationFragment.tvEmail = null;
            easycashContactInformationFragment.phoneEditText = null;
            easycashContactInformationFragment.mImageIconExpandMore = null;
            easycashContactInformationFragment.refCodeExpandView = null;
            easycashContactInformationFragment.refCode1 = null;
            easycashContactInformationFragment.refCode2 = null;
            easycashContactInformationFragment.btnNext = null;
            easycashContactInformationFragment.labelConsentSection = null;
            easycashContactInformationFragment.layoutConsentContent = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
