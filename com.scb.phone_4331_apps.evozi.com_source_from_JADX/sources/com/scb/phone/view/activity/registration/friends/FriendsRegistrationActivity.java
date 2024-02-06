package com.scb.phone.view.activity.registration.friends;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.friends.FriendsRegistrationFragment;
import p040o.getFileSHA;
import p040o.onGetStartedClick;

public final class FriendsRegistrationActivity extends BaseActivityWithFragment {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final String au_() {
        return "";
    }

    public final void onBackPressed() {
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, getFileSHA getfilesha) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, FriendsRegistrationActivity.class);
        intent.putExtra("SUCCESS_PAGE_DYNAMIC_TYPE", getfilesha);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new FriendsRegistrationFragment();
    }
}
