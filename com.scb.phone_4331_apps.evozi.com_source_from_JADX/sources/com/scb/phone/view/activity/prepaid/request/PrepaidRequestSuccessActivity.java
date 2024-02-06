package com.scb.phone.view.activity.prepaid.request;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestSuccessFragment;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PrepaidRequestSuccessActivity extends ReviewSuccessfulActivity {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("com.scb.phone.view.activity.prepaid.request.PrepaidRequestSuccessActivity.KEY_SUCCESS") : null;
        if (standardstartandwait != null) {
            PrepaidRequestSuccessFragment.IconCompatParcelizer iconCompatParcelizer = PrepaidRequestSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            PrepaidRequestSuccessFragment prepaidRequestSuccessFragment = new PrepaidRequestSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.scb.phone.view.fragment.prepaid.request.PrepaidRequestSuccessFragment.KEY_SUCCESS", standardstartandwait);
            prepaidRequestSuccessFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, prepaidRequestSuccessFragment).write();
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
