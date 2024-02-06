package com.scb.phone.view.activity.easycash;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.easycash.SummaryFragment;
import p040o.AnalyticsReceiver;
import p040o.ZTBSV;
import p040o.forEachClear;

public class SummaryActivity extends BaseActivityWithFragment {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return SummaryFragment.IconCompatParcelizer((AnalyticsReceiver) getIntent().getParcelableExtra("com.scb.phone.EXTRA_DISPLAY"), (forEachClear) ((getIntent() == null || getIntent().getParcelableExtra("FIREBASE_TRACKER_DATA") == null) ? null : (ZTBSV) getIntent().getParcelableExtra("FIREBASE_TRACKER_DATA")));
    }

    public final String au_() {
        return ((AnalyticsReceiver) getIntent().getParcelableExtra("com.scb.phone.EXTRA_DISPLAY")).MediaBrowserCompat$MediaItem;
    }
}
