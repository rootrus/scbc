package com.scb.phone.view.activity.maintenance;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class MaintenanceActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MaintenanceActivity IconCompatParcelizer;

    public MaintenanceActivity_ViewBinding(MaintenanceActivity maintenanceActivity, View view) {
        super(maintenanceActivity, view);
        this.IconCompatParcelizer = maintenanceActivity;
        maintenanceActivity.tvMaintenanceMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_maintenance_message, "field 'tvMaintenanceMessage'", TextView.class);
    }

    public final void read() {
        MaintenanceActivity maintenanceActivity = this.IconCompatParcelizer;
        if (maintenanceActivity != null) {
            this.IconCompatParcelizer = null;
            maintenanceActivity.tvMaintenanceMessage = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
