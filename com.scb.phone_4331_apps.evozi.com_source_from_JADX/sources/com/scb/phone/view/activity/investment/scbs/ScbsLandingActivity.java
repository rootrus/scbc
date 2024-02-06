package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.scbs.ScbsLandingFragment;

public class ScbsLandingActivity extends BaseActivityWithFragment {
    public final int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    public static Intent read(Context context) {
        return new Intent(context, ScbsLandingActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return ScbsLandingFragment.IconCompatParcelizer();
    }

    public final String au_() {
        return getString(R.string.landing_scbs_activity_title);
    }
}
