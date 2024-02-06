package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import p040o.C7537ue;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getInfoWindowAnchorU;
import p040o.logout;
import p040o.notifyBackgroundStateChangeListeners;
import p040o.registerDevice;
import p040o.skipBytes;

public class CardActivationDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;
    @HmlPinActivity
    public skipBytes notificationsDisplayMapper;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.scbAnalytics.write("inbox_noti", new ZSYR2K("feature", "card_activation"));
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            this.scbAnalytics.write("push_noti", new ZSYR2K("feature", "card_activation"));
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        this.deepLinkCase.read(this.deepLinkCase.IconCompatParcelizer(str).map(new logout(this)), new registerDevice(this), new C7537ue(this));
    }

    public final /* synthetic */ void write(notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners) throws Exception {
        aj_();
        read(CardActivationActivity.MediaBrowserCompat$ItemReceiver(this, notifybackgroundstatechangelisteners));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.deepLinkCase.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        super.onActivityResult(i, i2, intent);
    }
}
