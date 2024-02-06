package com.scb.phone.view.fragment.hml;

import android.content.DialogInterface;
import p040o.md5Hash;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class HmlDocumentListFragment$MediaSessionCompat$QueueItem implements DialogInterface.OnClickListener {
    private /* synthetic */ HmlDocumentListFragment MediaBrowserCompat$ItemReceiver;

    HmlDocumentListFragment$MediaSessionCompat$QueueItem(HmlDocumentListFragment hmlDocumentListFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentListFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        md5Hash md5hash = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer playbackStateCompat = new md5Hash.PlaybackStateCompat(md5hash);
        if (md5hash.RatingCompat != null) {
            playbackStateCompat.IconCompatParcelizer(md5hash.RatingCompat);
        }
    }
}
