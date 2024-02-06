package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlBusinessInformationFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.onGetStartedClick;

public class HmlBusinessInformationActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final HmlBusinessInformationActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new HmlBusinessInformationActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        HmlBusinessInformationFragment.IconCompatParcelizer iconCompatParcelizer = HmlBusinessInformationFragment.IconCompatParcelizer;
        return new HmlBusinessInformationFragment();
    }

    public final String au_() {
        String string = getString(R.string.hml_business_info_2_activity_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…ss_info_2_activity_title)");
        return string;
    }
}
