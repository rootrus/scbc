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
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponQuantityFragment;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponReviewFragment;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponReviewFragment$MediaBrowserCompat$ItemReceiver;
import p040o.Component;
import p040o.Component$$Lambda$3;
import p040o.FieldNamingPolicy;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getFirstName$MediaBrowserCompat$ItemReceiver;
import p040o.hasModifier;
import p040o.hasModifier$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.intoSet;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;

public final class ECouponCommonActivity extends BaseECouponActivity implements getFirstName$MediaBrowserCompat$ItemReceiver {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private intoSet MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    private Component.C31841 MediaSessionCompat$ResultReceiverWrapper;
    private Component$$Lambda$3 MediaSessionCompat$Token;
    @HmlPinActivity
    public hasModifier presenter;
    @BindView
    public TextView tvCardPoint;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, chain chain, intoSet intoset, Component.C31841 r5, Component$$Lambda$3 component$$Lambda$3) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) chain, "creditCardDisplay");
            onGetStartedClick.write((Object) intoset, "productDisplayModel");
            Intent intent = new Intent(context, ECouponCommonActivity.class);
            intent.putExtra("EXTRA_PAGE_TYPE_KEY", FieldNamingPolicy.C33496.E_COUPON_REVIEW_PAGE);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
            intent.putExtra("EXTRA_E_COUPON_QUOTA_LIMIT_KEY", r5);
            intent.putExtra("EXTRA_E_COUPON_QUANTITY_KEY", component$$Lambda$3);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f77482131492973);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            chain chain = (chain) extras.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaMetadataCompat = chain;
            }
            intoSet intoset = (intoSet) extras.getParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY");
            if (intoset != null) {
                onGetStartedClick.IconCompatParcelizer((Object) intoset, "product");
                this.MediaBrowserCompat$SearchResultReceiver = intoset;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = (Component.C31841) extras.getParcelable("EXTRA_E_COUPON_QUOTA_LIMIT_KEY");
            this.MediaSessionCompat$Token = (Component$$Lambda$3) extras.getParcelable("EXTRA_E_COUPON_QUANTITY_KEY");
            chain chain2 = this.MediaMetadataCompat;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            String str = chain2.setGroupDividerEnabled;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.rewardPoints");
            this.MediaDescriptionCompat = str;
        }
        hasModifier hasmodifier = this.presenter;
        if (hasmodifier == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hasmodifier.MediaBrowserCompat$ItemReceiver(this);
        hasModifier hasmodifier2 = this.presenter;
        if (hasmodifier2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        FieldNamingPolicy.C33496 MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        onGetStartedClick.write((Object) MediaSessionCompat$QueueItem, "pageType");
        writeUInt64NoTag.IconCompatParcelizer hasmodifier_mediabrowsercompat_customactionresultreceiver = new hasModifier$MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$QueueItem);
        boolean z = true;
        if (hasmodifier2.RatingCompat != null) {
            hasmodifier_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(hasmodifier2.RatingCompat);
        }
        hasModifier hasmodifier3 = this.presenter;
        if (hasmodifier3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("myRewardPoint");
        }
        if (str2 != null) {
            writeUInt64NoTag.IconCompatParcelizer write = new hasModifier.write(str2);
            if (hasmodifier3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write.IconCompatParcelizer(hasmodifier3.RatingCompat);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        m2845x50fd9e4a();
        super.setStackedBackground();
        setTitle(IconCompatParcelizer(MediaSessionCompat$QueueItem()));
        setTabContainer();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2845x50fd9e4a() {
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
        m2845x50fd9e4a();
        super.setStackedBackground();
        setTitle(IconCompatParcelizer(MediaSessionCompat$QueueItem()));
        setTabContainer();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "points");
        TextView textView = this.tvCardPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoint");
        }
        textView.setText(getString(R.string.you_have_points, new Object[]{str}));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TextView textView = this.tvCardPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoint");
        }
        textView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Component$$Lambda$3 component$$Lambda$3;
        Component.C31841 r0 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (r0 != null && (component$$Lambda$3 = this.MediaSessionCompat$Token) != null) {
            ECouponReviewFragment$MediaBrowserCompat$ItemReceiver eCouponReviewFragment$MediaBrowserCompat$ItemReceiver = ECouponReviewFragment.IconCompatParcelizer;
            chain chain = this.MediaMetadataCompat;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            onGetStartedClick.write((Object) chain, "creditCardDisplay");
            onGetStartedClick.write((Object) intoset, "productDisplay");
            onGetStartedClick.write((Object) r0, "quotaLimit");
            onGetStartedClick.write((Object) component$$Lambda$3, "quantity");
            ECouponReviewFragment eCouponReviewFragment = new ECouponReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            bundle.putParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
            bundle.putParcelable("EXTRA_E_COUPON_QUOTA_LIMIT_KEY", r0);
            bundle.putParcelable("EXTRA_E_COUPON_QUANTITY_KEY", component$$Lambda$3);
            eCouponReviewFragment.setArguments(bundle);
            Fragment fragment = eCouponReviewFragment;
            onGetStartedClick.write((Object) fragment, "fragment");
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, fragment).write();
        }
    }

    public final void read() {
        Component$$Lambda$3 component$$Lambda$3;
        Component.C31841 r0 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (r0 != null && (component$$Lambda$3 = this.MediaSessionCompat$Token) != null) {
            ECouponQuantityFragment.IconCompatParcelizer iconCompatParcelizer = ECouponQuantityFragment.IconCompatParcelizer;
            chain chain = this.MediaMetadataCompat;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            onGetStartedClick.write((Object) chain, "creditCardDisplay");
            onGetStartedClick.write((Object) intoset, "productDisplay");
            onGetStartedClick.write((Object) r0, "quotaLimit");
            onGetStartedClick.write((Object) component$$Lambda$3, "quantity");
            ECouponQuantityFragment eCouponQuantityFragment = new ECouponQuantityFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            bundle.putParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
            bundle.putParcelable("EXTRA_E_COUPON_QUOTA_LIMIT_KEY", r0);
            bundle.putParcelable("EXTRA_E_COUPON_QUANTITY_KEY", component$$Lambda$3);
            eCouponQuantityFragment.setArguments(bundle);
            Fragment fragment = eCouponQuantityFragment;
            onGetStartedClick.write((Object) fragment, "fragment");
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, fragment).write();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p040o.FieldNamingPolicy.C33496 MediaSessionCompat$QueueItem() {
        /*
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x0013
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "EXTRA_PAGE_TYPE_KEY"
            java.io.Serializable r0 = r0.getSerializable(r1)
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0019
            o.FieldNamingPolicy$6 r0 = (p040o.FieldNamingPolicy.C33496) r0
            return r0
        L_0x0019:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.scb.phone.presentation.presenter.ccrredemption.enums.ECouponPageType"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponCommonActivity.MediaSessionCompat$QueueItem():o.FieldNamingPolicy$6");
    }
}
