package com.scb.phone.view.fragment.ndid;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidIdpVerificationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private NdidIdpVerificationFragment write;

    public NdidIdpVerificationFragment_ViewBinding(final NdidIdpVerificationFragment ndidIdpVerificationFragment, View view) {
        super(ndidIdpVerificationFragment, view);
        this.write = ndidIdpVerificationFragment;
        ndidIdpVerificationFragment.cancelNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_three, "field 'cancelNote'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_get_started, "field 'getStartedButton' and method 'onGetStartedButtonClick'");
        ndidIdpVerificationFragment.getStartedButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_get_started, "field 'getStartedButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidIdpVerificationFragment.this.onGetStartedButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_consent, "field 'consentCheckbox' and method 'onConsentChecked'");
        ndidIdpVerificationFragment.consentCheckbox = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.cb_consent, "field 'consentCheckbox'", CheckBox.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NdidIdpVerificationFragment.this.onConsentChecked(z);
            }
        });
        ndidIdpVerificationFragment.agreeTermsConditionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agree_terms_condition, "field 'agreeTermsConditionTextView'", TextView.class);
        ndidIdpVerificationFragment.tvNoteTwo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_two, "field 'tvNoteTwo'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cb_terms_and_conditions, "method 'onTermsCondChecked'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        ((CompoundButton) IconCompatParcelizer4).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NdidIdpVerificationFragment.this.onTermsCondChecked(z);
            }
        });
    }

    public final void read() {
        NdidIdpVerificationFragment ndidIdpVerificationFragment = this.write;
        if (ndidIdpVerificationFragment != null) {
            this.write = null;
            ndidIdpVerificationFragment.cancelNote = null;
            ndidIdpVerificationFragment.getStartedButton = null;
            ndidIdpVerificationFragment.consentCheckbox = null;
            ndidIdpVerificationFragment.agreeTermsConditionTextView = null;
            ndidIdpVerificationFragment.tvNoteTwo = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            ((CompoundButton) this.IconCompatParcelizer).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
