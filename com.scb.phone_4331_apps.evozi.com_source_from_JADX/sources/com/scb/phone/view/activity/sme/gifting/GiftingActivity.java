package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C10888submitFatca;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class GiftingActivity extends BaseActivity implements ViewPager.MediaMetadataCompat {
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    @BindView
    CustomTabLayout giftsTabLayout;
    @BindView
    ViewPager giftsViewPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78142131493039);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.giftsViewPager.setAdapter(new C10888submitFatca(getSupportFragmentManager(), this));
        this.giftsTabLayout.setupWithViewPager(this.giftsViewPager);
        this.giftsViewPager.addOnPageChangeListener(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gifting_main_tile));
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            mo13676d_("gifts_box_received");
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gifting_main_tile));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93082131558413, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_help).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f67252131099881));
        menu.findItem(R.id.menu_action_help).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, GiftingAboutActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    @OnClick
    public void onGiftsSendButtonClick(View view) {
        mo13676d_("gifts_box_send_gift_action");
        Intent intent = new Intent(this, GiftSelectionActivity.class);
        intent.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onPageSelected(int i) {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            mo13676d_("gifts_box_received");
        }
        if (!this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
            mo13676d_("gifts_box_sent");
        }
    }
}
