package com.scb.phone.view.activity.hml;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.hml.SimulatorTutorialViewPagerAdapter;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.trimSessionFiles;
import p059me.relex.circleindicator.CircleIndicator;

public class HmlSimulatorTutorialActivity extends BaseActivity implements CheckCaptureModule_GetICheckDeserializerRttiFactory, ViewPager.MediaMetadataCompat, SimulatorTutorialViewPagerAdapter.write {
    @BindView
    ImageView mNextTutorialImageView;
    @BindView
    ImageView mPreviousTutorialImageView;
    @BindView
    RelativeLayout mRootLayout;
    @BindView
    CircleIndicator mSimulatorTutorialIndicator;
    @BindView
    ViewPager mSimulatorTutorialViewPager;
    @BindView
    ImageView mSkipImageView;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static Intent read(Context context, trimSessionFiles trimsessionfiles) {
        return new Intent(context, HmlSimulatorTutorialActivity.class).putExtra("SIMULATOR_DISPLAY", trimsessionfiles);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79962131493221);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mRootLayout.setSystemUiVisibility(3846);
        SimulatorTutorialViewPagerAdapter simulatorTutorialViewPagerAdapter = new SimulatorTutorialViewPagerAdapter(this, ((trimSessionFiles) getIntent().getParcelableExtra("SIMULATOR_DISPLAY")).MediaBrowserCompat$CustomActionResultReceiver);
        simulatorTutorialViewPagerAdapter.read = this;
        this.mSimulatorTutorialViewPager.setAdapter(simulatorTutorialViewPagerAdapter);
        this.mSimulatorTutorialIndicator.setViewPager(this.mSimulatorTutorialViewPager);
        this.mSimulatorTutorialViewPager.addOnPageChangeListener(this);
        this.mSkipImageView.bringToFront();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void closeTutorial() {
        this.mRootLayout.removeView(this.mSimulatorTutorialViewPager);
        this.mRootLayout.removeView(this.mNextTutorialImageView);
        this.mRootLayout.removeView(this.mPreviousTutorialImageView);
        this.mRootLayout.removeView(this.mSkipImageView);
        this.mRootLayout.removeView(this.mSimulatorTutorialIndicator);
        this.mRootLayout.setSystemUiVisibility(1792);
        setResult(-1);
        finish();
    }

    public void onPageSelected(int i) {
        int currentItem = this.mSimulatorTutorialViewPager.getCurrentItem();
        if (i == 0) {
            this.mNextTutorialImageView.setVisibility(0);
            this.mPreviousTutorialImageView.setVisibility(8);
        } else if (currentItem == this.mSimulatorTutorialViewPager.getAdapter().getCount() - 1) {
            this.mNextTutorialImageView.setVisibility(8);
            this.mPreviousTutorialImageView.setVisibility(0);
        } else {
            this.mNextTutorialImageView.setVisibility(0);
            this.mPreviousTutorialImageView.setVisibility(0);
        }
    }

    public void onPageClick(View view) {
        MediaSessionCompat$ResultReceiverWrapper();
    }

    @OnClick
    public void onNextTutorialButtonClick() {
        MediaSessionCompat$ResultReceiverWrapper();
    }

    @OnClick
    public void onPreviousTutorialButtonClick() {
        this.mSimulatorTutorialViewPager.setCurrentItem(this.mSimulatorTutorialViewPager.getCurrentItem() - 1);
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        int currentItem = this.mSimulatorTutorialViewPager.getCurrentItem() + 1;
        if (currentItem < this.mSimulatorTutorialViewPager.getAdapter().getCount()) {
            this.mSimulatorTutorialViewPager.setCurrentItem(currentItem);
        } else {
            closeTutorial();
        }
    }
}
