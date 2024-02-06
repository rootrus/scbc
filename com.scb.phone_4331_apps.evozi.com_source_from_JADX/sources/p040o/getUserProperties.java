package p040o;

import java.util.List;

/* renamed from: o.getUserProperties */
public class getUserProperties {
    public String Keep;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2859x50fd9e4a;
    public List<String> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public List<setCurrentScreen> ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String RatingCompat;
    public String setHasDecor;

    public getUserProperties(read read2) {
        this.MediaMetadataCompat = read2.MediaDescriptionCompat;
        this.setHasDecor = read2.PlaybackStateCompat;
        this.MediaSessionCompat$ResultReceiverWrapper = read2.MediaSessionCompat$Token;
        this.f2859x50fd9e4a = read2.f2860x50fd9e4a;
        this.Keep = read2.Keep;
        this.MediaSessionCompat$Token = read2.MediaSessionCompat$QueueItem;
        this.MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$MediaItem;
        this.RatingCompat = read2.MediaMetadataCompat;
        this.PlaybackStateCompat = read2.setHasDecor;
        this.MediaSessionCompat$QueueItem = read2.ParcelableVolumeInfo;
        this.MediaDescriptionCompat = read2.RatingCompat;
        this.ParcelableVolumeInfo = read2.MediaSessionCompat$ResultReceiverWrapper;
    }

    /* renamed from: o.getUserProperties$read */
    public static class read {
        public String Keep;
        public String MediaBrowserCompat$MediaItem;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2860x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public List<setCurrentScreen> MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public boolean ParcelableVolumeInfo;
        public String PlaybackStateCompat;
        public List<String> RatingCompat;
        public String setHasDecor;

        public getUserProperties IconCompatParcelizer() {
            return new getUserProperties(this);
        }
    }
}
