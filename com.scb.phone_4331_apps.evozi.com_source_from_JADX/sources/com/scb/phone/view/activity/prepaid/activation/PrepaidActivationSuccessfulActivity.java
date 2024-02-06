package com.scb.phone.view.activity.prepaid.activation;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.prepaid.activation.PrepaidActivationSuccessFragment;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PrepaidActivationSuccessfulActivity extends ReviewSuccessfulActivity {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("com.scb.phone.view.activity.prepaid.activation.PrepaidActivationSuccessfulActivity.KEY_SUCCESS") : null;
        if (standardstartandwait != null) {
            CardView read2 = getSupportFragmentManager().read();
            PrepaidActivationSuccessFragment.IconCompatParcelizer iconCompatParcelizer = PrepaidActivationSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            PrepaidActivationSuccessFragment prepaidActivationSuccessFragment = new PrepaidActivationSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.scb.phone.view.fragment.prepaid.activation.PrepaidActivationSuccessFragment.KEY_SUCCESS", standardstartandwait);
            prepaidActivationSuccessFragment.setArguments(bundle);
            read2.MediaBrowserCompat$ItemReceiver(R.id.frame_container, prepaidActivationSuccessFragment).write();
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
