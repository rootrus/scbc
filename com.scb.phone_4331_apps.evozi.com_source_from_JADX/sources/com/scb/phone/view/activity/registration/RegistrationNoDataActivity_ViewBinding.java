package com.scb.phone.view.activity.registration;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RegistrationNoDataActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private RegistrationNoDataActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public RegistrationNoDataActivity_ViewBinding(final RegistrationNoDataActivity registrationNoDataActivity, View view) {
        super(registrationNoDataActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = registrationNoDataActivity;
        registrationNoDataActivity.imageInfo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_info, "field 'imageInfo'", ImageView.class);
        registrationNoDataActivity.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'textTitle'", TextView.class);
        registrationNoDataActivity.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description, "field 'description'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'returnHome'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationNoDataActivity.this.returnHome();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_find_us, "method 'gotoFindUs'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationNoDataActivity.this.gotoFindUs();
            }
        });
    }

    public final void read() {
        RegistrationNoDataActivity registrationNoDataActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (registrationNoDataActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            registrationNoDataActivity.imageInfo = null;
            registrationNoDataActivity.textTitle = null;
            registrationNoDataActivity.description = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
