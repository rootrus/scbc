package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.devicesettings.DeviceSettingsFragment;

/* renamed from: o.otpBusinessOwnerSubmission */
public final /* synthetic */ class otpBusinessOwnerSubmission implements DialogInterface.OnClickListener {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DeviceSettingsFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ otpBusinessOwnerSubmission(DeviceSettingsFragment deviceSettingsFragment, String str) {
        this.MediaBrowserCompat$ItemReceiver = deviceSettingsFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceSettingsFragment deviceSettingsFragment = this.MediaBrowserCompat$ItemReceiver;
        deviceSettingsFragment.devicePresenter.read(this.MediaBrowserCompat$CustomActionResultReceiver, false);
    }
}
