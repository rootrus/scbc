package com.scb.phone.view.fragment.prepaid.cashout;

import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.prepaid.cashout.PrepaidCashOutInputFragment;
import p040o.onGetStartedClick;

final class PrepaidCashOutInputFragment$MediaBrowserCompat$ItemReceiver implements NoteEditText.IconCompatParcelizer {
    private /* synthetic */ PrepaidCashOutInputFragment write;

    PrepaidCashOutInputFragment$MediaBrowserCompat$ItemReceiver(PrepaidCashOutInputFragment prepaidCashOutInputFragment) {
        this.write = prepaidCashOutInputFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        PrepaidCashOutInputFragment.read MediaBrowserCompat$ItemReceiver = this.write.IconCompatParcelizer;
        if (MediaBrowserCompat$ItemReceiver != null) {
            NoteEditText noteEditText = this.write.mNoteEditText;
            if (noteEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mNoteEditText");
            }
            String obj = noteEditText.mNoteEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "mNoteEditText.note");
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(z, obj);
        }
    }
}
