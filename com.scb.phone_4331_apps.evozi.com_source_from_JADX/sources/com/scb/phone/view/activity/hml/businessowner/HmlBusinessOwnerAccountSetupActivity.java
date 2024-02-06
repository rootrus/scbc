package com.scb.phone.view.activity.hml.businessowner;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerAccountSetupFragment;
import p040o.onGetStartedClick;

public final class HmlBusinessOwnerAccountSetupActivity extends BaseActivityWithFragment {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_account_setup_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_account_setup_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlBusinessOwnerAccountSetupFragment.read read2 = HmlBusinessOwnerAccountSetupFragment.IconCompatParcelizer;
        return new HmlBusinessOwnerAccountSetupFragment();
    }
}
