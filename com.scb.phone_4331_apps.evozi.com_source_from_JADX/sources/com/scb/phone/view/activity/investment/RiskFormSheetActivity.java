package com.scb.phone.view.activity.investment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import p040o.ExecutorUtils;
import p040o.getOsBuildVersionString;
import p040o.setOnImageEventListener;

public class RiskFormSheetActivity extends setOnImageEventListener {
    public final int AppCompatDelegateImpl$ListMenuDecorView() {
        return R.string.mf_risksheet_title;
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return R.string.mf_risksheet_button_next;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* bridge */ /* synthetic */ void mo34028x50fd9e4a() {
        super.mo34028x50fd9e4a();
    }

    public final /* bridge */ /* synthetic */ void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
    }

    public final /* bridge */ /* synthetic */ void MediaSessionCompat$Token() {
        super.MediaSessionCompat$Token();
    }

    public /* bridge */ /* synthetic */ void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static Intent write(Context context, String str, ExecutorUtils.C33371 r4) {
        Intent intent = new Intent(context, RiskFormSheetActivity.class);
        intent.putExtra("DISPLAY_MODEL", r4);
        intent.putExtra("PDF_URL", str);
        return intent;
    }

    public static Intent read(Context context, String str, getOsBuildVersionString getosbuildversionstring) {
        Intent intent = new Intent(context, RiskFormSheetActivity.class);
        intent.putExtra("DISPLAY_MODEL", getosbuildversionstring);
        intent.putExtra("PDF_URL", str);
        return intent;
    }

    public final void MediaBrowserCompat$ItemReceiver(ExecutorUtils.C33371 r1) {
        write(r1);
    }

    public final void MediaBrowserCompat$ItemReceiver(getOsBuildVersionString getosbuildversionstring) {
        IconCompatParcelizer(getosbuildversionstring);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1332 == i && intent != null && intent.getBooleanExtra("REVIEW_IS_ERROR", false)) {
            setResult(0, intent);
            finish();
        }
    }
}
