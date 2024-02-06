package com.scb.phone.view.activity.remittance;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment;
import p040o.C3092xce3d994b;
import p040o.onGetStartedClick;

public final class RemittanceSenderAddressReviewActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("STATE", -1);
        C3092xce3d994b.Builder builder = intExtra >= 0 ? C3092xce3d994b.Builder.values()[intExtra] : null;
        if (builder == null) {
            builder = C3092xce3d994b.Builder.NORMAL;
        }
        RemittanceSenderAddressReviewFragment.write write = RemittanceSenderAddressReviewFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) builder, "state");
        RemittanceSenderAddressReviewFragment remittanceSenderAddressReviewFragment = new RemittanceSenderAddressReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("STATE", builder.ordinal());
        bundle.putParcelable("display", (C3092xce3d994b) getIntent().getParcelableExtra("display"));
        remittanceSenderAddressReviewFragment.setArguments(bundle);
        return remittanceSenderAddressReviewFragment;
    }

    public final String au_() {
        String string = getString(R.string.remittance_sender_address_review_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…der_address_review_title)");
        return string;
    }
}
