package com.scb.phone.view.activity.hml.promptpay;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.promptpay.HmlPromptPayAboutFragment;
import p040o.onGetStartedClick;

public class HmlPromptPayAboutActivity extends BaseActivityWithFragment {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_prompt_pay_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_prompt_pay_title)");
        return string;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("p10x1_ntb_promptpay_about");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlPromptPayAboutFragment.write write = HmlPromptPayAboutFragment.IconCompatParcelizer;
        return new HmlPromptPayAboutFragment();
    }
}
