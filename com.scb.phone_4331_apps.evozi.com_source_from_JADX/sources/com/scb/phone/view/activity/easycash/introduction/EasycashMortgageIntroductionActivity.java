package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import p040o.Check;
import p040o.HmlPinActivity;
import p040o.ImageProcessor;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.IsgMrzDocumentDetector;
import p040o.IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver;
import p040o.Onboarding;
import p040o.ZSYR2K;
import p040o.getLegacySharedPrefs;
import p040o.getTotalRamInBytes;
import p040o.zzbt;

public class EasycashMortgageIntroductionActivity extends EasycashBaseIntroductionActivity implements Check.IconCompatParcelizer {
    @HmlPinActivity
    public IsgMrzDocumentDetector easycashMortgageIntroductionPresenter;

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token() {
        return this.easycashMortgageIntroductionPresenter;
    }

    public static Intent read(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashMortgageIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.easycashMortgageIntroductionPresenter.MediaBrowserCompat$ItemReceiver(this);
        IsgMrzDocumentDetector isgMrzDocumentDetector = this.easycashMortgageIntroductionPresenter;
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        if (getlegacysharedprefs != null) {
            isgMrzDocumentDetector.write = getlegacysharedprefs;
            ImageProcessor.QaProgressClient qaProgressClient = new ImageProcessor.QaProgressClient(getlegacysharedprefs);
            if (isgMrzDocumentDetector.RatingCompat != null) {
                qaProgressClient.IconCompatParcelizer(isgMrzDocumentDetector.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setTitle(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", MediaSessionCompat$QueueItem()));
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        IsgMrzDocumentDetector isgMrzDocumentDetector = this.easycashMortgageIntroductionPresenter;
        if (isgMrzDocumentDetector.RatingCompat != null) {
            isgMrzDocumentDetector.RatingCompat.AlertController$RecycleListView();
        }
        isgMrzDocumentDetector.read.MediaBrowserCompat$CustomActionResultReceiver(isgMrzDocumentDetector.write.MediaDescriptionCompat);
        isgMrzDocumentDetector.read.IconCompatParcelizer(new IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver(isgMrzDocumentDetector));
    }

    public void onDestroy() {
        this.easycashMortgageIntroductionPresenter.onDestroy();
        super.onDestroy();
    }

    public final void write(getTotalRamInBytes gettotalraminbytes) {
        EasycashActivity.IconCompatParcelizer(this, gettotalraminbytes, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzbt.zzc zzc) {
        EasycashInputIncomeActivity.MediaBrowserCompat$CustomActionResultReceiver(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"), zzc.MediaBrowserCompat$ItemReceiver);
    }
}
