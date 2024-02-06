package p040o;

/* renamed from: o.VideoPlaybackActivity_ViewBinding */
public abstract class VideoPlaybackActivity_ViewBinding {

    /* renamed from: o.VideoPlaybackActivity_ViewBinding$read */
    public static final class read extends VideoPlaybackActivity_ViewBinding {
        private final Throwable MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((read) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CancellableEpicInputFailure(throwable=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(Throwable th) {
            super((byte) 0);
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
            VideoPlaybackActivity videoPlaybackActivity = VideoPlaybackActivity.CANCELLABLE_EPIC_INPUT_FAILURE;
        }
    }

    private VideoPlaybackActivity_ViewBinding() {
    }

    public /* synthetic */ VideoPlaybackActivity_ViewBinding(byte b) {
        this();
    }
}
