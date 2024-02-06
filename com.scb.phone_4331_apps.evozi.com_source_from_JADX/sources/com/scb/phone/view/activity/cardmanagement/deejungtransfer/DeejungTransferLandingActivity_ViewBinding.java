package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.view.View;
import android.widget.ScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public DeejungTransferLandingActivity_ViewBinding(final DeejungTransferLandingActivity deejungTransferLandingActivity, View view) {
        super(deejungTransferLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
        deejungTransferLandingActivity.scrollView = (ScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_scroll_view, "field 'scrollView'", ScrollView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.imv_deejung_about, "method 'onAboutClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferLandingActivity.this.onAboutClick();
            }
        });
    }

    public final void read() {
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungTransferLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deejungTransferLandingActivity.scrollView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
