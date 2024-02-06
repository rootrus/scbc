package p040o;

import com.scb.phone.view.activity.deeplink.HmlSuccessfulDeepLinkActivity;

/* renamed from: o.ot */
public final class C7332ot implements MileageQuantitySelectionActivity<HmlSuccessfulDeepLinkActivity> {
    public static void read(HmlSuccessfulDeepLinkActivity hmlSuccessfulDeepLinkActivity, KofaxWebServiceResponseBase kofaxWebServiceResponseBase) {
        hmlSuccessfulDeepLinkActivity.presenter = kofaxWebServiceResponseBase;
    }
}
