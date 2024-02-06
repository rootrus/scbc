package p040o;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.scb.phone.AndroidApplication;
import dagger.android.DispatchingAndroidInjector;
import p039io.github.inflationx.calligraphy3.CalligraphyConfig;

/* renamed from: o.ZHPMV */
public final class ZHPMV implements MileageQuantitySelectionActivity<AndroidApplication> {
    public static void read(AndroidApplication androidApplication, CalligraphyConfig calligraphyConfig) {
        androidApplication.calligraphyConfig = calligraphyConfig;
    }

    public static void read(AndroidApplication androidApplication, DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
        androidApplication.activityDispatchingAndroidInjector = dispatchingAndroidInjector;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(AndroidApplication androidApplication, DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
        androidApplication.fragmentDispatchingAndroidInjector = dispatchingAndroidInjector;
    }

    public static void MediaBrowserCompat$ItemReceiver(AndroidApplication androidApplication, DispatchingAndroidInjector<Service> dispatchingAndroidInjector) {
        androidApplication.serviceDispatchingAndroidInjector = dispatchingAndroidInjector;
    }

    public static void write(AndroidApplication androidApplication, SharedPreferences sharedPreferences) {
        androidApplication.sharedPreferences = sharedPreferences;
    }

    public static void IconCompatParcelizer(AndroidApplication androidApplication, getIdType getidtype) {
        androidApplication.iDeviceCompatibilityHelper = getidtype;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(AndroidApplication androidApplication, FragmentBuilder_BindETBCheckIdentityFragment fragmentBuilder_BindETBCheckIdentityFragment) {
        androidApplication.salesforceManager = fragmentBuilder_BindETBCheckIdentityFragment;
    }
}
