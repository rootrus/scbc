package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.ThreadFactoryBuilder;

public class ActivationSuccessfulActivity extends CCRBaseActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, ThreadFactoryBuilder.C38611 r3) {
        Intent intent = new Intent(context, ActivationSuccessfulActivity.class);
        intent.putExtra("ActivationSuccessfulActivity.KEY_ACTIVATION_DTO", r3);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80022131493227);
    }
}
