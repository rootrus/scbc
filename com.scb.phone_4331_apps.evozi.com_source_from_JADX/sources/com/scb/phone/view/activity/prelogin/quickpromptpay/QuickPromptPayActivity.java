package com.scb.phone.view.activity.prelogin.quickpromptpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.prelogin.quickpromptpay.QuickPromptPayFragment;
import p040o.AlertController$RecycleListView;

public class QuickPromptPayActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79552131493180);
        mo13676d_("lifestyle_promptpay");
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.quick_prompt_pay_fragment_container, QuickPromptPayFragment.MediaBrowserCompat$MediaItem(read("source", ""))).write();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == -1) {
            finish();
        }
    }
}
