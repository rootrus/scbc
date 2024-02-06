package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlVerifyIdentifyFragment;
import p040o.onGetStartedClick;

public final class HmlVerifyIdentifyActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlVerifyIdentifyFragment.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyFragment.MediaBrowserCompat$CustomActionResultReceiver;
        String stringExtra = getIntent().getStringExtra("HML_IDENTIFY_EKYC_METHOD");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Hm…HML_IDENTIFY_EKYC_METHOD)");
        onGetStartedClick.write((Object) stringExtra, "ekycMethod");
        HmlVerifyIdentifyFragment hmlVerifyIdentifyFragment = new HmlVerifyIdentifyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("HML_IDENTIFY_EKYC_METHOD", stringExtra);
        hmlVerifyIdentifyFragment.setArguments(bundle);
        return hmlVerifyIdentifyFragment;
    }

    public final String au_() {
        String string = getString(R.string.hml_verify_identity_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_verify_identity_title)");
        return string;
    }
}
