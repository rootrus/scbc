package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.AddressSearchActivity;

public class MwSubDistrictSearchActivity extends AddressSearchActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, MwSubDistrictSearchActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_shop_address_title);
        setTabContainer();
    }
}
