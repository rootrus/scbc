package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.BScanCNotificationDeepLinkActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSuccessActivity;
import p040o.C7540uh;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.StreetViewPanoramaView;
import p040o.executor;
import p040o.getInfoWindowAnchorU;
import p040o.getUuidUtf8Bytes;

public class BScanCNotificationDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public executor billPaymentTransactionDisplayMapper;
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        getInfoWindowAnchorU getinfowindowanchoru = this.deepLinkCase;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(str), new C7540uh(this), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                BScanCNotificationDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void read(StreetViewPanoramaView streetViewPanoramaView) throws Exception {
        getUuidUtf8Bytes read = this.billPaymentTransactionDisplayMapper.read(streetViewPanoramaView);
        Intent intent = new Intent(this, BillPaymentSuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", read);
        read(intent);
    }
}
