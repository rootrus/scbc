package com.scb.phone.view.activity.deeplink;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.isInternalContrastLowerThanThreshold;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PartnerLoginDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public isInternalContrastLowerThanThreshold presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean setMenu() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        String stringExtra = intent.getStringExtra("applicationId");
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaBrowserCompat$CustomActionResultReceiver = isInternalContrastLowerThanThreshold.MediaBrowserCompat$CustomActionResultReceiver(intent.getData());
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "applicationId");
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(isInternalContrastLowerThanThreshold.write(stringExtra, MediaBrowserCompat$CustomActionResultReceiver)));
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
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        finish();
    }
}
