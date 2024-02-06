package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.C5880x13fedaf9;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponDetailFragment;
import p040o.FieldNamingPolicy;
import p040o.chain;
import p040o.intoSet;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class ECouponDetailActivity extends BaseECouponActivity {
    private String MediaBrowserCompat$SearchResultReceiver;
    private chain MediaDescriptionCompat;
    private intoSet MediaMetadataCompat;
    @BindView
    public TextView tvCardPoint;

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f77482131492973);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            intoSet intoset = (intoSet) extras.getParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY");
            if (intoset != null) {
                onGetStartedClick.IconCompatParcelizer((Object) intoset, "product");
                this.MediaMetadataCompat = intoset;
            }
            chain chain = (chain) extras.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaDescriptionCompat = chain;
            }
            chain chain2 = this.MediaDescriptionCompat;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            String str = chain2.setGroupDividerEnabled;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.rewardPoints");
            this.MediaBrowserCompat$SearchResultReceiver = str;
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("myRewardPoint");
        }
        TextView textView = this.tvCardPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoint");
        }
        textView.setText(getString(R.string.you_have_points, new Object[]{str2}));
        C5880x13fedaf9 eCouponDetailFragment$MediaBrowserCompat$CustomActionResultReceiver = ECouponDetailFragment.IconCompatParcelizer;
        chain chain3 = this.MediaDescriptionCompat;
        if (chain3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        intoSet intoset2 = this.MediaMetadataCompat;
        if (intoset2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        onGetStartedClick.write((Object) chain3, "creditCardDisplay");
        onGetStartedClick.write((Object) intoset2, "productDisplayModel");
        ECouponDetailFragment eCouponDetailFragment = new ECouponDetailFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset2);
        bundle2.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain3);
        eCouponDetailFragment.setArguments(bundle2);
        Fragment fragment = eCouponDetailFragment;
        onGetStartedClick.write((Object) fragment, "fragment");
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, fragment).write();
    }

    public final void onStart() {
        super.onStart();
        MediaSessionCompat$QueueItem();
        super.setStackedBackground();
        setTitle(IconCompatParcelizer(FieldNamingPolicy.C33496.E_COUPON_DETAIL_PAGE));
        setTabContainer();
    }

    private final void MediaSessionCompat$QueueItem() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.f71012131100257);
        }
        TextView textView = this.tvCardPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoint");
        }
        Context context = this;
        textView.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        TextView textView2 = this.mActionBarTitle;
        if (textView2 != null) {
            textView2.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f65622131099715));
        }
    }

    public final void setStackedBackground() {
        MediaSessionCompat$QueueItem();
        super.setStackedBackground();
        setTitle(IconCompatParcelizer(FieldNamingPolicy.C33496.E_COUPON_DETAIL_PAGE));
        setTabContainer();
    }

    public static final Intent read(Context context, chain chain, intoSet intoset) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        onGetStartedClick.write((Object) intoset, "productDisplay");
        Intent intent = new Intent(context, ECouponDetailActivity.class);
        intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
        intent.putExtra("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
        return intent;
    }
}
