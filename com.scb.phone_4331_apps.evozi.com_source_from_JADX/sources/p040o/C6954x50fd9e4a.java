package p040o;

import android.media.session.MediaSession;

/* renamed from: o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
class C6954x50fd9e4a {

    /* renamed from: o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$read */
    public static class read {
        public static Object IconCompatParcelizer(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }
}
