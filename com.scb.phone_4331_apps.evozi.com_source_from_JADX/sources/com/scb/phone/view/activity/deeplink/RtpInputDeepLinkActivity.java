package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.RtpInputDeepLinkActivity;
import com.scb.phone.view.activity.requesttopay.PayerReviewActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.getInfoWindowAnchorU;
import p040o.setUuidFromUtf8Bytes;
import p040o.skipBytes;

public class RtpInputDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;
    @HmlPinActivity
    public skipBytes mapper;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        getInfoWindowAnchorU getinfowindowanchoru = this.deepLinkCase;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$CustomActionResultReceiver(str).map(new DirectDebitDeepLinkActivity(str) {
            private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r2;
            }

            public final Object write(Object obj) {
                RtpInputDeepLinkActivity rtpInputDeepLinkActivity = RtpInputDeepLinkActivity.this;
                String str = this.MediaBrowserCompat$ItemReceiver;
                return rtpInputDeepLinkActivity.mapper.IconCompatParcelizer((onEnterAmbient) obj, str);
            }
        }), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                RtpInputDeepLinkActivity.this.read((setUuidFromUtf8Bytes) obj);
            }
        }, new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                RtpInputDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) throws Exception {
        aj_();
        Intent intent = new Intent(this, PayerReviewActivity.class);
        setuuidfromutf8bytes.MediaMetadataCompat("rtp.payer.notification");
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        read(intent);
    }
}
