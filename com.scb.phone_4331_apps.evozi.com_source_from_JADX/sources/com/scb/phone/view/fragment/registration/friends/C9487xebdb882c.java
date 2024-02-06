package com.scb.phone.view.fragment.registration.friends;

import android.content.DialogInterface;
import p040o.getProcessName;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.registration.friends.FriendsRegistrationFragment$MediaBrowserCompat$SearchResultReceiver */
final class C9487xebdb882c implements DialogInterface.OnClickListener {
    private /* synthetic */ FriendsRegistrationFragment IconCompatParcelizer;

    C9487xebdb882c(FriendsRegistrationFragment friendsRegistrationFragment) {
        this.IconCompatParcelizer = friendsRegistrationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getProcessName getprocessname = this.IconCompatParcelizer.presenter;
        if (getprocessname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getProcessName.MediaMetadataCompat.write;
        if (getprocessname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getprocessname.RatingCompat);
        }
        dialogInterface.dismiss();
    }
}
