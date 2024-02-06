package com.scb.phone.view.activity.hml;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.onGetStartedClick;

public final class HmlNTBBusinessOccupationInfoActivity extends HmlBusinessOccupationInfoActivity {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public final void setContentView() {
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_business_occupation_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_business_occupation_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        ProgressStateBar progressStateBar = this.progressStateBar;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("progressStateBar");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64692130903048);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…mbs_business_profile_ntb)");
        progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar2 = this.progressStateBar;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("progressStateBar");
        }
        progressStateBar2.setCurrentState(2);
        ProgressStateBar progressStateBar3 = this.progressStateBar;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("progressStateBar");
        }
        progressStateBar3.setVisibility(0);
        HmlBusinessOccupationInfoFragment.write write = HmlBusinessOccupationInfoFragment.IconCompatParcelizer;
        return new HmlBusinessOccupationInfoFragment();
    }
}
