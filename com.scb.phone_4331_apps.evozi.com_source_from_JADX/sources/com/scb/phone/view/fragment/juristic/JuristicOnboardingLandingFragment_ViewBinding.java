package com.scb.phone.view.fragment.juristic;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ClearableOutLineEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class JuristicOnboardingLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private JuristicOnboardingLandingFragment IconCompatParcelizer;

    public JuristicOnboardingLandingFragment_ViewBinding(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment, View view) {
        super(juristicOnboardingLandingFragment, view);
        this.IconCompatParcelizer = juristicOnboardingLandingFragment;
        juristicOnboardingLandingFragment.buttonNext = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'buttonNext'", Button.class);
        juristicOnboardingLandingFragment.backButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.back_image, "field 'backButton'", ImageView.class);
        juristicOnboardingLandingFragment.editTextRegistrationNo = (ClearableOutLineEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_registration_no, "field 'editTextRegistrationNo'", ClearableOutLineEditText.class);
        juristicOnboardingLandingFragment.editTextPin = (ClearableOutLineEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_pin, "field 'editTextPin'", ClearableOutLineEditText.class);
        juristicOnboardingLandingFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        juristicOnboardingLandingFragment.tvRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'tvRefId'", TextView.class);
        juristicOnboardingLandingFragment.tvResendPin = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_resend_starting_pin, "field 'tvResendPin'", TextView.class);
    }

    public final void read() {
        JuristicOnboardingLandingFragment juristicOnboardingLandingFragment = this.IconCompatParcelizer;
        if (juristicOnboardingLandingFragment != null) {
            this.IconCompatParcelizer = null;
            juristicOnboardingLandingFragment.buttonNext = null;
            juristicOnboardingLandingFragment.backButton = null;
            juristicOnboardingLandingFragment.editTextRegistrationNo = null;
            juristicOnboardingLandingFragment.editTextPin = null;
            juristicOnboardingLandingFragment.tvRemark = null;
            juristicOnboardingLandingFragment.tvRefId = null;
            juristicOnboardingLandingFragment.tvResendPin = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
