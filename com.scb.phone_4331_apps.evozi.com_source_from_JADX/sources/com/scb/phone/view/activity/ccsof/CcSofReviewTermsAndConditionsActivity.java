package com.scb.phone.view.activity.ccsof;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ccsof.CcSofTermsAndConditionsFragment;
import p040o.onGetStartedClick;

public final class CcSofReviewTermsAndConditionsActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.tc_action_bar_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.tc_action_bar_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        CcSofTermsAndConditionsFragment.IconCompatParcelizer iconCompatParcelizer = CcSofTermsAndConditionsFragment.IconCompatParcelizer;
        Intent intent = getIntent();
        int i = -1;
        if (intent != null) {
            i = intent.getIntExtra("EXTRA_CARD_TYPE", -1);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_CARD_TYPE", i);
        CcSofTermsAndConditionsFragment ccSofTermsAndConditionsFragment = new CcSofTermsAndConditionsFragment();
        ccSofTermsAndConditionsFragment.setArguments(bundle);
        return ccSofTermsAndConditionsFragment;
    }
}
