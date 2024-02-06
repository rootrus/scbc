package com.scb.phone.view.activity.ccsof;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.ccsof.CcSofSuccessFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class CcSofSuccessActivity extends ReviewSuccessfulActivity {
    public static final C5578x4c901875 MediaMetadataCompat = new C5578x4c901875((byte) 0);

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        ArrayList arrayList = null;
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("EXTRA_CC_SOF_KEY_SUCCESS") : null;
        Intent intent2 = getIntent();
        String stringExtra = intent2 != null ? intent2.getStringExtra("EXTRA_CC_SOF_KEY_SUCCESS_PARTNER_SUBTYPE_CODE") : null;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            arrayList = intent3.getParcelableArrayListExtra("EXTRA_ITEM_DEEP_LINK_BUTTON_DISPLAY_LIST");
        }
        if (standardstartandwait != null && stringExtra != null) {
            CardView read = getSupportFragmentManager().read();
            CcSofSuccessFragment.IconCompatParcelizer iconCompatParcelizer = CcSofSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            List list = arrayList;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            onGetStartedClick.write((Object) stringExtra, "partnerSubtypeCode");
            CcSofSuccessFragment ccSofSuccessFragment = new CcSofSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CC_SOF_KEY_SUCCESS", standardstartandwait);
            bundle.putString("EXTRA_CC_SOF_KEY_SUCCESS_PARTNER_SUBTYPE_CODE", stringExtra);
            if (list != null) {
                bundle.putParcelableArrayList("EXTRA_ITEM_DEEP_LINK_BUTTON_DISPLAY_LIST", new ArrayList(list));
            }
            ccSofSuccessFragment.setArguments(bundle);
            read.MediaBrowserCompat$ItemReceiver(R.id.frame_container, ccSofSuccessFragment).write();
        }
    }
}
