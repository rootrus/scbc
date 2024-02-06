package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.injectOnDeviceDeserializer;
import p040o.isEdgeSupportStrongerThanThreshold;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PartnerInAppLoginDeepLinkActivity extends BaseDeepLinkActivity implements injectOnDeviceDeserializer {
    private Intent MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public isEdgeSupportStrongerThanThreshold presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(android.content.Intent r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "denyUrl"
            java.lang.String r4 = r4.getStringExtra(r0)
            android.content.Intent r0 = r3.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = "IS_NEED_HISTORY_STACK"
            boolean r0 = r0.getBoolean(r2, r1)
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            r2 = r3
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r4 = com.scb.phone.view.activity.partner.PartnerConsentActivity.IconCompatParcelizer(r2, r5, r0, r4)
            java.lang.String r5 = "PartnerConsentActivity.n…eepHistoryStack, denyUrl)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            r3.MediaBrowserCompat$SearchResultReceiver = r4
            android.content.Intent r5 = r3.getIntent()
            r4.putExtras(r5)
            o.isEdgeSupportStrongerThanThreshold r4 = r3.presenter
            java.lang.String r5 = "presenter"
            if (r4 != 0) goto L_0x003e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x003e:
            r2 = r3
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r2 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r2
            r4.MediaBrowserCompat$ItemReceiver(r2)
            o.isEdgeSupportStrongerThanThreshold r4 = r3.presenter
            if (r4 != 0) goto L_0x004b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x004b:
            r5 = 1
            if (r0 == 0) goto L_0x005f
            o.isEdgeSupportStrongerThanThreshold$MediaBrowserCompat$ItemReceiver r0 = p040o.C4820xc15fffda.write
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x0057
            r1 = r5
        L_0x0057:
            if (r1 == 0) goto L_0x005e
            T r4 = r4.RatingCompat
            r0.IconCompatParcelizer(r4)
        L_0x005e:
            return
        L_0x005f:
            o.isEdgeSupportStrongerThanThreshold$read r0 = p040o.isEdgeSupportStrongerThanThreshold.read.write
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x0068
            r1 = r5
        L_0x0068:
            if (r1 == 0) goto L_0x006f
            T r4 = r4.RatingCompat
            r0.IconCompatParcelizer(r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.deeplink.PartnerInAppLoginDeepLinkActivity.IconCompatParcelizer(android.content.Intent, java.lang.String):void");
    }

    public final void write() {
        Intent intent = this.MediaBrowserCompat$SearchResultReceiver;
        if (intent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("intentDeepLink");
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = this.MediaBrowserCompat$SearchResultReceiver;
        if (intent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("intentDeepLink");
        }
        read(intent);
    }
}
