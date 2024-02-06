package com.scb.phone.view.activity.remittance;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment;
import p040o.C3092xce3d994b;
import p040o.onGetStartedClick;

public final class RemittanceRecipientDetailActivity extends BaseActivityWithFragment {
    public static final C5711x4c69b8a8 MediaDescriptionCompat = new C5711x4c69b8a8((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("STATE", -1);
        C3092xce3d994b.Builder builder = intExtra >= 0 ? C3092xce3d994b.Builder.values()[intExtra] : null;
        if (builder == null) {
            builder = C3092xce3d994b.Builder.NORMAL;
        }
        RemittanceRecipientDetailFragment.IconCompatParcelizer iconCompatParcelizer = RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return RemittanceRecipientDetailFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(builder, (C3092xce3d994b) getIntent().getParcelableExtra("display"));
    }

    public final String au_() {
        String string = getString(R.string.remittance_recipient_detial_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…e_recipient_detial_title)");
        return string;
    }
}
