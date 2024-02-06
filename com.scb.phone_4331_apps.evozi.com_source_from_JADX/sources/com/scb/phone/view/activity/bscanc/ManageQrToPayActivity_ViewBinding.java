package com.scb.phone.view.activity.bscanc;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ManageQrToPayActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ManageQrToPayActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public ManageQrToPayActivity_ViewBinding(final ManageQrToPayActivity manageQrToPayActivity, View view) {
        super(manageQrToPayActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageQrToPayActivity;
        manageQrToPayActivity.tvQrLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_qr_to_pay_limit, "field 'tvQrLimit'", TextView.class);
        manageQrToPayActivity.qrLimitAmount = (CustomDeltaInputPressed) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_qr_to_pay_limit_amount, "field 'qrLimitAmount'", CustomDeltaInputPressed.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnAction' and method 'onSaveClick'");
        manageQrToPayActivity.btnAction = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action, "field 'btnAction'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageQrToPayActivity.this.onSaveClick();
            }
        });
    }

    public final void read() {
        ManageQrToPayActivity manageQrToPayActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageQrToPayActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageQrToPayActivity.tvQrLimit = null;
            manageQrToPayActivity.qrLimitAmount = null;
            manageQrToPayActivity.btnAction = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
