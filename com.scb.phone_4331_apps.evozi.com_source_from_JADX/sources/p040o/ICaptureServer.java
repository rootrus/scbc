package p040o;

import com.scb.phone.view.activity.deeplink.BScanCNotificationDeepLinkActivity;

/* renamed from: o.ICaptureServer */
public final class ICaptureServer implements MileageQuantitySelectionActivity<BScanCNotificationDeepLinkActivity> {
    public static void read(BScanCNotificationDeepLinkActivity bScanCNotificationDeepLinkActivity, getInfoWindowAnchorU getinfowindowanchoru) {
        bScanCNotificationDeepLinkActivity.deepLinkCase = getinfowindowanchoru;
    }

    public static void write(BScanCNotificationDeepLinkActivity bScanCNotificationDeepLinkActivity, executor executor) {
        bScanCNotificationDeepLinkActivity.billPaymentTransactionDisplayMapper = executor;
    }
}
