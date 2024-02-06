package com.scb.phone.view.fragment.registration;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RegistrationSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RegistrationSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public RegistrationSuccessFragment_ViewBinding(final RegistrationSuccessFragment registrationSuccessFragment, View view) {
        super(registrationSuccessFragment, view);
        this.IconCompatParcelizer = registrationSuccessFragment;
        registrationSuccessFragment.imageLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image, "field 'imageLogo'", ImageView.class);
        registrationSuccessFragment.textMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text, "field 'textMessage'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "field 'buttonNext' and method 'onNextButtonClicked'");
        registrationSuccessFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.next_button, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationSuccessFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        RegistrationSuccessFragment registrationSuccessFragment = this.IconCompatParcelizer;
        if (registrationSuccessFragment != null) {
            this.IconCompatParcelizer = null;
            registrationSuccessFragment.imageLogo = null;
            registrationSuccessFragment.textMessage = null;
            registrationSuccessFragment.buttonNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
