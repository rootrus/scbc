package com.scb.phone.view.activity.remittance;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment;
import p040o.C3092xce3d994b;
import p040o.onGetStartedClick;

public final class RemittanceAddFavouriteRecipientDetailActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        RemittanceRecipientDetailFragment.IconCompatParcelizer iconCompatParcelizer = RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return RemittanceRecipientDetailFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(C3092xce3d994b.Builder.ADD_FAVOURITE, (C3092xce3d994b) getIntent().getParcelableExtra("display"));
    }

    public final String au_() {
        String string = getString(R.string.remittance_recipient_detial_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…e_recipient_detial_title)");
        return string;
    }
}
