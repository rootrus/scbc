package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.NonSwipeableViewPager;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C7196kS;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTitleMarginStart;
import p040o.verifyResetPinOtp;

public final class MyECouponActivity extends BaseECouponActivity {
    public static final MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver = new MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public C7196kS MediaBrowserCompat$MediaItem;
    private verifyResetPinOtp MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean MediaSessionCompat$Token;
    @BindView
    public CustomTabLayout tabLayout;
    @BindView
    public NonSwipeableViewPager vpECouponViewPager;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        return MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(context, str, false);
    }

    public final void setStackedBackground() {
        m2846x50fd9e4a();
        super.setStackedBackground();
        setTitle(R.string.my_e_coupons);
        setTabContainer();
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f78962131493121);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.MediaMetadataCompat = AlertController$RecycleListView.write(extras, "EXTRA_MY_E_COUPON_CARD_REF_KEY");
            this.MediaSessionCompat$Token = extras.getBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW");
        }
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        Context context = this;
        List<Integer> MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        String str = this.MediaMetadataCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
        }
        this.MediaDescriptionCompat = new verifyResetPinOtp(supportFragmentManager, context, MediaSessionCompat$ResultReceiverWrapper, str, this.MediaSessionCompat$Token);
        NonSwipeableViewPager nonSwipeableViewPager = this.vpECouponViewPager;
        if (nonSwipeableViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpECouponViewPager");
        }
        nonSwipeableViewPager.setAdapter(this.MediaDescriptionCompat);
        NonSwipeableViewPager nonSwipeableViewPager2 = this.vpECouponViewPager;
        if (nonSwipeableViewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpECouponViewPager");
        }
        nonSwipeableViewPager2.setOffscreenPageLimit(MediaSessionCompat$ResultReceiverWrapper().size());
        NonSwipeableViewPager nonSwipeableViewPager3 = this.vpECouponViewPager;
        if (nonSwipeableViewPager3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpECouponViewPager");
        }
        nonSwipeableViewPager3.setDisableSwiping(true);
        NonSwipeableViewPager nonSwipeableViewPager4 = this.vpECouponViewPager;
        if (nonSwipeableViewPager4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpECouponViewPager");
        }
        nonSwipeableViewPager4.addOnPageChangeListener(new IconCompatParcelizer(this));
        CustomTabLayout customTabLayout = this.tabLayout;
        if (customTabLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tabLayout");
        }
        NonSwipeableViewPager nonSwipeableViewPager5 = this.vpECouponViewPager;
        if (nonSwipeableViewPager5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpECouponViewPager");
        }
        customTabLayout.setupWithViewPager(nonSwipeableViewPager5);
        m2846x50fd9e4a();
        super.setStackedBackground();
        setTitle(R.string.my_e_coupons);
        setTabContainer();
    }

    public static final class IconCompatParcelizer implements ViewPager.MediaMetadataCompat {
        private /* synthetic */ MyECouponActivity MediaBrowserCompat$ItemReceiver;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageSelected(int i) {
        }

        IconCompatParcelizer(MyECouponActivity myECouponActivity) {
            this.MediaBrowserCompat$ItemReceiver = myECouponActivity;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            C7196kS MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaBrowserCompat$CustomActionResultReceiver.write(i, i2);
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2846x50fd9e4a() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.f71012131100257);
        }
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        }
    }
}
