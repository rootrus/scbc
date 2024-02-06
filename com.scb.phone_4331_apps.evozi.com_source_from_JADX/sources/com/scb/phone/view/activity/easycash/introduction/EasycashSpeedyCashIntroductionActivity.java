package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import p040o.CaptureData;
import p040o.HmlPinActivity;
import p040o.ImageProcessor_Factory;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.Onboarding;
import p040o.getLegacySharedPrefs;

public class EasycashSpeedyCashIntroductionActivity extends EasycashBaseIntroductionActivity implements CaptureData {
    @HmlPinActivity
    public ImageProcessor_Factory presenter;

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token() {
        return this.presenter;
    }

    public static Intent write(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashSpeedyCashIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.auto_scbone_speedy_cash_title);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        this.presenter.write("SPEEDY_CASH", MediaSessionCompat$QueueItem());
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        EasycashActivity.IconCompatParcelizer(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"), "CARDS", (String) null);
    }

    public final void IconCompatParcelizer() {
        EasycashInputIncomeActivity.MediaBrowserCompat$ItemReceiver(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"));
    }
}
