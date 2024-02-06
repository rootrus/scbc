package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.ContextImageStorage_Factory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getDocumentSkew;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.stopListening;

public class CardlessATMTutorialActivity extends BaseActivity implements getDocumentSkew {
    private String MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public ContextImageStorage_Factory cardlessAtmTutorialPresenter;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        Intent write = write(context, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, CardlessATMTutorialActivity.class);
    }

    public static Intent write(Context context, String str) {
        String name = CardlessATMActivity.IconCompatParcelizer.DEPOSITS.name();
        Intent intent = new Intent(context, CardlessATMTutorialActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("CARDLESS_DEFAULT_TAB", name);
        return intent;
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2) {
        Intent intent = new Intent(context, CardlessATMTutorialActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("CARDLESS_DEFAULT_TAB", str2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaBrowserCompat$MediaItem = read("source", "");
        boolean z = true;
        this.scbAnalytics.write("cardless_atm_landing", new ZSYR2K("source", this.MediaBrowserCompat$MediaItem));
        setContentView(R.layout.f76992131492924);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.cardlessAtmTutorialPresenter.MediaBrowserCompat$ItemReceiver(this);
        ContextImageStorage_Factory contextImageStorage_Factory = this.cardlessAtmTutorialPresenter;
        if (contextImageStorage_Factory.RatingCompat != null) {
            if (contextImageStorage_Factory.write.write.MediaBrowserCompat$ItemReceiver()) {
                stopListening stoplistening = stopListening.MediaBrowserCompat$ItemReceiver;
                if (contextImageStorage_Factory.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    stoplistening.IconCompatParcelizer(contextImageStorage_Factory.RatingCompat);
                }
            } else {
                contextImageStorage_Factory.write.write.Keep();
            }
        }
        setStackedBackground();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.cardless_atm_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.f93082131558413, menu);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_help).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(this, R.color.f71012131100257));
        menu.findItem(R.id.menu_action_help).setIcon(MediaBrowserCompat$MediaItem2);
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

    public final void read() {
        Intent intent = new Intent(this, CardlessATMActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("source", this.MediaBrowserCompat$MediaItem);
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.hasExtra("CARDLESS_DEFAULT_TAB")) {
            intent.putExtra("CARDLESS_DEFAULT_TAB", intent2.getStringExtra("CARDLESS_DEFAULT_TAB"));
        }
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
        finish();
    }

    public void onDestroy() {
        this.cardlessAtmTutorialPresenter.onDestroy();
        super.onDestroy();
    }
}
