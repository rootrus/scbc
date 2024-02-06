package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.requesttopay.GoManagePromptPayActivity;

public class MoreOptionsPromptPayDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        Intent intent2 = new Intent(this, GoManagePromptPayActivity.class);
        intent2.putExtra("EXTRA_FROM_PROFILE_MANAGEMENT", true);
        read(intent2);
    }
}
