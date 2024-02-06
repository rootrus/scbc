package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import p040o.PassportCaptureActivity_MembersInjector;
import p040o.setContentDescription;

public class HmlHomeAddressActivity extends HmlBaseAddressActivity implements PassportCaptureActivity_MembersInjector, HmlAddressFragment$MediaBrowserCompat$ItemReceiver {
    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$QueueItem() {
        return R.string.hml_personal_info_home_address;
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, HmlHomeAddressActivity.class).putExtra("com.scb.phone.EXTRA_ADDRESS_TYPE", setContentDescription.write.HOME);
    }

    public final void IconCompatParcelizer(String str) {
        setResult(-1, new Intent().putExtra("com.scb.phone.EXTRA_RESULT_ADDRESS", str));
        finish();
    }
}
