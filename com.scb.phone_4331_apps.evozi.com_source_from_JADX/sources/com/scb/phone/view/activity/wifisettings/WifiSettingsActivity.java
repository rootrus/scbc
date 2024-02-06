package com.scb.phone.view.activity.wifisettings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;

public class WifiSettingsActivity extends BaseActivity {
    public static Intent write(Context context) {
        return new Intent(context, WifiSettingsActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80252131493250);
        mo13676d_("registration_wifialert");
    }
}
