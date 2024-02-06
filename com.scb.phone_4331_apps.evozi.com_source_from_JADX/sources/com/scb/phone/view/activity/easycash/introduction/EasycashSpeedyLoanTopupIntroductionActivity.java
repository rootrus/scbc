package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import p040o.C5250s;
import p040o.HmlPinActivity;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.Onboarding;
import p040o.RttiIdExtractor_Factory;
import p040o.getLegacySharedPrefs;

public class EasycashSpeedyLoanTopupIntroductionActivity extends EasycashBaseIntroductionActivity implements RttiIdExtractor_Factory {
    @HmlPinActivity
    public C5250s presenter;

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token() {
        return this.presenter;
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashSpeedyLoanTopupIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.easycash_introduction_speedy_loan_top_up_title);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        this.presenter.write("SPEEDY_LOAN_TOP_UP", MediaSessionCompat$QueueItem());
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        EasycashInputIncomeActivity.MediaBrowserCompat$ItemReceiver(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"));
    }

    public final void read() {
        EasycashActivity.IconCompatParcelizer(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"), "LOANS", (String) null);
    }
}
