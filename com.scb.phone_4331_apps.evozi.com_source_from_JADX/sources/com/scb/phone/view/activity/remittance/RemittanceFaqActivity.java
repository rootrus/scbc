package com.scb.phone.view.activity.remittance;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.C6151x7239bb75;
import com.scb.phone.view.fragment.remittance.RemittanceFaqFragment;
import p040o.onGetStartedClick;

public final class RemittanceFaqActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        C6151x7239bb75 remittanceFaqFragment$MediaBrowserCompat$CustomActionResultReceiver = RemittanceFaqFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new RemittanceFaqFragment();
    }

    public final String au_() {
        String string = getString(R.string.remittance_landing_page_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(com.scb.phone.…tance_landing_page_title)");
        return string;
    }
}
