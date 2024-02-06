package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.InputText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class LoanRequestorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private LoanRequestorFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public LoanRequestorFragment_ViewBinding(final LoanRequestorFragment loanRequestorFragment, View view) {
        super(loanRequestorFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = loanRequestorFragment;
        loanRequestorFragment.firstName = (InputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.first_name, "field 'firstName'", InputText.class);
        loanRequestorFragment.lastName = (InputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.last_name, "field 'lastName'", InputText.class);
        loanRequestorFragment.currentAddress = (InputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.current_address, "field 'currentAddress'", InputText.class);
        loanRequestorFragment.officeAddress = (InputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.office_address, "field 'officeAddress'", InputText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "field 'nextButton' and method 'onClick'");
        loanRequestorFragment.nextButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.next_button, "field 'nextButton'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LoanRequestorFragment.this.onClick();
            }
        });
        loanRequestorFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        loanRequestorFragment.vPrivacyNotice = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.v_privacy_notice, "field 'vPrivacyNotice'", LinearLayout.class);
    }

    public final void read() {
        LoanRequestorFragment loanRequestorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (loanRequestorFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            loanRequestorFragment.firstName = null;
            loanRequestorFragment.lastName = null;
            loanRequestorFragment.currentAddress = null;
            loanRequestorFragment.officeAddress = null;
            loanRequestorFragment.nextButton = null;
            loanRequestorFragment.tvPrivacyNotice = null;
            loanRequestorFragment.vPrivacyNotice = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
