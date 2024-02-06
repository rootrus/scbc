package com.scb.phone.view.activity.mailingaddress;

import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.mailingaddress.MailingAddressInputFragment;
import p040o.CardView;
import p040o.GoodToKnowActivity;
import p040o.addDelayedShutdownHook;
import p040o.onGetStartedClick;
import p040o.wrapPosition;

public final class MailingAddressInputActivity extends BaseActivity implements MailingAddressInputFragment.write {
    public static final write MediaMetadataCompat = new write((byte) 0);
    private String MediaBrowserCompat$SearchResultReceiver;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78562131493081);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String D_ = mo3026D_();
        onGetStartedClick.IconCompatParcelizer((Object) D_, "language");
        MediaBrowserCompat$ItemReceiver((wrapPosition) null, (addDelayedShutdownHook) null, D_, "INPUT_LANDING");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || 16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        if (str != null) {
            MailingAddressReviewActivity.MediaDescriptionCompat.write(this, str);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(wrapPosition wrapposition, addDelayedShutdownHook adddelayedshutdownhook, String str, String str2) {
        onGetStartedClick.write((Object) str, "locale");
        onGetStartedClick.write((Object) str2, "fragmentTag");
        MediaBrowserCompat$ItemReceiver(wrapposition, adddelayedshutdownhook, str, "INPUT_CONFIRM");
    }

    private final void MediaBrowserCompat$ItemReceiver(wrapPosition wrapposition, addDelayedShutdownHook adddelayedshutdownhook, String str, String str2) {
        CardView read = getSupportFragmentManager().read();
        MailingAddressInputFragment.read read2 = MailingAddressInputFragment.IconCompatParcelizer;
        if (getIntent() != null && getIntent().hasExtra("PARCELABLE_TOKEN_ID")) {
            this.MediaBrowserCompat$SearchResultReceiver = getIntent().getStringExtra("PARCELABLE_TOKEN_ID");
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) str, "locale");
        MailingAddressInputFragment mailingAddressInputFragment = new MailingAddressInputFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_MAILING_ADDRESS_DISPLAY", wrapposition);
        bundle.putString("EXTRA_INPUT_LOCALE", str);
        bundle.putParcelable("EXTRA_MAILING_ADDRESS_SUB_DISTRICT_DISPLAY", adddelayedshutdownhook);
        bundle.putString("TOKEN_ID", str3);
        mailingAddressInputFragment.setArguments(bundle);
        read.write(R.id.container, mailingAddressInputFragment, str2);
        if (GoodToKnowActivity.read(str2, "INPUT_CONFIRM", false)) {
            read.MediaBrowserCompat$CustomActionResultReceiver(str2);
        }
        read.write();
    }
}
