package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.C5992x12914c22;
import com.scb.phone.view.fragment.hml.HmlNTBAccountSetupFragment;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;

public final class HmlNTBAccountSetupActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_account_setup_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_account_setup_title)");
        return string;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_account_setup", new ZSYR2K("user_type", "ntb"));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        C5992x12914c22 hmlNTBAccountSetupFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBAccountSetupFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlNTBAccountSetupFragment();
    }
}
