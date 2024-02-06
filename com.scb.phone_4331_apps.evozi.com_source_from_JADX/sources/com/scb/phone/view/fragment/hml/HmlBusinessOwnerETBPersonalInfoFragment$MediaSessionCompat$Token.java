package com.scb.phone.view.fragment.hml;

import android.view.KeyEvent;
import android.widget.TextView;

final class HmlBusinessOwnerETBPersonalInfoFragment$MediaSessionCompat$Token implements TextView.OnEditorActionListener {
    private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment write;

    HmlBusinessOwnerETBPersonalInfoFragment$MediaSessionCompat$Token(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
        this.write = hmlBusinessOwnerETBPersonalInfoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.write.PlaybackStateCompat$CustomAction();
        HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment = this.write;
        hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusable(true);
        hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusableInTouchMode(true);
        hmlBusinessOwnerETBPersonalInfoFragment.root.requestFocus();
        return true;
    }
}
