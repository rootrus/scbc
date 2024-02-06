package com.scb.phone.view.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ErrorFragment;
import p040o.ForwardingCheckedFuture;

public class ErrorGenericActivity extends BaseActivityWithFragment {
    private String MediaDescriptionCompat = "";

    public void onCreate(Bundle bundle) {
        ForwardingCheckedFuture forwardingCheckedFuture = (ForwardingCheckedFuture) getIntent().getParcelableExtra("EXTRA_ERROR_DISPLAY");
        if (forwardingCheckedFuture != null) {
            this.MediaDescriptionCompat = forwardingCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver;
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        return ErrorFragment.MediaBrowserCompat$CustomActionResultReceiver((ForwardingCheckedFuture) getIntent().getParcelableExtra("EXTRA_ERROR_DISPLAY"));
    }

    /* access modifiers changed from: protected */
    public final String au_() {
        return this.MediaDescriptionCompat;
    }
}
