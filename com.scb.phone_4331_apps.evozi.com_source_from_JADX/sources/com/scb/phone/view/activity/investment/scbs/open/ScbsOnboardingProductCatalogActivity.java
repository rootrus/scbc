package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.LicenseCaptureView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.centerDistanceThreshold;
import p040o.getMicrAmount$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setPosX;
import p040o.setPosX$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.verifyReferral;

public class ScbsOnboardingProductCatalogActivity extends BaseActivity implements getMicrAmount$MediaBrowserCompat$CustomActionResultReceiver, verifyReferral.write {
    @BindView
    FrameLayout pdfView;
    @HmlPinActivity
    public setPosX presenter;

    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Intent intent = new Intent(context, ScbsOnboardingProductCatalogActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f92272131494454);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.scbs_onboarding_product_catalog_title));
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setPosX setposx = this.presenter;
        if (setposx.RatingCompat != null) {
            setposx.RatingCompat.AlertController$RecycleListView();
        }
        setposx.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        setposx.IconCompatParcelizer.IconCompatParcelizer(new setPosX$MediaBrowserCompat$ItemReceiver(setposx, (byte) 0));
        mo13676d_("scbsonboard_marketconduct");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.scbs_onboarding_product_catalog_title));
        setTabContainer();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        AlertController$RecycleListView.IconCompatParcelizer(getBaseContext(), this, (verifyReferral.IconCompatParcelizer) null, new centerDistanceThreshold(this.presenter), this.pdfView, str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CheckSCBSEligibilityActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    @OnClick
    public void onNextButtonClick() {
        setPosX setposx = this.presenter;
        LicenseCaptureView licenseCaptureView = LicenseCaptureView.IconCompatParcelizer;
        if (setposx.RatingCompat != null) {
            licenseCaptureView.IconCompatParcelizer(setposx.RatingCompat);
        }
    }
}
