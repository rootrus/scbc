package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SaveSlipBaseActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private SaveSlipBaseActivity MediaBrowserCompat$ItemReceiver;

    public SaveSlipBaseActivity_ViewBinding(final SaveSlipBaseActivity saveSlipBaseActivity, View view) {
        super(saveSlipBaseActivity, view);
        this.MediaBrowserCompat$ItemReceiver = saveSlipBaseActivity;
        saveSlipBaseActivity.imvSlipCurl = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_slip_curl, "field 'imvSlipCurl'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.save_slip, "field 'btnSaveSlip' and method 'onSaveSlipClick'");
        saveSlipBaseActivity.btnSaveSlip = (Button) onStart.write(IconCompatParcelizer, R.id.save_slip, "field 'btnSaveSlip'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SaveSlipBaseActivity.this.onSaveSlipClick();
            }
        });
    }

    public void read() {
        SaveSlipBaseActivity saveSlipBaseActivity = this.MediaBrowserCompat$ItemReceiver;
        if (saveSlipBaseActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            saveSlipBaseActivity.imvSlipCurl = null;
            saveSlipBaseActivity.btnSaveSlip = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
