package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private DeejungLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public DeejungLandingActivity_ViewBinding(final DeejungLandingActivity deejungLandingActivity, View view) {
        super(deejungLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungLandingActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.imv_deejung_about, "method 'onAboutClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungLandingActivity.this.onAboutClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
