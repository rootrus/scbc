package com.scb.phone.view.activity.prepaid.cashout;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.prepaid.cashout.PrepaidCashOutSuccessFragment;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PrepaidCashOutSuccessActivity extends ReviewSuccessfulActivity {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
        Intent intent = getIntent();
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("PREPAID_CASH_OUT_KEY_SUCCESS") : null;
        if (standardstartandwait != null) {
            PrepaidCashOutSuccessFragment.read read = PrepaidCashOutSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            PrepaidCashOutSuccessFragment prepaidCashOutSuccessFragment = new PrepaidCashOutSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("PREPAID_CASH_OUT_KEY_SUCCESS", standardstartandwait);
            prepaidCashOutSuccessFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, prepaidCashOutSuccessFragment).write();
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}
