package com.scb.phone.view.activity.ndid;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ndid.NdidIdpVerificationFragment;

public class NdidIdpVerificationActivity extends BaseActivityWithFragment {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return NdidIdpVerificationFragment.MediaBrowserCompat$ItemReceiver(getIntent().getStringExtra("com.scb.phone.EXTRA_REQUEST_MESSAGE"), getIntent().getStringExtra("com.scb.phone.EXTRA_REQUEST_ID"), getIntent().getStringExtra("com.scb.phone.EXTRA_REQUEST_TIMEOUT"));
    }

    public final String au_() {
        return getString(R.string.ndid_idp_verify_identity_title);
    }
}
