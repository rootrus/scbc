package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.partner.PartnerBillPaymentInputActivity;
import com.scb.phone.view.activity.thirdparty.FacebookConsentDeepLinkActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C5033x1aab6002;
import p040o.C6387x44179cf9;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.nativeIsEdgeSupportStrongerThanThreshold;
import p040o.setTapText;

public class BillPaymentDeepLinkActivity extends BaseDeepLinkActivity implements C6387x44179cf9 {
    private String MediaMetadataCompat;
    @HmlPinActivity
    public nativeIsEdgeSupportStrongerThanThreshold presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        this.MediaMetadataCompat = intent.getData() != null ? intent.getData().getQueryParameter("callback_url") : null;
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        nativeIsEdgeSupportStrongerThanThreshold nativeisedgesupportstrongerthanthreshold = this.presenter;
        if (nativeisedgesupportstrongerthanthreshold.RatingCompat != null) {
            nativeisedgesupportstrongerthanthreshold.RatingCompat.AlertController$RecycleListView();
        }
        nativeisedgesupportstrongerthanthreshold.MediaBrowserCompat$ItemReceiver.write(str);
        nativeisedgesupportstrongerthanthreshold.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C5033x1aab6002(nativeisedgesupportstrongerthanthreshold, (byte) 0));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.MediaMetadataCompat;
        if (str == null || str.length() == 0) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        Intent write = FacebookConsentDeepLinkActivity.write(this, "user_cancel", (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) null);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
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
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str) {
        read(PartnerBillPaymentInputActivity.read(this, exception, (String) null, str));
    }
}
