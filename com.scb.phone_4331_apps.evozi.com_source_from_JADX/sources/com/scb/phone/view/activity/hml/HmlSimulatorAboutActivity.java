package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlAboutFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.getCreateReportSpiCall;

public class HmlSimulatorAboutActivity extends BaseActivityWithFragment {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, List<getCreateReportSpiCall> list) {
        return new Intent(context, HmlSimulatorAboutActivity.class).putParcelableArrayListExtra("SIMULATOR_ABOUT_DISPLAY", new ArrayList(list)).putExtra("TITLE", str);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return HmlAboutFragment.write(getIntent().getParcelableArrayListExtra("SIMULATOR_ABOUT_DISPLAY"));
    }

    public final String au_() {
        return getIntent().getStringExtra("TITLE");
    }
}
