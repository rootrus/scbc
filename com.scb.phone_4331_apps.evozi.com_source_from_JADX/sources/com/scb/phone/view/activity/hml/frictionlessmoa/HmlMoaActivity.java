package com.scb.phone.view.activity.hml.frictionlessmoa;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.frictionlessmoa.HmlMoaFragment;
import com.scb.phone.view.fragment.hml.frictionlessmoa.HmlMoaFragment$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class HmlMoaActivity extends BaseActivityWithFragment {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_moa_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_moa_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlMoaFragment$MediaBrowserCompat$ItemReceiver hmlMoaFragment$MediaBrowserCompat$ItemReceiver = HmlMoaFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlMoaFragment();
    }
}
