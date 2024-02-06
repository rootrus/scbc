package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;
import p040o.parseProcMapsJsonFromStream;

public class RegistrationCardDetailActivity extends BaseActivityWithFragment {
    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final String au_() {
        return null;
    }

    public static Intent read(Context context, boolean z, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        Intent intent = new Intent(context, RegistrationCardDetailActivity.class);
        intent.putExtra("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION", z);
        intent.putExtra("EXTRA_FLOW_TYPE", parseprocmapsjsonfromstream);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return RegistrationCardDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(getIntent().getBooleanExtra("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION", false), (parseProcMapsJsonFromStream) getIntent().getSerializableExtra("EXTRA_FLOW_TYPE"));
    }
}
