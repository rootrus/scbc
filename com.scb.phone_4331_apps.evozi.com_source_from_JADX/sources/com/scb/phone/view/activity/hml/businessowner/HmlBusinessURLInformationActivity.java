package com.scb.phone.view.activity.hml.businessowner;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessURLInfoFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.isUseErrorMsgAsOnlyMessage;
import p040o.onGetStartedClick;

public class HmlBusinessURLInformationActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final read MediaDescriptionCompat = new read((byte) 0);
    @HmlPinActivity
    public isUseErrorMsgAsOnlyMessage presenter;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        isUseErrorMsgAsOnlyMessage isuseerrormsgasonlymessage = this.presenter;
        if (isuseerrormsgasonlymessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isuseerrormsgasonlymessage.MediaBrowserCompat$ItemReceiver(this);
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        HmlBusinessURLInfoFragment.read read2 = HmlBusinessURLInfoFragment.IconCompatParcelizer;
        return new HmlBusinessURLInfoFragment();
    }

    public final String au_() {
        String string = getString(R.string.hml_business_url_info_3_activity_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…rl_info_3_activity_title)");
        return string;
    }

    public void AppCompatDelegateImpl$ListMenuDecorView() {
        this.scbAnalytics.write("p10x1_business_info_3", new ZSYR2K("user_type", "etb"));
    }
}
