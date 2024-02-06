package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.RegistrationSuccessFragment;
import p040o.getFileSHA;
import p040o.onGetStartedClick;

public final class RegistrationSuccessActivity extends BaseActivityWithFragment {
    public static final write MediaDescriptionCompat = new write((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final void onBackPressed() {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        RegistrationSuccessFragment write2 = RegistrationSuccessFragment.write();
        onGetStartedClick.IconCompatParcelizer((Object) write2, "RegistrationSuccessFragment.newInstance()");
        return write2;
    }

    public final String au_() {
        String string = getString(R.string.registration_success);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.registration_success)");
        return string;
    }

    public static final Intent read(Context context, getFileSHA getfilesha) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, RegistrationSuccessActivity.class);
        intent.putExtra("SUCCESS_PAGE_DYNAMIC_TYPE", getfilesha);
        return intent;
    }
}
