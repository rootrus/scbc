package p040o;

import com.google.gson.Gson;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;

/* renamed from: o.setLongPressHintsEnabled */
public final class setLongPressHintsEnabled implements MileageQuantitySelectionActivity<ScanPaymentActivity> {
    public static void write(ScanPaymentActivity scanPaymentActivity, C7432sG sGVar) {
        scanPaymentActivity.presenter = sGVar;
    }

    public static void MediaBrowserCompat$ItemReceiver(ScanPaymentActivity scanPaymentActivity, Gson gson) {
        scanPaymentActivity.gson = gson;
    }
}
