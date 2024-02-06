package p040o;

import com.scb.phone.view.fragment.devicesettings.DeviceSettingsFragment;

/* renamed from: o.sendBusinessInfoStoreDetails */
public final class sendBusinessInfoStoreDetails implements MileageQuantitySelectionActivity<DeviceSettingsFragment> {
    public static void IconCompatParcelizer(DeviceSettingsFragment deviceSettingsFragment, XVrsMrzDetector xVrsMrzDetector) {
        deviceSettingsFragment.devicePresenter = xVrsMrzDetector;
    }
}
