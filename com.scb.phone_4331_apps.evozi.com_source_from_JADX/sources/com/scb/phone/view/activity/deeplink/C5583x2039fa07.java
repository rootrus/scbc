package com.scb.phone.view.activity.deeplink;

import p040o.getInfoWindowAnchorU;
import p040o.nativeIsTargetRectangleBottomEdgeFilled;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.deeplink.CreditCardServiceDefaultCardDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5583x2039fa07 implements Runnable {
    private /* synthetic */ CreditCardServiceDefaultCardDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    C5583x2039fa07(CreditCardServiceDefaultCardDeepLinkActivity creditCardServiceDefaultCardDeepLinkActivity, String str) {
        this.MediaBrowserCompat$ItemReceiver = creditCardServiceDefaultCardDeepLinkActivity;
        this.read = str;
    }

    public final void run() {
        nativeIsTargetRectangleBottomEdgeFilled nativeistargetrectanglebottomedgefilled = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (nativeistargetrectanglebottomedgefilled == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.read;
        if (nativeistargetrectanglebottomedgefilled.RatingCompat != null) {
            nativeistargetrectanglebottomedgefilled.RatingCompat.AlertController$RecycleListView();
        }
        getInfoWindowAnchorU getinfowindowanchoru = nativeistargetrectanglebottomedgefilled.IconCompatParcelizer;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(str), new nativeIsTargetRectangleBottomEdgeFilled.write(nativeistargetrectanglebottomedgefilled), new nativeIsTargetRectangleBottomEdgeFilled.IconCompatParcelizer(nativeistargetrectanglebottomedgefilled));
    }
}
