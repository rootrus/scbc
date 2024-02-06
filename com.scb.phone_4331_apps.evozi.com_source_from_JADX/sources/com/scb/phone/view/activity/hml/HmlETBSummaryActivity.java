package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlETBSummaryFragment;

public final class HmlETBSummaryActivity extends HmlSummaryActivity {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlETBSummaryFragment.write write = HmlETBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver;
        boolean booleanExtra = getIntent().getBooleanExtra("com.scb.phone.EXTRA_LOAN_PERSONALIZATION_SECTION", false);
        HmlETBSummaryFragment hmlETBSummaryFragment = new HmlETBSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.EXTRA_LOAN_PERSONALIZATION_SECTION", booleanExtra);
        hmlETBSummaryFragment.setArguments(bundle);
        return hmlETBSummaryFragment;
    }
}
