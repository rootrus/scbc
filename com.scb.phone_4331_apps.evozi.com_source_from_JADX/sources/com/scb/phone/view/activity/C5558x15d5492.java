package com.scb.phone.view.activity;

import android.media.MediaPlayer;
import android.view.View;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.VideoPlaybackActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5558x15d5492 implements MediaPlayer.OnPreparedListener {
    private /* synthetic */ VideoPlaybackActivity MediaBrowserCompat$ItemReceiver;

    C5558x15d5492(VideoPlaybackActivity videoPlaybackActivity) {
        this.MediaBrowserCompat$ItemReceiver = videoPlaybackActivity;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        View view = this.MediaBrowserCompat$ItemReceiver.loaderView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loaderView");
        }
        view.setVisibility(8);
    }
}
