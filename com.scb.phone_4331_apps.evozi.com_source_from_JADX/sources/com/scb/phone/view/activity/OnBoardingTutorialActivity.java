package com.scb.phone.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.C5723xe0078557;
import com.scb.phone.view.adapter.OnBoardingTutorialViewPagerAdapter;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.LogFileManager;
import p059me.relex.circleindicator.CircleIndicator;

public class OnBoardingTutorialActivity extends BaseActivity implements C5723xe0078557, ViewPager.MediaMetadataCompat, CheckCaptureModule_GetICheckDeserializerRttiFactory {
    @BindView
    ImageView mNextTutorialImageView;
    @BindView
    CircleIndicator mOnBoardingTutorialIndicator;
    @BindView
    ViewPager mOnBoardingTutorialViewPager;
    @BindView
    ImageView mPreviousTutorialImageView;
    @BindView
    RelativeLayout mRootLayout;
    @BindView
    ImageView mSkipImageView;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79112131493136);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$Token((LogFileManager.DirectoryProvider) getIntent().getParcelableExtra("com.scb.phone.EXTRA_WHITE_TUTORIAL"));
        OnBoardingTutorialViewPagerAdapter onBoardingTutorialViewPagerAdapter = new OnBoardingTutorialViewPagerAdapter(this);
        onBoardingTutorialViewPagerAdapter.write = this;
        this.mOnBoardingTutorialViewPager.setAdapter(onBoardingTutorialViewPagerAdapter);
        this.mOnBoardingTutorialIndicator.setViewPager(this.mOnBoardingTutorialViewPager);
        this.mOnBoardingTutorialViewPager.addOnPageChangeListener(this);
        this.mSkipImageView.bringToFront();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void closeTutorial() {
        this.mRootLayout.removeView(this.mOnBoardingTutorialViewPager);
        this.mRootLayout.removeView(this.mNextTutorialImageView);
        this.mRootLayout.removeView(this.mPreviousTutorialImageView);
        this.mRootLayout.removeView(this.mSkipImageView);
        this.mRootLayout.removeView(this.mOnBoardingTutorialIndicator);
        setHasNonEmbeddedTabs();
    }

    public void onPageSelected(int i) {
        int currentItem = this.mOnBoardingTutorialViewPager.getCurrentItem();
        if (i == 0) {
            this.mNextTutorialImageView.setVisibility(0);
            this.mPreviousTutorialImageView.setVisibility(8);
        } else if (currentItem == this.mOnBoardingTutorialViewPager.getAdapter().getCount() - 1) {
            this.mNextTutorialImageView.setVisibility(8);
            this.mPreviousTutorialImageView.setVisibility(0);
        } else {
            this.mNextTutorialImageView.setVisibility(0);
            this.mPreviousTutorialImageView.setVisibility(0);
        }
    }

    public void onPageClick(View view) {
        m3173x50fd9e4a();
    }

    @OnClick
    public void onNextTutorialButtonClick() {
        m3173x50fd9e4a();
    }

    @OnClick
    public void onPreviousTutorialButtonClick() {
        this.mOnBoardingTutorialViewPager.setCurrentItem(this.mOnBoardingTutorialViewPager.getCurrentItem() - 1);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m3173x50fd9e4a() {
        int currentItem = this.mOnBoardingTutorialViewPager.getCurrentItem() + 1;
        if (currentItem < this.mOnBoardingTutorialViewPager.getAdapter().getCount()) {
            this.mOnBoardingTutorialViewPager.setCurrentItem(currentItem);
        } else {
            closeTutorial();
        }
    }
}
