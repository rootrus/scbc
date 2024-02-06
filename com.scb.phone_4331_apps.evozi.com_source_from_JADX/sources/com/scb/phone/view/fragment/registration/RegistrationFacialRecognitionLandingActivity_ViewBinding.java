package com.scb.phone.view.fragment.registration;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RegistrationFacialRecognitionLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private RegistrationFacialRecognitionLandingActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public RegistrationFacialRecognitionLandingActivity_ViewBinding(final RegistrationFacialRecognitionLandingActivity registrationFacialRecognitionLandingActivity, View view) {
        super(registrationFacialRecognitionLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = registrationFacialRecognitionLandingActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "method 'onNextButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationFacialRecognitionLandingActivity.this.onNextButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_return, "method 'onReturnButtonClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationFacialRecognitionLandingActivity.this.onReturnButtonClicked();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
