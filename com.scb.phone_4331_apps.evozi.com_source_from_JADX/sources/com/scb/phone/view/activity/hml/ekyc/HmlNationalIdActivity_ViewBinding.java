package com.scb.phone.view.activity.hml.ekyc;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity_ViewBinding;
import p040o.onStart;

public final class HmlNationalIdActivity_ViewBinding extends NationalIdActivity_ViewBinding {
    private HmlNationalIdActivity IconCompatParcelizer;

    public HmlNationalIdActivity_ViewBinding(HmlNationalIdActivity hmlNationalIdActivity, View view) {
        super(hmlNationalIdActivity, view);
        this.IconCompatParcelizer = hmlNationalIdActivity;
        hmlNationalIdActivity.scanNationalIdLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_scan_national_id_label, "field 'scanNationalIdLabel'", TextView.class);
    }

    public final void read() {
        HmlNationalIdActivity hmlNationalIdActivity = this.IconCompatParcelizer;
        if (hmlNationalIdActivity != null) {
            this.IconCompatParcelizer = null;
            hmlNationalIdActivity.scanNationalIdLabel = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
