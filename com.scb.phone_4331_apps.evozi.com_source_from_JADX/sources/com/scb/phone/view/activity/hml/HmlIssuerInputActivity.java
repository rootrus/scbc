package com.scb.phone.view.activity.hml;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.C5990x29b355a7;
import com.scb.phone.view.fragment.hml.HmlIssuerInputFragment;
import p040o.onGetStartedClick;

public final class HmlIssuerInputActivity extends BaseActivityWithFragment {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        C5990x29b355a7 hmlIssuerInputFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlIssuerInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlIssuerInputFragment();
    }

    public final String au_() {
        String string = getString(R.string.auto_issuer_input_page_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_issuer_input_page_title)");
        return string;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
