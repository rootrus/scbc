package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationActivity;
import com.scb.phone.view.fragment.hml.HmlNTBManageEmailVerificationFragment;
import p040o.CardView;
import p040o.onGetStartedClick;

public final class HmlNTBManageEmailVerificationActivity extends ManageEmailVerificationActivity {
    public static final C5618xd52f00f9 MediaBrowserCompat$MediaItem = new C5618xd52f00f9((byte) 0);

    public final void MediaBrowserCompat$ItemReceiver(CardView cardView, Bundle bundle) {
        onGetStartedClick.write((Object) cardView, "transaction");
        onGetStartedClick.write((Object) bundle, "bundle");
        HmlNTBManageEmailVerificationFragment hmlNTBManageEmailVerificationFragment = new HmlNTBManageEmailVerificationFragment();
        hmlNTBManageEmailVerificationFragment.setArguments(bundle);
        cardView.write(R.id.fragment_email_verification_container, hmlNTBManageEmailVerificationFragment, "EMAIL_VERIFICATION_TAG");
    }
}
