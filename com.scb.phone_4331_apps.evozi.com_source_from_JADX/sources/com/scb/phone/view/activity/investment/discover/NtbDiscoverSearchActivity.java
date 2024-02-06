package com.scb.phone.view.activity.investment.discover;

import android.content.Context;
import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import p040o.onGetStartedClick;
import p040o.populateSessionData;

public final class NtbDiscoverSearchActivity extends BaseDiscoverSearchActivity {
    public static final NtbDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new NtbDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    static final class write implements DialogInterface.OnClickListener {
        public static final write write = new write();

        write() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public final void IconCompatParcelizer(populateSessionData populatesessiondata) {
        onGetStartedClick.write((Object) populatesessiondata, "display");
        PlaybackStateCompat$CustomAction();
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.investment_ntb_does_not_support_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.investment_ntb_does_not_support_text);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), write.write).show();
    }
}
