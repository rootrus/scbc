package com.scb.phone.view.activity.investment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.ExecutorUtils;
import p040o.MyECouponActivity_ViewBinding;
import p040o.doBackgroundInitialization;
import p040o.getOsBuildVersionString;
import p040o.setOnImageEventListener;
import p040o.setTapText;

public class FundFactSheetActivity extends setOnImageEventListener {
    public final int AppCompatDelegateImpl$ListMenuDecorView() {
        return R.string.mf_factsheet_title;
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return R.string.mf_factsheet_button_next;
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

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, doBackgroundInitialization dobackgroundinitialization, String str2) {
        Intent intent = new Intent(context, FundFactSheetActivity.class);
        intent.putExtra("DISPLAY_MODEL", dobackgroundinitialization);
        intent.putExtra("PDF_URL", str);
        intent.putExtra("EXTRA_EVENT_NAME", str2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().hasExtra("EXTRA_EVENT_NAME")) {
            mo13676d_(getIntent().getStringExtra("EXTRA_EVENT_NAME"));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ExecutorUtils.C33371 r4) {
        if (r4.MediaBrowserCompat$MediaItem() != null) {
            Intent write = RiskFormSheetActivity.write(this, r4.MediaBrowserCompat$MediaItem(), r4);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(read, 1333);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            write(r4);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getOsBuildVersionString getosbuildversionstring) {
        if (getosbuildversionstring.MediaBrowserCompat$MediaItem() != null) {
            Intent read = RiskFormSheetActivity.read(this, getosbuildversionstring.MediaBrowserCompat$MediaItem(), getosbuildversionstring);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, read).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read2, 1333);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            IconCompatParcelizer(getosbuildversionstring);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("REVIEW_IS_ERROR", false) : false;
        if ((1332 == i && booleanExtra && i2 == 0) || (1333 == i && i2 == 0 && booleanExtra)) {
            setResult(0);
            finish();
        }
    }
}
