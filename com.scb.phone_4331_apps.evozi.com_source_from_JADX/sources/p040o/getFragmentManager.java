package p040o;

import java.util.NoSuchElementException;
import p040o.getHost;

/* renamed from: o.getFragmentManager */
public final class getFragmentManager extends getHost.read {
    private final CheckExtractor_MembersInjector IconCompatParcelizer;
    private final getHost.read MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private boolean write;

    public getFragmentManager(getHost.read read2, CheckExtractor_MembersInjector checkExtractor_MembersInjector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        this.IconCompatParcelizer = checkExtractor_MembersInjector;
    }

    public final boolean hasNext() {
        if (!this.read) {
            while (true) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.hasNext()) {
                    this.write = false;
                    break;
                }
                int MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
                if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2)) {
                    this.write = true;
                    break;
                }
            }
            this.read = true;
        }
        return this.write;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        if (!this.read) {
            this.write = hasNext();
        }
        if (this.write) {
            this.read = false;
            return this.MediaBrowserCompat$ItemReceiver;
        }
        throw new NoSuchElementException();
    }
}
