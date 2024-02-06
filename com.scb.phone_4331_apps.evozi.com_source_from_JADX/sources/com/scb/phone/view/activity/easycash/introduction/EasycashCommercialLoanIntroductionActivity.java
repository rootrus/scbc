package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashReferralSendProductActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.Check$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.CrashlyticsBackgroundWorker;
import p040o.HmlPinActivity;
import p040o.IsgDetectionModule;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.MultiDetector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Onboarding;
import p040o.ZSYR2K;
import p040o.getLegacySharedPrefs;
import p040o.setPreviousExpirable;
import p040o.setPreviousExpirable$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;

public class EasycashCommercialLoanIntroductionActivity extends EasycashBaseIntroductionActivity implements Check$MediaBrowserCompat$CustomActionResultReceiver {
    @HmlPinActivity
    public IsgDetectionModule presenter;

    /* access modifiers changed from: protected */
    public final IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token() {
        return this.presenter;
    }

    public static Intent IconCompatParcelizer(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashCommercialLoanIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setTitle(R.string.easycash_introduction_business_loan_title);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14347x50fd9e4a() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", MediaSessionCompat$QueueItem()));
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_introduction");
        boolean z = true;
        if ("NON_REFERRAL".equals(MediaSessionCompat$QueueItem())) {
            IsgDetectionModule isgDetectionModule = this.presenter;
            if (isgDetectionModule.RatingCompat == null) {
                z = false;
            }
            if (z) {
                isgDetectionModule.RatingCompat.AlertController$RecycleListView();
            }
            isgDetectionModule.IconCompatParcelizer.IconCompatParcelizer();
            isgDetectionModule.IconCompatParcelizer.IconCompatParcelizer(new IsgDetectionModule.write());
        } else if ("REFERRAL".equals(MediaSessionCompat$QueueItem())) {
            IsgDetectionModule isgDetectionModule2 = this.presenter;
            getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
            if (isgDetectionModule2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                isgDetectionModule2.RatingCompat.AlertController$RecycleListView();
            }
            MultiDetector multiDetector = isgDetectionModule2.read;
            setPreviousExpirable$MediaBrowserCompat$ItemReceiver setpreviousexpirable_mediabrowsercompat_itemreceiver = new setPreviousExpirable$MediaBrowserCompat$ItemReceiver();
            setpreviousexpirable_mediabrowsercompat_itemreceiver.IconCompatParcelizer = "COMMERCIAL_LOAN";
            multiDetector.MediaBrowserCompat$ItemReceiver(new setPreviousExpirable(setpreviousexpirable_mediabrowsercompat_itemreceiver, (byte) 0));
            isgDetectionModule2.read.IconCompatParcelizer(new IsgDetectionModule.IconCompatParcelizer(getlegacysharedprefs));
        }
    }

    public final void read(CrashlyticsBackgroundWorker.C32131 r4) {
        Intent write = EasycashReferralSendProductActivity.write(this, r4);
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

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void RatingCompat(String str) {
        EasycashActivity.MediaBrowserCompat$ItemReceiver(this, str, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"));
    }
}
