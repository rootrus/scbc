package com.scb.phone.view.activity.hml.ekyc;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public final class HmlNTBeKYCLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlNTBeKYCLandingActivity IconCompatParcelizer;

    public HmlNTBeKYCLandingActivity_ViewBinding(HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity, View view) {
        super(hmlNTBeKYCLandingActivity, view);
        this.IconCompatParcelizer = hmlNTBeKYCLandingActivity;
        hmlNTBeKYCLandingActivity.breadcrumbsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbsNtb'", ProgressStateBar.class);
        hmlNTBeKYCLandingActivity.mainTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_main, "field 'mainTextView'", TextView.class);
        hmlNTBeKYCLandingActivity.secondaryTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_secondary, "field 'secondaryTextView'", TextView.class);
        hmlNTBeKYCLandingActivity.button = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt, "field 'button'", Button.class);
    }

    public final void read() {
        HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity = this.IconCompatParcelizer;
        if (hmlNTBeKYCLandingActivity != null) {
            this.IconCompatParcelizer = null;
            hmlNTBeKYCLandingActivity.breadcrumbsNtb = null;
            hmlNTBeKYCLandingActivity.mainTextView = null;
            hmlNTBeKYCLandingActivity.secondaryTextView = null;
            hmlNTBeKYCLandingActivity.button = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
