package com.scb.phone.view.activity.remittance;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceSuccessFragment;
import p040o.Keep;
import p040o.onGetStartedClick;
import p040o.setImportance;

public final class RemittanceSuccessActivity extends BaseActivityWithFragment {
    public static final RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final String au_() {
        return "";
    }

    public final void onBackPressed() {
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        RemittanceSuccessFragment.read read = RemittanceSuccessFragment.IconCompatParcelizer;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_REMITTANCE_SUCCESS_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…MITTANCE_SUCCESS_DISPLAY)");
        setImportance setimportance = (setImportance) parcelableExtra;
        onGetStartedClick.write((Object) setimportance, "successDisply");
        RemittanceSuccessFragment remittanceSuccessFragment = new RemittanceSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_REMITTANCE_SUCCESS_DISPLAY", setimportance);
        remittanceSuccessFragment.setArguments(bundle);
        return remittanceSuccessFragment;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.RatingCompat();
        }
    }
}
