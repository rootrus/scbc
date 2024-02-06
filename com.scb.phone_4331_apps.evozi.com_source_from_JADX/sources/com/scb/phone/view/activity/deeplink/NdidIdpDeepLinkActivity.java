package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.deeplink.NdidIdpDeepLinkActivity;
import com.scb.phone.view.activity.ndid.NdidIdpVerificationActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getInfoWindowAnchorU;
import p040o.setFieldNamingStrategy;

public class NdidIdpDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;
    @HmlPinActivity
    public setFieldNamingStrategy presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.scbAnalytics.write("inbox_noti", new ZSYR2K("feature", "ndid"));
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            this.scbAnalytics.write("push_noti", new ZSYR2K("feature", "ndid"));
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        getInfoWindowAnchorU getinfowindowanchoru = this.deepLinkCase;
        getinfowindowanchoru.read(getinfowindowanchoru.read(str), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                addGroundOverlay addgroundoverlay = (addGroundOverlay) obj;
                NdidIdpDeepLinkActivity.this.MediaBrowserCompat$CustomActionResultReceiver(addgroundoverlay.IconCompatParcelizer, addgroundoverlay.MediaBrowserCompat$ItemReceiver, addgroundoverlay.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }, new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                NdidIdpDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        aj_();
        read(new Intent(this, NdidIdpVerificationActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_REQUEST_ID", str).putExtra("com.scb.phone.EXTRA_REQUEST_MESSAGE", str2).putExtra("com.scb.phone.EXTRA_REQUEST_TIMEOUT", str3).putExtra("FROM_LINK_TAG", true));
    }
}
