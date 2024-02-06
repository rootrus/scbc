package com.scb.phone.view.activity.mailingaddress;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.mailingaddress.MailingAddressLandingFragment;
import p040o.CardView;

public final class MailingAddressLandingActivity extends BaseActivity {
    public static final MailingAddressLandingActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new MailingAddressLandingActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78572131493082);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_change_mailing_address_accounts_title));
        CardView read = getSupportFragmentManager().read();
        MailingAddressLandingFragment.IconCompatParcelizer iconCompatParcelizer = MailingAddressLandingFragment.MediaBrowserCompat$CustomActionResultReceiver;
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, new MailingAddressLandingFragment()).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_change_mailing_address_accounts_title));
    }
}
