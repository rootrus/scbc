package com.scb.phone.view.activity.demo.ntb;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment;
import p040o.onGetStartedClick;

public final class PreregisteredMobileActivity extends BaseActivityWithFragment {
    public static final PreregisteredMobileActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new PreregisteredMobileActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final String au_() {
        String string = getString(R.string.preregistered_mobile_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.preregistered_mobile_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        PreregisteredMobileFragment.write write = PreregisteredMobileFragment.IconCompatParcelizer;
        return new PreregisteredMobileFragment();
    }
}
