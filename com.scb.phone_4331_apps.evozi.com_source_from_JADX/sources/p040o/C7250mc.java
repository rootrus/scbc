package p040o;

import com.scb.phone.view.activity.deeplink.HmlBusinessOwnerSuccessfulDeepLinkActivity;

/* renamed from: o.mc */
public final class C7250mc implements MileageQuantitySelectionActivity<HmlBusinessOwnerSuccessfulDeepLinkActivity> {
    public static void read(HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, KofaxWebServiceResponseBase kofaxWebServiceResponseBase) {
        hmlBusinessOwnerSuccessfulDeepLinkActivity.presenter = kofaxWebServiceResponseBase;
    }
}
