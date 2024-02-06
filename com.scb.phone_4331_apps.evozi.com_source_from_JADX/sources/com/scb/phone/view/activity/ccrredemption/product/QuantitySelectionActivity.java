package com.scb.phone.view.activity.ccrredemption.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.getCollectionElementType;
import p040o.isEagerInDefaultApp;
import p040o.setLastBaselineToBottomHeight;
import p040o.setupJuristicPin;

public class QuantitySelectionActivity extends BaseActivity implements TabLayout$MediaBrowserCompat$ItemReceiver {
    private isEagerInDefaultApp MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getCollectionElementType presenter;
    @BindView
    TabLayout tabLayout;
    @BindView
    TextView txvRewardPoints;
    @BindView
    ViewPager viewPager;

    public static Intent IconCompatParcelizer(Context context, isEagerInDefaultApp iseagerindefaultapp) {
        Intent intent = new Intent(context, QuantitySelectionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO", iseagerindefaultapp);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79522131493177);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        isEagerInDefaultApp iseagerindefaultapp = (isEagerInDefaultApp) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO");
        this.MediaBrowserCompat$SearchResultReceiver = iseagerindefaultapp;
        boolean MediaBrowserCompat$CustomActionResultReceiver = getCollectionElementType.MediaBrowserCompat$CustomActionResultReceiver(iseagerindefaultapp);
        this.viewPager.setAdapter(new setupJuristicPin(getSupportFragmentManager(), this, MediaBrowserCompat$CustomActionResultReceiver));
        this.tabLayout.setupWithViewPager(this.viewPager);
        if (!MediaBrowserCompat$CustomActionResultReceiver) {
            this.tabLayout.setVisibility(8);
        }
        this.tabLayout.addOnTabSelectedListener(this);
        m2850x50fd9e4a();
        super.setStackedBackground();
        setTitle(R.string.select_quantity);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        mo13676d_("rewards_select_quantity");
    }

    public final void setStackedBackground() {
        m2850x50fd9e4a();
        super.setStackedBackground();
        setTitle(R.string.select_quantity);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m2850x50fd9e4a() {
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token}));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        this.txvRewardPoints.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f66092131099764));
    }

    public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
        PlaybackStateCompat$CustomAction();
    }
}
