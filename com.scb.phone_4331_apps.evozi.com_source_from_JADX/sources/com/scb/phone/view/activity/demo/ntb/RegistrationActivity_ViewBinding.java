package com.scb.phone.view.activity.demo.ntb;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RegistrationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private RegistrationActivity MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View write;

    public RegistrationActivity_ViewBinding(final RegistrationActivity registrationActivity, View view) {
        super(registrationActivity, view);
        this.MediaBrowserCompat$ItemReceiver = registrationActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_not_sure, "field 'notSureButton' and method 'clickNotSure'");
        registrationActivity.notSureButton = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_not_sure, "field 'notSureButton'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationActivity.this.clickNotSure();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_switch_to_thai, "field 'tvSwitchToThai' and method 'clickSwitchToThai'");
        registrationActivity.tvSwitchToThai = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_switch_to_thai, "field 'tvSwitchToThai'", TextView.class);
        this.MediaMetadataCompat = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationActivity.this.clickSwitchToThai();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_switch_to_eng, "field 'tvSwitchToEng' and method 'clickSwitchToEng'");
        registrationActivity.tvSwitchToEng = (TextView) onStart.write(IconCompatParcelizer4, R.id.tv_switch_to_eng, "field 'tvSwitchToEng'", TextView.class);
        this.MediaDescriptionCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationActivity.this.clickSwitchToEng();
            }
        });
        registrationActivity.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        registrationActivity.tvMobilePreregistration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mobile_pre_regis, "field 'tvMobilePreregistration'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_try_demo, "method 'clickNonCustomer'");
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationActivity.this.clickNonCustomer();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.bt_registration, "method 'clickCustomer'");
        this.write = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationActivity.this.clickCustomer();
            }
        });
    }

    public final void read() {
        RegistrationActivity registrationActivity = this.MediaBrowserCompat$ItemReceiver;
        if (registrationActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            registrationActivity.notSureButton = null;
            registrationActivity.tvSwitchToThai = null;
            registrationActivity.tvSwitchToEng = null;
            registrationActivity.tvPrivacyNotice = null;
            registrationActivity.tvMobilePreregistration = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
