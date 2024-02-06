package com.scb.phone.view.activity;

import android.view.View;
import com.google.android.gms.maps.MapView;
import com.scb.phone.R;
import p040o.onStart;

public class ScbMapActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ScbMapActivity IconCompatParcelizer;

    public ScbMapActivity_ViewBinding(ScbMapActivity scbMapActivity, View view) {
        super(scbMapActivity, view);
        this.IconCompatParcelizer = scbMapActivity;
        scbMapActivity.mMapView = (MapView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.map_view, "field 'mMapView'", MapView.class);
    }

    public void read() {
        ScbMapActivity scbMapActivity = this.IconCompatParcelizer;
        if (scbMapActivity != null) {
            this.IconCompatParcelizer = null;
            scbMapActivity.mMapView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
