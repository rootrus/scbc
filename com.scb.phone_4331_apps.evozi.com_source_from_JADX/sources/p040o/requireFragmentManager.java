package p040o;

import java.io.File;

/* renamed from: o.requireFragmentManager */
public class requireFragmentManager implements C1421x860ecb24 {
    private final C1429xbcccb1a5 MediaBrowserCompat$ItemReceiver;
    private final long read = 262144000;

    public requireFragmentManager(C1429xbcccb1a5 requirefragmentmanager_mediabrowsercompat_customactionresultreceiver, long j) {
        this.MediaBrowserCompat$ItemReceiver = requirefragmentmanager_mediabrowsercompat_customactionresultreceiver;
    }

    public final postponeEnterTransition write() {
        File MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver.mkdirs() || (MediaBrowserCompat$CustomActionResultReceiver.exists() && MediaBrowserCompat$CustomActionResultReceiver.isDirectory())) {
            return new AppCompatMultiAutoCompleteTextView(MediaBrowserCompat$CustomActionResultReceiver, this.read);
        }
        return null;
    }
}
