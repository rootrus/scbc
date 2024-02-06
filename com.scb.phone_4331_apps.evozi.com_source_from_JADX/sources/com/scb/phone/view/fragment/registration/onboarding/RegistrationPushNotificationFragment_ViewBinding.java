package com.scb.phone.view.fragment.registration.onboarding;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RegistrationPushNotificationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RegistrationPushNotificationFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public RegistrationPushNotificationFragment_ViewBinding(final RegistrationPushNotificationFragment registrationPushNotificationFragment, View view) {
        super(registrationPushNotificationFragment, view);
        this.IconCompatParcelizer = registrationPushNotificationFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_cancel, "field 'btnCancel' and method 'onNotNow'");
        registrationPushNotificationFragment.btnCancel = (Button) onStart.write(IconCompatParcelizer2, R.id.button_cancel, "field 'btnCancel'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationPushNotificationFragment.this.onNotNow();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_ok, "field 'btnOk' and method 'onNotify'");
        registrationPushNotificationFragment.btnOk = (Button) onStart.write(IconCompatParcelizer3, R.id.button_ok, "field 'btnOk'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationPushNotificationFragment.this.onNotify();
            }
        });
    }

    public final void read() {
        RegistrationPushNotificationFragment registrationPushNotificationFragment = this.IconCompatParcelizer;
        if (registrationPushNotificationFragment != null) {
            this.IconCompatParcelizer = null;
            registrationPushNotificationFragment.btnCancel = null;
            registrationPushNotificationFragment.btnOk = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
