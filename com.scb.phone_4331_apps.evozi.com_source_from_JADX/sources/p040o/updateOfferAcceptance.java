package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.devicesettings.DeviceSettingsFragment;

/* renamed from: o.updateOfferAcceptance */
public final /* synthetic */ class updateOfferAcceptance implements DialogInterface.OnClickListener {
    private final /* synthetic */ DeviceSettingsFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ updateOfferAcceptance(DeviceSettingsFragment deviceSettingsFragment, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deviceSettingsFragment;
        this.write = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceSettingsFragment deviceSettingsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        deviceSettingsFragment.devicePresenter.read(this.write, true);
    }
}
