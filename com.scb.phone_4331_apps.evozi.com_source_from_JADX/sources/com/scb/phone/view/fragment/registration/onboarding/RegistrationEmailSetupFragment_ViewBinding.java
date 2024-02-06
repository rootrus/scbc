package com.scb.phone.view.fragment.registration.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RegistrationEmailSetupFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private RegistrationEmailSetupFragment write;

    public RegistrationEmailSetupFragment_ViewBinding(final RegistrationEmailSetupFragment registrationEmailSetupFragment, View view) {
        super(registrationEmailSetupFragment, view);
        this.write = registrationEmailSetupFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_cancel, "method 'onNotNow'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationEmailSetupFragment.this.onNotNow();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_ok, "method 'onSetupEmail'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationEmailSetupFragment.this.onSetupEmail();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
