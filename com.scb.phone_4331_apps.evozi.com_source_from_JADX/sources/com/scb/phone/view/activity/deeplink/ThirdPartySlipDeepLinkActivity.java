package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.airbnb.deeplinkdispatch.DeepLink;
import com.scb.phone.view.activity.common.ThirdPartyWebActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.GoodToKnowActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class ThirdPartySlipDeepLinkActivity extends BaseDeepLinkActivity {
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
        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false) && !GoodToKnowActivity.read("prod", "prod", false)) {
            ThirdPartyWebActivity.IconCompatParcelizer iconCompatParcelizer = ThirdPartyWebActivity.MediaBrowserCompat$MediaItem;
            Context context = this;
            onGetStartedClick.write((Object) context, "context");
            Intent intent2 = new Intent(context, ThirdPartyWebActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent2).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        finish();
    }
}
