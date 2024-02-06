package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.Onboarding;
import p040o.calculate;
import p040o.getLegacySharedPrefs;

public class EasycashDeepLinkActivity extends BaseDeepLinkActivity implements CheckExtractActivity_MembersInjector.setBackgroundResource {
    @HmlPinActivity
    public calculate presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        calculate calculate = this.presenter;
        if (calculate.RatingCompat != null) {
            calculate.RatingCompat.AlertController$RecycleListView();
        }
        calculate.IconCompatParcelizer.IconCompatParcelizer(str);
        calculate.IconCompatParcelizer.IconCompatParcelizer(new calculate.write(calculate, (byte) 0));
    }

    public final void IconCompatParcelizer(Throwable th) {
        mo14215a_(th);
    }

    public final void MediaBrowserCompat$ItemReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r2) {
        read(EasycashLandingActivity.write(this, getlegacysharedprefs, r2));
    }
}
