package p040o;

import com.scb.phone.view.activity.deeplink.LifestyleDeepLinkActivity;

/* renamed from: o.ov */
public final class C7334ov implements MileageQuantitySelectionActivity<LifestyleDeepLinkActivity> {
    public static void write(LifestyleDeepLinkActivity lifestyleDeepLinkActivity, nativeIsTargetRectangleFilled nativeistargetrectanglefilled) {
        lifestyleDeepLinkActivity.presenter = nativeistargetrectanglefilled;
    }

    public static void read(LifestyleDeepLinkActivity lifestyleDeepLinkActivity, getIdType getidtype) {
        lifestyleDeepLinkActivity.iDeviceCompatibilityHelper = getidtype;
    }
}
