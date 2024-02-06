package com.scb.phone.view.activity.demo.ntb;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.demontb.IntroductionViewPagerAdapter;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.C7290oU;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.ProjectedCorners;
import p040o.Region;
import p040o.nativeDetectShadows;
import p059me.relex.circleindicator.CircleIndicator;

public class IntroductionActivity extends BaseActivity implements KtaJsonCheck.C69271.write {
    @BindView
    CircleIndicator indicator;
    @BindView
    RelativeLayout introductionContainer;
    @HmlPinActivity
    public nativeDetectShadows introductionPresenter;
    @BindView
    ViewPager viewPager;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.f78432131493068);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.introductionPresenter.MediaBrowserCompat$ItemReceiver(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("INTRODUCTION_LIST");
        if (parcelableArrayListExtra != null) {
            this.viewPager.setAdapter(new IntroductionViewPagerAdapter(this, parcelableArrayListExtra, new C7290oU(this)));
            this.indicator.setViewPager(this.viewPager);
            this.introductionContainer.setVisibility(0);
            return;
        }
        this.introductionContainer.setVisibility(8);
        finish();
    }

    public /* synthetic */ void lambda$setIntroduction$0$IntroductionActivity(View view) {
        nativeDetectShadows nativedetectshadows = this.introductionPresenter;
        int currentItem = this.viewPager.getCurrentItem();
        int count = this.viewPager.getAdapter().getCount();
        boolean z = true;
        int i = currentItem + 1;
        if (!(nativedetectshadows.RatingCompat != null)) {
            return;
        }
        if (i < count) {
            ProjectedCorners projectedCorners = new ProjectedCorners(i);
            if (nativedetectshadows.RatingCompat == null) {
                z = false;
            }
            if (z) {
                projectedCorners.IconCompatParcelizer(nativedetectshadows.RatingCompat);
                return;
            }
            return;
        }
        Region region = Region.MediaBrowserCompat$CustomActionResultReceiver;
        if (nativedetectshadows.RatingCompat == null) {
            z = false;
        }
        if (z) {
            region.IconCompatParcelizer(nativedetectshadows.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.viewPager.setCurrentItem(i);
    }

    public void onDestroy() {
        this.introductionPresenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void closeIntroduction() {
        this.introductionContainer.setVisibility(8);
        finish();
    }

    public void onBackPressed() {
        this.introductionContainer.setVisibility(8);
        finish();
    }
}
