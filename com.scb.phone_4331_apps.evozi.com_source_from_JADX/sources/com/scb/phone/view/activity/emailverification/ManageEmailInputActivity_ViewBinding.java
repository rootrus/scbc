package com.scb.phone.view.activity.emailverification;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.ScbEditText;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManageEmailInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ManageEmailInputActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public ManageEmailInputActivity_ViewBinding(final ManageEmailInputActivity manageEmailInputActivity, View view) {
        super(manageEmailInputActivity, view);
        this.MediaBrowserCompat$ItemReceiver = manageEmailInputActivity;
        manageEmailInputActivity.editEmailDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_email_description, "field 'editEmailDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_cancel, "field 'btnCancel' and method 'onBtnCancelClicked'");
        manageEmailInputActivity.btnCancel = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_cancel, "field 'btnCancel'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailInputActivity.this.onBtnCancelClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_save, "field 'btnSave' and method 'onBtnSaveClicked'");
        manageEmailInputActivity.btnSave = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_save, "field 'btnSave'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailInputActivity.this.onBtnSaveClicked();
            }
        });
        manageEmailInputActivity.etEmail = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_email, "field 'etEmail'", ScbEditText.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ic_delete_email, "field 'btnDeleteEmail' and method 'clearEmail'");
        manageEmailInputActivity.btnDeleteEmail = (ImageView) onStart.write(IconCompatParcelizer4, R.id.ic_delete_email, "field 'btnDeleteEmail'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailInputActivity.this.clearEmail();
            }
        });
        manageEmailInputActivity.tvEmailError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email_error, "field 'tvEmailError'", TextView.class);
    }

    public final void read() {
        ManageEmailInputActivity manageEmailInputActivity = this.MediaBrowserCompat$ItemReceiver;
        if (manageEmailInputActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            manageEmailInputActivity.editEmailDescription = null;
            manageEmailInputActivity.btnCancel = null;
            manageEmailInputActivity.btnSave = null;
            manageEmailInputActivity.etEmail = null;
            manageEmailInputActivity.btnDeleteEmail = null;
            manageEmailInputActivity.tvEmailError = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
