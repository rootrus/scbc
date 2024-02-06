package com.scb.phone.view.activity.bscanc;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import p040o.onGetStartedClick;

final class ManageQrToPayActivity$MediaBrowserCompat$ItemReceiver implements TextView.OnEditorActionListener {
    private /* synthetic */ ManageQrToPayActivity write;

    ManageQrToPayActivity$MediaBrowserCompat$ItemReceiver(ManageQrToPayActivity manageQrToPayActivity) {
        this.write = manageQrToPayActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        CustomDeltaInputPressed customDeltaInputPressed = this.write.qrLimitAmount;
        if (customDeltaInputPressed == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed.inputValue.clearFocus();
        this.write.PlaybackStateCompat$CustomAction();
        return true;
    }
}
