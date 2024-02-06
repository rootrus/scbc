package p040o;

import com.scb.phone.view.activity.deeplink.CardActivationDeepLinkActivity;

/* renamed from: o.IProgressListener */
public final class IProgressListener implements MileageQuantitySelectionActivity<CardActivationDeepLinkActivity> {
    public static void write(CardActivationDeepLinkActivity cardActivationDeepLinkActivity, getInfoWindowAnchorU getinfowindowanchoru) {
        cardActivationDeepLinkActivity.deepLinkCase = getinfowindowanchoru;
    }

    public static void write(CardActivationDeepLinkActivity cardActivationDeepLinkActivity, skipBytes skipbytes) {
        cardActivationDeepLinkActivity.notificationsDisplayMapper = skipbytes;
    }
}
