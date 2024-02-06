package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlVerifyEmailSuccessfulFragment;

public class HmlVerifyEmailSuccessfulActivity extends BaseActivityWithFragment {
    public static Intent write(Context context, String str) {
        Intent intent = new Intent(context, HmlVerifyEmailSuccessfulActivity.class);
        intent.putExtra("EMAIL", str);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        return HmlVerifyEmailSuccessfulFragment.IconCompatParcelizer(getIntent().getStringExtra("EMAIL"));
    }

    public final String au_() {
        return getString(R.string.hml_verify_email_success_title);
    }
}
