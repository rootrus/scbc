package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.fragment.easycash.landing.EasycashLandingEmptyFragment;
import com.scb.phone.view.fragment.easycash.landing.EasycashLandingProductsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C1158xd0c06e23;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Onboarding;
import p040o.forEachClear;
import p040o.getAppProcessInfo;
import p040o.getLegacySharedPrefs;
import p040o.getProximitySensorEnabled;
import p040o.setCroppingTetragon;
import p040o.setTapText;

public class EasycashLandingActivity extends BaseActivity implements C1158xd0c06e23 {
    private boolean MediaBrowserCompat$MediaItem = false;
    @HmlPinActivity
    public setCroppingTetragon easycashLandingPresenter;
    @HmlPinActivity
    public forEachClear tracker;

    public static Intent write(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashLandingActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_REFRESH", false);
        intent.putExtra("com.scb.phone.EXTRA_DEEPLINK", true);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent putExtra = new Intent(context, EasycashLandingActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_REFRESH", true).putExtra("com.scb.phone.EXTRA_DEEPLINK", false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, putExtra).read();
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
        setContentView(R.layout.f77582131492983);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setPrimaryBackground();
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.easycash_scb_easy_cash);
        setTabContainer();
        this.easycashLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        boolean z = false;
        if (getIntent().getBooleanExtra("com.scb.phone.EXTRA_DEEPLINK", false)) {
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, EasycashLandingProductsFragment.MediaDescriptionCompat((getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE"), (Onboarding.C37171) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION"))).write();
            forEachClear foreachclear = this.tracker;
            foreachclear.IconCompatParcelizer.edit().putString("entry_point", "PROMO").apply();
            foreachclear.write();
        } else {
            forEachClear foreachclear2 = this.tracker;
            foreachclear2.IconCompatParcelizer.edit().putString("entry_point", "REGULAR").apply();
            foreachclear2.write();
            z = true;
        }
        if (z) {
            this.easycashLandingPresenter.read(setGroupDividerEnabled(), mo13022E_());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        setSubtitle();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (getIntent().getBooleanExtra("com.scb.phone.EXTRA_REFRESH", false)) {
            this.easycashLandingPresenter.read(setGroupDividerEnabled(), mo13022E_());
            getIntent().putExtra("com.scb.phone.EXTRA_REFRESH", false);
        } else if (this.MediaBrowserCompat$MediaItem) {
            this.easycashLandingPresenter.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$MediaItem = false;
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.easycash_scb_easy_cash);
        setTabContainer();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7134) {
            if (i2 == -1) {
                this.MediaBrowserCompat$MediaItem = true;
            } else {
                finish();
            }
        } else if (getIntent().getBooleanExtra("com.scb.phone.EXTRA_DEEPLINK", false) && i2 == -1) {
            finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getAppProcessInfo getappprocessinfo, boolean z) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, EasycashLandingEmptyFragment.MediaBrowserCompat$CustomActionResultReceiver(getappprocessinfo, z)).write();
    }

    public final void IconCompatParcelizer(getProximitySensorEnabled getproximitysensorenabled, boolean z) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, EasycashLandingProductsFragment.IconCompatParcelizer(getproximitysensorenabled, z)).write();
    }

    public void onDestroy() {
        this.tracker.IconCompatParcelizer();
        this.easycashLandingPresenter.onDestroy();
        super.onDestroy();
    }
}
