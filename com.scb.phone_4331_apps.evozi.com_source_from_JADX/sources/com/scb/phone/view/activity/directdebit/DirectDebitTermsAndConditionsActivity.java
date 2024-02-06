package com.scb.phone.view.activity.directdebit;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.directdebit.DirectDebitTermsAndConditionsFragment;
import p040o.onGetStartedClick;

public final class DirectDebitTermsAndConditionsActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

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
        DirectDebitTermsAndConditionsFragment.read read = DirectDebitTermsAndConditionsFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new DirectDebitTermsAndConditionsFragment();
    }
}
