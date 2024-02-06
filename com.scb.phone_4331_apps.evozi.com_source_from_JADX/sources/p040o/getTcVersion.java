package p040o;

import android.view.View;
import com.scb.phone.view.adapter.devicesettings.DeviceSettingsAdapter;

/* renamed from: o.getTcVersion */
public final /* synthetic */ class getTcVersion implements View.OnClickListener {
    private final /* synthetic */ DeviceSettingsAdapter IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ getTcVersion(DeviceSettingsAdapter deviceSettingsAdapter, int i, String str) {
        this.IconCompatParcelizer = deviceSettingsAdapter;
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onClick(View view) {
        DeviceSettingsAdapter deviceSettingsAdapter = this.IconCompatParcelizer;
        int i = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        C6485x62801acb fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = deviceSettingsAdapter.MediaBrowserCompat$ItemReceiver;
        deviceSettingsAdapter.read.get(i);
        fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(deviceSettingsAdapter.read.get(i).read, str);
    }
}
