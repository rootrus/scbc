package com.scb.phone.view.activity.ntb.fillinformation;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment;
import p040o.C7505tO;

public class OccupationSearchActivity extends BaseActivityWithFragment {
    public final String au_() {
        return getIntent().getExtras().getString("SEARCH_TITLE");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        int i = getIntent().getExtras().getInt("OCCUPATION_LIST_SOURCE", 0);
        C7505tO tOVar = C7505tO.values()[i];
        if (!tOVar.equals(C7505tO.BUSINESS) && !tOVar.equals(C7505tO.ONBOARDING)) {
            findViewById(R.id.toolbar).setVisibility(8);
        }
        String str = "";
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            str = getIntent().getExtras().getString("OCCUPATION_CODE", str);
        }
        return OccupationSearchFragment.MediaBrowserCompat$ItemReceiver(i, str);
    }
}
