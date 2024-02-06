package com.scb.phone.view.activity.remittance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.C6154x158bbeb6;
import com.scb.phone.view.fragment.remittance.RemittanceLandingFragment;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C5011nL;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public final class RemittanceLandingActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public C5011nL presenter;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, C3092xce3d994b.Builder builder, C3088x7e3e3ebd.C30891 r4) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) builder, "state");
            Intent intent = new Intent(context, RemittanceLandingActivity.class);
            onGetStartedClick.IconCompatParcelizer((Object) intent.putExtra("STATE", builder.ordinal()), "putExtra(key, value?.ordinal ?: -1)");
            intent.putExtra("INPUT_DISPLAY", r4);
            return intent;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("STATE", -1);
        C3092xce3d994b.Builder builder = intExtra >= 0 ? C3092xce3d994b.Builder.values()[intExtra] : null;
        if (builder == null) {
            builder = C3092xce3d994b.Builder.NORMAL;
        }
        C6154x158bbeb6 remittanceLandingFragment$MediaBrowserCompat$CustomActionResultReceiver = RemittanceLandingFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) builder, "state");
        RemittanceLandingFragment remittanceLandingFragment = new RemittanceLandingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("STATE", builder.ordinal());
        bundle.putParcelable("INPUT_DISPLAY", (C3088x7e3e3ebd.C30891) getIntent().getParcelableExtra("INPUT_DISPLAY"));
        remittanceLandingFragment.setArguments(bundle);
        return remittanceLandingFragment;
    }

    public final String au_() {
        String string = getString(R.string.remittance_landing_page_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remittance_landing_page_title)");
        return string;
    }

    public static final Intent write(Context context, C3092xce3d994b.Builder builder) {
        return IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, builder, (C3088x7e3e3ebd.C30891) null);
    }
}
