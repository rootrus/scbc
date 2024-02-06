package com.scb.phone.view.activity.hml.promptpay;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.promptpay.HmlPromptpayEnterCodeFragment;
import p040o.onGetStartedClick;

public final class HmlPromptpayEnterCodeActivity extends BaseActivityWithFragment {
    public static final HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final String au_() {
        String string = getString(R.string.hml_promptpay_verification_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_p…ptpay_verification_title)");
        return string;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("p10x1_ntb_promptpay_entercode");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlPromptpayEnterCodeFragment.IconCompatParcelizer iconCompatParcelizer = HmlPromptpayEnterCodeFragment.IconCompatParcelizer;
        return new HmlPromptpayEnterCodeFragment();
    }
}
