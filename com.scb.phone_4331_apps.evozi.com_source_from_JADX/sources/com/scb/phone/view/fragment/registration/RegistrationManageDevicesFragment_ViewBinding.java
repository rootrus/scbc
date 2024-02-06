package com.scb.phone.view.fragment.registration;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RegistrationManageDevicesFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private RegistrationManageDevicesFragment write;

    public RegistrationManageDevicesFragment_ViewBinding(final RegistrationManageDevicesFragment registrationManageDevicesFragment, View view) {
        super(registrationManageDevicesFragment, view);
        this.write = registrationManageDevicesFragment;
        registrationManageDevicesFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "field 'nextButton' and method 'onButtonNext'");
        registrationManageDevicesFragment.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.next_button, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationManageDevicesFragment.this.onButtonNext();
            }
        });
    }

    public final void read() {
        RegistrationManageDevicesFragment registrationManageDevicesFragment = this.write;
        if (registrationManageDevicesFragment != null) {
            this.write = null;
            registrationManageDevicesFragment.recyclerView = null;
            registrationManageDevicesFragment.nextButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
