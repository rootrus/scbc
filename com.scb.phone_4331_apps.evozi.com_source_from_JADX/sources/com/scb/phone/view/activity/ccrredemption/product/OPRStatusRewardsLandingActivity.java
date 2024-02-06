package com.scb.phone.view.activity.ccrredemption.product;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.Barrier;
import p040o.eagerInDefaultApp;
import p040o.setLastBaselineToBottomHeight;

public class OPRStatusRewardsLandingActivity extends CCRBaseActivity implements TabLayout$MediaBrowserCompat$ItemReceiver {
    private BroadcastReceiver MediaBrowserCompat$MediaItem = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent.getStringExtra("OPRStatusRewardsLandingActivity.SelectedTier") != null) {
                OPRStatusRewardsLandingActivity.this.viewPager.setCurrentItem(1);
            }
        }
    };
    private int MediaBrowserCompat$SearchResultReceiver;
    private int[] MediaDescriptionCompat = {R.string.status_label, R.string.rewards_label};
    private eagerInDefaultApp MediaMetadataCompat;
    @BindView
    TabLayout statusRewardsTabLayout;
    @BindView
    ViewPager viewPager;

    public static Intent write(Context context, eagerInDefaultApp eagerindefaultapp) {
        Intent intent = new Intent(context, OPRStatusRewardsLandingActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO", eagerindefaultapp);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79142131493139);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        eagerInDefaultApp eagerindefaultapp = (eagerInDefaultApp) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        this.MediaMetadataCompat = eagerindefaultapp;
        this.MediaBrowserCompat$SearchResultReceiver = eagerindefaultapp.Keep;
        setStackedBackground();
        MediaSessionCompat$QueueItem();
        Barrier.MediaBrowserCompat$CustomActionResultReceiver((Context) this).IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, new IntentFilter("OPRStatusRewardsLandingActivity.RedeemAction"));
        mo13676d_("rewards_1point_landing");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaSessionCompat$QueueItem() {
        /*
            r7 = this;
            o.postMailingAddressConfirmation r0 = new o.postMailingAddressConfirmation
            o.setTitleMarginStart r1 = r7.getSupportFragmentManager()
            r0.<init>(r1, r7)
            androidx.viewpager.widget.ViewPager r1 = r7.viewPager
            r1.setAdapter(r0)
            com.google.android.material.tabs.TabLayout r0 = r7.statusRewardsTabLayout
            androidx.viewpager.widget.ViewPager r1 = r7.viewPager
            r0.setupWithViewPager(r1)
            r0 = 0
            r1 = r0
        L_0x0017:
            com.google.android.material.tabs.TabLayout r2 = r7.statusRewardsTabLayout
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$IconCompatParcelizer> r2 = r2.AppCompatDelegateImpl$ListMenuDecorView
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0089
            com.google.android.material.tabs.TabLayout r2 = r7.statusRewardsTabLayout
            com.google.android.material.tabs.TabLayout$IconCompatParcelizer r2 = r2.IconCompatParcelizer((int) r1)
            if (r2 == 0) goto L_0x0086
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r7)
            r4 = 2131494407(0x7f0c0607, float:1.8612322E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)
            r4 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131302066(0x7f0916b2, float:1.8222208E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int[] r6 = r7.MediaDescriptionCompat
            r6 = r6[r1]
            r4.setText(r6)
            r4 = 1
            if (r1 != r4) goto L_0x0078
            o.eagerInDefaultApp r6 = r7.MediaMetadataCompat
            java.util.List<o.validateInterface> r6 = r6.f2820x50fd9e4a
            if (r6 == 0) goto L_0x0062
            o.eagerInDefaultApp r6 = r7.MediaMetadataCompat
            java.util.List<o.validateInterface> r6 = r6.f2820x50fd9e4a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            if (r4 == 0) goto L_0x0078
            r5.setVisibility(r0)
            o.eagerInDefaultApp r4 = r7.MediaMetadataCompat
            java.util.List<o.validateInterface> r4 = r4.f2820x50fd9e4a
            int r4 = r4.size()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5.setText(r4)
            goto L_0x007d
        L_0x0078:
            r4 = 8
            r5.setVisibility(r4)
        L_0x007d:
            r2.IconCompatParcelizer = r3
            com.google.android.material.tabs.TabLayout$TabView r2 = r2.MediaDescriptionCompat
            if (r2 == 0) goto L_0x0086
            r2.MediaBrowserCompat$ItemReceiver()
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0089:
            r7.m3178x50fd9e4a()
            com.google.android.material.tabs.TabLayout r0 = r7.statusRewardsTabLayout
            r0.addOnTabSelectedListener(r7)
            androidx.viewpager.widget.ViewPager r0 = r7.viewPager
            int r1 = r7.MediaBrowserCompat$SearchResultReceiver
            r0.setCurrentItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccrredemption.product.OPRStatusRewardsLandingActivity.MediaSessionCompat$QueueItem():void");
    }

    public void onDestroy() {
        Barrier.MediaBrowserCompat$CustomActionResultReceiver((Context) this).IconCompatParcelizer(this.MediaBrowserCompat$MediaItem);
        super.onDestroy();
    }

    public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
        m3178x50fd9e4a();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        eagerInDefaultApp eagerindefaultapp = (eagerInDefaultApp) intent.getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        this.MediaMetadataCompat = eagerindefaultapp;
        this.MediaBrowserCompat$SearchResultReceiver = eagerindefaultapp.Keep;
        MediaSessionCompat$QueueItem();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m3178x50fd9e4a() {
        int i;
        for (int i2 = 0; i2 < this.statusRewardsTabLayout.AppCompatDelegateImpl$ListMenuDecorView.size(); i2++) {
            TabLayout.IconCompatParcelizer IconCompatParcelizer = this.statusRewardsTabLayout.IconCompatParcelizer(i2);
            if (!(IconCompatParcelizer == null || IconCompatParcelizer.IconCompatParcelizer == null)) {
                TextView textView = (TextView) IconCompatParcelizer.IconCompatParcelizer.findViewById(16908308);
                TabLayout.IconCompatParcelizer iconCompatParcelizer = this.statusRewardsTabLayout.MediaBrowserCompat$CustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    i = iconCompatParcelizer.read;
                } else {
                    i = -1;
                }
                if (i2 == i) {
                    textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65582131099711));
                } else {
                    textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f66192131099774));
                }
            }
        }
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.one_point_redemption));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
