package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.deeplink.CreditCardDeepLinkActivity;
import com.scb.phone.view.activity.transferandpay.CardPaySelectedActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.getInfoWindowAnchorU;
import p040o.loginAnonymously;

public class CreditCardDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            mo13676d_("inboxnoti_card_pmt_reminder");
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            mo13676d_("pushnoti_card_pmt_reminder");
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        getInfoWindowAnchorU getinfowindowanchoru = this.deepLinkCase;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaDescriptionCompat(str), new loginAnonymously(this), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                CreditCardDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        read(new Intent(getApplicationContext(), CardPaySelectedActivity.class));
    }
}
