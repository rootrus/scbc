package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.mwpartner.MwEditCreateQrFragment;

public class MwEditCreateQrActivity extends BaseActivityWithFragment {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2) {
        return new Intent(context, MwEditCreateQrActivity.class).putExtra("EXTRA_AMOUNT", str).putExtra("EXTRA_REFERENCE", str2);
    }

    public static String MediaBrowserCompat$ItemReceiver(Intent intent) {
        return intent.getStringExtra("EXTRA_QR_CODE");
    }

    public static String write(Intent intent) {
        return intent.getStringExtra("EXTRA_REFERENCE");
    }

    public static String read(Intent intent) {
        return intent.getStringExtra("EXTRA_AMOUNT");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return MwEditCreateQrFragment.MediaBrowserCompat$ItemReceiver(getIntent().getStringExtra("EXTRA_AMOUNT"), getIntent().getStringExtra("EXTRA_REFERENCE"));
    }

    public final String au_() {
        return getString(R.string.mw_create_qr_title);
    }
}
