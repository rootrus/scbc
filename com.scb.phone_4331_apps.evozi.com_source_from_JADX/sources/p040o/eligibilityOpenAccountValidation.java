package p040o;

import android.view.View;
import com.scb.phone.view.adapter.registration.RegistrationManageDeviceAdapter;

/* renamed from: o.eligibilityOpenAccountValidation */
public final /* synthetic */ class eligibilityOpenAccountValidation implements View.OnClickListener {
    private final /* synthetic */ C10872writeSessionOs MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ RegistrationManageDeviceAdapter.DeviceItemViewHolder write;

    public /* synthetic */ eligibilityOpenAccountValidation(RegistrationManageDeviceAdapter.DeviceItemViewHolder deviceItemViewHolder, C10872writeSessionOs writesessionos, String str) {
        this.write = deviceItemViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = writesessionos;
        this.read = str;
    }

    public final void onClick(View view) {
        RegistrationManageDeviceAdapter.DeviceItemViewHolder deviceItemViewHolder = this.write;
        C10872writeSessionOs writesessionos = this.MediaBrowserCompat$CustomActionResultReceiver;
        RegistrationManageDeviceAdapter.this.read.MediaBrowserCompat$ItemReceiver(writesessionos.read, this.read);
    }
}
