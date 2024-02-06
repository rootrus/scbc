package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.chequemanagement.ChequeAnnouncementActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeLandingActivity;
import p040o.ZSYR2K;

public class ActivateChequeDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.scbAnalytics.write("inbox_noti", new ZSYR2K("feature", "activatechq"));
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            this.scbAnalytics.write("push_noti", new ZSYR2K("feature", "activatechq"));
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        read(ChequeAnnouncementActivity.write(this, new Intent(this, ActivateChequeLandingActivity.class)));
    }
}
