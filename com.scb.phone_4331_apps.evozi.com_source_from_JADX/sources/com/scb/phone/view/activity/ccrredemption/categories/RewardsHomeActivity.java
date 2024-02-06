package com.scb.phone.view.activity.ccrredemption.categories;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.AlertController$RecycleListView;
import p040o.FieldNamingPolicy;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTPMV;
import p040o.chain;
import p040o.getFaceImage;
import p040o.intoSetBuilder;
import p040o.setTapText;

public class RewardsHomeActivity extends CCRBaseActivity implements getFaceImage {
    private static boolean MediaMetadataCompat;
    private chain MediaBrowserCompat$MediaItem;
    private ZTPMV MediaBrowserCompat$SearchResultReceiver;
    private FieldNamingPolicy.C33474 MediaDescriptionCompat;
    private Unbinder MediaSessionCompat$Token;
    @BindView
    TextView txvCardPoints;

    public static Intent IconCompatParcelizer(Context context, chain chain) {
        Intent intent = new Intent(context, RewardsHomeActivity.class);
        intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY", chain);
        return intent;
    }

    public static boolean MediaSessionCompat$Token() {
        return MediaMetadataCompat;
    }

    public void onCreate(Bundle bundle) {
        synchronized (RewardsHomeActivity.class) {
            MediaMetadataCompat = true;
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79732131493198);
        this.MediaBrowserCompat$SearchResultReceiver = new ZTPMV();
        this.MediaSessionCompat$Token = ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = new Object(this) {
            public getFaceImage write;

            {
                this.write = r1;
            }

            public final void IconCompatParcelizer(Intent intent) {
                if (intent != null && intent.hasExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE")) {
                    this.write.write(NumberFormat.getInstance(Locale.getDefault()).format((long) intent.getIntExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE", 0)));
                }
            }
        };
        super.setStackedBackground();
        setTitle(R.string.redeem_points);
        setTabContainer();
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.ParcelableVolumeInfo();
        }
        chain chain = (chain) getIntent().getParcelableExtra("EXTRA_CREDIT_CARD_DISPLAY");
        this.MediaBrowserCompat$MediaItem = chain;
        if (chain != null) {
            String str = chain.setGroupDividerEnabled;
            this.txvCardPoints.setText(getString(R.string.you_have_points, new Object[]{str}));
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.redeem_points);
        setTabContainer();
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.ParcelableVolumeInfo();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93102131558415, menu);
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.MediaDescriptionCompat.IconCompatParcelizer(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_reward_search) {
            chain chain = this.MediaBrowserCompat$MediaItem;
            if ((chain == null || chain.setShortcut == null) ? false : true) {
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$SearchResultReceiver.read("category_landing");
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "reward_search");
                intoSetBuilder IconCompatParcelizer = intoSetBuilder.IconCompatParcelizer();
                IconCompatParcelizer.MediaSessionCompat$Token = this.MediaBrowserCompat$MediaItem.setGroupDividerEnabled;
                IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat;
                IconCompatParcelizer.read = this.MediaBrowserCompat$MediaItem.AppCompatViewInflater;
                IconCompatParcelizer.MediaMetadataCompat = this.MediaBrowserCompat$MediaItem.MediaSessionCompat$Token;
                IconCompatParcelizer.IconCompatParcelizer = this.MediaBrowserCompat$MediaItem.setShortcut;
                IconCompatParcelizer.RatingCompat = true;
                IconCompatParcelizer.MediaDescriptionCompat = this.MediaBrowserCompat$MediaItem.setItemInvoker;
                Intent read = RewardSearchActivity.read(this, IconCompatParcelizer, this.MediaBrowserCompat$MediaItem, (Integer) null, "category_landing");
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, read).read();
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read2.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(read2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onDestroy() {
        super.onDestroy();
        synchronized (RewardsHomeActivity.class) {
            MediaMetadataCompat = false;
        }
        this.MediaSessionCompat$Token.read();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FieldNamingPolicy.C33474 r3 = this.MediaDescriptionCompat;
        if (i == 101 && intent != null) {
            if (intent.getBooleanExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.NAVIGATE_TO_ACCOUNT_SUMMARY", false)) {
                r3.write.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                r3.IconCompatParcelizer(intent);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setResult(-1);
        finish();
    }

    public final void write(String str) {
        chain chain = this.MediaBrowserCompat$MediaItem;
        chain.setGroupDividerEnabled = str;
        this.MediaBrowserCompat$MediaItem = chain;
        getIntent().putExtra("EXTRA_CREDIT_CARD_DISPLAY", this.MediaBrowserCompat$MediaItem);
        this.txvCardPoints.setText(getString(R.string.you_have_points, new Object[]{str}));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        chain chain = this.MediaBrowserCompat$MediaItem;
        if (chain != null) {
            bundle.putParcelable("EXTRA_CREDIT_CARD_DISPLAY", chain);
        }
    }
}
