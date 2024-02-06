package p040o;

import java.util.List;

/* renamed from: o.setCurrentScreen */
public final class setCurrentScreen {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public List<String> write;

    /* renamed from: o.setCurrentScreen$write */
    public static final class write {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public List<String> read;
    }

    public /* synthetic */ setCurrentScreen(write write2, byte b) {
        this(write2);
    }

    private setCurrentScreen(write write2) {
        this.read = write2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.write = write2.read;
    }
}
