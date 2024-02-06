package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class PromptPayTermsAndConditionsLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PromptPayTermsAndConditionsLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public PromptPayTermsAndConditionsLandingFragment_ViewBinding(PromptPayTermsAndConditionsLandingFragment promptPayTermsAndConditionsLandingFragment, View view) {
        super(promptPayTermsAndConditionsLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = promptPayTermsAndConditionsLandingFragment;
        promptPayTermsAndConditionsLandingFragment.termsAndConditionsCheck = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agree_terms_conditions_checkbox, "field 'termsAndConditionsCheck'", CheckBox.class);
        promptPayTermsAndConditionsLandingFragment.termsConditionsText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agree_terms_conditions_text, "field 'termsConditionsText'", TextView.class);
        promptPayTermsAndConditionsLandingFragment.buttonNext = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'buttonNext'", Button.class);
    }

    public final void read() {
        PromptPayTermsAndConditionsLandingFragment promptPayTermsAndConditionsLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (promptPayTermsAndConditionsLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            promptPayTermsAndConditionsLandingFragment.termsAndConditionsCheck = null;
            promptPayTermsAndConditionsLandingFragment.termsConditionsText = null;
            promptPayTermsAndConditionsLandingFragment.buttonNext = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
