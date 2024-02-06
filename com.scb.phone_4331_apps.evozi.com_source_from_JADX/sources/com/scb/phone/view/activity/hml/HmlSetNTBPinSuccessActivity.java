package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlSetNTBPinSuccessFragment;
import p040o.onGetStartedClick;

public final class HmlSetNTBPinSuccessActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77952131493020);
        mo13676d_("ntb_pin_setup_successful");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlSetNTBPinSuccessFragment.write write2 = HmlSetNTBPinSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlSetNTBPinSuccessFragment();
    }

    public final String au_() {
        String string = getString(R.string.ntb_pin_setup_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ntb_pin_setup_title)");
        return string;
    }
}
