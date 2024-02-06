package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.scb.phone.data.network.service.ProfileService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetUriRttiFactory;
import p040o.chain;
import p040o.nativeIsTargetRectangleBottomEdgeFilled;
import p040o.onGetStartedClick;

public final class CreditCardServiceDefaultCardDeepLinkActivity extends BaseDeepLinkActivity implements IdCaptureModule_GetUriRttiFactory {
    @HmlPinActivity
    public nativeIsTargetRectangleBottomEdgeFilled presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public static final class write {
        public ProfileService MediaBrowserCompat$CustomActionResultReceiver;
        public RegistrationWithApiAuthService write;

        private write() {
        }

        @HmlPinActivity
        public write(ProfileService profileService, RegistrationWithApiAuthService registrationWithApiAuthService) {
            this.MediaBrowserCompat$CustomActionResultReceiver = profileService;
            this.write = registrationWithApiAuthService;
        }
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        nativeIsTargetRectangleBottomEdgeFilled nativeistargetrectanglebottomedgefilled = this.presenter;
        if (nativeistargetrectanglebottomedgefilled == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nativeistargetrectanglebottomedgefilled.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        new Handler().postDelayed(new C5583x2039fa07(this, str), 1000);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends chain> list, int i) {
        onGetStartedClick.write((Object) list, "creditCardDisplayList");
        read(CreditCardDetailActivity.MediaBrowserCompat$ItemReceiver((Context) this, (List<chain>) list, i));
    }
}
