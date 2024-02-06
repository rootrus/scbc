package com.scb.phone.view.activity.prepaid;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.prepaid.C6120xd14b6dd0;
import com.scb.phone.view.fragment.prepaid.PrepaidTravelConversionSuccessFragment;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PrepaidTravelConversionSuccessActivity extends ReviewSuccessfulActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("PrepaidTravelConversionSuccessActivity.KEY_SUCCESS") : null;
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_BUY", false);
        if (standardstartandwait != null) {
            C6120xd14b6dd0 prepaidTravelConversionSuccessFragment$MediaBrowserCompat$ItemReceiver = PrepaidTravelConversionSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            PrepaidTravelConversionSuccessFragment prepaidTravelConversionSuccessFragment = new PrepaidTravelConversionSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.scb.phone.view.fragment.prepaid.request.PrepaidTravelConversionSuccessFragment.KEY_SUCCESS", standardstartandwait);
            bundle.putBoolean("EXTRA_IS_BUY", booleanExtra);
            prepaidTravelConversionSuccessFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, prepaidTravelConversionSuccessFragment).write();
        }
    }
}
