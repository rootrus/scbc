package com.scb.phone.view.fragment.ntb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.onGetStartedClick;

final class PreregisteredMobileFragment$MediaBrowserCompat$ItemReceiver implements TextView.OnEditorActionListener {
    private /* synthetic */ PreregisteredMobileFragment read;

    PreregisteredMobileFragment$MediaBrowserCompat$ItemReceiver(PreregisteredMobileFragment preregisteredMobileFragment) {
        this.read = preregisteredMobileFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return true;
        }
        CommonInputViewGroup commonInputViewGroup = this.read.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup.clearFocus();
        this.read.PlaybackStateCompat$CustomAction();
        return false;
    }
}
