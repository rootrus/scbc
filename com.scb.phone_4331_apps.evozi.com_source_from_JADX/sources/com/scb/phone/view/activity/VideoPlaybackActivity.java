package com.scb.phone.view.activity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.onGetStartedClick;

public final class VideoPlaybackActivity extends BaseActivity {
    public static final write MediaMetadataCompat = new write((byte) 0);
    @BindView
    public View loaderView;
    @BindView
    public VideoView videoPlayer;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void setLoaderView(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.loaderView = view;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80232131493248);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("VIDEO_URL");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Constants.VIDEO_URL)");
        View view = this.loaderView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loaderView");
        }
        view.setVisibility(0);
        VideoView videoView = this.videoPlayer;
        if (videoView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("videoPlayer");
        }
        videoView.setVideoPath(stringExtra);
        VideoView videoView2 = this.videoPlayer;
        if (videoView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("videoPlayer");
        }
        videoView2.setOnPreparedListener(new C5558x15d5492(this));
        VideoView videoView3 = this.videoPlayer;
        if (videoView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("videoPlayer");
        }
        videoView3.setOnErrorListener(new IconCompatParcelizer(this));
        VideoView videoView4 = this.videoPlayer;
        if (videoView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("videoPlayer");
        }
        videoView4.start();
    }

    static final class IconCompatParcelizer implements MediaPlayer.OnErrorListener {
        private /* synthetic */ VideoPlaybackActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(VideoPlaybackActivity videoPlaybackActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = videoPlaybackActivity;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver.finish();
            return true;
        }
    }
}
