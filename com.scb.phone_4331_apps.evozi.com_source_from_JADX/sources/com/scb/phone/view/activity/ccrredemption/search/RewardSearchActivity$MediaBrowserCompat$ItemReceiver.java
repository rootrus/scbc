package com.scb.phone.view.activity.ccrredemption.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import p040o.onGetStartedClick;
import p040o.setFormat;

public final class RewardSearchActivity$MediaBrowserCompat$ItemReceiver implements TextWatcher {
    private /* synthetic */ RewardSearchActivity read;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    RewardSearchActivity$MediaBrowserCompat$ItemReceiver(RewardSearchActivity rewardSearchActivity) {
        this.read = rewardSearchActivity;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ImageButton imageButton = this.read.btClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
        }
        int i4 = 0;
        if (!(String.valueOf(charSequence).length() > 0)) {
            i4 = 8;
        }
        imageButton.setVisibility(i4);
        setFormat setformat = this.read.presenter;
        if (setformat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setformat.MediaBrowserCompat$ItemReceiver(String.valueOf(charSequence));
    }
}
