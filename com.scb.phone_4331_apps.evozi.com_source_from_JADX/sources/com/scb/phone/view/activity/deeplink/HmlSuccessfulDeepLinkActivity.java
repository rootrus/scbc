package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.C5610xd0499873;
import com.scb.phone.view.activity.hml.HmlETBSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.KofaxWebServiceResponseBase;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetIParametersFactory;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlSuccessfulDeepLinkActivity extends HmlBaseDeepLinkActivity implements PassportCaptureModule_GetIParametersFactory {
    @HmlPinActivity
    public KofaxWebServiceResponseBase presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C5610xd0499873 hmlETBSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBSuccessActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(new Intent(context, HmlETBSuccessActivity.class));
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
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        KofaxWebServiceResponseBase kofaxWebServiceResponseBase = this.presenter;
        if (kofaxWebServiceResponseBase == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        kofaxWebServiceResponseBase.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        if (str != null) {
            KofaxWebServiceResponseBase kofaxWebServiceResponseBase = this.presenter;
            if (kofaxWebServiceResponseBase == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            kofaxWebServiceResponseBase.MediaBrowserCompat$CustomActionResultReceiver(str, false);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        KofaxWebServiceResponseBase kofaxWebServiceResponseBase = this.presenter;
        if (kofaxWebServiceResponseBase == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        kofaxWebServiceResponseBase.onDestroy();
    }
}
