package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.activity.deeplink.CreditCardServiceTabDeepLinkActivity;
import java.util.List;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.MapConstraints;
import p040o.chain;
import p040o.getInfoWindowAnchorU;
import p040o.sendImageService;

public class CreditCardServiceTabDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public MapConstraints.ConstrainedMultimap.C36361 creditCardDisplayMapper;
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
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat((String) null), new sendImageService(this), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                CreditCardServiceTabDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final void IconCompatParcelizer(List<chain> list) {
        read(CreditCardDetailActivity.MediaBrowserCompat$ItemReceiver((Context) this, 2, list));
    }
}
