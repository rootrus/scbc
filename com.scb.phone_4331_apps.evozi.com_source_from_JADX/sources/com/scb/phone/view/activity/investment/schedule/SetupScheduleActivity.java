package com.scb.phone.view.activity.investment.schedule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleFragment;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;

public class SetupScheduleActivity extends BaseActivityWithFragment implements FragmentBuilder_BindBaseGiftTransferInputFragment {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, CrashlyticsCore.C32494 r3) {
        Intent intent = new Intent(context, SetupScheduleActivity.class);
        intent.putExtra("DISPLAY_KEY", r3);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return SetupScheduleFragment.MediaBrowserCompat$ItemReceiver((CrashlyticsCore.C32494) getIntent().getParcelableExtra("DISPLAY_KEY"));
    }

    public final String au_() {
        return getString(R.string.setup_schedule_title);
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        setResult(0, new Intent());
        finish();
    }
}
