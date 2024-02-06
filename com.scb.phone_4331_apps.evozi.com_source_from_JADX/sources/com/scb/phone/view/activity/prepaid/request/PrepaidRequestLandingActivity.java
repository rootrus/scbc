package com.scb.phone.view.activity.prepaid.request;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestInputFragment;
import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestInputFragment$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class PrepaidRequestLandingActivity extends BaseActivityWithFragment {
    public static final C5698xe7b26873 MediaBrowserCompat$MediaItem = new C5698xe7b26873((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        PrepaidRequestInputFragment$MediaBrowserCompat$ItemReceiver prepaidRequestInputFragment$MediaBrowserCompat$ItemReceiver = PrepaidRequestInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new PrepaidRequestInputFragment();
    }

    public final String au_() {
        String string = getString(R.string.prepaid_request_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepaid_request_title)");
        return string;
    }
}
