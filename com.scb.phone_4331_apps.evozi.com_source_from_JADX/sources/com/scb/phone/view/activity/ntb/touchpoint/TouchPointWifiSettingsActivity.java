package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ntb.touchpoint.C6112x131c48e6;
import com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment;
import p040o.getKernelIDMultiply;
import p040o.onGetStartedClick;

public final class TouchPointWifiSettingsActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "stage");
            Intent putExtra = new Intent(context, TouchPointWifiSettingsActivity.class).putExtra("EXTRA_STATE_FLOW", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…(EXTRA_STATE_FLOW, stage)");
            return putExtra;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new getKernelIDMultiply().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "touchpoint_ekyc_wifi");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        String stringExtra;
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_STATE_FLOW")) == null) {
            return new Fragment();
        }
        C6112x131c48e6 touchPointWifiSettingsFragment$MediaBrowserCompat$CustomActionResultReceiver = TouchPointWifiSettingsFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent2 = getIntent();
        Bundle bundleExtra = intent2 != null ? intent2.getBundleExtra("EXTRA_BUNDLE") : null;
        onGetStartedClick.write((Object) stringExtra, "stage");
        TouchPointWifiSettingsFragment touchPointWifiSettingsFragment = new TouchPointWifiSettingsFragment();
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        if (bundleExtra != null) {
            bundleExtra.putString("EXTRA_STATE_FLOW", stringExtra);
        }
        touchPointWifiSettingsFragment.setArguments(bundleExtra);
        return touchPointWifiSettingsFragment;
    }

    public final String au_() {
        String string = getString(R.string.wifi_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.wifi_title)");
        return string;
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, String str, Bundle bundle) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) bundle, "bundle");
        Intent putExtra = write.MediaBrowserCompat$CustomActionResultReceiver(context, str).putExtra("EXTRA_BUNDLE", bundle);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "getIntent(context, name)…tra(EXTRA_BUNDLE, bundle)");
        return putExtra;
    }
}
