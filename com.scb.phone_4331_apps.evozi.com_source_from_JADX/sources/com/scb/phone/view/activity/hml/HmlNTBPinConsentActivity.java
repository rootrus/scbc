package com.scb.phone.view.activity.hml;

import android.view.View;
import com.scb.phone.R;
import java.util.HashMap;
import p040o.isUserLoggedIn;
import p040o.onGetStartedClick;

public final class HmlNTBPinConsentActivity extends NTBPinLoginActivity {
    public static final read MediaMetadataCompat = new read((byte) 0);
    private HashMap MediaBrowserCompat$MediaItem;

    public final View IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$MediaItem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$MediaItem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void IconCompatParcelizer() {
        setResult(-1);
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        isUserLoggedIn isuserloggedin = this.presenter;
        if (isuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isuserloggedin.read();
    }
}
