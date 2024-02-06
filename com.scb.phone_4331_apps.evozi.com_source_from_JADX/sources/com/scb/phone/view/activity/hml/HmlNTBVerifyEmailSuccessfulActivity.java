package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlNTBVerifyEmailSuccessfulFragment;

public class HmlNTBVerifyEmailSuccessfulActivity extends HmlVerifyEmailSuccessfulActivity {
    public static Intent IconCompatParcelizer(Context context, String str) {
        Intent intent = new Intent(context, HmlNTBVerifyEmailSuccessfulActivity.class);
        intent.putExtra("EMAIL", str);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return HmlNTBVerifyEmailSuccessfulFragment.read(getIntent().getStringExtra("EMAIL"));
    }
}
