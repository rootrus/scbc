package com.scb.phone.view.fragment.ndid;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidSelectIdpFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private NdidSelectIdpFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public NdidSelectIdpFragment_ViewBinding(final NdidSelectIdpFragment ndidSelectIdpFragment, View view) {
        super(ndidSelectIdpFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ndidSelectIdpFragment;
        ndidSelectIdpFragment.idpSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.idp_spinner, "field 'idpSpinner'", CustomSpinnerWithTitle.class);
        ndidSelectIdpFragment.agreeTermsConditionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agree_terms_condition, "field 'agreeTermsConditionTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'onNextButtonClick'");
        ndidSelectIdpFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidSelectIdpFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_consent, "method 'onConsentChecked'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NdidSelectIdpFragment.this.onConsentChecked(z);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cb_terms_and_conditions, "method 'onTermsCondChecked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        ((CompoundButton) IconCompatParcelizer4).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NdidSelectIdpFragment.this.onTermsCondChecked(z);
            }
        });
    }

    public final void read() {
        NdidSelectIdpFragment ndidSelectIdpFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ndidSelectIdpFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ndidSelectIdpFragment.idpSpinner = null;
            ndidSelectIdpFragment.agreeTermsConditionTextView = null;
            ndidSelectIdpFragment.nextButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            ((CompoundButton) this.IconCompatParcelizer).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.IconCompatParcelizer = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
