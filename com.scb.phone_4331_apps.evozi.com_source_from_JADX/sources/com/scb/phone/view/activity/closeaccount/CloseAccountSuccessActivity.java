package com.scb.phone.view.activity.closeaccount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment;

public class CloseAccountSuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static Intent write(Activity activity) {
        return new Intent(activity, CloseAccountSuccessActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77142131492939);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, CloseAccountSuccessFragment.MediaBrowserCompat$ItemReceiver()).write();
        mo13676d_("close_acct_success");
    }
}
