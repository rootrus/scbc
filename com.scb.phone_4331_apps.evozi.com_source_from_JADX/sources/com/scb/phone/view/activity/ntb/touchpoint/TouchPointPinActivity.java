package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ntb.touchpoint.TouchPointPinFragment;
import p040o.C10839getFilename;
import p040o.ZSYR2K;
import p040o.getKernelIDMultiply;
import p040o.onGetStartedClick;

public final class TouchPointPinActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        C10839getFilename getfilename;
        super.onCreate(bundle);
        new getKernelIDMultiply();
        Intent intent = getIntent();
        if (intent != null && (getfilename = (C10839getFilename) intent.getParcelableExtra("EXTRA_INFO_DISPLAY")) != null) {
            this.scbAnalytics.write("touchpoint_ekyc_pin", new ZSYR2K("source", getfilename.MediaBrowserCompat$ItemReceiver));
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        C10839getFilename getfilename;
        Intent intent = getIntent();
        if (intent == null || (getfilename = (C10839getFilename) intent.getParcelableExtra("EXTRA_INFO_DISPLAY")) == null) {
            return new Fragment();
        }
        TouchPointPinFragment.read read = TouchPointPinFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) getfilename, "display");
        TouchPointPinFragment touchPointPinFragment = new TouchPointPinFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_INFO_DISPLAY", getfilename);
        touchPointPinFragment.setArguments(bundle);
        return touchPointPinFragment;
    }

    public final String au_() {
        String string = getString(R.string.auto_touchpoints_enter_temporary_pin);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_…ints_enter_temporary_pin)");
        return string;
    }
}
