package com.scb.phone.view.activity.mailingaddress;

import android.content.Context;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.C7143hy;
import p040o.C9777xebbb7ee1;
import p040o.HmlPinActivity;
import p040o.getEnvCarrier;
import p040o.getEnvCarrier$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.readElement;

public final class MailingAddressReviewOTPActivity extends BaseOtpActivity implements C7143hy {
    public static final C5658x8bfdd5e6 MediaDescriptionCompat = new C5658x8bfdd5e6((byte) 0);
    @HmlPinActivity
    public getEnvCarrier presenter;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r3 = r3.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            o.getEnvCarrier r3 = r2.presenter
            java.lang.String r0 = "presenter"
            if (r3 != 0) goto L_0x000c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x000c:
            r1 = r2
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r3.MediaBrowserCompat$ItemReceiver(r1)
            android.content.Intent r3 = r2.getIntent()
            if (r3 == 0) goto L_0x0025
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "PARCELABLE_TOKEN_ID"
            java.lang.String r3 = r3.getString(r1)
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x0031
            o.getEnvCarrier r1 = r2.presenter
            if (r1 != 0) goto L_0x002f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x002f:
            r1.write = r3
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mailingaddress.MailingAddressReviewOTPActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        getEnvCarrier getenvcarrier = this.presenter;
        if (getenvcarrier == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvcarrier.onDestroy();
    }

    public final void write(String str, String str2) {
        getEnvCarrier getenvcarrier = this.presenter;
        if (getenvcarrier == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str3 = getenvcarrier.write;
        if (str2 != null && str != null && str3 != null) {
            if (getenvcarrier.RatingCompat != null) {
                getenvcarrier.RatingCompat.AlertController$RecycleListView();
            }
            getEnvCarrier getenvcarrier2 = getenvcarrier;
            getenvcarrier.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new C9777xebbb7ee1(str2, str, str3), new getEnvCarrier$MediaBrowserCompat$ItemReceiver(getenvcarrier2), new getEnvCarrier.write(getenvcarrier2));
        }
    }

    public final void read(readElement readelement) {
        onGetStartedClick.write((Object) readelement, "params");
        MailingAddressSuccessfulActivity.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((Context) this, readelement);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        finish();
    }
}
