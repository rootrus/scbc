package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;

public class HmlBusinessOccupationInfoActivity extends BaseActivityWithFragment {
    public static final C5602xb52cebc MediaBrowserCompat$SearchResultReceiver = new C5602xb52cebc((byte) 0);
    @BindView
    public ProgressStateBar progressStateBar;

    public final int MediaSessionCompat$Token() {
        return R.layout.f76832131492908;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        ProgressStateBar progressStateBar2 = this.progressStateBar;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("progressStateBar");
        }
        progressStateBar2.setVisibility(8);
        HmlBusinessOccupationInfoFragment.write write = HmlBusinessOccupationInfoFragment.IconCompatParcelizer;
        return new HmlBusinessOccupationInfoFragment();
    }

    public String au_() {
        String string = getString(R.string.hml_business_occupation_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_business_occupation_title)");
        return string;
    }

    public void setContentView() {
        this.scbAnalytics.write("p10x1_business_info_1", new ZSYR2K("user_type", "etb"));
    }
}
