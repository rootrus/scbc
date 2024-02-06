package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.C5879x1e10e92;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponBarCodeFragment;
import p040o.AlertController$RecycleListView;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class ECouponRedemptionDetailActivity extends BaseECouponActivity {
    public static final C5573x211f1f83 MediaBrowserCompat$SearchResultReceiver = new C5573x211f1f83((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    @BindView
    public TextView txtCardPoint;

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f77482131492973);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.MediaMetadataCompat = AlertController$RecycleListView.write(extras, "EXTRA_CARD_REF_NO_KEY");
            this.MediaSessionCompat$Token = AlertController$RecycleListView.write(extras, "EXTRA_REF_ID_KEY");
            this.MediaBrowserCompat$MediaItem = AlertController$RecycleListView.write(extras, "EXTRA_ITEM_CODE_KEY");
            this.MediaSessionCompat$ResultReceiverWrapper = extras.getInt("EXTRA_RELATION_ID_KEY");
            this.MediaDescriptionCompat = extras.getBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW");
        }
        MediaSessionCompat$Token();
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.my_e_coupons);
        C5879x1e10e92 eCouponBarCodeFragment$MediaBrowserCompat$CustomActionResultReceiver = ECouponBarCodeFragment.IconCompatParcelizer;
        String str = this.MediaMetadataCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
        }
        String str2 = this.MediaSessionCompat$Token;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("refId");
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemCode");
        }
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z = this.MediaDescriptionCompat;
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, "itemCode");
        ECouponBarCodeFragment eCouponBarCodeFragment = new ECouponBarCodeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("EXTRA_CARD_REF_NO_KEY", str);
        bundle2.putString("EXTRA_REF_ID_KEY", str2);
        bundle2.putString("EXTRA_ITEM_CODE_KEY", str3);
        bundle2.putInt("EXTRA_RELATION_ID_KEY", i);
        bundle2.putBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW", z);
        eCouponBarCodeFragment.setArguments(bundle2);
        Fragment fragment = eCouponBarCodeFragment;
        onGetStartedClick.write((Object) fragment, "fragment");
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, fragment).write();
    }

    public final void setStackedBackground() {
        MediaSessionCompat$Token();
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.my_e_coupons);
    }

    private final void MediaSessionCompat$Token() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.f71012131100257);
        }
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        }
        TextView textView2 = this.txtCardPoint;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txtCardPoint");
        }
        textView2.setVisibility(8);
    }
}
