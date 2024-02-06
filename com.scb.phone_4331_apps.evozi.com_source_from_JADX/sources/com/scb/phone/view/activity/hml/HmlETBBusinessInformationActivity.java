package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlETBBusinessInformationFragment;
import p040o.ZSYR2K;

public final class HmlETBBusinessInformationActivity extends HmlBusinessInformationActivity {
    public static final C5606xa099befc MediaBrowserCompat$SearchResultReceiver = new C5606xa099befc((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlETBBusinessInformationFragment.write write = HmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlETBBusinessInformationFragment();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_business_info_2", new ZSYR2K("user_type", "etb"));
    }
}
