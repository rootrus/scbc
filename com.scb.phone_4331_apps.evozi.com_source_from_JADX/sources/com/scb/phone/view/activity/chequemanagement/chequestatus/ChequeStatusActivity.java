package com.scb.phone.view.activity.chequemanagement.chequestatus;

import android.app.Activity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.C1153xe809f160;
import p040o.ConstructorConstructor;
import p040o.ConstructorConstructor$6$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.productAddress;

public class ChequeStatusActivity extends BaseActivity implements ViewPager.MediaMetadataCompat, C1153xe809f160 {
    @HmlPinActivity
    public ConstructorConstructor.C32066 presenter;
    @BindView
    protected TabLayout tabLayout;
    @BindView
    protected ViewPager tabPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77112131492936);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ConstructorConstructor.C32066 r4 = this.presenter;
        if (r4.RatingCompat != null) {
            r4.RatingCompat.AlertController$RecycleListView();
        }
        r4.read.write("DISPLAY_RECEIVE_CHEQUE");
        r4.read.IconCompatParcelizer(new ConstructorConstructor$6$MediaBrowserCompat$ItemReceiver(r4));
        super.setStackedBackground();
        setTitle(R.string.cheque_status_title);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.cheque_status_title);
        setTabContainer();
    }

    public final void write(int i, int i2) {
        this.tabPager.setAdapter(new productAddress(getSupportFragmentManager(), this, i, i2));
        this.tabPager.setOffscreenPageLimit(2);
        this.tabLayout.setupWithViewPager(this.tabPager);
        this.tabPager.addOnPageChangeListener(this);
        this.tabPager.setCurrentItem(1);
    }

    public void onPageSelected(int i) {
        this.scbAnalytics.write("chqstatus_landing", new ZSYR2K("chqstatus_type", i != 0 ? i != 1 ? "" : "paid" : "received"));
    }
}
