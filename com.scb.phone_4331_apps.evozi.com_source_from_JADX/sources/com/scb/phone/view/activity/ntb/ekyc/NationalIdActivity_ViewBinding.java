package com.scb.phone.view.activity.ntb.ekyc;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.DateInputText;
import p040o.onStart;

public class NationalIdActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NationalIdActivity MediaBrowserCompat$ItemReceiver;

    public NationalIdActivity_ViewBinding(NationalIdActivity nationalIdActivity, View view) {
        super(nationalIdActivity, view);
        this.MediaBrowserCompat$ItemReceiver = nationalIdActivity;
        nationalIdActivity.scanIdIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_scan_id, "field 'scanIdIcon'", ImageView.class);
        nationalIdActivity.helpButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.help_button, "field 'helpButton'", ImageView.class);
        nationalIdActivity.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'nextButton'", Button.class);
        nationalIdActivity.dateEditText = (DateInputText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_edit_text, "field 'dateEditText'", DateInputText.class);
        nationalIdActivity.laserIdFirst = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_first, "field 'laserIdFirst'", EditText.class);
        nationalIdActivity.laserIdSecond = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_second, "field 'laserIdSecond'", EditText.class);
        nationalIdActivity.laserIdThird = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_third, "field 'laserIdThird'", EditText.class);
        nationalIdActivity.fieldsContainer = onStart.IconCompatParcelizer(view, R.id.fields_container, "field 'fieldsContainer'");
    }

    public void read() {
        NationalIdActivity nationalIdActivity = this.MediaBrowserCompat$ItemReceiver;
        if (nationalIdActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            nationalIdActivity.scanIdIcon = null;
            nationalIdActivity.helpButton = null;
            nationalIdActivity.nextButton = null;
            nationalIdActivity.dateEditText = null;
            nationalIdActivity.laserIdFirst = null;
            nationalIdActivity.laserIdSecond = null;
            nationalIdActivity.laserIdThird = null;
            nationalIdActivity.fieldsContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
