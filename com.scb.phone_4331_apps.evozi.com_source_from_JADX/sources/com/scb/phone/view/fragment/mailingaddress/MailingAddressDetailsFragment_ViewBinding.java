package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MailingAddressDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private MailingAddressDetailsFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public MailingAddressDetailsFragment_ViewBinding(final MailingAddressDetailsFragment mailingAddressDetailsFragment, View view) {
        super(mailingAddressDetailsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = mailingAddressDetailsFragment;
        mailingAddressDetailsFragment.tvAddressDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radioButton_current_address_sub, "field 'tvAddressDetails'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.radioButton_current_address, "field 'btnCurrentAddress' and method 'onRadioButtonCheckChanged'");
        mailingAddressDetailsFragment.btnCurrentAddress = (ConstraintLayout) onStart.write(IconCompatParcelizer2, R.id.radioButton_current_address, "field 'btnCurrentAddress'", ConstraintLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressDetailsFragment.this.onRadioButtonCheckChanged(view);
            }
        });
        mailingAddressDetailsFragment.btnNewAddressIcon = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radioButton_new_address_button, "field 'btnNewAddressIcon'", RadioButton.class);
        mailingAddressDetailsFragment.btnCurrentAddressIcon = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radioButton_current_address_button, "field 'btnCurrentAddressIcon'", RadioButton.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'btnNext' and method 'onNextClick'");
        mailingAddressDetailsFragment.btnNext = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressDetailsFragment.this.onNextClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.radioButton_new_address, "method 'onRadioButtonCheckChanged'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressDetailsFragment.this.onRadioButtonCheckChanged(view);
            }
        });
    }

    public final void read() {
        MailingAddressDetailsFragment mailingAddressDetailsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (mailingAddressDetailsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mailingAddressDetailsFragment.tvAddressDetails = null;
            mailingAddressDetailsFragment.btnCurrentAddress = null;
            mailingAddressDetailsFragment.btnNewAddressIcon = null;
            mailingAddressDetailsFragment.btnCurrentAddressIcon = null;
            mailingAddressDetailsFragment.btnNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
