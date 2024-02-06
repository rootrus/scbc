package com.scb.phone.view.activity.hml.businessowner;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment;
import p040o.C7505tO;
import p040o.onGetStartedClick;

public class HmlBusinessIndustrySelectionActivity extends BaseActivityWithFragment {
    public static final C5622xa441a992 MediaBrowserCompat$MediaItem = new C5622xa441a992((byte) 0);

    public final String au_() {
        return "";
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        OccupationSearchFragment MediaBrowserCompat$ItemReceiver = OccupationSearchFragment.MediaBrowserCompat$ItemReceiver(C7505tO.INDUSTRY.ordinal(), "");
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "OccupationSearchFragment…rce.INDUSTRY.ordinal, \"\")");
        return MediaBrowserCompat$ItemReceiver;
    }

    public final void setStackedBackground() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
    }
}
