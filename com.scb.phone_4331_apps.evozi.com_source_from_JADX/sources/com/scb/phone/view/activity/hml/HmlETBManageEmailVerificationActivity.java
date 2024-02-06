package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationActivity;
import com.scb.phone.view.fragment.hml.HmlETBManageEmailVerificationFragment;
import p040o.CardView;
import p040o.onGetStartedClick;

public final class HmlETBManageEmailVerificationActivity extends ManageEmailVerificationActivity {
    public static final read MediaBrowserCompat$SearchResultReceiver = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CardView cardView, Bundle bundle) {
        onGetStartedClick.write((Object) cardView, "transaction");
        onGetStartedClick.write((Object) bundle, "bundle");
        HmlETBManageEmailVerificationFragment hmlETBManageEmailVerificationFragment = new HmlETBManageEmailVerificationFragment();
        hmlETBManageEmailVerificationFragment.setArguments(bundle);
        cardView.write(R.id.fragment_email_verification_container, hmlETBManageEmailVerificationFragment, "EMAIL_VERIFICATION_TAG");
    }
}
