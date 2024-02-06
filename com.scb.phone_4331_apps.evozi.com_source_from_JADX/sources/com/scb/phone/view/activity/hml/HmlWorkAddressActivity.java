package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import p040o.setContentDescription;

public class HmlWorkAddressActivity extends HmlBaseAddressActivity implements HmlAddressFragment$MediaBrowserCompat$ItemReceiver {
    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$QueueItem() {
        return R.string.ntb_fillinformation_occupation_info_work_address;
    }

    public static Intent write(Context context) {
        return new Intent(context, HmlWorkAddressActivity.class).putExtra("com.scb.phone.EXTRA_ADDRESS_TYPE", setContentDescription.write.WORK);
    }
}
