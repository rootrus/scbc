package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.EmailVerificationDeepLinkActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.getIsLeftEyeOpenProbability;
import p040o.zzaj;

public class EmailVerificationDeepLinkActivity extends BaseDeepLinkActivity {
    @HmlPinActivity
    public getIsLeftEyeOpenProbability ctaVerifyEmailUseCase;

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
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        getIsLeftEyeOpenProbability getislefteyeopenprobability = this.ctaVerifyEmailUseCase;
        getislefteyeopenprobability.read(getislefteyeopenprobability.write(str), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                EmailVerificationDeepLinkActivity.this.IconCompatParcelizer((zzaj.zzc) obj);
            }
        }, new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                EmailVerificationDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void IconCompatParcelizer(zzaj.zzc zzc) throws Exception {
        aj_();
        read(ManageEmailVerificationActivity.write(this, zzc.write, zzc.IconCompatParcelizer, false));
    }
}
