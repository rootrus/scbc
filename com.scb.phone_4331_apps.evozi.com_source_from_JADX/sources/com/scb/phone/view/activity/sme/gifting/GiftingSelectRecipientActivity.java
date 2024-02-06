package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFromFavouriteFragment;
import p040o.AlertController$RecycleListView;
import p040o.calculateCreditPower;

public class GiftingSelectRecipientActivity extends BaseActivity {
    @BindView
    CustomTabLayout tabLayout;
    @BindView
    ViewPager viewPager;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78122131493037);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_input_select_recipient));
        final calculateCreditPower calculatecreditpower = new calculateCreditPower(getIntent().getStringExtra("RECIPIENT_TYPE"), getSupportFragmentManager(), this);
        this.viewPager.setAdapter(calculatecreditpower);
        this.viewPager.setOffscreenPageLimit(3);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.tabLayout.addOnTabSelectedListener(new TabLayout$MediaBrowserCompat$ItemReceiver() {
            public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
                if (calculatecreditpower.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.read) instanceof GiftRecipientFromFavouriteFragment) {
                    GiftingSelectRecipientActivity.this.PlaybackStateCompat$CustomAction();
                }
            }
        });
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_input_select_recipient));
    }
}
