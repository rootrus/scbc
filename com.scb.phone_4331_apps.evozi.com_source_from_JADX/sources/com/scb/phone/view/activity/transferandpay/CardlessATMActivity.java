package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessAtmInfoActivity;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessWithdrawAmountFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setBaselineAligned;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSelectedColor;
import p040o.setTapText;
import p040o.setViewPager;

public class CardlessATMActivity extends BaseActivity {
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;

    public enum IconCompatParcelizer {
        DEPOSITS,
        CARDS
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76962131492921);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_SHOW_CANCEL_CARDLESS_CONFIRMATION_SNACK_BAR")).subscribe(new setSelectedColor(this), setViewPager.read);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.fragment_container, CardlessWithdrawAmountFragment.read(read("source", "")), getString(R.string.cardless_withdraw_amount_tag)).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.cardless_atm_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93082131558413, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_help).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f71012131100257));
        menu.findItem(R.id.menu_action_help).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, CardlessAtmInfoActivity.class);
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

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        super.onDestroy();
    }
}
