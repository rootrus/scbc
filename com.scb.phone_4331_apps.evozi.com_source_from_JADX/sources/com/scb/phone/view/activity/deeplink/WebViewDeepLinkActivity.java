package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import org.bouncycastle.i18n.MessageBundle;
import p040o.onGetStartedClick;
import p040o.setCurrentSession;

public final class WebViewDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            String string = extras.getString(MessageBundle.TITLE_ENTRY, "");
            String string2 = extras.getString(ImagesContract.URL, "");
            CharSequence charSequence = string2;
            if (!(charSequence == null || charSequence.length() == 0)) {
                setCurrentSession write = setCurrentSession.write();
                write.MediaMetadataCompat = string2;
                write.MediaBrowserCompat$MediaItem = string;
                write.IconCompatParcelizer = false;
                write.write = 1;
                write.read = false;
                Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(this, string2, string);
                MediaBrowserCompat$ItemReceiver.addFlags(603979776);
                MediaBrowserCompat$ItemReceiver.putExtra("com.scb.phone.EXTRA_DISPLAY", write);
                MediaBrowserCompat$ItemReceiver.putExtra("FROM_LINK_TAG", true);
                read(MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
