package com.scb.phone.view.activity.emailverification;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManageEmailLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ManageEmailLandingActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public ManageEmailLandingActivity_ViewBinding(final ManageEmailLandingActivity manageEmailLandingActivity, View view) {
        super(manageEmailLandingActivity, view);
        this.MediaBrowserCompat$ItemReceiver = manageEmailLandingActivity;
        manageEmailLandingActivity.tvIsVerified = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_is_verified, "field 'tvIsVerified'", TextView.class);
        manageEmailLandingActivity.tvEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email, "field 'tvEmail'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_email_enter_verification, "field 'btnEnterEmailVerification' and method 'onBtnEnterEmailVerificationClicked'");
        manageEmailLandingActivity.btnEnterEmailVerification = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_email_enter_verification, "field 'btnEnterEmailVerification'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailLandingActivity.this.onBtnEnterEmailVerificationClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_email_request_verification, "field 'btnSendEmailVerification' and method 'onBtnSendEmailVerificationClicked'");
        manageEmailLandingActivity.btnSendEmailVerification = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_email_request_verification, "field 'btnSendEmailVerification'", Button.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailLandingActivity.this.onBtnSendEmailVerificationClicked();
            }
        });
        manageEmailLandingActivity.emailVerifyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_verify_description, "field 'emailVerifyDescription'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ib_email_edit, "method 'onIbEmailEditClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailLandingActivity.this.onIbEmailEditClicked();
            }
        });
    }

    public final void read() {
        ManageEmailLandingActivity manageEmailLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (manageEmailLandingActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            manageEmailLandingActivity.tvIsVerified = null;
            manageEmailLandingActivity.tvEmail = null;
            manageEmailLandingActivity.btnEnterEmailVerification = null;
            manageEmailLandingActivity.btnSendEmailVerification = null;
            manageEmailLandingActivity.emailVerifyDescription = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
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
