package com.scb.phone.view.fragment.hml;

import android.view.KeyEvent;
import android.widget.TextView;

final class HmlBusinessInformationFragment$MediaBrowserCompat$MediaItem implements TextView.OnEditorActionListener {
    private /* synthetic */ HmlBusinessInformationFragment write;

    HmlBusinessInformationFragment$MediaBrowserCompat$MediaItem(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
        this.write = hmlBusinessInformationFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.write.IconCompatParcelizer();
        this.write.PlaybackStateCompat$CustomAction();
        return false;
    }
}
