package com.scb.phone.view.activity.investment.discover;

import android.content.Context;
import android.content.Intent;
import p040o.PassportCaptureModule_RttiExceptionResponseDeserializer_Factory;

public class NtbDiscoverActivity extends DiscoverActivity implements PassportCaptureModule_RttiExceptionResponseDeserializer_Factory {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, NtbDiscoverActivity.class);
        intent.putExtra("com.scb.phone.INVESTMENT_TILE", str);
        intent.putExtra("EXTRA_NTB", true);
        return intent;
    }

    public static Intent write(Context context) {
        Intent intent = new Intent(context, NtbDiscoverActivity.class);
        intent.putExtra("EXTRA_NTB", true);
        return intent;
    }
}
