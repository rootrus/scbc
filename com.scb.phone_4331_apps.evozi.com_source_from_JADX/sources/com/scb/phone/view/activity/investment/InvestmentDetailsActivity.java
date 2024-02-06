package com.scb.phone.view.activity.investment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.p038tc.MutualFundTermsAndConditionsActivity;
import com.scb.phone.view.custom.common.NonSwipeableViewPager;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindMileageConfirmRedemptionActivity;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.buildSessionDataFrom;
import p040o.findReports;
import p040o.getDeejungInstallmentAmortizationList;
import p040o.writeCachedSettings;

public class InvestmentDetailsActivity extends BaseActivity implements CheckCaptureModule.C6375a.RatingCompat {
    private ActivityBuilder_BindMileageConfirmRedemptionActivity MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public buildSessionDataFrom goInvestmentPresenter;
    @BindView
    protected TabLayout tabLayout;
    @BindView
    protected NonSwipeableViewPager tabPager;

    public static Intent read(Context context) {
        return new Intent(context, InvestmentDetailsActivity.class);
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, InvestmentDetailsActivity.class);
        intent.putExtra("EXTRA_GO_TO_DISCOVER_TAB", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78442131493069);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.goInvestmentPresenter.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("accountsummary_investmentdetails");
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.investment_details_title));
        setTabContainer();
        Intent intent = getIntent();
        boolean z3 = false;
        if (intent != null) {
            z2 = intent.getBooleanExtra("EXTRA_BYPASS_TERM_AND_CON", false);
            z = intent.getBooleanExtra("EXTRA_GO_TO_DISCOVER_TAB", false);
        } else {
            z = false;
            z2 = false;
        }
        buildSessionDataFrom buildsessiondatafrom = this.goInvestmentPresenter;
        buildsessiondatafrom.MediaBrowserCompat$ItemReceiver = z;
        boolean z4 = true;
        if (z2) {
            buildsessiondatafrom.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            writeCachedSettings writecachedsettings = writeCachedSettings.IconCompatParcelizer;
            if (buildsessiondatafrom.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                writecachedsettings.IconCompatParcelizer(buildsessiondatafrom.RatingCompat);
                return;
            }
            return;
        }
        if (buildsessiondatafrom.RatingCompat == null) {
            z4 = false;
        }
        if (z4) {
            buildsessiondatafrom.RatingCompat.Keep();
        }
        buildsessiondatafrom.read.read();
        buildsessiondatafrom.read.IconCompatParcelizer(new buildSessionDataFrom.IconCompatParcelizer(buildsessiondatafrom, (byte) 0));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.investment_details_title));
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        AlertController$RecycleListView();
        this.tabPager.setAdapter(new getDeejungInstallmentAmortizationList(getSupportFragmentManager(), this));
        this.tabPager.setOffscreenPageLimit(2);
        this.tabLayout.setupWithViewPager(this.tabPager);
        this.tabPager.setDisableSwiping(true);
        this.tabLayout.addOnTabSelectedListener(new TabLayout$MediaBrowserCompat$ItemReceiver() {
            public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
                if (iconCompatParcelizer.read == 1) {
                    InvestmentDetailsActivity investmentDetailsActivity = InvestmentDetailsActivity.this;
                    investmentDetailsActivity.scbAnalytics.write("mutualfund_discover_landing", new ZSYR2K("mf_customer", DiskLruCache.VERSION_1), new ZSYR2K("source", "tab"));
                    InvestmentDetailsActivity.MediaBrowserCompat$CustomActionResultReceiver(InvestmentDetailsActivity.this);
                }
            }
        });
    }

    public final void write(boolean z) {
        MutualFundTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver(this, z);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        access$2200 access_2200 = new access$2200();
        access_2200.IconCompatParcelizer = getString(R.string.investment_term_error);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void IconCompatParcelizer() {
        TabLayout.IconCompatParcelizer IconCompatParcelizer = this.tabLayout.IconCompatParcelizer(1);
        if (IconCompatParcelizer != null) {
            TabLayout tabLayout2 = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (tabLayout2 != null) {
                tabLayout2.write(IconCompatParcelizer, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public final void read() {
        buildSessionDataFrom buildsessiondatafrom = this.goInvestmentPresenter;
        if (buildsessiondatafrom.MediaBrowserCompat$ItemReceiver) {
            findReports findreports = findReports.MediaBrowserCompat$CustomActionResultReceiver;
            if (buildsessiondatafrom.RatingCompat != null) {
                findreports.IconCompatParcelizer(buildsessiondatafrom.RatingCompat);
            }
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof ActivityBuilder_BindMileageConfirmRedemptionActivity) {
            this.MediaBrowserCompat$SearchResultReceiver = (ActivityBuilder_BindMileageConfirmRedemptionActivity) fragment;
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(InvestmentDetailsActivity investmentDetailsActivity) {
        ActivityBuilder_BindMileageConfirmRedemptionActivity activityBuilder_BindMileageConfirmRedemptionActivity = investmentDetailsActivity.MediaBrowserCompat$SearchResultReceiver;
        if (activityBuilder_BindMileageConfirmRedemptionActivity != null) {
            activityBuilder_BindMileageConfirmRedemptionActivity.MediaDescriptionCompat();
        }
    }
}
