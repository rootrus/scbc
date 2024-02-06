package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlRepaymentMethodFragment;

public class HmlRepaymentMethodAboutActivity extends BaseActivityWithFragment {
    public static Intent read(Context context) {
        return new Intent(context, HmlRepaymentMethodAboutActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return HmlRepaymentMethodFragment.MediaBrowserCompat$ItemReceiver();
    }

    public final String au_() {
        return getString(R.string.hml_repayment_about_title);
    }
}
