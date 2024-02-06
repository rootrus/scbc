package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.onGetStartedClick;

public abstract class HmlSummaryActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract Fragment mo13702x50fd9e4a();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
    }

    public final String au_() {
        String string = getString(R.string.hml_summary_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_summary_title)");
        return string;
    }
}
