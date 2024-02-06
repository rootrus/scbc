package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomLaserIdInput_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CustomLaserIdInput write;

    public CustomLaserIdInput_ViewBinding(final CustomLaserIdInput customLaserIdInput, View view) {
        this.write = customLaserIdInput;
        customLaserIdInput.etLaserIdFirst = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_first, "field 'etLaserIdFirst'", EditText.class);
        customLaserIdInput.etLaserIdSecond = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_second, "field 'etLaserIdSecond'", EditText.class);
        customLaserIdInput.etLaserIdThird = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_third, "field 'etLaserIdThird'", EditText.class);
        customLaserIdInput.tvLaserIdError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_error_text_view, "field 'tvLaserIdError'", TextView.class);
        customLaserIdInput.tvLaserIdTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_title, "field 'tvLaserIdTitle'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.laser_id_help_button, "field 'laserIdHelpButton' and method 'onLaserIdButtonClicked'");
        customLaserIdInput.laserIdHelpButton = (ImageView) onStart.write(IconCompatParcelizer, R.id.laser_id_help_button, "field 'laserIdHelpButton'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomLaserIdInput.this.onLaserIdButtonClicked(view);
            }
        });
    }

    public final void read() {
        CustomLaserIdInput customLaserIdInput = this.write;
        if (customLaserIdInput != null) {
            this.write = null;
            customLaserIdInput.etLaserIdFirst = null;
            customLaserIdInput.etLaserIdSecond = null;
            customLaserIdInput.etLaserIdThird = null;
            customLaserIdInput.tvLaserIdError = null;
            customLaserIdInput.tvLaserIdTitle = null;
            customLaserIdInput.laserIdHelpButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
