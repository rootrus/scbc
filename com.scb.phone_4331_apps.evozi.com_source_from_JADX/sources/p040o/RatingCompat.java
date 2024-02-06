package p040o;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.p044v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: o.RatingCompat */
public class RatingCompat {
    public static Object MediaBrowserCompat$CustomActionResultReceiver(RatingCompat$MediaBrowserCompat$ItemReceiver ratingCompat$MediaBrowserCompat$ItemReceiver) {
        return new read(ratingCompat$MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.RatingCompat$write */
    public static class write {
        public static AudioAttributes read(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int MediaBrowserCompat$ItemReceiver(Object obj) {
            return MediaBrowserCompat$ItemReceiver(read(obj));
        }

        private static int MediaBrowserCompat$ItemReceiver(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: o.RatingCompat$read */
    static class read<T extends RatingCompat$MediaBrowserCompat$ItemReceiver> extends MediaController.Callback {
        protected final T MediaBrowserCompat$CustomActionResultReceiver;

        public read(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
        }

        public void onSessionDestroyed() {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.write(bundle);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((Object) mediaMetadata);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.write(bundle);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(bundle);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(playbackInfo.getPlaybackType(), write.MediaBrowserCompat$ItemReceiver((Object) playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }
}
