package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import p040o.PassportCaptureActivity_MembersInjector;
import p040o.setContentDescription;

public class HmlMailingAddressActivity extends HmlBaseAddressActivity implements PassportCaptureActivity_MembersInjector, HmlAddressFragment$MediaBrowserCompat$ItemReceiver {
    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$QueueItem() {
        return R.string.mf_onboarding_address_main_mail_nav_title;
    }

    public static Intent write(Context context) {
        return new Intent(context, HmlMailingAddressActivity.class).putExtra("com.scb.phone.EXTRA_ADDRESS_TYPE", setContentDescription.write.MAILING);
    }

    public final void IconCompatParcelizer(String str) {
        setResult(-1, new Intent().putExtra("com.scb.phone.EXTRA_RESULT_ADDRESS", str));
        finish();
    }
}
