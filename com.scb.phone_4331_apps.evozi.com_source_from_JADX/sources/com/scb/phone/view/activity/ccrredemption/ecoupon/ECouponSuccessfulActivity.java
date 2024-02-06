package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponSaveSlipFragment;
import p040o.CardView;
import p040o.intoSet;
import p040o.onGetStartedClick;

public final class ECouponSuccessfulActivity extends ReviewSuccessfulActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("EXTRA_CARD_REF_NO_KEY");
            String stringExtra2 = intent.getStringExtra("EXTRA_REF_ID_KEY");
            String stringExtra3 = intent.getStringExtra("EXTRA_SLIP_REF_ID_KEY");
            Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_PRODUCT_DISPLAY_MODEL_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "this.getParcelableExtra(…RODUCT_DISPLAY_MODEL_KEY)");
            intoSet intoset = (intoSet) parcelableExtra;
            String str = intoset.MediaSessionCompat$Token;
            Integer num = intoset.Keep;
            boolean z = intoset.MediaBrowserCompat$ItemReceiver != null;
            CardView read = getSupportFragmentManager().read();
            ECouponSaveSlipFragment.IconCompatParcelizer iconCompatParcelizer = ECouponSaveSlipFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "cardRefNo");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "refId");
            onGetStartedClick.IconCompatParcelizer((Object) str, "itemCode");
            onGetStartedClick.IconCompatParcelizer((Object) num, "relationId");
            int intValue = num.intValue();
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "slipRefId");
            onGetStartedClick.write((Object) stringExtra, "cardRefNo");
            onGetStartedClick.write((Object) stringExtra2, "refId");
            onGetStartedClick.write((Object) str, "itemCode");
            onGetStartedClick.write((Object) stringExtra3, "slipRefId");
            ECouponSaveSlipFragment eCouponSaveSlipFragment = new ECouponSaveSlipFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_CARD_REF_NO_KEY", stringExtra);
            bundle.putString("EXTRA_REF_ID_KEY", stringExtra2);
            bundle.putString("EXTRA_ITEM_CODE_KEY", str);
            bundle.putString("EXTRA_SLIP_REF_ID_KEY", stringExtra3);
            bundle.putBoolean("EXTRA_IS_COUPON_SENSITIVE_TIME_KEY", z);
            bundle.putInt("EXTRA_RELATION_ID_KEY", intValue);
            eCouponSaveSlipFragment.setArguments(bundle);
            read.MediaBrowserCompat$ItemReceiver(R.id.frame_container, eCouponSaveSlipFragment).write();
        }
    }
}
