package com.scb.phone.view.fragment.registration;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RegistrationFacialVerificationLockedActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private RegistrationFacialVerificationLockedActivity MediaBrowserCompat$ItemReceiver;

    public RegistrationFacialVerificationLockedActivity_ViewBinding(final RegistrationFacialVerificationLockedActivity registrationFacialVerificationLockedActivity, View view) {
        super(registrationFacialVerificationLockedActivity, view);
        this.MediaBrowserCompat$ItemReceiver = registrationFacialVerificationLockedActivity;
        registrationFacialVerificationLockedActivity.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleTextView'", TextView.class);
        registrationFacialVerificationLockedActivity.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description, "field 'descriptionTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'descriptionButton' and method 'onNextButtonClicked'");
        registrationFacialVerificationLockedActivity.descriptionButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'descriptionButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationFacialVerificationLockedActivity.this.onNextButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_return, "field 'returnButton' and method 'onReturnButtonClicked'");
        registrationFacialVerificationLockedActivity.returnButton = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_return, "field 'returnButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationFacialVerificationLockedActivity.this.onReturnButtonClicked();
            }
        });
    }

    public final void read() {
        RegistrationFacialVerificationLockedActivity registrationFacialVerificationLockedActivity = this.MediaBrowserCompat$ItemReceiver;
        if (registrationFacialVerificationLockedActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            registrationFacialVerificationLockedActivity.titleTextView = null;
            registrationFacialVerificationLockedActivity.descriptionTextView = null;
            registrationFacialVerificationLockedActivity.descriptionButton = null;
            registrationFacialVerificationLockedActivity.returnButton = null;
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
