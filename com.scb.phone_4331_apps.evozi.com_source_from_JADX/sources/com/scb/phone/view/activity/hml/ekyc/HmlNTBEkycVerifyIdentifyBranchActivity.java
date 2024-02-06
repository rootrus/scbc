package com.scb.phone.view.activity.hml.ekyc;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.ekyc.HmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.onGetStartedClick;

public final class HmlNTBEkycVerifyIdentifyBranchActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
    }

    public final String au_() {
        String string = getString(R.string.hml_ntb_ekyc_verify_identify_branch_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_n…fy_identify_branch_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlNTBEkycVerifyIdentifyBranchFragment.write write = HmlNTBEkycVerifyIdentifyBranchFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlNTBEkycVerifyIdentifyBranchFragment();
    }
}
