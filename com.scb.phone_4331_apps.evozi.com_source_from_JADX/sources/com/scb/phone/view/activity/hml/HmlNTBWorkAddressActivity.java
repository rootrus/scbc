package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import p040o.setContentDescription;

public class HmlNTBWorkAddressActivity extends HmlWorkAddressActivity implements HmlAddressFragment$MediaBrowserCompat$ItemReceiver {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, HmlNTBWorkAddressActivity.class).putExtra("com.scb.phone.EXTRA_ADDRESS_TYPE", setContentDescription.write.WORK);
    }
}
