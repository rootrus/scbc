package com.scb.phone.view.activity.partner.nsip;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.parntner.nsip.C6114xa9e179d6;
import com.scb.phone.view.fragment.parntner.nsip.NsipPartnerPaymentSuccessFragment;
import p040o.forEachSrcOver;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class NsipPartnerPaymentSuccessActivity extends ReviewSuccessfulActivity {
    public static final read MediaDescriptionCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
        Intent intent = getIntent();
        String str = null;
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("EXTRA_NSIP_SUCCESS") : null;
        if (standardstartandwait != null) {
            Intent intent2 = getIntent();
            onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
            Bundle extras = intent2.getExtras();
            if (extras != null) {
                str = extras.getString("NSIP_TRACKER_FROM", forEachSrcOver.read.IconCompatParcelizer);
            }
            C6114xa9e179d6 nsipPartnerPaymentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = NsipPartnerPaymentSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            NsipPartnerPaymentSuccessFragment nsipPartnerPaymentSuccessFragment = new NsipPartnerPaymentSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_NSIP_SUCCESS", standardstartandwait);
            bundle.putString("NSIP_TRACKER_FROM", str);
            nsipPartnerPaymentSuccessFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, nsipPartnerPaymentSuccessFragment).write();
        }
    }
}
