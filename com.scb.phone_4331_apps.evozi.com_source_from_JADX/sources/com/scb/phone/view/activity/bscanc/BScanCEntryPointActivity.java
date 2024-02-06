package com.scb.phone.view.activity.bscanc;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bscanc.ManageQrToPayActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CreditCardCaptureModule;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getHeartBeatCode;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.shutdownNow;

public final class BScanCEntryPointActivity extends BaseActivity implements CreditCardCaptureModule.read {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private boolean MediaMetadataCompat;
    @HmlPinActivity
    public getHeartBeatCode presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent read(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, BScanCEntryPointActivity.class);
            intent.putExtra("KEYS_IS_SETTING_PAGE", false);
            Intent putExtra = intent.putExtra("KEY_SUCCESS_MESSAGE", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "createIntent(context, is…E, displaySuccessMessage)");
            return putExtra;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r6 = r6.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.content.Intent r6 = r5.getIntent()
            r0 = 0
            if (r6 == 0) goto L_0x0017
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L_0x0017
            java.lang.String r1 = "KEYS_IS_SETTING_PAGE"
            boolean r6 = r6.getBoolean(r1, r0)
            goto L_0x0018
        L_0x0017:
            r6 = r0
        L_0x0018:
            r5.MediaMetadataCompat = r6
            android.content.Intent r6 = r5.getIntent()
            r1 = 0
            if (r6 == 0) goto L_0x002d
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L_0x002d
            java.lang.String r2 = "KEY_SUCCESS_MESSAGE"
            java.lang.String r1 = r6.getString(r2, r1)
        L_0x002d:
            r5.MediaBrowserCompat$MediaItem = r1
            o.getHeartBeatCode r6 = r5.presenter
            java.lang.String r1 = "presenter"
            if (r6 != 0) goto L_0x0038
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0038:
            r2 = r5
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r2 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r2
            r6.MediaBrowserCompat$ItemReceiver(r2)
            o.getHeartBeatCode r6 = r5.presenter
            if (r6 != 0) goto L_0x0045
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0045:
            boolean r1 = r5.MediaMetadataCompat
            java.lang.String r2 = r5.MediaBrowserCompat$MediaItem
            T r3 = r6.RatingCompat
            if (r3 == 0) goto L_0x004e
            r0 = 1
        L_0x004e:
            if (r0 == 0) goto L_0x0055
            T r0 = r6.RatingCompat
            r0.AlertController$RecycleListView()
        L_0x0055:
            o.getKeepAlive r0 = r6.write
            o.classification r3 = r0.IconCompatParcelizer
            o.DebitCardResetOtpActivity r3 = r3.MediaBrowserCompat$CustomActionResultReceiver()
            o.getHeartBeatCode$read r4 = new o.getHeartBeatCode$read
            r4.<init>(r6, r1, r2)
            o.DebitCardMarketConductDeepLinkActivity r4 = (p040o.DebitCardMarketConductDeepLinkActivity) r4
            o.getHeartBeatCode$IconCompatParcelizer r1 = new o.getHeartBeatCode$IconCompatParcelizer
            r1.<init>(r6)
            o.DebitCardMarketConductDeepLinkActivity r1 = (p040o.DebitCardMarketConductDeepLinkActivity) r1
            r0.read(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity.onCreate(android.os.Bundle):void");
    }

    public final void write() {
        RatingCompat(false);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(shutdownNow shutdownnow, boolean z) {
        onGetStartedClick.write((Object) shutdownnow, "bScanCEntryPointDisplay");
        ManageQrToPayActivity.IconCompatParcelizer iconCompatParcelizer = ManageQrToPayActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$CustomActionResultReceiver = ManageQrToPayActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this, shutdownnow.write, z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(shutdownNow shutdownnow, String str) {
        onGetStartedClick.write((Object) shutdownnow, "bScanCEntryPointDisplay");
        QRPaymentActivity$MediaBrowserCompat$CustomActionResultReceiver qRPaymentActivity$MediaBrowserCompat$CustomActionResultReceiver = QRPaymentActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) shutdownnow, "bScanCEntryPointDisplay");
        Intent intent = new Intent(context, QRPaymentActivity.class);
        intent.putExtra("EXTRAS_BSCANC_ENTRY_POINT_DISPLAY", shutdownnow);
        intent.putExtra("EXTRAS_SUCCESS_MESSAGE", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }
}
