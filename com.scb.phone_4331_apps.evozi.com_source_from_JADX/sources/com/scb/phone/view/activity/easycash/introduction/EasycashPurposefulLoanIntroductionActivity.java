package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import p040o.C9771x3ae934ff;
import p040o.HmlPinActivity;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.IsgPassportDetector;
import p040o.Onboarding;
import p040o.ZSYR2K;
import p040o.getLegacySharedPrefs;

public class EasycashPurposefulLoanIntroductionActivity extends EasycashBaseIntroductionActivity {
    @HmlPinActivity
    public IsgPassportDetector.C3516a presenter;

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token() {
        return this.presenter;
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashPurposefulLoanIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.purposeful_loan_introduction_title);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", "REFERRAL"));
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        IsgPassportDetector.C3516a aVar = this.presenter;
        if (aVar.RatingCompat != null) {
            aVar.RatingCompat.AlertController$RecycleListView();
        }
        aVar.read.read("PURPOSEFUL_LOAN");
        aVar.read.IconCompatParcelizer(new C9771x3ae934ff(aVar, (byte) 0));
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        EasycashInputIncomeActivity.MediaBrowserCompat$ItemReceiver(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"));
    }
}
