package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNTBVerifyEmailFragment;
import p040o.ZSYR2K;

public class HmlNTBVerifyEmailActivity extends BaseActivityWithFragment {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, HmlNTBVerifyEmailActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return HmlNTBVerifyEmailFragment.IconCompatParcelizer();
    }

    public final String au_() {
        return getString(R.string.hml_verify_email_title);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_email_verify_notify", new ZSYR2K("user_type", "ntb"));
    }
}
