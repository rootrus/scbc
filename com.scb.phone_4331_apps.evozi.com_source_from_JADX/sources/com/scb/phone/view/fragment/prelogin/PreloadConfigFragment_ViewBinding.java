package com.scb.phone.view.fragment.prelogin;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseDialogFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PreloadConfigFragment_ViewBinding extends BaseDialogFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PreloadConfigFragment write;

    public PreloadConfigFragment_ViewBinding(final PreloadConfigFragment preloadConfigFragment, View view) {
        super(preloadConfigFragment, view);
        this.write = preloadConfigFragment;
        preloadConfigFragment.deviceId = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_id, "field 'deviceId'", EditText.class);
        preloadConfigFragment.phoneNumber = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.phone_number, "field 'phoneNumber'", EditText.class);
        preloadConfigFragment.environmentSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.environment_spinner, "field 'environmentSpinner'", Spinner.class);
        preloadConfigFragment.rootCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_checkbox, "field 'rootCheckBox'", CheckBox.class);
        preloadConfigFragment.wireMockCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wiremock_checkbox, "field 'wireMockCheckBox'", CheckBox.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_confirm, "method 'confirmClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreloadConfigFragment.this.confirmClick();
            }
        });
    }

    public final void read() {
        PreloadConfigFragment preloadConfigFragment = this.write;
        if (preloadConfigFragment != null) {
            this.write = null;
            preloadConfigFragment.deviceId = null;
            preloadConfigFragment.phoneNumber = null;
            preloadConfigFragment.environmentSpinner = null;
            preloadConfigFragment.rootCheckBox = null;
            preloadConfigFragment.wireMockCheckBox = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
