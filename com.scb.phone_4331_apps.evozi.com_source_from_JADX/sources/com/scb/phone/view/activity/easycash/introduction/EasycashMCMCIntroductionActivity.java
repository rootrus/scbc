package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import p040o.C10827Iterators;
import p040o.C5186r;
import p040o.Check;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.Onboarding;
import p040o.getLegacySharedPrefs;
import p040o.onGetStartedClick;
import p040o.r$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.r$MediaBrowserCompat$ItemReceiver;
import p040o.setImageData;

public final class EasycashMCMCIntroductionActivity extends EasycashBaseIntroductionActivity implements Check {
    public static final C5599x710e2b77 MediaDescriptionCompat = new C5599x710e2b77((byte) 0);
    @HmlPinActivity
    public C5186r presenter;

    public static final Intent write(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r2) {
        return C5599x710e2b77.read(context, getlegacysharedprefs, r2);
    }

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory<?> MediaSessionCompat$Token() {
        C5186r rVar = this.presenter;
        if (rVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return rVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.auto_mcmc_header_title);
    }

    public final void IconCompatParcelizer() {
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        onGetStartedClick.IconCompatParcelizer((Object) getlegacysharedprefs, "tileDisplay");
        EasycashInputIncomeActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this, getlegacysharedprefs);
    }

    public final void onDestroy() {
        C5186r rVar = this.presenter;
        if (rVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        rVar.onDestroy();
        super.onDestroy();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        C5186r rVar = this.presenter;
        if (rVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        onGetStartedClick.IconCompatParcelizer((Object) MediaSessionCompat$QueueItem, "flowType");
        onGetStartedClick.write((Object) "MCMC", "productType");
        onGetStartedClick.write((Object) MediaSessionCompat$QueueItem, "flowType");
        if (rVar.RatingCompat != null) {
            rVar.RatingCompat.AlertController$RecycleListView();
        }
        C10827Iterators.C35467 r5 = rVar.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity r_mediabrowsercompat_itemreceiver = new r$MediaBrowserCompat$ItemReceiver(rVar);
        FundFactSheetActivity r_mediabrowsercompat_customactionresultreceiver = new r$MediaBrowserCompat$CustomActionResultReceiver(rVar);
        onGetStartedClick.write((Object) r_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) r_mediabrowsercompat_customactionresultreceiver, "onError");
        onGetStartedClick.write((Object) "MCMC", "productType");
        onGetStartedClick.write((Object) MediaSessionCompat$QueueItem, "flowType");
        r5.IconCompatParcelizer(r5.read, r_mediabrowsercompat_itemreceiver, r_mediabrowsercompat_customactionresultreceiver, new setImageData.write("MCMC", MediaSessionCompat$QueueItem));
    }
}
