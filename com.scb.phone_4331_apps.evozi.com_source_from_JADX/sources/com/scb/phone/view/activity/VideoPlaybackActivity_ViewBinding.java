package com.scb.phone.view.activity;

import android.view.View;
import android.widget.VideoView;
import com.scb.phone.R;
import p040o.onStart;

public final class VideoPlaybackActivity_ViewBinding extends BaseActivity_ViewBinding {
    private VideoPlaybackActivity MediaBrowserCompat$ItemReceiver;

    public VideoPlaybackActivity_ViewBinding(VideoPlaybackActivity videoPlaybackActivity, View view) {
        super(videoPlaybackActivity, view);
        this.MediaBrowserCompat$ItemReceiver = videoPlaybackActivity;
        videoPlaybackActivity.videoPlayer = (VideoView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vv_video_player, "field 'videoPlayer'", VideoView.class);
        videoPlaybackActivity.loaderView = onStart.IconCompatParcelizer(view, R.id.cv_loader, "field 'loaderView'");
    }

    public final void read() {
        VideoPlaybackActivity videoPlaybackActivity = this.MediaBrowserCompat$ItemReceiver;
        if (videoPlaybackActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            videoPlaybackActivity.videoPlayer = null;
            videoPlaybackActivity.loaderView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
